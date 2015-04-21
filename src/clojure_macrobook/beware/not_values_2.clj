(ns clojure-macrobook.beware.not-values-2)

(defmacro square [x] `(* ~x ~x))

(map (fn [n] (square n)) (range 10))
