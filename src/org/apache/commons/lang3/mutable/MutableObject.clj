(ns org.apache.commons.lang3.mutable.MutableObject
  "A mutable Object wrapper."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.mutable MutableObject]))

(defn ->mutable-object
  "Constructor.

  Constructs a new MutableObject with the specified value.

  value - the initial value to store - `T`"
  (^MutableObject [value]
    (new MutableObject value))
  (^MutableObject []
    (new MutableObject )))

(defn get-value
  "Gets the value.

  returns: the value, may be null - `T`"
  ([^MutableObject this]
    (-> this (.getValue))))

(defn set-value
  "Sets the value.

  value - the value to set - `T`"
  ([^MutableObject this value]
    (-> this (.setValue value))))

(defn equals
  "Compares this object against the specified object. The result is true if and only if the argument
   is not null and is a MutableObject object that contains the same T
   value as this object.

  obj - the object to compare with, null returns false - `java.lang.Object`

  returns: true if the objects are the same;
            true if the objects have equivalent value fields;
            false otherwise. - `boolean`"
  (^Boolean [^MutableObject this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Returns the value's hash code or 0 if the value is null.

  returns: the value's hash code or 0 if the value is null. - `int`"
  (^Integer [^MutableObject this]
    (-> this (.hashCode))))

(defn to-string
  "Returns the String value of this mutable.

  returns: the mutable value as a string - `java.lang.String`"
  (^java.lang.String [^MutableObject this]
    (-> this (.toString))))

