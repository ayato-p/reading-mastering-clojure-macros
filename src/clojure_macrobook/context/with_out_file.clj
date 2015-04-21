(ns clojure-macrobook.context.with-out-file
  (:require [clojure.java.io :as io]))

(defmacro with-out-file [file & body]
  `(with-open [writer# (io/writer ~file :append true)]
     (binding [*out* writer#]
       ~@body)))
