(ns org.apache.commons.lang3.tuple.ImmutablePair
  "An immutable pair consisting of two Object elements.

  Although the implementation is immutable, there is no restriction on the objects
  that may be stored. If mutable objects are stored in the pair, then the pair
  itself effectively becomes mutable. The class is also final, so a subclass
  can not add undesirable behaviour.

  #ThreadSafe# if both paired objects are thread-safe"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.tuple ImmutablePair]))

(defn ->immutable-pair
  "Constructor.

  Create a new pair instance.

  left - the left value, may be null - `L`
  right - the right value, may be null - `R`"
  (^ImmutablePair [left right]
    (new ImmutablePair left right)))

(defn left
  "Instance Constant.

  Left object

  type: L"
  ([^ImmutablePair this]
    (-> this .-left)))

(defn right
  "Instance Constant.

  Right object

  type: R"
  ([^ImmutablePair this]
    (-> this .-right)))

(defn *null-pair
  "Returns an immutable pair of nulls.

  returns: an immutable pair of nulls. - `<L,R> org.apache.commons.lang3.tuple.ImmutablePair<L,R>`"
  ([]
    (ImmutablePair/nullPair )))

(defn *of
  "Obtains an immutable pair of two objects inferring the generic types.

   This factory allows the pair to be created using inference to
   obtain the generic types.

  left - the left element, may be null - `L`
  right - the right element, may be null - `R`

  returns: a pair formed from the two parameters, not null - `<L,R> org.apache.commons.lang3.tuple.ImmutablePair<L,R>`"
  ([left right]
    (ImmutablePair/of left right)))

(defn get-left
  "Gets the left element from this pair.

   When treated as a key-value pair, this is the key.

  returns: the left element, may be null - `L`"
  ([^ImmutablePair this]
    (-> this (.getLeft))))

(defn get-right
  "Gets the right element from this pair.

   When treated as a key-value pair, this is the value.

  returns: the right element, may be null - `R`"
  ([^ImmutablePair this]
    (-> this (.getRight))))

(defn set-value
  "Throws UnsupportedOperationException.

   This pair is immutable, so this operation is not supported.

  value - the value to set - `R`

  returns: never - `R`

  throws: java.lang.UnsupportedOperationException - as this operation is not supported"
  ([^ImmutablePair this value]
    (-> this (.setValue value))))

