(ns aoc-2018.day-01-test
  (:require [clojure.test :refer :all]
            [aoc-2018.day-01 :refer :all]
            [clojure.java.io :as io]))

(deftest part-1-example-1
  (is (= 3 (part-1 ["+1" "-2" "+3" "+1"]))))

(deftest part-1-example-2
  (is (= 0 (part-1 ["+1" "+1" "-2"]))))

(deftest part-1-example-3
  (is (= -6 (part-1 ["-1" "-2" "-3"]))))

(deftest part-1-problem
  (with-open [reader (io/reader (io/resource "day-01.txt"))]
    (is (= 486 (part-1 (line-seq reader))))))

(deftest part-2-example-1
  (is (= 0 (part-2 ["+1" "-1"]))))

(deftest part-2-example-2
  (is (= 10 (part-2 ["+3" "+3" "+4" "-2" "-4"]))))

(deftest part-2-example-3
  (is (= 5 (part-2 ["-6" "+3" "+8" "+5" "-6"]))))

(deftest part-2-example-4
  (is (= 14 (part-2 ["+7" "+7" "-2" "-7" "-4"]))))

(deftest part-2-problem
  (with-open [reader (io/reader (io/resource "day-01.txt"))]
    (is (= 69285 (part-2 (line-seq reader))))))
