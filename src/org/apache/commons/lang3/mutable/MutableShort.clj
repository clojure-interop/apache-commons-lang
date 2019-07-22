(ns org.apache.commons.lang3.mutable.MutableShort
  "A mutable short wrapper.

  Note that as MutableShort does not extend Short, it is not treated by String.format as a Short parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.mutable MutableShort]))

(defn ->mutable-short
  "Constructor.

  Constructs a new MutableShort with the specified value.

  value - the initial value to store - `short`"
  (^MutableShort [^Short value]
    (new MutableShort value))
  (^MutableShort []
    (new MutableShort )))

(defn get-and-add
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately prior to the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `short`

  returns: the value associated with this instance immediately before the operand was added - `short`"
  (^Short [^MutableShort this ^Short operand]
    (-> this (.getAndAdd operand))))

(defn short-value
  "Returns the value of this MutableShort as a short.

  returns: the numeric value represented by this object after conversion to type short. - `short`"
  (^Short [^MutableShort this]
    (-> this (.shortValue))))

(defn double-value
  "Returns the value of this MutableShort as a double.

  returns: the numeric value represented by this object after conversion to type double. - `double`"
  (^Double [^MutableShort this]
    (-> this (.doubleValue))))

(defn add-and-get
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately after the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `short`

  returns: the value associated with this instance after adding the operand - `short`"
  (^Short [^MutableShort this ^Short operand]
    (-> this (.addAndGet operand))))

(defn long-value
  "Returns the value of this MutableShort as a long.

  returns: the numeric value represented by this object after conversion to type long. - `long`"
  (^Long [^MutableShort this]
    (-> this (.longValue))))

(defn to-string
  "Returns the String value of this mutable.

  returns: the mutable value as a string - `java.lang.String`"
  (^java.lang.String [^MutableShort this]
    (-> this (.toString))))

(defn increment
  "Increments the value."
  ([^MutableShort this]
    (-> this (.increment))))

(defn get-value
  "Gets the value as a Short instance.

  returns: the value as a Short, never null - `java.lang.Short`"
  (^java.lang.Short [^MutableShort this]
    (-> this (.getValue))))

(defn float-value
  "Returns the value of this MutableShort as a float.

  returns: the numeric value represented by this object after conversion to type float. - `float`"
  (^Float [^MutableShort this]
    (-> this (.floatValue))))

(defn get-and-decrement
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the decrement operation. This method is not thread safe.

  returns: the value associated with the instance before it was decremented - `short`"
  (^Short [^MutableShort this]
    (-> this (.getAndDecrement))))

(defn subtract
  "Subtracts a value from the value of this instance.

  operand - the value to subtract, not null - `short`"
  ([^MutableShort this ^Short operand]
    (-> this (.subtract operand))))

(defn decrement
  "Decrements the value."
  ([^MutableShort this]
    (-> this (.decrement))))

(defn to-short
  "Gets this mutable as an instance of Short.

  returns: a Short instance containing the value from this mutable, never null - `java.lang.Short`"
  (^java.lang.Short [^MutableShort this]
    (-> this (.toShort))))

(defn decrement-and-get
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately after the decrement operation. This method is not thread safe.

  returns: the value associated with the instance after it is decremented - `short`"
  (^Short [^MutableShort this]
    (-> this (.decrementAndGet))))

(defn set-value
  "Sets the value.

  value - the value to set - `short`"
  ([^MutableShort this ^Short value]
    (-> this (.setValue value))))

(defn int-value
  "Returns the value of this MutableShort as an int.

  returns: the numeric value represented by this object after conversion to type int. - `int`"
  (^Integer [^MutableShort this]
    (-> this (.intValue))))

(defn get-and-increment
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the increment operation. This method is not thread safe.

  returns: the value associated with the instance before it was incremented - `short`"
  (^Short [^MutableShort this]
    (-> this (.getAndIncrement))))

(defn hash-code
  "Returns a suitable hash code for this mutable.

  returns: a suitable hash code - `int`"
  (^Integer [^MutableShort this]
    (-> this (.hashCode))))

(defn add
  "Adds a value to the value of this instance.

  operand - the value to add, not null - `short`"
  ([^MutableShort this ^Short operand]
    (-> this (.add operand))))

(defn compare-to
  "Compares this mutable to another in ascending order.

  other - the other mutable to compare to, not null - `org.apache.commons.lang3.mutable.MutableShort`

  returns: negative if this is less, zero if equal, positive if greater - `int`"
  (^Integer [^MutableShort this ^org.apache.commons.lang3.mutable.MutableShort other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this object to the specified object. The result is true if and only if the argument
   is not null and is a MutableShort object that contains the same short
   value as this object.

  obj - the object to compare with, null returns false - `java.lang.Object`

  returns: true if the objects are the same; false otherwise. - `boolean`"
  (^Boolean [^MutableShort this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn increment-and-get
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately after the increment operation. This method is not thread safe.

  returns: the value associated with the instance after it is incremented - `short`"
  (^Short [^MutableShort this]
    (-> this (.incrementAndGet))))

