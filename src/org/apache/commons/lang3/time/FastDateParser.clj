(ns org.apache.commons.lang3.time.FastDateParser
  "FastDateParser is a fast and thread-safe version of
  SimpleDateFormat.

  To obtain a proxy to a FastDateParser, use FastDateFormat.getInstance(String, TimeZone, Locale)
  or another variation of the factory methods of FastDateFormat.

  Since FastDateParser is thread safe, you can use a static member instance:

      private static final DateParser DATE_PARSER = FastDateFormat.getInstance(\"yyyy-MM-dd\");


  This class can be used as a direct replacement for
  SimpleDateFormat in most parsing situations.
  This class is especially useful in multi-threaded server environments.
  SimpleDateFormat is not thread-safe in any JDK version,
  nor will it be as Sun has closed the
  bug/RFE.


  Only parsing is supported by this class, but all patterns are compatible with
  SimpleDateFormat.

  The class operates in lenient mode, so for example a time of 90 minutes is treated as 1 hour 30 minutes.

  Timing tests indicate this class is as about as fast as SimpleDateFormat
  in single thread applications and about 25% faster in multi-thread applications."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time FastDateParser]))

(defn get-pattern
  "Description copied from interface: DateParser

  returns: the pattern, SimpleDateFormat compatible - `java.lang.String`"
  (^java.lang.String [^FastDateParser this]
    (-> this (.getPattern))))

(defn get-time-zone
  "Description copied from interface: DateParser

  returns: the time zone - `java.util.TimeZone`"
  (^java.util.TimeZone [^FastDateParser this]
    (-> this (.getTimeZone))))

(defn get-locale
  "Description copied from interface: DateParser

  returns: the locale - `java.util.Locale`"
  (^java.util.Locale [^FastDateParser this]
    (-> this (.getLocale))))

(defn equals
  "Compare another object for equality with this object.

  obj - the object to compare to - `java.lang.Object`

  returns: trueif equal to this instance - `boolean`"
  (^Boolean [^FastDateParser this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Return a hash code compatible with equals.

  returns: a hash code compatible with equals - `int`"
  (^Integer [^FastDateParser this]
    (-> this (.hashCode))))

(defn to-string
  "Get a string version of this formatter.

  returns: a debugging string - `java.lang.String`"
  (^java.lang.String [^FastDateParser this]
    (-> this (.toString))))

(defn parse-object
  "Description copied from interface: DateParser

  source - A String whose beginning should be parsed. - `java.lang.String`
  pos - the parse position - `java.text.ParsePosition`

  returns: a java.util.Date object - `java.lang.Object`"
  (^java.lang.Object [^FastDateParser this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parseObject source pos)))
  (^java.lang.Object [^FastDateParser this ^java.lang.String source]
    (-> this (.parseObject source))))

(defn parse
  "Parse a formatted date string according to the format.  Updates the Calendar with parsed fields.
   Upon success, the ParsePosition index is updated to indicate how much of the source text was consumed.
   Not all source text needs to be consumed.  Upon parse failure, ParsePosition error index is updated to
   the offset of the source text which does not match the supplied format.

  source - The text to parse. - `java.lang.String`
  pos - On input, the position in the source to start parsing, on output, updated position. - `java.text.ParsePosition`
  calendar - The calendar into which to set parsed fields. - `java.util.Calendar`

  returns: true, if source has been parsed (pos parsePosition is updated); otherwise false (and pos errorIndex is updated) - `boolean`

  throws: java.lang.IllegalArgumentException - when Calendar has been set to be not lenient, and a parsed field is out of range."
  (^Boolean [^FastDateParser this ^java.lang.String source ^java.text.ParsePosition pos ^java.util.Calendar calendar]
    (-> this (.parse source pos calendar)))
  (^java.util.Date [^FastDateParser this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^java.util.Date [^FastDateParser this ^java.lang.String source]
    (-> this (.parse source))))

