(ns org.apache.commons.lang3.text.translate.UnicodeEscaper
  "Deprecated.
 as of 3.6, use commons-text

  UnicodeEscaper instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate UnicodeEscaper]))

(defn ->unicode-escaper
  "Constructor.

  Deprecated."
  (^UnicodeEscaper []
    (new UnicodeEscaper )))

(defn *below
  "Deprecated.

  codepoint - below which to escape - `int`

  returns: the newly created UnicodeEscaper instance - `org.apache.commons.lang3.text.translate.UnicodeEscaper`"
  (^org.apache.commons.lang3.text.translate.UnicodeEscaper [^Integer codepoint]
    (UnicodeEscaper/below codepoint)))

(defn *above
  "Deprecated.

  codepoint - above which to escape - `int`

  returns: the newly created UnicodeEscaper instance - `org.apache.commons.lang3.text.translate.UnicodeEscaper`"
  (^org.apache.commons.lang3.text.translate.UnicodeEscaper [^Integer codepoint]
    (UnicodeEscaper/above codepoint)))

(defn *outside-of
  "Deprecated.

  codepoint-low - below which to escape - `int`
  codepoint-high - above which to escape - `int`

  returns: the newly created UnicodeEscaper instance - `org.apache.commons.lang3.text.translate.UnicodeEscaper`"
  (^org.apache.commons.lang3.text.translate.UnicodeEscaper [^Integer codepoint-low ^Integer codepoint-high]
    (UnicodeEscaper/outsideOf codepoint-low codepoint-high)))

(defn *between
  "Deprecated.

  codepoint-low - above which to escape - `int`
  codepoint-high - below which to escape - `int`

  returns: the newly created UnicodeEscaper instance - `org.apache.commons.lang3.text.translate.UnicodeEscaper`"
  (^org.apache.commons.lang3.text.translate.UnicodeEscaper [^Integer codepoint-low ^Integer codepoint-high]
    (UnicodeEscaper/between codepoint-low codepoint-high)))

(defn translate
  "Deprecated.

  codepoint - int character input to translate - `int`
  out - Writer to optionally push the translated output to - `java.io.Writer`

  returns: boolean as to whether translation occurred or not - `boolean`

  throws: java.io.IOException - if and only if the Writer produces an IOException"
  (^Boolean [^UnicodeEscaper this ^Integer codepoint ^java.io.Writer out]
    (-> this (.translate codepoint out))))

