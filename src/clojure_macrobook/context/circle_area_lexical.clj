(ns clojure-macrobook.context.circle-area-lexical)

(defn circle-area [radius]
  (* Math/PI radius radius))
(circle-area 10)
