(ns ex1
  (:require [clojure.string :as s]))

(def inp (as-> "inputs/1.txt" $
			     (slurp $)
			     (s/split $ #"\n")
			     (map #(s/split % #"   ") $)))

(let [l1 (->> inp (map (comp Integer/parseInt first)) sort)
      l2 (->> inp (map (comp Integer/parseInt second)) sort)]
  (prn (reduce + (map (comp abs -) l1 l2))))
