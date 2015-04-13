(ns clojure-macrobook.advanced-mechanics.gensym-5)

(defmacro safe-math-expression? [expression]
  `(try ~expression
        true
        (catch ArithmeticException e# false)))
