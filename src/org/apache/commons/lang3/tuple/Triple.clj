(ns org.apache.commons.lang3.tuple.Triple
  "A triple consisting of three elements.

  This class is an abstract implementation defining the basic API.
  It refers to the elements as 'left', 'middle' and 'right'.

  Subclass implementations may be mutable or immutable.
  However, there is no restriction on the type of the stored objects that may be stored.
  If mutable objects are stored in the triple, then the triple itself effectively becomes mutable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.tuple Triple]))

(defn ->triple
  "Constructor."
  (^Triple []
    (new Triple )))

(defn *of
  "Obtains an immutable triple of three objects inferring the generic types.

   This factory allows the triple to be created using inference to
   obtain the generic types.

  left - the left element, may be null - `L`
  middle - the middle element, may be null - `M`
  right - the right element, may be null - `R`

  returns: a triple formed from the three parameters, not null - `<L,M,R> org.apache.commons.lang3.tuple.Triple<L,M,R>`"
  ([left middle right]
    (Triple/of left middle right)))

(defn get-left
  "Gets the left element from this triple.

  returns: the left element, may be null - `L`"
  ([^Triple this]
    (-> this (.getLeft))))

(defn get-middle
  "Gets the middle element from this triple.

  returns: the middle element, may be null - `M`"
  ([^Triple this]
    (-> this (.getMiddle))))

(defn get-right
  "Gets the right element from this triple.

  returns: the right element, may be null - `R`"
  ([^Triple this]
    (-> this (.getRight))))

(defn compare-to
  "Compares the triple based on the left element, followed by the middle element,
   finally the right element.
   The types must be Comparable.

  other - the other triple, not null - `org.apache.commons.lang3.tuple.Triple`

  returns: negative if this is less, zero if equal, positive if greater - `int`"
  (^Integer [^Triple this ^org.apache.commons.lang3.tuple.Triple other]
    (-> this (.compareTo other))))

(defn equals
  "Compares this triple to another based on the three elements.

  obj - the object to compare to, null returns false - `java.lang.Object`

  returns: true if the elements of the triple are equal - `boolean`"
  (^Boolean [^Triple this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Returns a suitable hash code.

  returns: the hash code - `int`"
  (^Integer [^Triple this]
    (-> this (.hashCode))))

(defn to-string
  "Formats the receiver using the given format.

   This uses Formattable to perform the formatting. Three variables may
   be used to embed the left and right elements. Use %1$s for the left
   element, %2$s for the middle and %3$s for the right element.
   The default format used by toString() is (%1$s,%2$s,%3$s).

  format - the format string, optionally containing %1$s, %2$s and %3$s, not null - `java.lang.String`

  returns: the formatted string, not null - `java.lang.String`"
  (^java.lang.String [^Triple this ^java.lang.String format]
    (-> this (.toString format)))
  (^java.lang.String [^Triple this]
    (-> this (.toString))))

