(ns org.apache.commons.lang3.text.translate.JavaUnicodeEscaper
  "Deprecated.
 as of 3.6, use commons-text

  UnicodeEscaper instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate JavaUnicodeEscaper]))

(defn ->java-unicode-escaper
  "Constructor.

  Deprecated.

  below - int value representing the lowest codepoint boundary - `int`
  above - int value representing the highest codepoint boundary - `int`
  between - whether to escape between the boundaries or outside them - `boolean`"
  (^JavaUnicodeEscaper [^Integer below ^Integer above ^Boolean between]
    (new JavaUnicodeEscaper below above between)))

(defn *above
  "Deprecated.

  codepoint - above which to escape - `int`

  returns: the newly created UnicodeEscaper instance - `org.apache.commons.lang3.text.translate.JavaUnicodeEscaper`"
  (^org.apache.commons.lang3.text.translate.JavaUnicodeEscaper [^Integer codepoint]
    (JavaUnicodeEscaper/above codepoint)))

(defn *below
  "Deprecated.

  codepoint - below which to escape - `int`

  returns: the newly created UnicodeEscaper instance - `org.apache.commons.lang3.text.translate.JavaUnicodeEscaper`"
  (^org.apache.commons.lang3.text.translate.JavaUnicodeEscaper [^Integer codepoint]
    (JavaUnicodeEscaper/below codepoint)))

(defn *between
  "Deprecated.

  codepoint-low - above which to escape - `int`
  codepoint-high - below which to escape - `int`

  returns: the newly created UnicodeEscaper instance - `org.apache.commons.lang3.text.translate.JavaUnicodeEscaper`"
  (^org.apache.commons.lang3.text.translate.JavaUnicodeEscaper [^Integer codepoint-low ^Integer codepoint-high]
    (JavaUnicodeEscaper/between codepoint-low codepoint-high)))

(defn *outside-of
  "Deprecated.

  codepoint-low - below which to escape - `int`
  codepoint-high - above which to escape - `int`

  returns: the newly created UnicodeEscaper instance - `org.apache.commons.lang3.text.translate.JavaUnicodeEscaper`"
  (^org.apache.commons.lang3.text.translate.JavaUnicodeEscaper [^Integer codepoint-low ^Integer codepoint-high]
    (JavaUnicodeEscaper/outsideOf codepoint-low codepoint-high)))

