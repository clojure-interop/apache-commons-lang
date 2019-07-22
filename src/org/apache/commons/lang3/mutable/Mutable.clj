(ns org.apache.commons.lang3.mutable.Mutable
  "Provides mutable access to a value.

  Mutable is used as a generic interface to the implementations in this package.

  A typical use case would be to enable a primitive or string to be passed to a method and allow that method to
  effectively change the value of the primitive/string. Another use case is to store a frequently changing primitive in
  a collection (for example a total in a map) without needing to create new Integer/Long wrapper objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.mutable Mutable]))

(defn get-value
  "Gets the value of this mutable.

  returns: the stored value - `T`"
  ([^Mutable this]
    (-> this (.getValue))))

(defn set-value
  "Sets the value of this mutable.

  value - the value to store - `T`

  throws: java.lang.NullPointerException - if the object is null and null is invalid"
  ([^Mutable this value]
    (-> this (.setValue value))))

