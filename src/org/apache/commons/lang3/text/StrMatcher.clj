(ns org.apache.commons.lang3.text.StrMatcher
  "Deprecated.
 as of 3.6, use commons-text

  StringMatcherFactory instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text StrMatcher]))

(defn *single-quote-matcher
  "Deprecated.

  returns: a matcher for a single quote - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher []
    (StrMatcher/singleQuoteMatcher )))

(defn *tab-matcher
  "Deprecated.

  returns: a matcher for a tab - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher []
    (StrMatcher/tabMatcher )))

(defn *trim-matcher
  "Deprecated.

  returns: the trim matcher - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher []
    (StrMatcher/trimMatcher )))

(defn *char-set-matcher
  "Deprecated.

  chars - the characters to match, null or empty matches nothing - `char`

  returns: a new matcher for the given char[] - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^Character chars]
    (StrMatcher/charSetMatcher chars)))

(defn *none-matcher
  "Deprecated.

  returns: a matcher that matches nothing - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher []
    (StrMatcher/noneMatcher )))

(defn *split-matcher
  "Deprecated.

  returns: the split matcher - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher []
    (StrMatcher/splitMatcher )))

(defn *comma-matcher
  "Deprecated.

  returns: a matcher for a comma - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher []
    (StrMatcher/commaMatcher )))

(defn *double-quote-matcher
  "Deprecated.

  returns: a matcher for a double quote - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher []
    (StrMatcher/doubleQuoteMatcher )))

(defn *string-matcher
  "Deprecated.

  str - the string to match, null or empty matches nothing - `java.lang.String`

  returns: a new Matcher for the given String - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^java.lang.String str]
    (StrMatcher/stringMatcher str)))

(defn *space-matcher
  "Deprecated.

  returns: a matcher for a space - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher []
    (StrMatcher/spaceMatcher )))

(defn *char-matcher
  "Deprecated.

  ch - the character to match, must not be null - `char`

  returns: a new Matcher for the given char - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^Character ch]
    (StrMatcher/charMatcher ch)))

(defn *quote-matcher
  "Deprecated.

  returns: a matcher for a single or double quote - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher []
    (StrMatcher/quoteMatcher )))

(defn is-match
  "Deprecated.

  buffer - the text content to match against, do not change - `char[]`
  pos - the starting position for the match, valid for buffer - `int`
  buffer-start - the first active index in the buffer, valid for buffer - `int`
  buffer-end - the end index (exclusive) of the active buffer, valid for buffer - `int`

  returns: the number of matching characters, zero for no match - `int`"
  (^Integer [^StrMatcher this buffer ^Integer pos ^Integer buffer-start ^Integer buffer-end]
    (-> this (.isMatch buffer pos buffer-start buffer-end)))
  (^Integer [^StrMatcher this buffer ^Integer pos]
    (-> this (.isMatch buffer pos))))

