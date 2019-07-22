(ns org.apache.commons.lang3.text.ExtendedMessageFormat
  "Deprecated.
 as of 3.6, use commons-text

  ExtendedMessageFormat instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text ExtendedMessageFormat]))

(defn ->extended-message-format
  "Constructor.

  Deprecated.

  pattern - the pattern to use, not null - `java.lang.String`
  locale - the locale to use, not null - `java.util.Locale`
  registry - the registry of format factories, may be null - `java.util.Map`

  throws: java.lang.IllegalArgumentException - in case of a bad pattern."
  (^ExtendedMessageFormat [^java.lang.String pattern ^java.util.Locale locale ^java.util.Map registry]
    (new ExtendedMessageFormat pattern locale registry))
  (^ExtendedMessageFormat [^java.lang.String pattern ^java.util.Locale locale]
    (new ExtendedMessageFormat pattern locale))
  (^ExtendedMessageFormat [^java.lang.String pattern]
    (new ExtendedMessageFormat pattern)))

(defn to-pattern
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^ExtendedMessageFormat this]
    (-> this (.toPattern))))

(defn apply-pattern
  "Deprecated.

  pattern - String - `java.lang.String`"
  ([^ExtendedMessageFormat this ^java.lang.String pattern]
    (-> this (.applyPattern pattern))))

(defn set-format
  "Deprecated.

  format-element-index - format element index - `int`
  new-format - the new format - `java.text.Format`

  throws: java.lang.UnsupportedOperationException - always thrown since this isn't supported by ExtendMessageFormat"
  ([^ExtendedMessageFormat this ^Integer format-element-index ^java.text.Format new-format]
    (-> this (.setFormat format-element-index new-format))))

(defn set-format-by-argument-index
  "Deprecated.

  argument-index - argument index - `int`
  new-format - the new format - `java.text.Format`

  throws: java.lang.UnsupportedOperationException - always thrown since this isn't supported by ExtendMessageFormat"
  ([^ExtendedMessageFormat this ^Integer argument-index ^java.text.Format new-format]
    (-> this (.setFormatByArgumentIndex argument-index new-format))))

(defn set-formats
  "Deprecated.

  new-formats - new formats - `java.text.Format[]`

  throws: java.lang.UnsupportedOperationException - always thrown since this isn't supported by ExtendMessageFormat"
  ([^ExtendedMessageFormat this new-formats]
    (-> this (.setFormats new-formats))))

(defn set-formats-by-argument-index
  "Deprecated.

  new-formats - new formats - `java.text.Format[]`

  throws: java.lang.UnsupportedOperationException - always thrown since this isn't supported by ExtendMessageFormat"
  ([^ExtendedMessageFormat this new-formats]
    (-> this (.setFormatsByArgumentIndex new-formats))))

(defn equals
  "Deprecated.

  obj - the object to compare to - `java.lang.Object`

  returns: true if this object equals the other, otherwise false - `boolean`"
  (^Boolean [^ExtendedMessageFormat this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Deprecated.

  returns: `int`"
  (^Integer [^ExtendedMessageFormat this]
    (-> this (.hashCode))))

