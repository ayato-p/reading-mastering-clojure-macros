(ns clojure-macrobook.context.structural-duplicatoin
  (:require [clojure.java.io :as io]))

(defn info-to-file
  ""
  [path text]
  (let [file (io/writer path :append true)]
    (try
      (binding [*out* file]
        (println "[INFO]" text))
      (finally
        (.close file)))))

(defn error-to-file
  ""
  [path text]
  (let [file (io/writer path :append true)]
    (try
      (binding [*out* file]
        (println "[ERROR]" text))
      (finally
        (.close file)))))
