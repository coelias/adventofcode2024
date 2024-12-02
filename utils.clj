(ns utils
  (:require [clojure.string :as s]))

(defn read-line-numbers [l]
  (map Integer/parseInt (re-seq #"[0-9.]+" l)))

(defn read-input [fil direction parse-f]
  (let [d (map parse-f (-> fil slurp (s/split #"\n")))]
    (if (= :v direction)
	  (apply map vector d)
	  d)))
