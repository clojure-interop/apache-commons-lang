(ns org.apache.commons.lang3.builder.Diff
  " A Diff contains the differences between two Diffable class
  fields.



  Typically, Diffs are retrieved by using a DiffBuilder to
  produce a DiffResult, containing the differences between two objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder Diff]))

(defn get-type
  "Returns the type of the field.

  returns: the field type - `java.lang.reflect.Type`"
  (^java.lang.reflect.Type [^Diff this]
    (-> this (.getType))))

(defn get-field-name
  "Returns the name of the field.

  returns: the field name - `java.lang.String`"
  (^java.lang.String [^Diff this]
    (-> this (.getFieldName))))

(defn to-string
  "Returns a String representation of the Diff, with the
   following format:



   [fieldname: left-value, right-value]

  returns: the string representation - `java.lang.String`"
  (^java.lang.String [^Diff this]
    (-> this (.toString))))

(defn set-value
  "Throws UnsupportedOperationException.

  value - ignored - `T`

  returns: nothing - `T`"
  ([^Diff this value]
    (-> this (.setValue value))))

