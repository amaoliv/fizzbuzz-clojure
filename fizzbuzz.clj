(ns fizzbuzz)

(defn fn-fizzbuzz
  "Returns fizz for multiples of 3, buzz for multiples of 5, fizzbuzz for both, otherwise the number"
  [n]
  (cond
    (and (zero? (mod n 3)) (zero? (mod n 5))) "fizzbuzz"
    (zero? (mod n 3)) "fizz"
    (zero? (mod n 5)) "buzz"
    :else n))

(defmulti fizzbuzz
  "Fizzbuzz for a number or collection. Given a number, returns its fizzbuzz value; given a coll, returns a seq of fizzbuzz values."
  (fn [x] (if (number? x) :number :coll)))

(defmethod fizzbuzz :number [n]
  (fn-fizzbuzz n))

(defmethod fizzbuzz :coll [col]
  (map fn-fizzbuzz col))

(def numbers (range 1 16))


