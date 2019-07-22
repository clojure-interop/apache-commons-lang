(ns org.apache.commons.lang3.CharEncoding
  "Deprecated.
 Java 7 introduced StandardCharsets, which defines these constants as
  Charset objects. Use Charset.name() to get the string values provided in this class.
  This class will be removed in a future release."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 CharEncoding]))

(defn ->char-encoding
  "Constructor.

  Deprecated."
  (^CharEncoding []
    (new CharEncoding )))

(def *-iso-8859-1
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  CharEncoding/ISO_8859_1)

(def *-us-ascii
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  CharEncoding/US_ASCII)

(def *-utf-16
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  CharEncoding/UTF_16)

(def *-utf-16-be
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  CharEncoding/UTF_16BE)

(def *-utf-16-le
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  CharEncoding/UTF_16LE)

(def *-utf-8
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  CharEncoding/UTF_8)

(defn *supported?
  "Deprecated. Please use Charset.isSupported(String) instead, although be aware that null
   values are not accepted by that method and an IllegalCharsetNameException may be thrown.

  name - the name of the requested charset; may be either a canonical name or an alias, null returns false - `java.lang.String`

  returns: true if the charset is available in the current Java virtual machine - `boolean`"
  (^Boolean [^java.lang.String name]
    (CharEncoding/isSupported name)))

