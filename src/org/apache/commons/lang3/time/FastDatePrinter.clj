(ns org.apache.commons.lang3.time.FastDatePrinter
  "FastDatePrinter is a fast and thread-safe version of
  SimpleDateFormat.

  To obtain a FastDatePrinter, use FastDateFormat.getInstance(String, TimeZone, Locale)
  or another variation of the factory methods of FastDateFormat.

  Since FastDatePrinter is thread safe, you can use a static member instance:

      private static final DatePrinter DATE_PRINTER = FastDateFormat.getInstance(\"yyyy-MM-dd\");


  This class can be used as a direct replacement to
  SimpleDateFormat in most formatting situations.
  This class is especially useful in multi-threaded server environments.
  SimpleDateFormat is not thread-safe in any JDK version,
  nor will it be as Sun have closed the bug/RFE.


  Only formatting is supported by this class, but all patterns are compatible with
  SimpleDateFormat (except time zones and some year patterns - see below).

  Java 1.4 introduced a new pattern letter, 'Z', to represent
  time zones in RFC822 format (eg. +0800 or -1100).
  This pattern letter can be used here (on all JDK versions).

  In addition, the pattern 'ZZ' has been made to represent
  ISO 8601 extended format time zones (eg. +08:00 or -11:00).
  This introduces a minor incompatibility with Java 1.4, but at a gain of
  useful functionality.

  Starting with JDK7, ISO 8601 support was added using the pattern 'X'.
  To maintain compatibility, 'ZZ' will continue to be supported, but using
  one of the 'X' formats is recommended.

  Javadoc cites for the year pattern: For formatting, if the number of
  pattern letters is 2, the year is truncated to 2 digits; otherwise it is
  interpreted as a number. Starting with Java 1.7 a pattern of 'Y' or
  'YYY' will be formatted as '2003', while it was '03' in former Java
  versions. FastDatePrinter implements the behavior of Java 7."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time FastDatePrinter]))

(def *-full
  "Static Constant.

  FULL locale dependent date or time style.

  type: int"
  FastDatePrinter/FULL)

(def *-long
  "Static Constant.

  LONG locale dependent date or time style.

  type: int"
  FastDatePrinter/LONG)

(def *-medium
  "Static Constant.

  MEDIUM locale dependent date or time style.

  type: int"
  FastDatePrinter/MEDIUM)

(def *-short
  "Static Constant.

  SHORT locale dependent date or time style.

  type: int"
  FastDatePrinter/SHORT)

(defn format
  "Deprecated. Use {format(Date), {format(Calendar), {format(long), or {format(Object)

  obj - the object to format - `java.lang.Object`
  to-append-to - the buffer to append to - `java.lang.StringBuffer`
  pos - the position - ignored - `java.text.FieldPosition`

  returns: the buffer passed in - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^FastDatePrinter this ^java.lang.Object obj ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format obj to-append-to pos)))
  (^java.lang.StringBuffer [^FastDatePrinter this ^Long millis ^java.lang.StringBuffer buf]
    (-> this (.format millis buf)))
  (^java.lang.String [^FastDatePrinter this ^Long millis]
    (-> this (.format millis))))

(defn get-pattern
  "Description copied from interface: DatePrinter

  returns: the pattern, SimpleDateFormat compatible - `java.lang.String`"
  (^java.lang.String [^FastDatePrinter this]
    (-> this (.getPattern))))

(defn get-time-zone
  "Description copied from interface: DatePrinter

  returns: the time zone - `java.util.TimeZone`"
  (^java.util.TimeZone [^FastDatePrinter this]
    (-> this (.getTimeZone))))

(defn get-locale
  "Description copied from interface: DatePrinter

  returns: the locale - `java.util.Locale`"
  (^java.util.Locale [^FastDatePrinter this]
    (-> this (.getLocale))))

(defn get-max-length-estimate
  "Gets an estimate for the maximum string length that the
   formatter will produce.

   The actual formatted length will almost always be less than or
   equal to this amount.

  returns: the maximum formatted length - `int`"
  (^Integer [^FastDatePrinter this]
    (-> this (.getMaxLengthEstimate))))

(defn equals
  "Compares two objects for equality.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^FastDatePrinter this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Returns a hash code compatible with equals.

  returns: a hash code compatible with equals - `int`"
  (^Integer [^FastDatePrinter this]
    (-> this (.hashCode))))

(defn to-string
  "Gets a debugging string version of this formatter.

  returns: a debugging string - `java.lang.String`"
  (^java.lang.String [^FastDatePrinter this]
    (-> this (.toString))))

