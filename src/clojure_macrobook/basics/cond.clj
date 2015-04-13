(ns clojure-macrobook.basics.cond)

(defn hi [] (println ))

(defmacro cond
  "Taktes a set of test/expr pairs It evalutes each test one at a
  time. If a test returns logical true, cond evalutes and returns
  the value of the corresponding expr and doesn't evalute any of the
  other tests or exprs. (cond( returns nil"
  {:added "1.0"}
  [& clauses]
  (when clauses
    (list 'if (first clauses)
          (if (next clauses)
            (second clauses)
            (throw (IllegalArgumentException.
                    "cond requires an even number of forms")))
          (cons 'clojure-macrobook.basics.cond/cond (next (next clauses))))))

(clojure-macrobook.basics.cond/cond
  (= x 10) (println "Hello"))
