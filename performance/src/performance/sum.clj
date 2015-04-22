(ns performance.sum
  (:require [criterium.core :refer :all]))

(defn sum [xs]
  (reduce + xs))
(def collection (range 100))

(bench (sum collection))

(defn array-sum [^ints xs]
  (loop [index 0
         acc 0]
    (if (< index (alength xs))
      (recur (unchecked-int index) (+ acc (aget xs index)))
      acc)))
(def array (into-array Integer/TYPE (range 100)))
(with-progress-reporting (bench (array-sum array)))

(defn array-sum [^ints xs]
  (areduce xs index ret 0 (+ ret (aget xs index))))
(bench (array-sum array))
