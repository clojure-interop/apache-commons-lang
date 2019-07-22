(ns org.apache.commons.lang3.CharSequenceUtils
  "Operations on CharSequence that are
  null safe."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 CharSequenceUtils]))

(defn ->char-sequence-utils
  "Constructor.

  CharSequenceUtils instances should NOT be constructed in
   standard programming.

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^CharSequenceUtils []
    (new CharSequenceUtils )))

(defn *sub-sequence
  "Returns a new CharSequence that is a subsequence of this
   sequence starting with the char value at the specified index.

   This provides the CharSequence equivalent to String.substring(int).
   The length (in char) of the returned sequence is length() - start,
   so if start == end then an empty sequence is returned.

  cs - the specified subsequence, null returns null - `java.lang.CharSequence`
  start - the start index, inclusive, valid - `int`

  returns: a new subsequence, may be null - `java.lang.CharSequence`

  throws: java.lang.IndexOutOfBoundsException - if start is negative or if start is greater than length()"
  (^java.lang.CharSequence [^java.lang.CharSequence cs ^Integer start]
    (CharSequenceUtils/subSequence cs start)))

