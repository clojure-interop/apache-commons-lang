(ns org.apache.commons.lang3.mutable.MutableLong
  "A mutable long wrapper.

  Note that as MutableLong does not extend Long, it is not treated by String.format as a Long parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.mutable MutableLong]))

(defn ->mutable-long
  "Constructor.

  Constructs a new MutableLong with the specified value.

  value - the initial value to store - `long`"
  (^MutableLong [^Long value]
    (new MutableLong value))
  (^MutableLong []
    (new MutableLong )))

(defn get-and-add
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately prior to the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `long`

  returns: the value associated with this instance immediately before the operand was added - `long`"
  (^Long [^MutableLong this ^Long operand]
    (-> this (.getAndAdd operand))))

(defn double-value
  "Returns the value of this MutableLong as a double.

  returns: the numeric value represented by this object after conversion to type double. - `double`"
  (^Double [^MutableLong this]
    (-> this (.doubleValue))))

(defn add-and-get
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately after the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `long`

  returns: the value associated with this instance after adding the operand - `long`"
  (^Long [^MutableLong this ^Long operand]
    (-> this (.addAndGet operand))))

(defn long-value
  "Returns the value of this MutableLong as a long.

  returns: the numeric value represented by this object after conversion to type long. - `long`"
  (^Long [^MutableLong this]
    (-> this (.longValue))))

(defn to-string
  "Returns the String value of this mutable.

  returns: the mutable value as a string - `java.lang.String`"
  (^java.lang.String [^MutableLong this]
    (-> this (.toString))))

(defn increment
  "Increments the value."
  ([^MutableLong this]
    (-> this (.increment))))

(defn get-value
  "Gets the value as a Long instance.

  returns: the value as a Long, never null - `java.lang.Long`"
  (^java.lang.Long [^MutableLong this]
    (-> this (.getValue))))

(defn float-value
  "Returns the value of this MutableLong as a float.

  returns: the numeric value represented by this object after conversion to type float. - `float`"
  (^Float [^MutableLong this]
    (-> this (.floatValue))))

(defn get-and-decrement
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the decrement operation. This method is not thread safe.

  returns: the value associated with the instance before it was decremented - `long`"
  (^Long [^MutableLong this]
    (-> this (.getAndDecrement))))

(defn subtract
  "Subtracts a value from the value of this instance.

  operand - the value to subtract, not null - `long`"
  ([^MutableLong this ^Long operand]
    (-> this (.subtract operand))))

(defn decrement
  "Decrements the value."
  ([^MutableLong this]
    (-> this (.decrement))))

(defn to-long
  "Gets this mutable as an instance of Long.

  returns: a Long instance containing the value from this mutable, never null - `java.lang.Long`"
  (^java.lang.Long [^MutableLong this]
    (-> this (.toLong))))

(defn decrement-and-get
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately after the decrement operation. This method is not thread safe.

  returns: the value associated with the instance after it is decremented - `long`"
  (^Long [^MutableLong this]
    (-> this (.decrementAndGet))))

(defn set-value
  "Sets the value.

  value - the value to set - `long`"
  ([^MutableLong this ^Long value]
    (-> this (.setValue value))))

(defn int-value
  "Returns the value of this MutableLong as an int.

  returns: the numeric value represented by this object after conversion to type int. - `int`"
  (^Integer [^MutableLong this]
    (-> this (.intValue))))

(defn get-and-increment
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the increment operation. This method is not thread safe.

  returns: the value associated with the instance before it was incremented - `long`"
  (^Long [^MutableLong this]
    (-> this (.getAndIncrement))))

(defn hash-code
  "Returns a suitable hash code for this mutable.

  returns: a suitable hash code - `int`"
  (^Integer [^MutableLong this]
    (-> this (.hashCode))))

(defn add
  "Adds a value to the value of this instance.

  operand - the value to add, not null - `long`"
  ([^MutableLong this ^Long operand]
    (-> this (.add operand))))

(defn compare-to
  "Compares this mutable to another in ascending order.

  other - the other mutable to compare to, not null - `org.apache.commons.lang3.mutable.MutableLong`

  returns: negative if this is less, zero if equal, positive if greater - `int`"
  (^Integer [^MutableLong this ^org.apache.commons.lang3.mutable.MutableLong other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this object to the specified object. The result is true if and only if the argument
   is not null and is a MutableLong object that contains the same long
   value as this object.

  obj - the object to compare with, null returns false - `java.lang.Object`

  returns: true if the objects are the same; false otherwise. - `boolean`"
  (^Boolean [^MutableLong this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn increment-and-get
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately after the increment operation. This method is not thread safe.

  returns: the value associated with the instance after it is incremented - `long`"
  (^Long [^MutableLong this]
    (-> this (.incrementAndGet))))

