(ns org.apache.commons.lang3.text.translate.LookupTranslator
  "Deprecated.
 as of 3.6, use commons-text

  LookupTranslator instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate LookupTranslator]))

(defn ->lookup-translator
  "Constructor.

  Deprecated.

  lookup - CharSequence[][] table of size [*][2] - `java.lang.CharSequence[]`"
  (^LookupTranslator [lookup]
    (new LookupTranslator lookup)))

(defn translate
  "Deprecated.

  input - CharSequence that is being translated - `java.lang.CharSequence`
  index - int representing the current point of translation - `int`
  out - Writer to translate the text to - `java.io.Writer`

  returns: int count of codepoints consumed - `int`

  throws: java.io.IOException - if and only if the Writer produces an IOException"
  (^Integer [^LookupTranslator this ^java.lang.CharSequence input ^Integer index ^java.io.Writer out]
    (-> this (.translate input index out))))

