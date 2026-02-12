(ns fizzbuzz)

(defn fizzbuzz [n]
  (cond
    (and (zero? (mod n 3)) (zero? (mod n 5))) "fizzbuzz"
    (zero? (mod n 3)) "fizz"
    (zero? (mod n 5)) "buzz"
    :else n))

