;; (ns clojure-macrobook.advanced-mechanics.assert-no-syntax-quote)

;; (defmacro assert [x]
;;   (when *assert*
;;     (list 'when-not x
;;           (list 'throw
;;                 (list 'AssertionError.
;;                       (list 'str "Assert failed: "
;;                             (list 'pr-str (list 'quote x))))))))

;; (assert false)
