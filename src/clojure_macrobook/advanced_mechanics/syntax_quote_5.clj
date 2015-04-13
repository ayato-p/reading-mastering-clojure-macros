(ns clojure-macrobook.advanced-mechanics.syntax-quote-5)

(defmacro squares [xs]
  (list 'map '#(* % %) xs))

(squares (range 10))
