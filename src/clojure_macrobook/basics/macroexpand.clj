(ns clojure-macrobook.basics.macroexpand)

(defmacro when-falsy [test & body]
  (list 'when (list 'not test)
        (cons 'do body)))

(macroexpand-1 '(when-falsy (= 1 2) (println "Hi")))

(macroexpand '(when-falsy (= 1 2) (println "Hi")))
