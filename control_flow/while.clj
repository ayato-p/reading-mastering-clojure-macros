
(defmacro while
  "Repeatedly executes body while test expression is true. Presumes
  some side-effect will cause test to become false/nil. Returns nil"
  {:added "1.0"}
  [test & body]
  `(loop []
     (when ~test
       ~@body
       (recur))))

(def counter (atom 0))

(while (< @counter 3)
  (println @counter)
  (swap! counter inc))

(loop []
  (when (< @counter 3)
    (println @counter)
    (swap! counter inc)
    (recur)))

(while true
  (println "Hello"))
