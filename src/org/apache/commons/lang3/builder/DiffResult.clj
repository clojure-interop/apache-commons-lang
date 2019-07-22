(ns org.apache.commons.lang3.builder.DiffResult
  " A DiffResult contains a collection of the differences between two
  Diffable objects. Typically these differences are displayed using
  toString() method, which returns a string describing the fields that
  differ between the objects.


  Use a DiffBuilder to build a DiffResult comparing two objects."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder DiffResult]))

(def *-objects-same-string
  "Static Constant.

  The String returned when the objects have no differences:
   \"\"

  type: java.lang.String"
  DiffResult/OBJECTS_SAME_STRING)

(defn get-diffs
  "Returns an unmodifiable list of Diffs. The list may be empty if
   there were no differences between the objects.

  returns: an unmodifiable list of Diffs - `java.util.List<org.apache.commons.lang3.builder.Diff<?>>`"
  (^java.util.List [^DiffResult this]
    (-> this (.getDiffs))))

(defn get-number-of-diffs
  "Returns the number of differences between the two objects.

  returns: the number of differences - `int`"
  (^Integer [^DiffResult this]
    (-> this (.getNumberOfDiffs))))

(defn get-to-string-style
  "Returns the style used by the toString() method.

  returns: the style - `org.apache.commons.lang3.builder.ToStringStyle`"
  (^org.apache.commons.lang3.builder.ToStringStyle [^DiffResult this]
    (-> this (.getToStringStyle))))

(defn to-string
  "Builds a String description of the differences contained within
   this DiffResult, using the supplied ToStringStyle.

  style - the ToStringStyle to use when outputting the objects - `org.apache.commons.lang3.builder.ToStringStyle`

  returns: a String description of the differences. - `java.lang.String`"
  (^java.lang.String [^DiffResult this ^org.apache.commons.lang3.builder.ToStringStyle style]
    (-> this (.toString style)))
  (^java.lang.String [^DiffResult this]
    (-> this (.toString))))

(defn iterator
  "Returns an iterator over the Diff objects contained in this list.

  returns: the iterator - `java.util.Iterator<org.apache.commons.lang3.builder.Diff<?>>`"
  (^java.util.Iterator [^DiffResult this]
    (-> this (.iterator))))

