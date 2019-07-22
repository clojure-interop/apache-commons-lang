(ns org.apache.commons.lang3.time.FastDateFormat
  "FastDateFormat is a fast and thread-safe version of
  SimpleDateFormat.

  To obtain an instance of FastDateFormat, use one of the static factory methods:
  getInstance(String, TimeZone, Locale), getDateInstance(int, TimeZone, Locale),
  getTimeInstance(int, TimeZone, Locale), or getDateTimeInstance(int, int, TimeZone, Locale)


  Since FastDateFormat is thread safe, you can use a static member instance:

    private static final FastDateFormat DATE_FORMATTER = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.SHORT);


  This class can be used as a direct replacement to
  SimpleDateFormat in most formatting and parsing situations.
  This class is especially useful in multi-threaded server environments.
  SimpleDateFormat is not thread-safe in any JDK version,
  nor will it be as Sun have closed the bug/RFE.


  All patterns are compatible with
  SimpleDateFormat (except time zones and some year patterns - see below).

  Since 3.2, FastDateFormat supports parsing as well as printing.

  Java 1.4 introduced a new pattern letter, 'Z', to represent
  time zones in RFC822 format (eg. +0800 or -1100).
  This pattern letter can be used here (on all JDK versions).

  In addition, the pattern 'ZZ' has been made to represent
  ISO 8601 extended format time zones (eg. +08:00 or -11:00).
  This introduces a minor incompatibility with Java 1.4, but at a gain of
  useful functionality.

  Javadoc cites for the year pattern: For formatting, if the number of
  pattern letters is 2, the year is truncated to 2 digits; otherwise it is
  interpreted as a number. Starting with Java 1.7 a pattern of 'Y' or
  'YYY' will be formatted as '2003', while it was '03' in former Java
  versions. FastDateFormat implements the behavior of Java 7."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time FastDateFormat]))

(def *-full
  "Static Constant.

  FULL locale dependent date or time style.

  type: int"
  FastDateFormat/FULL)

(def *-long
  "Static Constant.

  LONG locale dependent date or time style.

  type: int"
  FastDateFormat/LONG)

(def *-medium
  "Static Constant.

  MEDIUM locale dependent date or time style.

  type: int"
  FastDateFormat/MEDIUM)

(def *-short
  "Static Constant.

  SHORT locale dependent date or time style.

  type: int"
  FastDateFormat/SHORT)

(defn *get-instance
  "Gets a formatter instance using the specified pattern, time zone
   and locale.

  pattern - SimpleDateFormat compatible pattern - `java.lang.String`
  time-zone - optional time zone, overrides time zone of formatted date - `java.util.TimeZone`
  locale - optional locale, overrides system locale - `java.util.Locale`

  returns: a pattern based date/time formatter - `org.apache.commons.lang3.time.FastDateFormat`

  throws: java.lang.IllegalArgumentException - if pattern is invalid or null"
  (^org.apache.commons.lang3.time.FastDateFormat [^java.lang.String pattern ^java.util.TimeZone time-zone ^java.util.Locale locale]
    (FastDateFormat/getInstance pattern time-zone locale))
  (^org.apache.commons.lang3.time.FastDateFormat [^java.lang.String pattern ^java.util.TimeZone time-zone]
    (FastDateFormat/getInstance pattern time-zone))
  (^org.apache.commons.lang3.time.FastDateFormat [^java.lang.String pattern]
    (FastDateFormat/getInstance pattern))
  (^org.apache.commons.lang3.time.FastDateFormat []
    (FastDateFormat/getInstance )))

(defn *get-date-instance
  "Gets a date formatter instance using the specified style, time
   zone and locale.

  style - date style: FULL, LONG, MEDIUM, or SHORT - `int`
  time-zone - optional time zone, overrides time zone of formatted date - `java.util.TimeZone`
  locale - optional locale, overrides system locale - `java.util.Locale`

  returns: a localized standard date formatter - `org.apache.commons.lang3.time.FastDateFormat`

  throws: java.lang.IllegalArgumentException - if the Locale has no date pattern defined"
  (^org.apache.commons.lang3.time.FastDateFormat [^Integer style ^java.util.TimeZone time-zone ^java.util.Locale locale]
    (FastDateFormat/getDateInstance style time-zone locale))
  (^org.apache.commons.lang3.time.FastDateFormat [^Integer style ^java.util.Locale locale]
    (FastDateFormat/getDateInstance style locale))
  (^org.apache.commons.lang3.time.FastDateFormat [^Integer style]
    (FastDateFormat/getDateInstance style)))

(defn *get-time-instance
  "Gets a time formatter instance using the specified style, time
   zone and locale.

  style - time style: FULL, LONG, MEDIUM, or SHORT - `int`
  time-zone - optional time zone, overrides time zone of formatted time - `java.util.TimeZone`
  locale - optional locale, overrides system locale - `java.util.Locale`

  returns: a localized standard time formatter - `org.apache.commons.lang3.time.FastDateFormat`

  throws: java.lang.IllegalArgumentException - if the Locale has no time pattern defined"
  (^org.apache.commons.lang3.time.FastDateFormat [^Integer style ^java.util.TimeZone time-zone ^java.util.Locale locale]
    (FastDateFormat/getTimeInstance style time-zone locale))
  (^org.apache.commons.lang3.time.FastDateFormat [^Integer style ^java.util.Locale locale]
    (FastDateFormat/getTimeInstance style locale))
  (^org.apache.commons.lang3.time.FastDateFormat [^Integer style]
    (FastDateFormat/getTimeInstance style)))

(defn *get-date-time-instance
  "Gets a date/time formatter instance using the specified style,
   time zone and locale.

  date-style - date style: FULL, LONG, MEDIUM, or SHORT - `int`
  time-style - time style: FULL, LONG, MEDIUM, or SHORT - `int`
  time-zone - optional time zone, overrides time zone of formatted date - `java.util.TimeZone`
  locale - optional locale, overrides system locale - `java.util.Locale`

  returns: a localized standard date/time formatter - `org.apache.commons.lang3.time.FastDateFormat`

  throws: java.lang.IllegalArgumentException - if the Locale has no date/time pattern defined"
  (^org.apache.commons.lang3.time.FastDateFormat [^Integer date-style ^Integer time-style ^java.util.TimeZone time-zone ^java.util.Locale locale]
    (FastDateFormat/getDateTimeInstance date-style time-style time-zone locale))
  (^org.apache.commons.lang3.time.FastDateFormat [^Integer date-style ^Integer time-style ^java.util.Locale locale]
    (FastDateFormat/getDateTimeInstance date-style time-style locale))
  (^org.apache.commons.lang3.time.FastDateFormat [^Integer date-style ^Integer time-style]
    (FastDateFormat/getDateTimeInstance date-style time-style)))

(defn get-pattern
  "Gets the pattern used by this formatter.

  returns: the pattern, SimpleDateFormat compatible - `java.lang.String`"
  (^java.lang.String [^FastDateFormat this]
    (-> this (.getPattern))))

(defn parse-object
  "Description copied from interface: DateParser

  source - A String whose beginning should be parsed. - `java.lang.String`
  pos - the parse position - `java.text.ParsePosition`

  returns: a java.util.Date object - `java.lang.Object`"
  (^java.lang.Object [^FastDateFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parseObject source pos))))

(defn get-locale
  "Gets the locale used by this formatter.

  returns: the locale - `java.util.Locale`"
  (^java.util.Locale [^FastDateFormat this]
    (-> this (.getLocale))))

(defn to-string
  "Gets a debugging string version of this formatter.

  returns: a debugging string - `java.lang.String`"
  (^java.lang.String [^FastDateFormat this]
    (-> this (.toString))))

(defn get-time-zone
  "Gets the time zone used by this formatter.

   This zone is always used for Date formatting.

  returns: the time zone - `java.util.TimeZone`"
  (^java.util.TimeZone [^FastDateFormat this]
    (-> this (.getTimeZone))))

(defn parse
  "Description copied from interface: DateParser

  source - The text to parse. - `java.lang.String`
  pos - On input, the position in the source to start parsing, on output, updated position. - `java.text.ParsePosition`
  calendar - The calendar into which to set parsed fields. - `java.util.Calendar`

  returns: true, if source has been parsed (pos parsePosition is updated); otherwise false (and pos errorIndex is updated) - `boolean`"
  (^Boolean [^FastDateFormat this ^java.lang.String source ^java.text.ParsePosition pos ^java.util.Calendar calendar]
    (-> this (.parse source pos calendar)))
  (^java.util.Date [^FastDateFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^java.util.Date [^FastDateFormat this ^java.lang.String source]
    (-> this (.parse source))))

(defn hash-code
  "Returns a hash code compatible with equals.

  returns: a hash code compatible with equals - `int`"
  (^Integer [^FastDateFormat this]
    (-> this (.hashCode))))

(defn get-max-length-estimate
  "Gets an estimate for the maximum string length that the
   formatter will produce.

   The actual formatted length will almost always be less than or
   equal to this amount.

  returns: the maximum formatted length - `int`"
  (^Integer [^FastDateFormat this]
    (-> this (.getMaxLengthEstimate))))

(defn equals
  "Compares two objects for equality.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^FastDateFormat this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn format
  "Formats a Date, Calendar or
   Long (milliseconds) object.
   This method is an implementation of Format.format(Object, StringBuffer, FieldPosition)

  obj - the object to format - `java.lang.Object`
  to-append-to - the buffer to append to - `java.lang.StringBuffer`
  pos - the position - ignored - `java.text.FieldPosition`

  returns: the buffer passed in - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^FastDateFormat this ^java.lang.Object obj ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format obj to-append-to pos)))
  (^java.lang.StringBuffer [^FastDateFormat this ^Long millis ^java.lang.StringBuffer buf]
    (-> this (.format millis buf)))
  (^java.lang.String [^FastDateFormat this ^Long millis]
    (-> this (.format millis))))

