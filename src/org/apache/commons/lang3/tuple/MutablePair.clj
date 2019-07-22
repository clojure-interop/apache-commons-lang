(ns org.apache.commons.lang3.tuple.MutablePair
  "A mutable pair consisting of two Object elements.

  Not #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.tuple MutablePair]))

(defn ->mutable-pair
  "Constructor.

  Create a new pair instance.

  left - the left value, may be null - `L`
  right - the right value, may be null - `R`"
  (^MutablePair [left right]
    (new MutablePair left right))
  (^MutablePair []
    (new MutablePair )))

(defn left
  "Instance Field.

  Left object

  type: L"
  ([^MutablePair this]
    (-> this .-left)))

(defn right
  "Instance Field.

  Right object

  type: R"
  ([^MutablePair this]
    (-> this .-right)))

(defn *of
  "Obtains a mutable pair of two objects inferring the generic types.

   This factory allows the pair to be created using inference to
   obtain the generic types.

  left - the left element, may be null - `L`
  right - the right element, may be null - `R`

  returns: a pair formed from the two parameters, not null - `<L,R> org.apache.commons.lang3.tuple.MutablePair<L,R>`"
  ([left right]
    (MutablePair/of left right)))

(defn get-left
  "Gets the left element from this pair.

   When treated as a key-value pair, this is the key.

  returns: the left element, may be null - `L`"
  ([^MutablePair this]
    (-> this (.getLeft))))

(defn set-left
  "Sets the left element of the pair.

  left - the new value of the left element, may be null - `L`"
  ([^MutablePair this left]
    (-> this (.setLeft left))))

(defn get-right
  "Gets the right element from this pair.

   When treated as a key-value pair, this is the value.

  returns: the right element, may be null - `R`"
  ([^MutablePair this]
    (-> this (.getRight))))

(defn set-right
  "Sets the right element of the pair.

  right - the new value of the right element, may be null - `R`"
  ([^MutablePair this right]
    (-> this (.setRight right))))

(defn set-value
  "Sets the Map.Entry value.
   This sets the right element of the pair.

  value - the right value to set, not null - `R`

  returns: the old value for the right element - `R`"
  ([^MutablePair this value]
    (-> this (.setValue value))))

