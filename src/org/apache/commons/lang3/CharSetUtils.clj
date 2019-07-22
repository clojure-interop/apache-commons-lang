(ns org.apache.commons.lang3.CharSetUtils
  "Operations on CharSet instances.

  This class handles null input gracefully.
  An exception will not be thrown for a null input.
  Each method documents its behaviour in more detail.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 CharSetUtils]))

(defn ->char-set-utils
  "Constructor.

  CharSetUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as CharSetUtils.evaluateSet(null);.

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^CharSetUtils []
    (new CharSetUtils )))

(defn *squeeze
  "Squeezes any repetitions of a character that is mentioned in the
   supplied set.



   CharSetUtils.squeeze(null, *)        = null
   CharSetUtils.squeeze(\"\", *)          = \"\"
   CharSetUtils.squeeze(*, null)        = *
   CharSetUtils.squeeze(*, \"\")          = *
   CharSetUtils.squeeze(\"hello\", \"k-p\") = \"helo\"
   CharSetUtils.squeeze(\"hello\", \"a-e\") = \"hello\"

  str - the string to squeeze, may be null - `java.lang.String`
  set - the character set to use for manipulation, may be null - `java.lang.String`

  returns: the modified String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String set]
    (CharSetUtils/squeeze str set)))

(defn *contains-any
  "Takes an argument in set-syntax, see evaluateSet,
   and identifies whether any of the characters are present in the specified string.



   CharSetUtils.containsAny(null, *)        = false
   CharSetUtils.containsAny(\"\", *)          = false
   CharSetUtils.containsAny(*, null)        = false
   CharSetUtils.containsAny(*, \"\")          = false
   CharSetUtils.containsAny(\"hello\", \"k-p\") = true
   CharSetUtils.containsAny(\"hello\", \"a-d\") = false

  str - String to look for characters in, may be null - `java.lang.String`
  set - String[] set of characters to identify, may be null - `java.lang.String`

  returns: whether or not the characters in the set are in the primary string - `boolean`"
  (^Boolean [^java.lang.String str ^java.lang.String set]
    (CharSetUtils/containsAny str set)))

(defn *count
  "Takes an argument in set-syntax, see evaluateSet,
   and returns the number of characters present in the specified string.



   CharSetUtils.count(null, *)        = 0
   CharSetUtils.count(\"\", *)          = 0
   CharSetUtils.count(*, null)        = 0
   CharSetUtils.count(*, \"\")          = 0
   CharSetUtils.count(\"hello\", \"k-p\") = 3
   CharSetUtils.count(\"hello\", \"a-e\") = 1

  str - String to count characters in, may be null - `java.lang.String`
  set - String[] set of characters to count, may be null - `java.lang.String`

  returns: the character count, zero if null string input - `int`"
  (^Integer [^java.lang.String str ^java.lang.String set]
    (CharSetUtils/count str set)))

(defn *keep
  "Takes an argument in set-syntax, see evaluateSet,
   and keeps any of characters present in the specified string.



   CharSetUtils.keep(null, *)        = null
   CharSetUtils.keep(\"\", *)          = \"\"
   CharSetUtils.keep(*, null)        = \"\"
   CharSetUtils.keep(*, \"\")          = \"\"
   CharSetUtils.keep(\"hello\", \"hl\")  = \"hll\"
   CharSetUtils.keep(\"hello\", \"le\")  = \"ell\"

  str - String to keep characters from, may be null - `java.lang.String`
  set - String[] set of characters to keep, may be null - `java.lang.String`

  returns: the modified String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String set]
    (CharSetUtils/keep str set)))

(defn *delete
  "Takes an argument in set-syntax, see evaluateSet,
   and deletes any of characters present in the specified string.



   CharSetUtils.delete(null, *)        = null
   CharSetUtils.delete(\"\", *)          = \"\"
   CharSetUtils.delete(*, null)        = *
   CharSetUtils.delete(*, \"\")          = *
   CharSetUtils.delete(\"hello\", \"hl\")  = \"eo\"
   CharSetUtils.delete(\"hello\", \"le\")  = \"ho\"

  str - String to delete characters from, may be null - `java.lang.String`
  set - String[] set of characters to delete, may be null - `java.lang.String`

  returns: the modified String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String set]
    (CharSetUtils/delete str set)))

