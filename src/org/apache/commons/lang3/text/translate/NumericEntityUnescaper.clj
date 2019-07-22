(ns org.apache.commons.lang3.text.translate.NumericEntityUnescaper
  "Deprecated.
 as of 3.6, use commons-text

  NumericEntityUnescaper instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate NumericEntityUnescaper]))

(defn ->numeric-entity-unescaper
  "Constructor.

  Deprecated.

  options - to apply to this unescaper - `org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION`"
  (^NumericEntityUnescaper [^org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION options]
    (new NumericEntityUnescaper options)))

(defn set?
  "Deprecated.

  option - to check state of - `org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION`

  returns: whether the option is set - `boolean`"
  (^Boolean [^NumericEntityUnescaper this ^org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION option]
    (-> this (.isSet option))))

(defn translate
  "Deprecated.

  input - CharSequence that is being translated - `java.lang.CharSequence`
  index - int representing the current point of translation - `int`
  out - Writer to translate the text to - `java.io.Writer`

  returns: int count of codepoints consumed - `int`

  throws: java.io.IOException - if and only if the Writer produces an IOException"
  (^Integer [^NumericEntityUnescaper this ^java.lang.CharSequence input ^Integer index ^java.io.Writer out]
    (-> this (.translate input index out))))

