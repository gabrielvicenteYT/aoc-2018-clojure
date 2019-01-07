(ns aoc-2018.day-02-test
  (:require [clojure.test :refer :all]
            [aoc-2018.day-02 :refer :all]
            [clojure.java.io :as io]))

(deftest part-1-example
  (is (= 12 (part-1 ["abcdef" "bababc" "abbcde" "abcccd" "aabcdd" "abcdee" "ababab"]))))

(deftest part-1-problem
  (with-open [reader (io/reader (io/resource "day-02.txt"))]
    (is (= 5456 (part-1 (line-seq reader))))))

(deftest part-2-example
  (is (= "fgij" (part-2 ["abcde" "fghij" "klmno" "pqrst" "fguij" "axcye" "wvxyz"]))))

(deftest part-2-problem
  (with-open [reader (io/reader (io/resource "day-02.txt"))]
    (is (= "megsdlpulxvinkatfoyzxcbvq" (part-2 (line-seq reader))))))
