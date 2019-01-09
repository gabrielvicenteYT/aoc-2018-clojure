(ns aoc-2018.day-03)

(defn part-1 [in]
  (->>
   (for [[id x y w h] (map #(map read-string (re-seq #"\d+" %)) in)
         x (range x (+ x w))
         y (range y (+ y h))]
     [x y])
   frequencies
   (filter (fn [[_ v]] (< 1 v)))
   count))

(defn intersect [a b]
  (and (not= a b)
       (<= (:x b) (+ (:x a) (:w a)))
       (<= (:y b) (+ (:y a) (:h a)))
       (> (+ (:x b) (:w b)) (:x a))
       (> (+ (:y b) (:h b)) (:y a))))

(defn part-2 [in]
  (let [claims (map #(zipmap [:id :x :y :w :h] (map read-string (re-seq #"\d+" %))) in)]
    (some
     (fn [claim] (if (every? #(not (intersect claim %)) claims) (:id claim)))
     claims)))
