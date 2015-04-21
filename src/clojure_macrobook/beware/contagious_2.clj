(ns clojure-macrobook.beware.contagious-2
  (:require [clojure.string :as str]))

(defmacro log [& args]
  `(println (str "[INFO] " (str/join " : " ~(vec args)))))

(defn send-email [user messages]
  (Thread/sleep 1000))

(def admin-user "kathy@example.com")
(def current-user "colin@example.com")

(defn notify-everyone [messages]
  (apply log messages)
  (send-email admin-user messages)
  (send-email current-user messages))
