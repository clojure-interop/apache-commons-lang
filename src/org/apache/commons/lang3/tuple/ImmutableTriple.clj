(ns org.apache.commons.lang3.tuple.ImmutableTriple
  "An immutable triple consisting of three Object elements.

  Although the implementation is immutable, there is no restriction on the objects
  that may be stored. If mutable objects are stored in the triple, then the triple
  itself effectively becomes mutable. The class is also final, so a subclass
  can not add undesirable behaviour.

  #ThreadSafe# if all three objects are thread-safe"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.tuple ImmutableTriple]))

(defn ->immutable-triple
  "Constructor.

  Create a new triple instance.

  left - the left value, may be null - `L`
  middle - the middle value, may be null - `M`
  right - the right value, may be null - `R`"
  (^ImmutableTriple [left middle right]
    (new ImmutableTriple left middle right)))

(defn left
  "Instance Constant.

  Left object

  type: L"
  ([^ImmutableTriple this]
    (-> this .-left)))

(defn middle
  "Instance Constant.

  Middle object

  type: M"
  ([^ImmutableTriple this]
    (-> this .-middle)))

(defn right
  "Instance Constant.

  Right object

  type: R"
  ([^ImmutableTriple this]
    (-> this .-right)))

(defn *null-triple
  "Returns an immutable triple of nulls.

  returns: an immutable triple of nulls. - `<L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L,M,R>`"
  ([]
    (ImmutableTriple/nullTriple )))

(defn *of
  "Obtains an immutable triple of three objects inferring the generic types.

   This factory allows the triple to be created using inference to
   obtain the generic types.

  left - the left element, may be null - `L`
  middle - the middle element, may be null - `M`
  right - the right element, may be null - `R`

  returns: a triple formed from the three parameters, not null - `<L,M,R> org.apache.commons.lang3.tuple.ImmutableTriple<L,M,R>`"
  ([left middle right]
    (ImmutableTriple/of left middle right)))

(defn get-left
  "Gets the left element from this triple.

  returns: the left element, may be null - `L`"
  ([^ImmutableTriple this]
    (-> this (.getLeft))))

(defn get-middle
  "Gets the middle element from this triple.

  returns: the middle element, may be null - `M`"
  ([^ImmutableTriple this]
    (-> this (.getMiddle))))

(defn get-right
  "Gets the right element from this triple.

  returns: the right element, may be null - `R`"
  ([^ImmutableTriple this]
    (-> this (.getRight))))

