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
