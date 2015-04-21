(ns clojure-macrobook.beware.not-values)

(defn square [x] (* x x))

(map square (range 10))

(defmacro square [x] `(* ~x ~x))

(map square (range 10))
