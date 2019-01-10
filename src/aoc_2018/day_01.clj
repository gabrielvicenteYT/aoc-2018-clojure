(ns aoc-2018.day-01)

(defn part-1 [in]
  (reduce + (map read-string in)))

(defn part-2 [in]
  (reduce
   (fn [[curr seen] val]
     (if (seen curr)
       (reduced curr)
       [(+ curr val) (conj seen curr)]))
   [0 #{}]
   (cycle (map read-string in))))
