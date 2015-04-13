(ns clojure-macrobook.basics.replace-addition-2)

(let [expression '(+ 1 2 3 4 5)]
  (cons (read-string "*")
        (rest expression)))
