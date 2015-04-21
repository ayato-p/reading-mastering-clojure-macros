(ns clojure-macrobook.context.circle-area-dynamic)

(declare ^:dynamic *radius*)

(defn circle-area
  ""
  []
  (* Math/PI *radius* *radius*))

(binding [*radius* 10.0]
  (circle-area))
