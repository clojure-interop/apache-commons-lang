(ns org.apache.commons.lang3.text.FormatFactory
  "Deprecated.
 as of 3.6, use commons-text

  FormatFactory instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text FormatFactory]))

(defn get-format
  "Deprecated.

  name - The format type name - `java.lang.String`
  arguments - Arguments used to create the format instance. This allows the FormatFactory to implement the \"format style\" concept from java.text.MessageFormat. - `java.lang.String`
  locale - The locale, may be null - `java.util.Locale`

  returns: The format instance - `java.text.Format`"
  (^java.text.Format [^FormatFactory this ^java.lang.String name ^java.lang.String arguments ^java.util.Locale locale]
    (-> this (.getFormat name arguments locale))))

