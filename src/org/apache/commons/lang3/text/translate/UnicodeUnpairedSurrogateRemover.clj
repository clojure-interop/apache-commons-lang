(ns org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover
  "Deprecated.
 as of 3.6, use commons-text

  UnicodeUnpairedSurrogateRemover instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate UnicodeUnpairedSurrogateRemover]))

(defn ->unicode-unpaired-surrogate-remover
  "Constructor.

  Deprecated."
  (^UnicodeUnpairedSurrogateRemover []
    (new UnicodeUnpairedSurrogateRemover )))

(defn translate
  "Deprecated.

  codepoint - int character input to translate - `int`
  out - Writer to optionally push the translated output to - `java.io.Writer`

  returns: boolean as to whether translation occurred or not - `boolean`

  throws: java.io.IOException - if and only if the Writer produces an IOException"
  (^Boolean [^UnicodeUnpairedSurrogateRemover this ^Integer codepoint ^java.io.Writer out]
    (-> this (.translate codepoint out))))

