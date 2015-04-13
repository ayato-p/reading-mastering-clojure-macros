(ns clojure-macrobook.advanced-mechanics.assert-syntax-quote)

(defmacro assert [x]
  (when *assert*
    `(when-not ~x
       (throw (AssertionError. (str "Assert failed: " (pr-str ~x)))))))

(assert false)
