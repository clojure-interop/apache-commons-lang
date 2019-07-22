(ns org.apache.commons.lang3.mutable.MutableBoolean
  "A mutable boolean wrapper.

  Note that as MutableBoolean does not extend Boolean, it is not treated by String.format as a Boolean parameter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.mutable MutableBoolean]))

(defn ->mutable-boolean
  "Constructor.

  Constructs a new MutableBoolean with the specified value.

  value - the initial value to store - `boolean`"
  (^MutableBoolean [^Boolean value]
    (new MutableBoolean value))
  (^MutableBoolean []
    (new MutableBoolean )))

(defn to-string
  "Returns the String value of this mutable.

  returns: the mutable value as a string - `java.lang.String`"
  (^java.lang.String [^MutableBoolean this]
    (-> this (.toString))))

(defn get-value?
  "Gets the value as a Boolean instance.

  returns: the value as a Boolean, never null - `java.lang.Boolean`"
  (^java.lang.Boolean [^MutableBoolean this]
    (-> this (.getValue))))

(defn true?
  "Checks if the current value is true.

  returns: true if the current value is true - `boolean`"
  (^Boolean [^MutableBoolean this]
    (-> this (.isTrue))))

(defn set-true
  "Sets the value to true."
  ([^MutableBoolean this]
    (-> this (.setTrue))))

(defn to-boolean
  "Gets this mutable as an instance of Boolean.

  returns: a Boolean instance containing the value from this mutable, never null - `java.lang.Boolean`"
  (^java.lang.Boolean [^MutableBoolean this]
    (-> this (.toBoolean))))

(defn set-false
  "Sets the value to false."
  ([^MutableBoolean this]
    (-> this (.setFalse))))

(defn set-value
  "Sets the value.

  value - the value to set - `boolean`"
  ([^MutableBoolean this ^Boolean value]
    (-> this (.setValue value))))

(defn hash-code
  "Returns a suitable hash code for this mutable.

  returns: the hash code returned by Boolean.TRUE or Boolean.FALSE - `int`"
  (^Integer [^MutableBoolean this]
    (-> this (.hashCode))))

(defn false?
  "Checks if the current value is false.

  returns: true if the current value is false - `boolean`"
  (^Boolean [^MutableBoolean this]
    (-> this (.isFalse))))

(defn compare-to
  "Compares this mutable to another in ascending order.

  other - the other mutable to compare to, not null - `org.apache.commons.lang3.mutable.MutableBoolean`

  returns: negative if this is less, zero if equal, positive if greater
    where false is less than true - `int`"
  (^Integer [^MutableBoolean this ^org.apache.commons.lang3.mutable.MutableBoolean other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this object to the specified object. The result is true if and only if the argument is
   not null and is an MutableBoolean object that contains the same
   boolean value as this object.

  obj - the object to compare with, null returns false - `java.lang.Object`

  returns: true if the objects are the same; false otherwise. - `boolean`"
  (^Boolean [^MutableBoolean this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn boolean-value
  "Returns the value of this MutableBoolean as a boolean.

  returns: the boolean value represented by this object. - `boolean`"
  (^Boolean [^MutableBoolean this]
    (-> this (.booleanValue))))

