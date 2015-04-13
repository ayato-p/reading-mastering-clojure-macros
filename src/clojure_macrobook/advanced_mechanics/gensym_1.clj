(ns clojure-macrobook.advanced-mechanics.gensym-1)

(defmacro squares [xs] `(map (fn [x] (* x x)) ~xs))

(squares (range 10))
