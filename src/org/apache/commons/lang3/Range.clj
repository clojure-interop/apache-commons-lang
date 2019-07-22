(ns org.apache.commons.lang3.Range
  "An immutable range of objects from a minimum to maximum point inclusive.

  The objects need to either be implementations of Comparable
  or you need to supply a Comparator.

  #ThreadSafe# if the objects and comparator are thread-safe"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Range]))

(defn *is
  "Obtains a range using the specified element as both the minimum
   and maximum in this range.

   The range uses the specified Comparator to determine where
   values lie in the range.

  element - the value to use for this range, must not be null - `T`
  comparator - the comparator to be used, null for natural ordering - `java.util.Comparator`

  returns: the range object, not null - `<T> org.apache.commons.lang3.Range<T>`

  throws: java.lang.IllegalArgumentException - if the element is null"
  ([element ^java.util.Comparator comparator]
    (Range/is element comparator))
  ([element]
    (Range/is element)))

(defn *between
  "Obtains a range with the specified minimum and maximum values (both inclusive).

   The range uses the specified Comparator to determine where
   values lie in the range.

   The arguments may be passed in the order (min,max) or (max,min).
   The getMinimum and getMaximum methods will return the correct values.

  from-inclusive - the first value that defines the edge of the range, inclusive - `T`
  to-inclusive - the second value that defines the edge of the range, inclusive - `T`
  comparator - the comparator to be used, null for natural ordering - `java.util.Comparator`

  returns: the range object, not null - `<T> org.apache.commons.lang3.Range<T>`

  throws: java.lang.IllegalArgumentException - if either element is null"
  ([from-inclusive to-inclusive ^java.util.Comparator comparator]
    (Range/between from-inclusive to-inclusive comparator))
  ([from-inclusive to-inclusive]
    (Range/between from-inclusive to-inclusive)))

(defn ended-by?
  "Checks whether this range ends with the specified element.

  element - the element to check for, null returns false - `T`

  returns: true if the specified element occurs within this range - `boolean`"
  (^Boolean [^Range this element]
    (-> this (.isEndedBy element))))

(defn get-minimum
  "Gets the minimum value in this range.

  returns: the minimum value in this range, not null - `T`"
  ([^Range this]
    (-> this (.getMinimum))))

(defn contains-range
  "Checks whether this range contains all the elements of the specified range.

   This method may fail if the ranges have two different comparators or element types.

  other-range - the range to check, null returns false - `org.apache.commons.lang3.Range`

  returns: true if this range contains the specified range - `boolean`

  throws: java.lang.RuntimeException - if ranges cannot be compared"
  (^Boolean [^Range this ^org.apache.commons.lang3.Range other-range]
    (-> this (.containsRange other-range))))

(defn before-range?
  "Checks whether this range is completely before the specified range.

   This method may fail if the ranges have two different comparators or element types.

  other-range - the range to check, null returns false - `org.apache.commons.lang3.Range`

  returns: true if this range is completely before the specified range - `boolean`

  throws: java.lang.RuntimeException - if ranges cannot be compared"
  (^Boolean [^Range this ^org.apache.commons.lang3.Range other-range]
    (-> this (.isBeforeRange other-range))))

(defn contains
  "Checks whether the specified element occurs within this range.

  element - the element to check for, null returns false - `T`

  returns: true if the specified element occurs within this range - `boolean`"
  (^Boolean [^Range this element]
    (-> this (.contains element))))

(defn after-range?
  "Checks whether this range is completely after the specified range.

   This method may fail if the ranges have two different comparators or element types.

  other-range - the range to check, null returns false - `org.apache.commons.lang3.Range`

  returns: true if this range is completely after the specified range - `boolean`

  throws: java.lang.RuntimeException - if ranges cannot be compared"
  (^Boolean [^Range this ^org.apache.commons.lang3.Range other-range]
    (-> this (.isAfterRange other-range))))

(defn started-by?
  "Checks whether this range starts with the specified element.

  element - the element to check for, null returns false - `T`

  returns: true if the specified element occurs within this range - `boolean`"
  (^Boolean [^Range this element]
    (-> this (.isStartedBy element))))

(defn to-string
  "Formats the receiver using the given format.

   This uses Formattable to perform the formatting. Three variables may
   be used to embed the minimum, maximum and comparator.
   Use %1$s for the minimum element, %2$s for the maximum element
   and %3$s for the comparator.
   The default format used by toString() is [%1$s..%2$s].

  format - the format string, optionally containing %1$s, %2$s and %3$s, not null - `java.lang.String`

  returns: the formatted string, not null - `java.lang.String`"
  (^java.lang.String [^Range this ^java.lang.String format]
    (-> this (.toString format)))
  (^java.lang.String [^Range this]
    (-> this (.toString))))

(defn before?
  "Checks whether this range is before the specified element.

  element - the element to check for, null returns false - `T`

  returns: true if this range is entirely before the specified element - `boolean`"
  (^Boolean [^Range this element]
    (-> this (.isBefore element))))

(defn overlapped-by?
  "Checks whether this range is overlapped by the specified range.

   Two ranges overlap if there is at least one element in common.

   This method may fail if the ranges have two different comparators or element types.

  other-range - the range to test, null returns false - `org.apache.commons.lang3.Range`

  returns: true if the specified range overlaps with this
    range; otherwise, false - `boolean`

  throws: java.lang.RuntimeException - if ranges cannot be compared"
  (^Boolean [^Range this ^org.apache.commons.lang3.Range other-range]
    (-> this (.isOverlappedBy other-range))))

(defn get-comparator
  "Gets the comparator being used to determine if objects are within the range.

   Natural ordering uses an internal comparator implementation, thus this
   method never returns null. See isNaturalOrdering().

  returns: the comparator being used, not null - `java.util.Comparator<T>`"
  (^java.util.Comparator [^Range this]
    (-> this (.getComparator))))

(defn after?
  "Checks whether this range is after the specified element.

  element - the element to check for, null returns false - `T`

  returns: true if this range is entirely after the specified element - `boolean`"
  (^Boolean [^Range this element]
    (-> this (.isAfter element))))

(defn natural-ordering?
  "Whether or not the Range is using the natural ordering of the elements.

   Natural ordering uses an internal comparator implementation, thus this
   method is the only way to check if a null comparator was specified.

  returns: true if using natural ordering - `boolean`"
  (^Boolean [^Range this]
    (-> this (.isNaturalOrdering))))

(defn hash-code
  "Gets a suitable hash code for the range.

  returns: a hash code value for this object - `int`"
  (^Integer [^Range this]
    (-> this (.hashCode))))

(defn element-compare-to
  "Checks where the specified element occurs relative to this range.

   The API is reminiscent of the Comparable interface returning -1 if
   the element is before the range, 0 if contained within the range and
   1 if the element is after the range.

  element - the element to check for, not null - `T`

  returns: -1, 0 or 1 depending on the element's location relative to the range - `int`"
  (^Integer [^Range this element]
    (-> this (.elementCompareTo element))))

(defn get-maximum
  "Gets the maximum value in this range.

  returns: the maximum value in this range, not null - `T`"
  ([^Range this]
    (-> this (.getMaximum))))

(defn intersection-with
  "Calculate the intersection of this and an overlapping Range.

  other - overlapping Range - `org.apache.commons.lang3.Range`

  returns: range representing the intersection of this and other (this if equal) - `org.apache.commons.lang3.Range<T>`

  throws: java.lang.IllegalArgumentException - if other does not overlap this"
  (^org.apache.commons.lang3.Range [^Range this ^org.apache.commons.lang3.Range other]
    (-> this (.intersectionWith other))))

(defn equals
  "Compares this range to another object to test if they are equal..

   To be equal, the minimum and maximum values must be equal, which
   ignores any differences in the comparator.

  obj - the reference object with which to compare - `java.lang.Object`

  returns: true if this object is equal - `boolean`"
  (^Boolean [^Range this ^java.lang.Object obj]
    (-> this (.equals obj))))

