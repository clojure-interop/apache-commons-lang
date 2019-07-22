(ns org.apache.commons.lang3.time.DatePrinter
  "DatePrinter is the \"missing\" interface for the format methods of
  DateFormat. You can obtain an object implementing this
  interface by using one of the FastDateFormat factory methods.

  Warning: Since binary compatible methods may be added to this interface in any
  release, developers are not expected to implement this interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time DatePrinter]))

(defn format
  "Formats a Date, Calendar or
   Long (milliseconds) object.

  obj - the object to format - `java.lang.Object`
  to-append-to - the buffer to append to - `java.lang.StringBuffer`
  pos - the position - ignored - `java.text.FieldPosition`

  returns: the buffer passed in - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^DatePrinter this ^java.lang.Object obj ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format obj to-append-to pos)))
  (^java.lang.StringBuffer [^DatePrinter this ^Long millis ^java.lang.StringBuffer buf]
    (-> this (.format millis buf)))
  (^java.lang.String [^DatePrinter this ^Long millis]
    (-> this (.format millis))))

(defn get-pattern
  "Gets the pattern used by this printer.

  returns: the pattern, SimpleDateFormat compatible - `java.lang.String`"
  (^java.lang.String [^DatePrinter this]
    (-> this (.getPattern))))

(defn get-time-zone
  "Gets the time zone used by this printer.

   This zone is always used for Date printing.

  returns: the time zone - `java.util.TimeZone`"
  (^java.util.TimeZone [^DatePrinter this]
    (-> this (.getTimeZone))))

(defn get-locale
  "Gets the locale used by this printer.

  returns: the locale - `java.util.Locale`"
  (^java.util.Locale [^DatePrinter this]
    (-> this (.getLocale))))

