(ns clojure-macrobook.basics.function-argument-evaluation)

(defn print-with-asterisks [printable-argument]
  (print "*****")
  (print printable-argument)
  (println "*****"))

(print-with-asterisks "Hi")
(print-with-asterisks (do (println "in argument expression")
                          "hi"))
