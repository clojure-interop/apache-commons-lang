(ns org.apache.commons.lang3.StringEscapeUtils
  "Deprecated.
 as of 3.6, use commons-text

  StringEscapeUtils instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 StringEscapeUtils]))

(defn ->string-escape-utils
  "Constructor.

  Deprecated."
  (^StringEscapeUtils []
    (new StringEscapeUtils )))

(def *-escape-java
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/ESCAPE_JAVA)

(def *-escape-ecmascript
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/ESCAPE_ECMASCRIPT)

(def *-escape-json
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/ESCAPE_JSON)

(def *-escape-xml
  "Static Constant.

  Deprecated. use ESCAPE_XML10 or ESCAPE_XML11 instead.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/ESCAPE_XML)

(def *-escape-xml-10
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/ESCAPE_XML10)

(def *-escape-xml-11
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/ESCAPE_XML11)

(def *-escape-html-3
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/ESCAPE_HTML3)

(def *-escape-html-4
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/ESCAPE_HTML4)

(def *-escape-csv
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/ESCAPE_CSV)

(def *-unescape-java
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/UNESCAPE_JAVA)

(def *-unescape-ecmascript
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/UNESCAPE_ECMASCRIPT)

(def *-unescape-json
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/UNESCAPE_JSON)

(def *-unescape-html-3
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/UNESCAPE_HTML3)

(def *-unescape-html-4
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/UNESCAPE_HTML4)

(def *-unescape-xml
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/UNESCAPE_XML)

(def *-unescape-csv
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.translate.CharSequenceTranslator"
  StringEscapeUtils/UNESCAPE_CSV)

(defn *escape-json
  "Deprecated.

  input - String to escape values in, may be null - `java.lang.String`

  returns: String with escaped values, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/escapeJson input)))

(defn *escape-java
  "Deprecated.

  input - String to escape values in, may be null - `java.lang.String`

  returns: String with escaped values, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/escapeJava input)))

(defn *unescape-xml
  "Deprecated.

  input - the String to unescape, may be null - `java.lang.String`

  returns: a new unescaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/unescapeXml input)))

(defn *escape-csv
  "Deprecated.

  input - the input CSV column String, may be null - `java.lang.String`

  returns: the input String, enclosed in double quotes if the value contains a comma,
   newline or double quote, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/escapeCsv input)))

(defn *unescape-csv
  "Deprecated.

  input - the input CSV column String, may be null - `java.lang.String`

  returns: the input String, with enclosing double quotes removed and embedded double
   quotes unescaped, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/unescapeCsv input)))

(defn *escape-ecma-script
  "Deprecated.

  input - String to escape values in, may be null - `java.lang.String`

  returns: String with escaped values, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/escapeEcmaScript input)))

(defn *unescape-html-3
  "Deprecated.

  input - the String to unescape, may be null - `java.lang.String`

  returns: a new unescaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/unescapeHtml3 input)))

(defn *escape-xml-10
  "Deprecated.

  input - the String to escape, may be null - `java.lang.String`

  returns: a new escaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/escapeXml10 input)))

(defn *unescape-ecma-script
  "Deprecated.

  input - the String to unescape, may be null - `java.lang.String`

  returns: A new unescaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/unescapeEcmaScript input)))

(defn *unescape-json
  "Deprecated.

  input - the String to unescape, may be null - `java.lang.String`

  returns: A new unescaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/unescapeJson input)))

(defn *escape-html-3
  "Deprecated.

  input - the String to escape, may be null - `java.lang.String`

  returns: a new escaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/escapeHtml3 input)))

(defn *unescape-html-4
  "Deprecated.

  input - the String to unescape, may be null - `java.lang.String`

  returns: a new unescaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/unescapeHtml4 input)))

(defn *escape-xml-11
  "Deprecated.

  input - the String to escape, may be null - `java.lang.String`

  returns: a new escaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/escapeXml11 input)))

(defn *escape-xml
  "Deprecated. use escapeXml10(java.lang.String) or escapeXml11(java.lang.String) instead.

  input - the String to escape, may be null - `java.lang.String`

  returns: a new escaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/escapeXml input)))

(defn *unescape-java
  "Deprecated.

  input - the String to unescape, may be null - `java.lang.String`

  returns: a new unescaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/unescapeJava input)))

(defn *escape-html-4
  "Deprecated.

  input - the String to escape, may be null - `java.lang.String`

  returns: a new escaped String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringEscapeUtils/escapeHtml4 input)))

