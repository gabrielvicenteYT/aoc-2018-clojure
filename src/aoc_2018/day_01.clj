(ns aoc-2018.day-01)

(defn part-1 [in]
  (reduce + (map read-string in)))
