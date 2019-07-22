(ns org.apache.commons.lang3.text.translate.EntityArrays
  "Deprecated.
 as of 3.6, use commons-text

  EntityArrays instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text.translate EntityArrays]))

(defn ->entity-arrays
  "Constructor.

  Deprecated."
  (^EntityArrays []
    (new EntityArrays )))

(defn *iso-8859-1-escape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/ISO8859_1_ESCAPE )))

(defn *invert
  "Deprecated.

  array - String[][] to be inverted - `java.lang.String[][]`

  returns: String[][] inverted array - `java.lang.String[][]`"
  ([array]
    (EntityArrays/invert array)))

(defn *html-40-extended-escape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/HTML40_EXTENDED_ESCAPE )))

(defn *apos-escape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/APOS_ESCAPE )))

(defn *apos-unescape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/APOS_UNESCAPE )))

(defn *html-40-extended-unescape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/HTML40_EXTENDED_UNESCAPE )))

(defn *iso-8859-1-unescape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/ISO8859_1_UNESCAPE )))

(defn *basic-unescape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/BASIC_UNESCAPE )))

(defn *basic-escape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/BASIC_ESCAPE )))

(defn *java-ctrl-chars-escape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/JAVA_CTRL_CHARS_ESCAPE )))

(defn *java-ctrl-chars-unescape
  "Deprecated.

  returns: the mapping table - `java.lang.String[][]`"
  ([]
    (EntityArrays/JAVA_CTRL_CHARS_UNESCAPE )))

