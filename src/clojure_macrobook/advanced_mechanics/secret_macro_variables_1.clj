(ns clojure-macrobook.advanced-mechanics.secret-macro-variables-1
  (:require [clojure.pprint :refer [pprint]]))

(defmacro info-about-caller []
  (pprint {:form &form :env &env})
  `(println "macro was called!"))

(info-about-caller)
(let [foo "bar"] (info-about-caller))
(let [foo "bar"
      baz "quux"] (info-about-caller))
