(ns org.apache.commons.lang3.mutable.MutableInt
  "A mutable int wrapper.

  Note that as MutableInt does not extend Integer, it is not treated by String.format as an Integer parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.mutable MutableInt]))

(defn ->mutable-int
  "Constructor.

  Constructs a new MutableInt with the specified value.

  value - the initial value to store - `int`"
  (^MutableInt [^Integer value]
    (new MutableInt value))
  (^MutableInt []
    (new MutableInt )))

(defn get-and-add
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately prior to the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `int`

  returns: the value associated with this instance immediately before the operand was added - `int`"
  (^Integer [^MutableInt this ^Integer operand]
    (-> this (.getAndAdd operand))))

(defn to-integer
  "Gets this mutable as an instance of Integer.

  returns: a Integer instance containing the value from this mutable, never null - `java.lang.Integer`"
  (^java.lang.Integer [^MutableInt this]
    (-> this (.toInteger))))

(defn double-value
  "Returns the value of this MutableInt as a double.

  returns: the numeric value represented by this object after conversion to type double. - `double`"
  (^Double [^MutableInt this]
    (-> this (.doubleValue))))

(defn add-and-get
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately after the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `int`

  returns: the value associated with this instance after adding the operand - `int`"
  (^Integer [^MutableInt this ^Integer operand]
    (-> this (.addAndGet operand))))

(defn long-value
  "Returns the value of this MutableInt as a long.

  returns: the numeric value represented by this object after conversion to type long. - `long`"
  (^Long [^MutableInt this]
    (-> this (.longValue))))

(defn to-string
  "Returns the String value of this mutable.

  returns: the mutable value as a string - `java.lang.String`"
  (^java.lang.String [^MutableInt this]
    (-> this (.toString))))

(defn increment
  "Increments the value."
  ([^MutableInt this]
    (-> this (.increment))))

(defn get-value
  "Gets the value as a Integer instance.

  returns: the value as a Integer, never null - `java.lang.Integer`"
  (^java.lang.Integer [^MutableInt this]
    (-> this (.getValue))))

(defn float-value
  "Returns the value of this MutableInt as a float.

  returns: the numeric value represented by this object after conversion to type float. - `float`"
  (^Float [^MutableInt this]
    (-> this (.floatValue))))

(defn get-and-decrement
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the decrement operation. This method is not thread safe.

  returns: the value associated with the instance before it was decremented - `int`"
  (^Integer [^MutableInt this]
    (-> this (.getAndDecrement))))

(defn subtract
  "Subtracts a value from the value of this instance.

  operand - the value to subtract, not null - `int`"
  ([^MutableInt this ^Integer operand]
    (-> this (.subtract operand))))

(defn decrement
  "Decrements the value."
  ([^MutableInt this]
    (-> this (.decrement))))

(defn decrement-and-get
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately after the decrement operation. This method is not thread safe.

  returns: the value associated with the instance after it is decremented - `int`"
  (^Integer [^MutableInt this]
    (-> this (.decrementAndGet))))

(defn set-value
  "Sets the value.

  value - the value to set - `int`"
  ([^MutableInt this ^Integer value]
    (-> this (.setValue value))))

(defn int-value
  "Returns the value of this MutableInt as an int.

  returns: the numeric value represented by this object after conversion to type int. - `int`"
  (^Integer [^MutableInt this]
    (-> this (.intValue))))

(defn get-and-increment
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the increment operation. This method is not thread safe.

  returns: the value associated with the instance before it was incremented - `int`"
  (^Integer [^MutableInt this]
    (-> this (.getAndIncrement))))

(defn hash-code
  "Returns a suitable hash code for this mutable.

  returns: a suitable hash code - `int`"
  (^Integer [^MutableInt this]
    (-> this (.hashCode))))

(defn add
  "Adds a value to the value of this instance.

  operand - the value to add, not null - `int`"
  ([^MutableInt this ^Integer operand]
    (-> this (.add operand))))

(defn compare-to
  "Compares this mutable to another in ascending order.

  other - the other mutable to compare to, not null - `org.apache.commons.lang3.mutable.MutableInt`

  returns: negative if this is less, zero if equal, positive if greater - `int`"
  (^Integer [^MutableInt this ^org.apache.commons.lang3.mutable.MutableInt other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this object to the specified object. The result is true if and only if the argument is
   not null and is a MutableInt object that contains the same int value
   as this object.

  obj - the object to compare with, null returns false - `java.lang.Object`

  returns: true if the objects are the same; false otherwise. - `boolean`"
  (^Boolean [^MutableInt this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn increment-and-get
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately after the increment operation. This method is not thread safe.

  returns: the value associated with the instance after it is incremented - `int`"
  (^Integer [^MutableInt this]
    (-> this (.incrementAndGet))))

