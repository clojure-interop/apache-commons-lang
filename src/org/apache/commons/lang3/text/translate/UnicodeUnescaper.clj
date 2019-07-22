(ns org.apache.commons.lang3.text.translate.UnicodeUnescaper
  "Deprecated.
 as of 3.6, use commons-text

  UnicodeUnescaper instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate UnicodeUnescaper]))

(defn ->unicode-unescaper
  "Constructor.

  Deprecated."
  (^UnicodeUnescaper []
    (new UnicodeUnescaper )))

(defn translate
  "Deprecated.

  input - CharSequence that is being translated - `java.lang.CharSequence`
  index - int representing the current point of translation - `int`
  out - Writer to translate the text to - `java.io.Writer`

  returns: int count of codepoints consumed - `int`

  throws: java.io.IOException - if and only if the Writer produces an IOException"
  (^Integer [^UnicodeUnescaper this ^java.lang.CharSequence input ^Integer index ^java.io.Writer out]
    (-> this (.translate input index out))))

