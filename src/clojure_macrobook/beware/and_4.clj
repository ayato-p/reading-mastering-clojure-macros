(ns clojure-macrobook.beware.and-4)

(defmacro our-and
  ([] true)
  ([x] x)
  ([x & next]
   `(let [arg# ~x]
      (if arg#
        (our-and ~@next)
        arg#))))
(our-and (do (println "hi there") (= 1 2)) (= 3 4))
