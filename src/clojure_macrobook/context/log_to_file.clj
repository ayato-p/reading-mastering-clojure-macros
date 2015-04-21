(ns clojure-macrobook.context.log-to-file
  (:require [clojure.java.io :as io]))

(defn log
  ""
  [message]
  (let [timestamp (.format (java.text.SimpleDateFormat. "yyyy-MM-dd'T'HH:mmZ")
                           (java.util.Date.))]
    (println timestamp "[INFO]" message)))

(defn process-events [events]
  (doseq [event events]
    (log (format "Event %s has been processed" (:id event)))))

(let [file (java.io.File. (System/getProperty "user.home") "event-stream.log")]
  (with-open [file (io/writer file :append true)]
    (binding [*out* file]
      (process-events [{:id 88896} {:id 88898}]))))
(let [xs (range 10)]
  (println (nnext xs)))
