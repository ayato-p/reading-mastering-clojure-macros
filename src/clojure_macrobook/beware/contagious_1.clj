(ns clojure-macrobook.beware.contagious-1
  (:require [clojure.string :as str]))

(defmacro log [& args]
  `(println (str "[INFO] " (str/join " : " ~(vec args)))))

(defn log [& args]
  (println (str "[INFO] " (str/join " : " args))))

(log "that when well" )
(log "item #1 created" "by user #42")
