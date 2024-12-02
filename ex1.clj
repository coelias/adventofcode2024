(ns ex1
  (:require [clojure.string :as s]))

(load-file "utils.clj")

(def inp (utils/read-input "inputs/1.txt" :v utils/read-line-numbers))

(let [l1 (->> inp first sort)
      l2 (->> inp second sort)]
  (prn (reduce + (map (comp abs -) l1 l2))))
