(ns performance.criterium-run
  (:require [criterium.core :refer :all]))

(defn length-1 [x] (.length x))

(bench (length-1 "hi there!"))

(defn length-2 [^String x] (.length x))

(bench (length-2 "hi there!"))

(set! *warn-on-reflection* true)
