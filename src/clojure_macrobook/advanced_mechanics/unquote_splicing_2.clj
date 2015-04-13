(ns clojure-macrobook.advanced-mechanics.unquote-splicing-2)

(def other-numbers '(4 5 6))

`(1 2 3 ~other-numbers 7 8 9)

`(1 2 3 ~@other-numbers 7 8 9)
