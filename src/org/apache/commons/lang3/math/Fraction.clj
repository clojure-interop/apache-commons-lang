(ns org.apache.commons.lang3.math.Fraction
  "Fraction is a Number implementation that
  stores fractions accurately.

  This class is immutable, and interoperable with most methods that accept
  a Number.

  Note that this class is intended for common use cases, it is int
  based and thus suffers from various overflow issues. For a BigInteger based
  equivalent, please see the Commons Math BigFraction class."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.math Fraction]))

(def *-zero
  "Static Constant.

  Fraction representation of 0.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/ZERO)

(def *-one
  "Static Constant.

  Fraction representation of 1.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/ONE)

(def *-one-half
  "Static Constant.

  Fraction representation of 1/2.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/ONE_HALF)

(def *-one-third
  "Static Constant.

  Fraction representation of 1/3.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/ONE_THIRD)

(def *-two-thirds
  "Static Constant.

  Fraction representation of 2/3.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/TWO_THIRDS)

(def *-one-quarter
  "Static Constant.

  Fraction representation of 1/4.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/ONE_QUARTER)

(def *-two-quarters
  "Static Constant.

  Fraction representation of 2/4.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/TWO_QUARTERS)

(def *-three-quarters
  "Static Constant.

  Fraction representation of 3/4.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/THREE_QUARTERS)

(def *-one-fifth
  "Static Constant.

  Fraction representation of 1/5.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/ONE_FIFTH)

(def *-two-fifths
  "Static Constant.

  Fraction representation of 2/5.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/TWO_FIFTHS)

(def *-three-fifths
  "Static Constant.

  Fraction representation of 3/5.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/THREE_FIFTHS)

(def *-four-fifths
  "Static Constant.

  Fraction representation of 4/5.

  type: org.apache.commons.lang3.math.Fraction"
  Fraction/FOUR_FIFTHS)

(defn *get-fraction
  "Creates a Fraction instance with the 3 parts
   of a fraction X Y/Z.

   The negative sign must be passed in on the whole number part.

  whole - the whole number, for example the one in 'one and three sevenths' - `int`
  numerator - the numerator, for example the three in 'one and three sevenths' - `int`
  denominator - the denominator, for example the seven in 'one and three sevenths' - `int`

  returns: a new fraction instance - `org.apache.commons.lang3.math.Fraction`

  throws: java.lang.ArithmeticException - if the resulting numerator exceeds Integer.MAX_VALUE"
  (^org.apache.commons.lang3.math.Fraction [^Integer whole ^Integer numerator ^Integer denominator]
    (Fraction/getFraction whole numerator denominator))
  (^org.apache.commons.lang3.math.Fraction [^Integer numerator ^Integer denominator]
    (Fraction/getFraction numerator denominator))
  (^org.apache.commons.lang3.math.Fraction [^Double value]
    (Fraction/getFraction value)))

(defn *get-reduced-fraction
  "Creates a reduced Fraction instance with the 2 parts
   of a fraction Y/Z.

   For example, if the input parameters represent 2/4, then the created
   fraction will be 1/2.

   Any negative signs are resolved to be on the numerator.

  numerator - the numerator, for example the three in 'three sevenths' - `int`
  denominator - the denominator, for example the seven in 'three sevenths' - `int`

  returns: a new fraction instance, with the numerator and denominator reduced - `org.apache.commons.lang3.math.Fraction`

  throws: java.lang.ArithmeticException - if the denominator is zero"
  (^org.apache.commons.lang3.math.Fraction [^Integer numerator ^Integer denominator]
    (Fraction/getReducedFraction numerator denominator)))

(defn invert
  "Gets a fraction that is the inverse (1/fraction) of this one.

   The returned fraction is not reduced.

  returns: a new fraction instance with the numerator and denominator
           inverted. - `org.apache.commons.lang3.math.Fraction`

  throws: java.lang.ArithmeticException - if the fraction represents zero."
  (^org.apache.commons.lang3.math.Fraction [^Fraction this]
    (-> this (.invert))))

(defn double-value
  "Gets the fraction as a double. This calculates the fraction
   as the numerator divided by denominator.

  returns: the fraction as a double - `double`"
  (^Double [^Fraction this]
    (-> this (.doubleValue))))

(defn long-value
  "Gets the fraction as a long. This returns the whole number
   part of the fraction.

  returns: the whole number fraction part - `long`"
  (^Long [^Fraction this]
    (-> this (.longValue))))

(defn negate
  "Gets a fraction that is the negative (-fraction) of this one.

   The returned fraction is not reduced.

  returns: a new fraction instance with the opposite signed numerator - `org.apache.commons.lang3.math.Fraction`"
  (^org.apache.commons.lang3.math.Fraction [^Fraction this]
    (-> this (.negate))))

(defn pow
  "Gets a fraction that is raised to the passed in power.

   The returned fraction is in reduced form.

  power - the power to raise the fraction to - `int`

  returns: this if the power is one, ONE if the power
   is zero (even if the fraction equals ZERO) or a new fraction instance
   raised to the appropriate power - `org.apache.commons.lang3.math.Fraction`

  throws: java.lang.ArithmeticException - if the resulting numerator or denominator exceeds Integer.MAX_VALUE"
  (^org.apache.commons.lang3.math.Fraction [^Fraction this ^Integer power]
    (-> this (.pow power))))

(defn multiply-by
  "Multiplies the value of this fraction by another, returning the
   result in reduced form.

  fraction - the fraction to multiply by, must not be null - `org.apache.commons.lang3.math.Fraction`

  returns: a Fraction instance with the resulting values - `org.apache.commons.lang3.math.Fraction`

  throws: java.lang.IllegalArgumentException - if the fraction is null"
  (^org.apache.commons.lang3.math.Fraction [^Fraction this ^org.apache.commons.lang3.math.Fraction fraction]
    (-> this (.multiplyBy fraction))))

(defn to-string
  "Gets the fraction as a String.

   The format used is 'numerator/denominator' always.

  returns: a String form of the fraction - `java.lang.String`"
  (^java.lang.String [^Fraction this]
    (-> this (.toString))))

(defn get-proper-whole
  "Gets the proper whole part of the fraction.

   An improper fraction 7/4 can be resolved into a proper one, 1 3/4.
   This method returns the 1 from the proper fraction.

   If the fraction is negative such as -7/4, it can be resolved into
   -1 3/4, so this method returns the positive whole part -1.

  returns: the whole fraction part of a proper fraction, that includes the sign - `int`"
  (^Integer [^Fraction this]
    (-> this (.getProperWhole))))

(defn get-numerator
  "Gets the numerator part of the fraction.

   This method may return a value greater than the denominator, an
   improper fraction, such as the seven in 7/4.

  returns: the numerator fraction part - `int`"
  (^Integer [^Fraction this]
    (-> this (.getNumerator))))

(defn float-value
  "Gets the fraction as a float. This calculates the fraction
   as the numerator divided by denominator.

  returns: the fraction as a float - `float`"
  (^Float [^Fraction this]
    (-> this (.floatValue))))

(defn subtract
  "Subtracts the value of another fraction from the value of this one,
   returning the result in reduced form.

  fraction - the fraction to subtract, must not be null - `org.apache.commons.lang3.math.Fraction`

  returns: a Fraction instance with the resulting values - `org.apache.commons.lang3.math.Fraction`

  throws: java.lang.IllegalArgumentException - if the fraction is null"
  (^org.apache.commons.lang3.math.Fraction [^Fraction this ^org.apache.commons.lang3.math.Fraction fraction]
    (-> this (.subtract fraction))))

(defn abs
  "Gets a fraction that is the positive equivalent of this one.
   More precisely: (fraction >= 0 ? this : -fraction)

   The returned fraction is not reduced.

  returns: this if it is positive, or a new positive fraction
    instance with the opposite signed numerator - `org.apache.commons.lang3.math.Fraction`"
  (^org.apache.commons.lang3.math.Fraction [^Fraction this]
    (-> this (.abs))))

(defn int-value
  "Gets the fraction as an int. This returns the whole number
   part of the fraction.

  returns: the whole number fraction part - `int`"
  (^Integer [^Fraction this]
    (-> this (.intValue))))

(defn hash-code
  "Gets a hashCode for the fraction.

  returns: a hash code value for this object - `int`"
  (^Integer [^Fraction this]
    (-> this (.hashCode))))

(defn add
  "Adds the value of this fraction to another, returning the result in reduced form.
   The algorithm follows Knuth, 4.5.1.

  fraction - the fraction to add, must not be null - `org.apache.commons.lang3.math.Fraction`

  returns: a Fraction instance with the resulting values - `org.apache.commons.lang3.math.Fraction`

  throws: java.lang.IllegalArgumentException - if the fraction is null"
  (^org.apache.commons.lang3.math.Fraction [^Fraction this ^org.apache.commons.lang3.math.Fraction fraction]
    (-> this (.add fraction))))

(defn to-proper-string
  "Gets the fraction as a proper String in the format X Y/Z.

   The format used in 'wholeNumber numerator/denominator'.
   If the whole number is zero it will be omitted. If the numerator is zero,
   only the whole number is returned.

  returns: a String form of the fraction - `java.lang.String`"
  (^java.lang.String [^Fraction this]
    (-> this (.toProperString))))

(defn reduce
  "Reduce the fraction to the smallest values for the numerator and
   denominator, returning the result.

   For example, if this fraction represents 2/4, then the result
   will be 1/2.

  returns: a new reduced fraction instance, or this if no simplification possible - `org.apache.commons.lang3.math.Fraction`"
  (^org.apache.commons.lang3.math.Fraction [^Fraction this]
    (-> this (.reduce))))

(defn compare-to
  "Compares this object to another based on size.

   Note: this class has a natural ordering that is inconsistent
   with equals, because, for example, equals treats 1/2 and 2/4 as
   different, whereas compareTo treats them as equal.

  other - the object to compare to - `org.apache.commons.lang3.math.Fraction`

  returns: -1 if this is less, 0 if equal, 1 if greater - `int`

  throws: java.lang.ClassCastException - if the object is not a Fraction"
  (^Integer [^Fraction this ^org.apache.commons.lang3.math.Fraction other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this fraction to another object to test if they are equal..

   To be equal, both values must be equal. Thus 2/4 is not equal to 1/2.

  obj - the reference object with which to compare - `java.lang.Object`

  returns: true if this object is equal - `boolean`"
  (^Boolean [^Fraction this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-proper-numerator
  "Gets the proper numerator, always positive.

   An improper fraction 7/4 can be resolved into a proper one, 1 3/4.
   This method returns the 3 from the proper fraction.

   If the fraction is negative such as -7/4, it can be resolved into
   -1 3/4, so this method returns the positive proper numerator, 3.

  returns: the numerator fraction part of a proper fraction, always positive - `int`"
  (^Integer [^Fraction this]
    (-> this (.getProperNumerator))))

(defn get-denominator
  "Gets the denominator part of the fraction.

  returns: the denominator fraction part - `int`"
  (^Integer [^Fraction this]
    (-> this (.getDenominator))))

(defn divide-by
  "Divide the value of this fraction by another.

  fraction - the fraction to divide by, must not be null - `org.apache.commons.lang3.math.Fraction`

  returns: a Fraction instance with the resulting values - `org.apache.commons.lang3.math.Fraction`

  throws: java.lang.IllegalArgumentException - if the fraction is null"
  (^org.apache.commons.lang3.math.Fraction [^Fraction this ^org.apache.commons.lang3.math.Fraction fraction]
    (-> this (.divideBy fraction))))

