(ns clojure-macrobook.basics.replace-addition)

(let [expression (read-string "(+ 1 2 3 4 5)")]
  (cons (read-string "*")
        (rest expression)))
(eval *1)
