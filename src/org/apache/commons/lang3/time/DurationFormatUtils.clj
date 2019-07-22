(ns org.apache.commons.lang3.time.DurationFormatUtils
  "Duration formatting utilities and constants. The following table describes the tokens
  used in the pattern language for formatting.

   Pattern Tokens
   characterduration element
   yyears
   Mmonths
   ddays
   Hhours
   mminutes
   sseconds
   Smilliseconds
   'text'arbitrary text content


  Note: It's not currently possible to include a single-quote in a format.

  Token values are printed using decimal digits.
  A token character can be repeated to ensure that the field occupies a certain minimum
  size. Values will be left-padded with 0 unless padding is disabled in the method invocation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time DurationFormatUtils]))

(defn ->duration-format-utils
  "Constructor.

  DurationFormatUtils instances should NOT be constructed in standard programming.

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^DurationFormatUtils []
    (new DurationFormatUtils )))

(def *-iso-extended-format-pattern
  "Static Constant.

  Pattern used with FastDateFormat and SimpleDateFormat
   for the ISO 8601 period format used in durations.

  type: java.lang.String"
  DurationFormatUtils/ISO_EXTENDED_FORMAT_PATTERN)

(defn *format-duration-hms
  "Formats the time gap as a string.

   The format used is ISO 8601-like: HH:mm:ss.SSS.

  duration-millis - the duration to format - `long`

  returns: the formatted duration, not null - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if durationMillis is negative"
  (^java.lang.String [^Long duration-millis]
    (DurationFormatUtils/formatDurationHMS duration-millis)))

(defn *format-duration-iso
  "Formats the time gap as a string.

   The format used is the ISO 8601 period format.

   This method formats durations using the days and lower fields of the
   ISO format pattern, such as P7D6TH5M4.321S.

  duration-millis - the duration to format - `long`

  returns: the formatted duration, not null - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if durationMillis is negative"
  (^java.lang.String [^Long duration-millis]
    (DurationFormatUtils/formatDurationISO duration-millis)))

(defn *format-duration
  "Formats the time gap as a string, using the specified format.
   Padding the left hand side of numbers with zeroes is optional.

   This method formats durations using the days and lower fields of the
   format pattern. Months and larger are not used.

  duration-millis - the duration to format - `long`
  format - the way in which to format the duration, not null - `java.lang.String`
  pad-with-zeros - whether to pad the left hand side of numbers with 0's - `boolean`

  returns: the formatted duration, not null - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if durationMillis is negative"
  (^java.lang.String [^Long duration-millis ^java.lang.String format ^Boolean pad-with-zeros]
    (DurationFormatUtils/formatDuration duration-millis format pad-with-zeros))
  (^java.lang.String [^Long duration-millis ^java.lang.String format]
    (DurationFormatUtils/formatDuration duration-millis format)))

(defn *format-duration-words
  "Formats an elapsed time into a pluralization correct string.

   This method formats durations using the days and lower fields of the
   format pattern. Months and larger are not used.

  duration-millis - the elapsed time to report in milliseconds - `long`
  suppress-leading-zero-elements - suppresses leading 0 elements - `boolean`
  suppress-trailing-zero-elements - suppresses trailing 0 elements - `boolean`

  returns: the formatted text in days/hours/minutes/seconds, not null - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if durationMillis is negative"
  (^java.lang.String [^Long duration-millis ^Boolean suppress-leading-zero-elements ^Boolean suppress-trailing-zero-elements]
    (DurationFormatUtils/formatDurationWords duration-millis suppress-leading-zero-elements suppress-trailing-zero-elements)))

(defn *format-period-iso
  "Formats the time gap as a string.

   The format used is the ISO 8601 period format.

  start-millis - the start of the duration to format - `long`
  end-millis - the end of the duration to format - `long`

  returns: the formatted duration, not null - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if startMillis is greater than endMillis"
  (^java.lang.String [^Long start-millis ^Long end-millis]
    (DurationFormatUtils/formatPeriodISO start-millis end-millis)))

(defn *format-period
  "Formats the time gap as a string, using the specified format.
   Padding the left hand side of numbers with zeroes is optional and
   the timezone may be specified.

   When calculating the difference between months/days, it chooses to
   calculate months first. So when working out the number of months and
   days between January 15th and March 10th, it choose 1 month and
   23 days gained by choosing January->February = 1 month and then
   calculating days forwards, and not the 1 month and 26 days gained by
   choosing March -> February = 1 month and then calculating days
   backwards.

   For more control, the Joda-Time
   library is recommended.

  start-millis - the start of the duration - `long`
  end-millis - the end of the duration - `long`
  format - the way in which to format the duration, not null - `java.lang.String`
  pad-with-zeros - whether to pad the left hand side of numbers with 0's - `boolean`
  timezone - the millis are defined in - `java.util.TimeZone`

  returns: the formatted duration, not null - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if startMillis is greater than endMillis"
  (^java.lang.String [^Long start-millis ^Long end-millis ^java.lang.String format ^Boolean pad-with-zeros ^java.util.TimeZone timezone]
    (DurationFormatUtils/formatPeriod start-millis end-millis format pad-with-zeros timezone))
  (^java.lang.String [^Long start-millis ^Long end-millis ^java.lang.String format]
    (DurationFormatUtils/formatPeriod start-millis end-millis format)))

