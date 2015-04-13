(ns clojure-macrobook.advanced-mechanics.gensym-4)

(defmacro make-adder [x]
  `(fn [y#] (+ ~x y#)))

(def y 100)

((make-adder (+ y 3)) 5)
