(ns org.apache.commons.lang3.mutable.MutableFloat
  "A mutable float wrapper.

  Note that as MutableFloat does not extend Float, it is not treated by String.format as a Float parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.mutable MutableFloat]))

(defn ->mutable-float
  "Constructor.

  Constructs a new MutableFloat with the specified value.

  value - the initial value to store - `float`"
  (^MutableFloat [^Float value]
    (new MutableFloat value))
  (^MutableFloat []
    (new MutableFloat )))

(defn get-and-add
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately prior to the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `float`

  returns: the value associated with this instance immediately before the operand was added - `float`"
  (^Float [^MutableFloat this ^Float operand]
    (-> this (.getAndAdd operand))))

(defn double-value
  "Returns the value of this MutableFloat as a double.

  returns: the numeric value represented by this object after conversion to type double. - `double`"
  (^Double [^MutableFloat this]
    (-> this (.doubleValue))))

(defn add-and-get
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately after the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `float`

  returns: the value associated with this instance after adding the operand - `float`"
  (^Float [^MutableFloat this ^Float operand]
    (-> this (.addAndGet operand))))

(defn long-value
  "Returns the value of this MutableFloat as a long.

  returns: the numeric value represented by this object after conversion to type long. - `long`"
  (^Long [^MutableFloat this]
    (-> this (.longValue))))

(defn to-string
  "Returns the String value of this mutable.

  returns: the mutable value as a string - `java.lang.String`"
  (^java.lang.String [^MutableFloat this]
    (-> this (.toString))))

(defn increment
  "Increments the value."
  ([^MutableFloat this]
    (-> this (.increment))))

(defn get-value
  "Gets the value as a Float instance.

  returns: the value as a Float, never null - `java.lang.Float`"
  (^java.lang.Float [^MutableFloat this]
    (-> this (.getValue))))

(defn infinite?
  "Checks whether the float value is infinite.

  returns: true if infinite - `boolean`"
  (^Boolean [^MutableFloat this]
    (-> this (.isInfinite))))

(defn float-value
  "Returns the value of this MutableFloat as a float.

  returns: the numeric value represented by this object after conversion to type float. - `float`"
  (^Float [^MutableFloat this]
    (-> this (.floatValue))))

(defn get-and-decrement
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the decrement operation. This method is not thread safe.

  returns: the value associated with the instance before it was decremented - `float`"
  (^Float [^MutableFloat this]
    (-> this (.getAndDecrement))))

(defn subtract
  "Subtracts a value from the value of this instance.

  operand - the value to subtract - `float`"
  ([^MutableFloat this ^Float operand]
    (-> this (.subtract operand))))

(defn decrement
  "Decrements the value."
  ([^MutableFloat this]
    (-> this (.decrement))))

(defn to-float
  "Gets this mutable as an instance of Float.

  returns: a Float instance containing the value from this mutable, never null - `java.lang.Float`"
  (^java.lang.Float [^MutableFloat this]
    (-> this (.toFloat))))

(defn decrement-and-get
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately after the decrement operation. This method is not thread safe.

  returns: the value associated with the instance after it is decremented - `float`"
  (^Float [^MutableFloat this]
    (-> this (.decrementAndGet))))

(defn set-value
  "Sets the value.

  value - the value to set - `float`"
  ([^MutableFloat this ^Float value]
    (-> this (.setValue value))))

(defn na-n?
  "Checks whether the float value is the special NaN value.

  returns: true if NaN - `boolean`"
  (^Boolean [^MutableFloat this]
    (-> this (.isNaN))))

(defn int-value
  "Returns the value of this MutableFloat as an int.

  returns: the numeric value represented by this object after conversion to type int. - `int`"
  (^Integer [^MutableFloat this]
    (-> this (.intValue))))

(defn get-and-increment
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the increment operation. This method is not thread safe.

  returns: the value associated with the instance before it was incremented - `float`"
  (^Float [^MutableFloat this]
    (-> this (.getAndIncrement))))

(defn hash-code
  "Returns a suitable hash code for this mutable.

  returns: a suitable hash code - `int`"
  (^Integer [^MutableFloat this]
    (-> this (.hashCode))))

(defn add
  "Adds a value to the value of this instance.

  operand - the value to add, not null - `float`"
  ([^MutableFloat this ^Float operand]
    (-> this (.add operand))))

(defn compare-to
  "Compares this mutable to another in ascending order.

  other - the other mutable to compare to, not null - `org.apache.commons.lang3.mutable.MutableFloat`

  returns: negative if this is less, zero if equal, positive if greater - `int`"
  (^Integer [^MutableFloat this ^org.apache.commons.lang3.mutable.MutableFloat other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this object against some other object. The result is true if and only if the argument is
   not null and is a Float object that represents a float that has the
   identical bit pattern to the bit pattern of the float represented by this object. For this
   purpose, two float values are considered to be the same if and only if the method
   Float.floatToIntBits(float)returns the same int value when applied to each.

   Note that in most cases, for two instances of class Float,f1 and f2,
   the value of f1.equals(f2) is true if and only if



     f1.floatValue() == f2.floatValue()



   also has the value true. However, there are two exceptions:

   If f1 and f2 both represent Float.NaN, then the
   equals method returns true, even though Float.NaN==Float.NaN has
   the value false.
   If f1 represents +0.0f while f2 represents -0.0f,
   or vice versa, the equal test has the value false, even though
   0.0f==-0.0f has the value true.

   This definition allows hashtables to operate properly.

  obj - the object to compare with, null returns false - `java.lang.Object`

  returns: true if the objects are the same; false otherwise. - `boolean`"
  (^Boolean [^MutableFloat this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn increment-and-get
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately after the increment operation. This method is not thread safe.

  returns: the value associated with the instance after it is incremented - `float`"
  (^Float [^MutableFloat this]
    (-> this (.incrementAndGet))))

