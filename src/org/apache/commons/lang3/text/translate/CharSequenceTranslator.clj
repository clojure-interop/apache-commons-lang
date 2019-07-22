(ns org.apache.commons.lang3.text.translate.CharSequenceTranslator
  "Deprecated.
 as of 3.6, use commons-text

  CharSequenceTranslator instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate CharSequenceTranslator]))

(defn ->char-sequence-translator
  "Constructor.

  Deprecated."
  (^CharSequenceTranslator []
    (new CharSequenceTranslator )))

(defn *hex
  "Deprecated.

  codepoint - The codepoint to convert. - `int`

  returns: An upper case hexadecimal String - `java.lang.String`"
  (^java.lang.String [^Integer codepoint]
    (CharSequenceTranslator/hex codepoint)))

(defn translate
  "Deprecated.

  input - CharSequence that is being translated - `java.lang.CharSequence`
  index - int representing the current point of translation - `int`
  out - Writer to translate the text to - `java.io.Writer`

  returns: int count of codepoints consumed - `int`

  throws: java.io.IOException - if and only if the Writer produces an IOException"
  (^Integer [^CharSequenceTranslator this ^java.lang.CharSequence input ^Integer index ^java.io.Writer out]
    (-> this (.translate input index out)))
  ([^CharSequenceTranslator this ^java.lang.CharSequence input ^java.io.Writer out]
    (-> this (.translate input out)))
  (^java.lang.String [^CharSequenceTranslator this ^java.lang.CharSequence input]
    (-> this (.translate input))))

(defn with
  "Deprecated.

  translators - CharSequenceTranslator array of translators to merge with this one - `org.apache.commons.lang3.text.translate.CharSequenceTranslator`

  returns: CharSequenceTranslator merging this translator with the others - `org.apache.commons.lang3.text.translate.CharSequenceTranslator`"
  (^org.apache.commons.lang3.text.translate.CharSequenceTranslator [^CharSequenceTranslator this ^org.apache.commons.lang3.text.translate.CharSequenceTranslator translators]
    (-> this (.with translators))))

