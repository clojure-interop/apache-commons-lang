(ns org.apache.commons.lang3.time.DateParser
  "DateParser is the \"missing\" interface for the parsing methods of
  DateFormat. You can obtain an object implementing this
  interface by using one of the FastDateFormat factory methods.

  Warning: Since binary compatible methods may be added to this interface in any
  release, developers are not expected to implement this interface."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time DateParser]))

(defn parse
  "Parses a formatted date string according to the format.  Updates the Calendar with parsed fields.
   Upon success, the ParsePosition index is updated to indicate how much of the source text was consumed.
   Not all source text needs to be consumed.  Upon parse failure, ParsePosition error index is updated to
   the offset of the source text which does not match the supplied format.

  source - The text to parse. - `java.lang.String`
  pos - On input, the position in the source to start parsing, on output, updated position. - `java.text.ParsePosition`
  calendar - The calendar into which to set parsed fields. - `java.util.Calendar`

  returns: true, if source has been parsed (pos parsePosition is updated); otherwise false (and pos errorIndex is updated) - `boolean`

  throws: java.lang.IllegalArgumentException - when Calendar has been set to be not lenient, and a parsed field is out of range."
  (^Boolean [^DateParser this ^java.lang.String source ^java.text.ParsePosition pos ^java.util.Calendar calendar]
    (-> this (.parse source pos calendar)))
  (^java.util.Date [^DateParser this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parse source pos)))
  (^java.util.Date [^DateParser this ^java.lang.String source]
    (-> this (.parse source))))

(defn get-pattern
  "Gets the pattern used by this parser.

  returns: the pattern, SimpleDateFormat compatible - `java.lang.String`"
  (^java.lang.String [^DateParser this]
    (-> this (.getPattern))))

(defn get-time-zone
  "Gets the time zone used by this parser.



   The default TimeZone used to create a Date when the TimeZone is not specified by
   the format pattern.

  returns: the time zone - `java.util.TimeZone`"
  (^java.util.TimeZone [^DateParser this]
    (-> this (.getTimeZone))))

(defn get-locale
  "Gets the locale used by this parser.

  returns: the locale - `java.util.Locale`"
  (^java.util.Locale [^DateParser this]
    (-> this (.getLocale))))

(defn parse-object
  "Parses a date/time string according to the given parse position.

  source - A String whose beginning should be parsed. - `java.lang.String`
  pos - the parse position - `java.text.ParsePosition`

  returns: a java.util.Date object - `java.lang.Object`"
  (^java.lang.Object [^DateParser this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parseObject source pos)))
  (^java.lang.Object [^DateParser this ^java.lang.String source]
    (-> this (.parseObject source))))

