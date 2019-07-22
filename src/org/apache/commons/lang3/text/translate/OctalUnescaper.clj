(ns org.apache.commons.lang3.text.translate.OctalUnescaper
  "Deprecated.
 as of 3.6, use commons-text

  OctalUnescaper instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate OctalUnescaper]))

(defn ->octal-unescaper
  "Constructor.

  Deprecated."
  (^OctalUnescaper []
    (new OctalUnescaper )))

(defn translate
  "Deprecated.

  input - CharSequence that is being translated - `java.lang.CharSequence`
  index - int representing the current point of translation - `int`
  out - Writer to translate the text to - `java.io.Writer`

  returns: int count of codepoints consumed - `int`

  throws: java.io.IOException - if and only if the Writer produces an IOException"
  (^Integer [^OctalUnescaper this ^java.lang.CharSequence input ^Integer index ^java.io.Writer out]
    (-> this (.translate input index out))))

