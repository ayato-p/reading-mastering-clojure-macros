(ns clojure-macrobook.basics.eval-expression)

(eval (read-string "(+ 1 2 3 4 5)"))
(class (eval (read-string "(+ 1 2 3 4 5)")))
(+ 1 2 3 4 5)
