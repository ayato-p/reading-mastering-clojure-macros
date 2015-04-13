(ns clojure-macrobook.advanced-mechanics.unhygienic-4)

(defmacro make-adder [x] `(fn [~'y] (+ ~x ~'y)))

(def y 100)

;; ((make-adder (+ x 3)) 5)
