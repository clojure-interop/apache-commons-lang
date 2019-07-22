(ns org.apache.commons.lang3.mutable.MutableDouble
  "A mutable double wrapper.

  Note that as MutableDouble does not extend Double, it is not treated by String.format as a Double parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.mutable MutableDouble]))

(defn ->mutable-double
  "Constructor.

  Constructs a new MutableDouble with the specified value.

  value - the initial value to store - `double`"
  (^MutableDouble [^Double value]
    (new MutableDouble value))
  (^MutableDouble []
    (new MutableDouble )))

(defn get-and-add
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately prior to the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `double`

  returns: the value associated with this instance immediately before the operand was added - `double`"
  (^Double [^MutableDouble this ^Double operand]
    (-> this (.getAndAdd operand))))

(defn double-value
  "Returns the value of this MutableDouble as a double.

  returns: the numeric value represented by this object after conversion to type double. - `double`"
  (^Double [^MutableDouble this]
    (-> this (.doubleValue))))

(defn add-and-get
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately after the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `double`

  returns: the value associated with this instance after adding the operand - `double`"
  (^Double [^MutableDouble this ^Double operand]
    (-> this (.addAndGet operand))))

(defn long-value
  "Returns the value of this MutableDouble as a long.

  returns: the numeric value represented by this object after conversion to type long. - `long`"
  (^Long [^MutableDouble this]
    (-> this (.longValue))))

(defn to-double
  "Gets this mutable as an instance of Double.

  returns: a Double instance containing the value from this mutable, never null - `java.lang.Double`"
  (^java.lang.Double [^MutableDouble this]
    (-> this (.toDouble))))

(defn to-string
  "Returns the String value of this mutable.

  returns: the mutable value as a string - `java.lang.String`"
  (^java.lang.String [^MutableDouble this]
    (-> this (.toString))))

(defn increment
  "Increments the value."
  ([^MutableDouble this]
    (-> this (.increment))))

(defn get-value
  "Gets the value as a Double instance.

  returns: the value as a Double, never null - `java.lang.Double`"
  (^java.lang.Double [^MutableDouble this]
    (-> this (.getValue))))

(defn infinite?
  "Checks whether the double value is infinite.

  returns: true if infinite - `boolean`"
  (^Boolean [^MutableDouble this]
    (-> this (.isInfinite))))

(defn float-value
  "Returns the value of this MutableDouble as a float.

  returns: the numeric value represented by this object after conversion to type float. - `float`"
  (^Float [^MutableDouble this]
    (-> this (.floatValue))))

(defn get-and-decrement
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the decrement operation. This method is not thread safe.

  returns: the value associated with the instance before it was decremented - `double`"
  (^Double [^MutableDouble this]
    (-> this (.getAndDecrement))))

(defn subtract
  "Subtracts a value from the value of this instance.

  operand - the value to subtract, not null - `double`"
  ([^MutableDouble this ^Double operand]
    (-> this (.subtract operand))))

(defn decrement
  "Decrements the value."
  ([^MutableDouble this]
    (-> this (.decrement))))

(defn decrement-and-get
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately after the decrement operation. This method is not thread safe.

  returns: the value associated with the instance after it is decremented - `double`"
  (^Double [^MutableDouble this]
    (-> this (.decrementAndGet))))

(defn set-value
  "Sets the value.

  value - the value to set - `double`"
  ([^MutableDouble this ^Double value]
    (-> this (.setValue value))))

(defn na-n?
  "Checks whether the double value is the special NaN value.

  returns: true if NaN - `boolean`"
  (^Boolean [^MutableDouble this]
    (-> this (.isNaN))))

(defn int-value
  "Returns the value of this MutableDouble as an int.

  returns: the numeric value represented by this object after conversion to type int. - `int`"
  (^Integer [^MutableDouble this]
    (-> this (.intValue))))

(defn get-and-increment
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the increment operation. This method is not thread safe.

  returns: the value associated with the instance before it was incremented - `double`"
  (^Double [^MutableDouble this]
    (-> this (.getAndIncrement))))

(defn hash-code
  "Returns a suitable hash code for this mutable.

  returns: a suitable hash code - `int`"
  (^Integer [^MutableDouble this]
    (-> this (.hashCode))))

(defn add
  "Adds a value to the value of this instance.

  operand - the value to add - `double`"
  ([^MutableDouble this ^Double operand]
    (-> this (.add operand))))

(defn compare-to
  "Compares this mutable to another in ascending order.

  other - the other mutable to compare to, not null - `org.apache.commons.lang3.mutable.MutableDouble`

  returns: negative if this is less, zero if equal, positive if greater - `int`"
  (^Integer [^MutableDouble this ^org.apache.commons.lang3.mutable.MutableDouble other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this object against the specified object. The result is true if and only if the argument
   is not null and is a Double object that represents a double that has the identical
   bit pattern to the bit pattern of the double represented by this object. For this purpose, two
   double values are considered to be the same if and only if the method
   Double.doubleToLongBits(double)returns the same long value when applied to each.

   Note that in most cases, for two instances of class Double,d1 and d2,
   the value of d1.equals(d2) is true if and only if



     d1.doubleValue() == d2.doubleValue()



   also has the value true. However, there are two exceptions:

   If d1 and d2 both represent Double.NaN, then the
   equals method returns true, even though Double.NaN==Double.NaN has
   the value false.
   If d1 represents +0.0 while d2 represents -0.0,
   or vice versa, the equal test has the value false, even though
   +0.0==-0.0 has the value true. This allows hashtables to operate properly.

  obj - the object to compare with, null returns false - `java.lang.Object`

  returns: true if the objects are the same; false otherwise. - `boolean`"
  (^Boolean [^MutableDouble this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn increment-and-get
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately after the increment operation. This method is not thread safe.

  returns: the value associated with the instance after it is incremented - `double`"
  (^Double [^MutableDouble this]
    (-> this (.incrementAndGet))))

