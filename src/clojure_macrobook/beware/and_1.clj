(ns clojure-macrobook.beware.and-1)

(defmacro our-and
  ([] true)
  ([x] x)
  ([x & next]
   `(if ~x (our-and ~@next) ~x)))

(our-and true true)
(our-and true false)
(our-and true true false)
(our-and true true nil)
(our-and 1 2 3)

(and "foo" "bar" "baz")
(our-and "foo" "bar" "baz")
