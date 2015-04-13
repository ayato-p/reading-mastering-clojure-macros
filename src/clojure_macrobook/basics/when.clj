(ns clojure-macrobook.basics.when)

(defmacro when
  "Evalutes test. If logical true, evalutes body in an implicit do."
  {:added "1.0"}
  [test & body]
  (list 'if test (cons 'do body)))
(when "foo"
  (println "foo1")
  (println "foo2"))
