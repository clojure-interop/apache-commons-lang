(ns org.apache.commons.lang3.text.StrLookup
  "Deprecated.
 as of 3.6, use commons-text

  StringLookupFactory instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text StrLookup]))

(defn *none-lookup
  "Deprecated.

  returns: a lookup that always returns null, not null - `org.apache.commons.lang3.text.StrLookup<?>`"
  (^org.apache.commons.lang3.text.StrLookup []
    (StrLookup/noneLookup )))

(defn *system-properties-lookup
  "Deprecated.

  returns: a lookup using system properties, not null - `org.apache.commons.lang3.text.StrLookup<java.lang.String>`"
  (^org.apache.commons.lang3.text.StrLookup []
    (StrLookup/systemPropertiesLookup )))

(defn *map-lookup
  "Deprecated.

  map - the map of keys to values, may be null - `java.util.Map`

  returns: a lookup using the map, not null - `<V> org.apache.commons.lang3.text.StrLookup<V>`"
  ([^java.util.Map map]
    (StrLookup/mapLookup map)))

(defn lookup
  "Deprecated.

  key - the key to be looked up, may be null - `java.lang.String`

  returns: the matching value, null if no match - `java.lang.String`"
  (^java.lang.String [^StrLookup this ^java.lang.String key]
    (-> this (.lookup key))))

