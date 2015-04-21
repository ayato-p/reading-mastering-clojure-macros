(ns clojure-macrobook.beware.not-values-3)

(defmacro do-multiplication [expression]
  (cons `* (rest expression)))

(do-multiplication (+ 3 4))

;; (map (fn [x] (do-multiplication x))
;;      [(x '(+ 3 4)) ])
