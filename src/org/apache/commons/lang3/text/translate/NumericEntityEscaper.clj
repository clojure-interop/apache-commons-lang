(ns org.apache.commons.lang3.text.translate.NumericEntityEscaper
  "Deprecated.
 as of 3.6, use commons-text

  NumericEntityEscaper instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate NumericEntityEscaper]))

(defn ->numeric-entity-escaper
  "Constructor.

  Deprecated."
  (^NumericEntityEscaper []
    (new NumericEntityEscaper )))

(defn *below
  "Deprecated.

  codepoint - below which to escape - `int`

  returns: the newly created NumericEntityEscaper instance - `org.apache.commons.lang3.text.translate.NumericEntityEscaper`"
  (^org.apache.commons.lang3.text.translate.NumericEntityEscaper [^Integer codepoint]
    (NumericEntityEscaper/below codepoint)))

(defn *above
  "Deprecated.

  codepoint - above which to escape - `int`

  returns: the newly created NumericEntityEscaper instance - `org.apache.commons.lang3.text.translate.NumericEntityEscaper`"
  (^org.apache.commons.lang3.text.translate.NumericEntityEscaper [^Integer codepoint]
    (NumericEntityEscaper/above codepoint)))

(defn *between
  "Deprecated.

  codepoint-low - above which to escape - `int`
  codepoint-high - below which to escape - `int`

  returns: the newly created NumericEntityEscaper instance - `org.apache.commons.lang3.text.translate.NumericEntityEscaper`"
  (^org.apache.commons.lang3.text.translate.NumericEntityEscaper [^Integer codepoint-low ^Integer codepoint-high]
    (NumericEntityEscaper/between codepoint-low codepoint-high)))

(defn *outside-of
  "Deprecated.

  codepoint-low - below which to escape - `int`
  codepoint-high - above which to escape - `int`

  returns: the newly created NumericEntityEscaper instance - `org.apache.commons.lang3.text.translate.NumericEntityEscaper`"
  (^org.apache.commons.lang3.text.translate.NumericEntityEscaper [^Integer codepoint-low ^Integer codepoint-high]
    (NumericEntityEscaper/outsideOf codepoint-low codepoint-high)))

(defn translate
  "Deprecated.

  codepoint - int character input to translate - `int`
  out - Writer to optionally push the translated output to - `java.io.Writer`

  returns: boolean as to whether translation occurred or not - `boolean`

  throws: java.io.IOException - if and only if the Writer produces an IOException"
  (^Boolean [^NumericEntityEscaper this ^Integer codepoint ^java.io.Writer out]
    (-> this (.translate codepoint out))))

