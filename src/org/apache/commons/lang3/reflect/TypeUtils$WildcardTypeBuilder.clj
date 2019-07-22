(ns org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder
  "WildcardType builder."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.reflect TypeUtils$WildcardTypeBuilder]))

(defn with-upper-bounds
  "Specify upper bounds of the wildcard type to build.

  bounds - to set - `java.lang.reflect.Type`

  returns: this - `org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder`"
  (^org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder [^TypeUtils$WildcardTypeBuilder this ^java.lang.reflect.Type bounds]
    (-> this (.withUpperBounds bounds))))

(defn with-lower-bounds
  "Specify lower bounds of the wildcard type to build.

  bounds - to set - `java.lang.reflect.Type`

  returns: this - `org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder`"
  (^org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder [^TypeUtils$WildcardTypeBuilder this ^java.lang.reflect.Type bounds]
    (-> this (.withLowerBounds bounds))))

(defn build
  "Returns a reference to the object being constructed or result being
   calculated by the builder.

  returns: the object constructed or result calculated by the builder. - `java.lang.reflect.WildcardType`"
  (^java.lang.reflect.WildcardType [^TypeUtils$WildcardTypeBuilder this]
    (-> this (.build))))

