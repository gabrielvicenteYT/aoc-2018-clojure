(ns aoc-2018.day-03-test
  (:require [clojure.test :refer :all]
            [aoc-2018.day-03 :refer :all]
            [clojure.java.io :as io]))

(deftest part-1-example
  (is (= 4 (part-1 ["#1 @ 1,3: 4x4" "#2 @ 3,1: 4x4" "#3 @ 5,5: 2x2"]))))

(deftest part-1-problem
  (with-open [reader (io/reader (io/resource "day-03.txt"))]
    (is (= 101565 (part-1 (line-seq reader))))))

(deftest part-2-example
  (is (= 3 (part-2 ["#1 @ 1,3: 4x4" "#2 @ 3,1: 4x4" "#3 @ 5,5: 2x2"]))))

(deftest part-2-problem
  (with-open [reader (io/reader (io/resource "day-03.txt"))]
    (is (= 656 (part-2 (line-seq reader))))))
