(ns math.core)

(defn fibonacci
  "Shows fibonacci sequence to max of n"
  [n]
  (let [acc (fn [[x y]]
              [y (+ x y)])]
    (->> (iterate acc [0 1])
         (map first)
         (take n))))

(comment
  (fibonacci 25)

  (comment))
