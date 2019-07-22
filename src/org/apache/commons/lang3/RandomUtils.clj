(ns org.apache.commons.lang3.RandomUtils
  "Utility library that supplements the standard Random class.

  Caveat: Instances of Random are not cryptographically secure.

  Please note that the Apache Commons project provides a component
  dedicated to pseudo-random number generation, namely
  Commons RNG, that may be
  a better choice for applications with more stringent requirements
  (performance and/or correctness)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 RandomUtils]))

(defn ->random-utils
  "Constructor.

  RandomUtils instances should NOT be constructed in standard
   programming. Instead, the class should be used as
   RandomUtils.nextBytes(5);.



   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^RandomUtils []
    (new RandomUtils )))

(defn *next-boolean
  "Returns a random boolean value

  returns: the random boolean - `boolean`"
  (^Boolean []
    (RandomUtils/nextBoolean )))

(defn *next-bytes
  "Creates an array of random bytes.

  count - the size of the returned array - `int`

  returns: the random byte array - `byte[]`

  throws: java.lang.IllegalArgumentException - if count is negative"
  ([^Integer count]
    (RandomUtils/nextBytes count)))

(defn *next-int
  "Returns a random integer within the specified range.

  start-inclusive - the smallest value that can be returned, must be non-negative - `int`
  end-exclusive - the upper bound (not included) - `int`

  returns: the random integer - `int`

  throws: java.lang.IllegalArgumentException - if startInclusive > endExclusive or if startInclusive is negative"
  (^Integer [^Integer start-inclusive ^Integer end-exclusive]
    (RandomUtils/nextInt start-inclusive end-exclusive))
  (^Integer []
    (RandomUtils/nextInt )))

(defn *next-long
  "Returns a random long within the specified range.

  start-inclusive - the smallest value that can be returned, must be non-negative - `long`
  end-exclusive - the upper bound (not included) - `long`

  returns: the random long - `long`

  throws: java.lang.IllegalArgumentException - if startInclusive > endExclusive or if startInclusive is negative"
  (^Long [^Long start-inclusive ^Long end-exclusive]
    (RandomUtils/nextLong start-inclusive end-exclusive))
  (^Long []
    (RandomUtils/nextLong )))

(defn *next-double
  "Returns a random double within the specified range.

  start-inclusive - the smallest value that can be returned, must be non-negative - `double`
  end-inclusive - the upper bound (included) - `double`

  returns: the random double - `double`

  throws: java.lang.IllegalArgumentException - if startInclusive > endInclusive or if startInclusive is negative"
  (^Double [^Double start-inclusive ^Double end-inclusive]
    (RandomUtils/nextDouble start-inclusive end-inclusive))
  (^Double []
    (RandomUtils/nextDouble )))

(defn *next-float
  "Returns a random float within the specified range.

  start-inclusive - the smallest value that can be returned, must be non-negative - `float`
  end-inclusive - the upper bound (included) - `float`

  returns: the random float - `float`

  throws: java.lang.IllegalArgumentException - if startInclusive > endInclusive or if startInclusive is negative"
  (^Float [^Float start-inclusive ^Float end-inclusive]
    (RandomUtils/nextFloat start-inclusive end-inclusive))
  (^Float []
    (RandomUtils/nextFloat )))

