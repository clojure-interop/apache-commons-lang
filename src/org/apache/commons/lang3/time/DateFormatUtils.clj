(ns org.apache.commons.lang3.time.DateFormatUtils
  "Date and time formatting utilities and constants.

  Formatting is performed using the thread-safe
  FastDateFormat class.

  Note that the JDK has a bug wherein calling Calendar.get(int) will
  override any previously called Calendar.clear() calls. See LANG-755."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time DateFormatUtils]))

(defn ->date-format-utils
  "Constructor.

  DateFormatUtils instances should NOT be constructed in standard programming.

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^DateFormatUtils []
    (new DateFormatUtils )))

(def *-iso-8601-extended-datetime-format
  "Static Constant.

  ISO 8601 formatter for date-time without time zone.


   The format used is yyyy-MM-dd'T'HH:mm:ss. This format uses the
   default TimeZone in effect at the time of loading DateFormatUtils class.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_8601_EXTENDED_DATETIME_FORMAT)

(def *-iso-datetime-format
  "Static Constant.

  Deprecated. - as of 4.0, ISO_DATETIME_FORMAT will be replaced by ISO_8601_EXTENDED_DATETIME_FORMAT.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_DATETIME_FORMAT)

(def *-iso-8601-extended-datetime-time-zone-format
  "Static Constant.

  ISO 8601 formatter for date-time with time zone.


   The format used is yyyy-MM-dd'T'HH:mm:ssZZ. This format uses the
   default TimeZone in effect at the time of loading DateFormatUtils class.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT)

(def *-iso-datetime-time-zone-format
  "Static Constant.

  Deprecated. - as of 4.0, ISO_DATETIME_TIME_ZONE_FORMAT will be replaced by ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_DATETIME_TIME_ZONE_FORMAT)

(def *-iso-8601-extended-date-format
  "Static Constant.

  ISO 8601 formatter for date without time zone.


   The format used is yyyy-MM-dd. This format uses the
   default TimeZone in effect at the time of loading DateFormatUtils class.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_8601_EXTENDED_DATE_FORMAT)

(def *-iso-date-format
  "Static Constant.

  Deprecated. - as of 4.0, ISO_DATE_FORMAT will be replaced by ISO_8601_EXTENDED_DATE_FORMAT.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_DATE_FORMAT)

(def *-iso-date-time-zone-format
  "Static Constant.

  Deprecated. - as of 4.0, ISO_DATE_TIME_ZONE_FORMAT will be removed.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_DATE_TIME_ZONE_FORMAT)

(def *-iso-time-format
  "Static Constant.

  Deprecated. - as of 4.0, ISO_TIME_FORMAT will be removed.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_TIME_FORMAT)

(def *-iso-time-time-zone-format
  "Static Constant.

  Deprecated. - as of 4.0, ISO_TIME_TIME_ZONE_FORMAT will be removed.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_TIME_TIME_ZONE_FORMAT)

(def *-iso-8601-extended-time-format
  "Static Constant.

  ISO 8601 formatter for time without time zone.


   The format used is HH:mm:ss. This format uses the default
   TimeZone in effect at the time of loading DateFormatUtils class.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_8601_EXTENDED_TIME_FORMAT)

(def *-iso-time-no-t-format
  "Static Constant.

  Deprecated. - as of 4.0, ISO_TIME_NO_T_FORMAT will be replaced by ISO_8601_EXTENDED_TIME_FORMAT.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_TIME_NO_T_FORMAT)

(def *-iso-8601-extended-time-time-zone-format
  "Static Constant.

  ISO 8601 formatter for time with time zone.


   The format used is HH:mm:ssZZ. This format uses the default
   TimeZone in effect at the time of loading DateFormatUtils class.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT)

(def *-iso-time-no-t-time-zone-format
  "Static Constant.

  Deprecated. - as of 4.0, ISO_TIME_NO_T_TIME_ZONE_FORMAT will be replaced by ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/ISO_TIME_NO_T_TIME_ZONE_FORMAT)

(def *-smtp-datetime-format
  "Static Constant.

  SMTP (and probably other) date headers.


   The format used is EEE, dd MMM yyyy HH:mm:ss Z in US locale.
   This format uses the default TimeZone in effect at the time of loading
   DateFormatUtils class.

  type: org.apache.commons.lang3.time.FastDateFormat"
  DateFormatUtils/SMTP_DATETIME_FORMAT)

(defn *format-utc
  "Formats a date/time into a specific pattern using the UTC time zone.

  millis - the date to format expressed in milliseconds - `long`
  pattern - the pattern to use to format the date, not null - `java.lang.String`
  locale - the locale to use, may be null - `java.util.Locale`

  returns: the formatted date - `java.lang.String`"
  (^java.lang.String [^Long millis ^java.lang.String pattern ^java.util.Locale locale]
    (DateFormatUtils/formatUTC millis pattern locale))
  (^java.lang.String [^Long millis ^java.lang.String pattern]
    (DateFormatUtils/formatUTC millis pattern)))

(defn *format
  "Formats a date/time into a specific pattern in a time zone  and locale.

  millis - the date to format expressed in milliseconds - `long`
  pattern - the pattern to use to format the date, not null - `java.lang.String`
  time-zone - the time zone to use, may be null - `java.util.TimeZone`
  locale - the locale to use, may be null - `java.util.Locale`

  returns: the formatted date - `java.lang.String`"
  (^java.lang.String [^Long millis ^java.lang.String pattern ^java.util.TimeZone time-zone ^java.util.Locale locale]
    (DateFormatUtils/format millis pattern time-zone locale))
  (^java.lang.String [^Long millis ^java.lang.String pattern ^java.util.TimeZone time-zone]
    (DateFormatUtils/format millis pattern time-zone))
  (^java.lang.String [^Long millis ^java.lang.String pattern]
    (DateFormatUtils/format millis pattern)))

