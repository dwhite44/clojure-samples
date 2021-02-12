(ns math.core-test
  (:require [clojure.test :refer [deftest testing is]]
            [math.core :as math]))

(deftest fibonacci-tests
  (testing "fibonacci sequence"
    (is (= [0] (math/fibonacci 1)))
    (is (= [0 1 1 2 3 5 8 13 21 34] (math/fibonacci 10))))

  (testing "nth positions of fibonacci"
    (is (= 46368 (last (math/fibonacci 25))))))
