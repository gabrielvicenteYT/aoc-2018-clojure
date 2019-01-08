(ns aoc-2018.day-01)

(defn part-1 [in]
  (reduce + (map read-string in)))

(defn part-2 [in]
  (loop [coll (cycle (map read-string in))
         current 0
         seen #{}]
    (if (seen current)
      current
      (recur
       (rest coll)
       (+ current (first coll))
       (conj seen current)))))
