(ns starflight-code-wheel.core-test
  (:require [clojure.test :refer :all]
            [starflight-code-wheel.core :refer :all]))

(deftest decode-test
  (is (= 100232 (decode 20 0 0)))
  (is (= 228865 (decode 20 0 1)))
  (is (= 462801 (decode 0 4 2)))
  (is (= 86116 (decode 16 20 3))))
