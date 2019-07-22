(ns org.apache.commons.lang3.tuple.MutableTriple
  "A mutable triple consisting of three Object elements.

  Not #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.tuple MutableTriple]))

(defn ->mutable-triple
  "Constructor.

  Create a new triple instance.

  left - the left value, may be null - `L`
  middle - the middle value, may be null - `M`
  right - the right value, may be null - `R`"
  (^MutableTriple [left middle right]
    (new MutableTriple left middle right))
  (^MutableTriple []
    (new MutableTriple )))

(defn left
  "Instance Field.

  Left object

  type: L"
  ([^MutableTriple this]
    (-> this .-left)))

(defn middle
  "Instance Field.

  Middle object

  type: M"
  ([^MutableTriple this]
    (-> this .-middle)))

(defn right
  "Instance Field.

  Right object

  type: R"
  ([^MutableTriple this]
    (-> this .-right)))

(defn *of
  "Obtains a mutable triple of three objects inferring the generic types.

   This factory allows the triple to be created using inference to
   obtain the generic types.

  left - the left element, may be null - `L`
  middle - the middle element, may be null - `M`
  right - the right element, may be null - `R`

  returns: a triple formed from the three parameters, not null - `<L,M,R> org.apache.commons.lang3.tuple.MutableTriple<L,M,R>`"
  ([left middle right]
    (MutableTriple/of left middle right)))

(defn get-left
  "Gets the left element from this triple.

  returns: the left element, may be null - `L`"
  ([^MutableTriple this]
    (-> this (.getLeft))))

(defn set-left
  "Sets the left element of the triple.

  left - the new value of the left element, may be null - `L`"
  ([^MutableTriple this left]
    (-> this (.setLeft left))))

(defn get-middle
  "Gets the middle element from this triple.

  returns: the middle element, may be null - `M`"
  ([^MutableTriple this]
    (-> this (.getMiddle))))

(defn set-middle
  "Sets the middle element of the triple.

  middle - the new value of the middle element, may be null - `M`"
  ([^MutableTriple this middle]
    (-> this (.setMiddle middle))))

(defn get-right
  "Gets the right element from this triple.

  returns: the right element, may be null - `R`"
  ([^MutableTriple this]
    (-> this (.getRight))))

(defn set-right
  "Sets the right element of the triple.

  right - the new value of the right element, may be null - `R`"
  ([^MutableTriple this right]
    (-> this (.setRight right))))

