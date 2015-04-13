(ns clojure-macrobook.advanced-mechanics.secret-macro-variables-2)

(defmacro inspect-caller-locals []
  (->> (keys &env)
       (map (fn [k] [`'~k k]))
       (into {})))

(inspect-caller-locals)

(let [foo "bar" baz "quux"] (inspect-caller-locals))

((fn [k] [`'~k k]) "bar")
