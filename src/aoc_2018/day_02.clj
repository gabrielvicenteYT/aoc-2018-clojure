(ns aoc-2018.day-02)

(defn part-1 [in]
  (let [freqs (map (comp vals frequencies) in)]
    (* (count (filter #(some #{2} %) freqs))
       (count (filter #(some #{3} %) freqs)))))

(defn part-2 [in]
  (first
   (for [a in
         b in
         :let [together (map vector a b)]
         :when (= 1 (count (filter (fn [[a b]] (not= a b)) together)))]
     (reduce
      (fn [acc [a b]] (if (= a b) (str acc a) acc))
      ""
      together))))
