(ns org.apache.commons.lang3.math.IEEE754rUtils
  "Provides IEEE-754r variants of NumberUtils methods.

  See: http://en.wikipedia.org/wiki/IEEE_754r"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.math IEEE754rUtils]))

(defn ->ieee-754r-utils
  "Constructor."
  (^IEEE754rUtils []
    (new IEEE754rUtils )))

(defn *min
  "Gets the minimum of three double values.

   NaN is only returned if all numbers are NaN as per IEEE-754r.

  a - value 1 - `double`
  b - value 2 - `double`
  c - value 3 - `double`

  returns: the smallest of the values - `double`"
  (^Double [^Double a ^Double b ^Double c]
    (IEEE754rUtils/min a b c))
  (^Double [^Double a ^Double b]
    (IEEE754rUtils/min a b))
  (^Double [^Double array]
    (IEEE754rUtils/min array)))

(defn *max
  "Gets the maximum of three double values.

   NaN is only returned if all numbers are NaN as per IEEE-754r.

  a - value 1 - `double`
  b - value 2 - `double`
  c - value 3 - `double`

  returns: the largest of the values - `double`"
  (^Double [^Double a ^Double b ^Double c]
    (IEEE754rUtils/max a b c))
  (^Double [^Double a ^Double b]
    (IEEE754rUtils/max a b))
  (^Double [^Double array]
    (IEEE754rUtils/max array)))

