(ns clojure-macrobook.advanced-mechanics.unhygienic-2)

(defmacro make-adder [x]
  `(fn [~'y] (+ ~x ~'y)))

(macroexpand-1 '(make-adder 10))
