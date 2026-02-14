# FizzBuzz (Clojure)

Classic FizzBuzz in Clojure: returns `"fizz"` for multiples of 3, `"buzz"` for multiples of 5, `"fizzbuzz"` for both, otherwise the number.

Uses a multimethod that dispatches on argument type: a single number or a collection (which is mapped over).

## Run

Start a REPL with the Clojure CLI:

```bash
clj
```

Then load the namespace:

```clojure
(load-file "fizzbuzz.clj")
```

## Usage

Single values:

```clojure
(fizzbuzz 3)   ; => "fizz"
(fizzbuzz 5)   ; => "buzz"
(fizzbuzz 15)  ; => "fizzbuzz"
(fizzbuzz 7)  ; => 7
```

Over a collection (multimethod handles it):

```clojure
(fizzbuzz '(3 5 15))     ; => ("fizz" "buzz" "fizzbuzz")
(fizzbuzz numbers)       ; numbers is (range 1 16) => (1 2 "fizz" 4 "buzz" ...)
```

Or with `map` for a single-argument sequence:

```clojure
(map fizzbuzz numbers)
```
