(ns org.apache.commons.lang3.mutable.MutableByte
  "A mutable byte wrapper.

  Note that as MutableByte does not extend Byte, it is not treated by String.format as a Byte parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.mutable MutableByte]))

(defn ->mutable-byte
  "Constructor.

  Constructs a new MutableByte with the specified value.

  value - the initial value to store - `byte`"
  (^MutableByte [^Byte value]
    (new MutableByte value))
  (^MutableByte []
    (new MutableByte )))

(defn get-and-add
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately prior to the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `byte`

  returns: the value associated with this instance immediately before the operand was added - `byte`"
  (^Byte [^MutableByte this ^Byte operand]
    (-> this (.getAndAdd operand))))

(defn double-value
  "Returns the value of this MutableByte as a double.

  returns: the numeric value represented by this object after conversion to type double. - `double`"
  (^Double [^MutableByte this]
    (-> this (.doubleValue))))

(defn add-and-get
  "Increments this instance's value by operand; this method returns the value associated with the instance
   immediately after the addition operation. This method is not thread safe.

  operand - the quantity to add, not null - `byte`

  returns: the value associated with this instance after adding the operand - `byte`"
  (^Byte [^MutableByte this ^Byte operand]
    (-> this (.addAndGet operand))))

(defn long-value
  "Returns the value of this MutableByte as a long.

  returns: the numeric value represented by this object after conversion to type long. - `long`"
  (^Long [^MutableByte this]
    (-> this (.longValue))))

(defn byte-value
  "Returns the value of this MutableByte as a byte.

  returns: the numeric value represented by this object after conversion to type byte. - `byte`"
  (^Byte [^MutableByte this]
    (-> this (.byteValue))))

(defn to-string
  "Returns the String value of this mutable.

  returns: the mutable value as a string - `java.lang.String`"
  (^java.lang.String [^MutableByte this]
    (-> this (.toString))))

(defn increment
  "Increments the value."
  ([^MutableByte this]
    (-> this (.increment))))

(defn get-value
  "Gets the value as a Byte instance.

  returns: the value as a Byte, never null - `java.lang.Byte`"
  (^java.lang.Byte [^MutableByte this]
    (-> this (.getValue))))

(defn float-value
  "Returns the value of this MutableByte as a float.

  returns: the numeric value represented by this object after conversion to type float. - `float`"
  (^Float [^MutableByte this]
    (-> this (.floatValue))))

(defn to-byte
  "Gets this mutable as an instance of Byte.

  returns: a Byte instance containing the value from this mutable - `java.lang.Byte`"
  (^java.lang.Byte [^MutableByte this]
    (-> this (.toByte))))

(defn get-and-decrement
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the decrement operation. This method is not thread safe.

  returns: the value associated with the instance before it was decremented - `byte`"
  (^Byte [^MutableByte this]
    (-> this (.getAndDecrement))))

(defn subtract
  "Subtracts a value from the value of this instance.

  operand - the value to subtract, not null - `byte`"
  ([^MutableByte this ^Byte operand]
    (-> this (.subtract operand))))

(defn decrement
  "Decrements the value."
  ([^MutableByte this]
    (-> this (.decrement))))

(defn decrement-and-get
  "Decrements this instance's value by 1; this method returns the value associated with the instance
   immediately after the decrement operation. This method is not thread safe.

  returns: the value associated with the instance after it is decremented - `byte`"
  (^Byte [^MutableByte this]
    (-> this (.decrementAndGet))))

(defn set-value
  "Sets the value.

  value - the value to set - `byte`"
  ([^MutableByte this ^Byte value]
    (-> this (.setValue value))))

(defn int-value
  "Returns the value of this MutableByte as an int.

  returns: the numeric value represented by this object after conversion to type int. - `int`"
  (^Integer [^MutableByte this]
    (-> this (.intValue))))

(defn get-and-increment
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately prior to the increment operation. This method is not thread safe.

  returns: the value associated with the instance before it was incremented - `byte`"
  (^Byte [^MutableByte this]
    (-> this (.getAndIncrement))))

(defn hash-code
  "Returns a suitable hash code for this mutable.

  returns: a suitable hash code - `int`"
  (^Integer [^MutableByte this]
    (-> this (.hashCode))))

(defn add
  "Adds a value to the value of this instance.

  operand - the value to add, not null - `byte`"
  ([^MutableByte this ^Byte operand]
    (-> this (.add operand))))

(defn compare-to
  "Compares this mutable to another in ascending order.

  other - the other mutable to compare to, not null - `org.apache.commons.lang3.mutable.MutableByte`

  returns: negative if this is less, zero if equal, positive if greater - `int`"
  (^Integer [^MutableByte this ^org.apache.commons.lang3.mutable.MutableByte other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this object to the specified object. The result is true if and only if the argument is
   not null and is a MutableByte object that contains the same byte value
   as this object.

  obj - the object to compare with, null returns false - `java.lang.Object`

  returns: true if the objects are the same; false otherwise. - `boolean`"
  (^Boolean [^MutableByte this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn increment-and-get
  "Increments this instance's value by 1; this method returns the value associated with the instance
   immediately after the increment operation. This method is not thread safe.

  returns: the value associated with the instance after it is incremented - `byte`"
  (^Byte [^MutableByte this]
    (-> this (.incrementAndGet))))

