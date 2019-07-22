(ns org.apache.commons.lang3.tuple.Pair
  "A pair consisting of two elements.

  This class is an abstract implementation defining the basic API.
  It refers to the elements as 'left' and 'right'. It also implements the
  Map.Entry interface where the key is 'left' and the value is 'right'.

  Subclass implementations may be mutable or immutable.
  However, there is no restriction on the type of the stored objects that may be stored.
  If mutable objects are stored in the pair, then the pair itself effectively becomes mutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.tuple Pair]))

(defn ->pair
  "Constructor."
  (^Pair []
    (new Pair )))

(defn *of
  "Obtains an immutable pair of two objects inferring the generic types.

   This factory allows the pair to be created using inference to
   obtain the generic types.

  left - the left element, may be null - `L`
  right - the right element, may be null - `R`

  returns: a pair formed from the two parameters, not null - `<L,R> org.apache.commons.lang3.tuple.Pair<L,R>`"
  ([left right]
    (Pair/of left right)))

(defn get-left
  "Gets the left element from this pair.

   When treated as a key-value pair, this is the key.

  returns: the left element, may be null - `L`"
  ([^Pair this]
    (-> this (.getLeft))))

(defn get-right
  "Gets the right element from this pair.

   When treated as a key-value pair, this is the value.

  returns: the right element, may be null - `R`"
  ([^Pair this]
    (-> this (.getRight))))

(defn get-key
  "Gets the key from this pair.

   This method implements the Map.Entry interface returning the
   left element as the key.

  returns: the left element as the key, may be null - `L`"
  ([^Pair this]
    (-> this (.getKey))))

(defn get-value
  "Gets the value from this pair.

   This method implements the Map.Entry interface returning the
   right element as the value.

  returns: the right element as the value, may be null - `R`"
  ([^Pair this]
    (-> this (.getValue))))

(defn compare-to
  "Compares the pair based on the left element followed by the right element.
   The types must be Comparable.

  other - the other pair, not null - `org.apache.commons.lang3.tuple.Pair`

  returns: negative if this is less, zero if equal, positive if greater - `int`"
  (^Integer [^Pair this ^org.apache.commons.lang3.tuple.Pair other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this pair to another based on the two elements.

  obj - the object to compare to, null returns false - `java.lang.Object`

  returns: true if the elements of the pair are equal - `boolean`"
  (^Boolean [^Pair this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Returns a suitable hash code.
   The hash code follows the definition in Map.Entry.

  returns: the hash code - `int`"
  (^Integer [^Pair this]
    (-> this (.hashCode))))

(defn to-string
  "Formats the receiver using the given format.

   This uses Formattable to perform the formatting. Two variables may
   be used to embed the left and right elements. Use %1$s for the left
   element (key) and %2$s for the right element (value).
   The default format used by toString() is (%1$s,%2$s).

  format - the format string, optionally containing %1$s and %2$s, not null - `java.lang.String`

  returns: the formatted string, not null - `java.lang.String`"
  (^java.lang.String [^Pair this ^java.lang.String format]
    (-> this (.toString format)))
  (^java.lang.String [^Pair this]
    (-> this (.toString))))

