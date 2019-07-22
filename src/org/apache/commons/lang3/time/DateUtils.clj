(ns org.apache.commons.lang3.time.DateUtils
  "A suite of utilities surrounding the use of the
  Calendar and Date object.

  DateUtils contains a lot of common methods considering manipulations
  of Dates or Calendars. Some methods require some extra explanation.
  The truncate, ceiling and round methods could be considered the Math.floor(),
  Math.ceil() or Math.round versions for dates
  This way date-fields will be ignored in bottom-up order.
  As a complement to these methods we've introduced some fragment-methods.
  With these methods the Date-fields will be ignored in top-down order.
  Since a date without a year is not a valid date, you have to decide in what
  kind of date-field you want your result, for instance milliseconds or days.


  Several methods are provided for adding to Date objects, of the form
  addXXX(Date date, int amount). It is important to note these methods
  use a Calendar internally (with default timezone and locale) and may
  be affected by changes to daylight saving time (DST)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time DateUtils]))

(defn ->date-utils
  "Constructor.

  DateUtils instances should NOT be constructed in
   standard programming. Instead, the static methods on the class should
   be used, such as DateUtils.parseDate(str);.

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^DateUtils []
    (new DateUtils )))

(def *-millis-per-second
  "Static Constant.

  Number of milliseconds in a standard second.

  type: long"
  DateUtils/MILLIS_PER_SECOND)

(def *-millis-per-minute
  "Static Constant.

  Number of milliseconds in a standard minute.

  type: long"
  DateUtils/MILLIS_PER_MINUTE)

(def *-millis-per-hour
  "Static Constant.

  Number of milliseconds in a standard hour.

  type: long"
  DateUtils/MILLIS_PER_HOUR)

(def *-millis-per-day
  "Static Constant.

  Number of milliseconds in a standard day.

  type: long"
  DateUtils/MILLIS_PER_DAY)

(def *-semi-month
  "Static Constant.

  This is half a month, so this represents whether a date is in the top
   or bottom half of the month.

  type: int"
  DateUtils/SEMI_MONTH)

(def *-range-week-sunday
  "Static Constant.

  A week range, starting on Sunday.

  type: int"
  DateUtils/RANGE_WEEK_SUNDAY)

(def *-range-week-monday
  "Static Constant.

  A week range, starting on Monday.

  type: int"
  DateUtils/RANGE_WEEK_MONDAY)

(def *-range-week-relative
  "Static Constant.

  A week range, starting on the day focused.

  type: int"
  DateUtils/RANGE_WEEK_RELATIVE)

(def *-range-week-center
  "Static Constant.

  A week range, centered around the day focused.

  type: int"
  DateUtils/RANGE_WEEK_CENTER)

(def *-range-month-sunday
  "Static Constant.

  A month range, the week starting on Sunday.

  type: int"
  DateUtils/RANGE_MONTH_SUNDAY)

(def *-range-month-monday
  "Static Constant.

  A month range, the week starting on Monday.

  type: int"
  DateUtils/RANGE_MONTH_MONDAY)

(defn *add-milliseconds
  "Adds a number of milliseconds to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to add, may be negative - `int`

  returns: the new Date with the amount added - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/addMilliseconds date amount)))

(defn *set-seconds
  "Sets the seconds field to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to set - `int`

  returns: a new Date set with the specified value - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/setSeconds date amount)))

(defn *set-months
  "Sets the months field to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to set - `int`

  returns: a new Date set with the specified value - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/setMonths date amount)))

(defn *add-years
  "Adds a number of years to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to add, may be negative - `int`

  returns: the new Date with the amount added - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/addYears date amount)))

(defn *same-day?
  "Checks if two date objects are on the same day ignoring time.

   28 Mar 2002 13:45 and 28 Mar 2002 06:01 would return true.
   28 Mar 2002 13:45 and 12 Mar 2002 13:45 would return false.

  date-1 - the first date, not altered, not null - `java.util.Date`
  date-2 - the second date, not altered, not null - `java.util.Date`

  returns: true if they represent the same day - `boolean`

  throws: java.lang.IllegalArgumentException - if either date is null"
  (^Boolean [^java.util.Date date-1 ^java.util.Date date-2]
    (DateUtils/isSameDay date-1 date-2)))

(defn *add-hours
  "Adds a number of hours to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to add, may be negative - `int`

  returns: the new Date with the amount added - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/addHours date amount)))

(defn *add-days
  "Adds a number of days to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to add, may be negative - `int`

  returns: the new Date with the amount added - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/addDays date amount)))

(defn *set-hours
  "Sets the hours field to a date returning a new object.  Hours range
   from  0-23.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to set - `int`

  returns: a new Date set with the specified value - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/setHours date amount)))

(defn *parse-date
  "Parses a string representing a date by trying a variety of different parsers,
   using the default date format symbols for the given locale.

   The parse will try each parse pattern in turn.
   A parse is only deemed successful if it parses the whole of the input string.
   If no parse patterns match, a ParseException is thrown.
   The parser will be lenient toward the parsed date.

  str - the date to parse, not null - `java.lang.String`
  locale - the locale whose date format symbols should be used. If null, the system locale is used (as per parseDate(String, String...)). - `java.util.Locale`
  parse-patterns - the date format patterns to use, see SimpleDateFormat, not null - `java.lang.String`

  returns: the parsed date - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date string or pattern array is null"
  (^java.util.Date [^java.lang.String str ^java.util.Locale locale ^java.lang.String parse-patterns]
    (DateUtils/parseDate str locale parse-patterns))
  (^java.util.Date [^java.lang.String str ^java.lang.String parse-patterns]
    (DateUtils/parseDate str parse-patterns)))

(defn *iterator
  "Constructs an Iterator over each day in a date
   range defined by a focus date and range style.

   For instance, passing Thursday, July 4, 2002 and a
   RANGE_MONTH_SUNDAY will return an Iterator
   that starts with Sunday, June 30, 2002 and ends with Saturday, August 3,
   2002, returning a Calendar instance for each intermediate day.

   This method provides an iterator that returns Calendar objects.
   The days are progressed using Calendar.add(int, int).

  focus - the date to work with, not null - `java.util.Date`
  range-style - the style constant to use. Must be one of RANGE_MONTH_SUNDAY, RANGE_MONTH_MONDAY, RANGE_WEEK_SUNDAY, RANGE_WEEK_MONDAY, RANGE_WEEK_RELATIVE, RANGE_WEEK_CENTER - `int`

  returns: the date iterator, not null, not null - `java.util.Iterator<java.util.Calendar>`

  throws: java.lang.IllegalArgumentException - if the rangeStyle is invalid"
  (^java.util.Iterator [^java.util.Date focus ^Integer range-style]
    (DateUtils/iterator focus range-style)))

(defn *get-fragment-in-minutes
  "Returns the number of minutes within the
   fragment. All datefields greater than the fragment will be ignored.

   Asking the minutes of any date will only return the number of minutes
   of the current hour (resulting in a number between 0 and 59). This
   method will retrieve the number of minutes for any fragment.
   For example, if you want to calculate the number of minutes past this month,
   your fragment is Calendar.MONTH. The result will be all minutes of the
   past day(s) and hour(s).

   Valid fragments are: Calendar.YEAR, Calendar.MONTH, both
   Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY,
   Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
   A fragment less than or equal to a MINUTE field will return 0.


    January 1, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     (equivalent to deprecated date.getMinutes())
    January 6, 2008 7:15:10.538 with Calendar.HOUR_OF_DAY as fragment will return 15
     (equivalent to deprecated date.getMinutes())
    January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 15
    January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 435 (7*60  15)
    January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     (a millisecond cannot be split in minutes)

  date - the date to work with, not null - `java.util.Date`
  fragment - the Calendar field part of date to calculate - `int`

  returns: number of minutes within the fragment of date - `long`

  throws: java.lang.IllegalArgumentException - if the date is null or fragment is not supported"
  (^Long [^java.util.Date date ^Integer fragment]
    (DateUtils/getFragmentInMinutes date fragment)))

(defn *add-seconds
  "Adds a number of seconds to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to add, may be negative - `int`

  returns: the new Date with the amount added - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/addSeconds date amount)))

(defn *add-minutes
  "Adds a number of minutes to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to add, may be negative - `int`

  returns: the new Date with the amount added - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/addMinutes date amount)))

(defn *add-months
  "Adds a number of months to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to add, may be negative - `int`

  returns: the new Date with the amount added - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/addMonths date amount)))

(defn *add-weeks
  "Adds a number of weeks to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to add, may be negative - `int`

  returns: the new Date with the amount added - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/addWeeks date amount)))

(defn *set-milliseconds
  "Sets the milliseconds field to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to set - `int`

  returns: a new Date set with the specified value - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/setMilliseconds date amount)))

(defn *get-fragment-in-seconds
  "Returns the number of seconds within the
   fragment. All datefields greater than the fragment will be ignored.

   Asking the seconds of any date will only return the number of seconds
   of the current minute (resulting in a number between 0 and 59). This
   method will retrieve the number of seconds for any fragment.
   For example, if you want to calculate the number of seconds past today,
   your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
   be all seconds of the past hour(s) and minutes(s).

   Valid fragments are: Calendar.YEAR, Calendar.MONTH, both
   Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY,
   Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
   A fragment less than or equal to a SECOND field will return 0.


    January 1, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     (equivalent to deprecated date.getSeconds())
    January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10
     (equivalent to deprecated date.getSeconds())
    January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 26110
     (7*3600  15*60  10)
    January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     (a millisecond cannot be split in seconds)

  date - the date to work with, not null - `java.util.Date`
  fragment - the Calendar field part of date to calculate - `int`

  returns: number of seconds within the fragment of date - `long`

  throws: java.lang.IllegalArgumentException - if the date is null or fragment is not supported"
  (^Long [^java.util.Date date ^Integer fragment]
    (DateUtils/getFragmentInSeconds date fragment)))

(defn *set-days
  "Sets the day of month field to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to set - `int`

  returns: a new Date set with the specified value - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/setDays date amount)))

(defn *set-minutes
  "Sets the minute field to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to set - `int`

  returns: a new Date set with the specified value - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/setMinutes date amount)))

(defn *truncate
  "Truncates a date, leaving the field specified as the most
   significant field.

   For example, if you had the date-time of 28 Mar 2002
   13:45:01.231, if you passed with HOUR, it would return 28 Mar
   2002 13:00:00.000.  If this was passed with MONTH, it would
   return 1 Mar 2002 0:00:00.000.

  date - the date to work with, not null - `java.util.Date`
  field - the field from Calendar or SEMI_MONTH - `int`

  returns: the different truncated date, not null - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer field]
    (DateUtils/truncate date field)))

(defn *parse-date-strictly
  "Parses a string representing a date by trying a variety of different parsers,
   using the default date format symbols for the given locale..

   The parse will try each parse pattern in turn.
   A parse is only deemed successful if it parses the whole of the input string.
   If no parse patterns match, a ParseException is thrown.
   The parser parses strictly - it does not allow for dates such as \"February 942, 1996\".

  str - the date to parse, not null - `java.lang.String`
  locale - the locale whose date format symbols should be used. If null, the system locale is used (as per parseDateStrictly(String, String...)). - `java.util.Locale`
  parse-patterns - the date format patterns to use, see SimpleDateFormat, not null - `java.lang.String`

  returns: the parsed date - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date string or pattern array is null"
  (^java.util.Date [^java.lang.String str ^java.util.Locale locale ^java.lang.String parse-patterns]
    (DateUtils/parseDateStrictly str locale parse-patterns))
  (^java.util.Date [^java.lang.String str ^java.lang.String parse-patterns]
    (DateUtils/parseDateStrictly str parse-patterns)))

(defn *get-fragment-in-days
  "Returns the number of days within the
   fragment. All datefields greater than the fragment will be ignored.

   Asking the days of any date will only return the number of days
   of the current month (resulting in a number between 1 and 31). This
   method will retrieve the number of days for any fragment.
   For example, if you want to calculate the number of days past this year,
   your fragment is Calendar.YEAR. The result will be all days of the
   past month(s).

   Valid fragments are: Calendar.YEAR, Calendar.MONTH, both
   Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY,
   Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
   A fragment less than or equal to a DAY field will return 0.


    January 28, 2008 with Calendar.MONTH as fragment will return 28
     (equivalent to deprecated date.getDay())
    February 28, 2008 with Calendar.MONTH as fragment will return 28
     (equivalent to deprecated date.getDay())
    January 28, 2008 with Calendar.YEAR as fragment will return 28
    February 28, 2008 with Calendar.YEAR as fragment will return 59
    January 28, 2008 with Calendar.MILLISECOND as fragment will return 0
     (a millisecond cannot be split in days)

  date - the date to work with, not null - `java.util.Date`
  fragment - the Calendar field part of date to calculate - `int`

  returns: number of days  within the fragment of date - `long`

  throws: java.lang.IllegalArgumentException - if the date is null or fragment is not supported"
  (^Long [^java.util.Date date ^Integer fragment]
    (DateUtils/getFragmentInDays date fragment)))

(defn *to-calendar
  "Converts a Date of a given TimeZone into a Calendar

  date - the date to convert to a Calendar - `java.util.Date`
  tz - the time zone of the date - `java.util.TimeZone`

  returns: the created Calendar - `java.util.Calendar`

  throws: java.lang.NullPointerException - if date or tz is null"
  (^java.util.Calendar [^java.util.Date date ^java.util.TimeZone tz]
    (DateUtils/toCalendar date tz))
  (^java.util.Calendar [^java.util.Date date]
    (DateUtils/toCalendar date)))

(defn *truncated-compare-to
  "Determines how two calendars compare up to no more than the specified
   most significant field.

  cal-1 - the first calendar, not null - `java.util.Calendar`
  cal-2 - the second calendar, not null - `java.util.Calendar`
  field - the field from Calendar - `int`

  returns: a negative integer, zero, or a positive integer as the first
   calendar is less than, equal to, or greater than the second. - `int`

  throws: java.lang.IllegalArgumentException - if any argument is null"
  (^Integer [^java.util.Calendar cal-1 ^java.util.Calendar cal-2 ^Integer field]
    (DateUtils/truncatedCompareTo cal-1 cal-2 field)))

(defn *get-fragment-in-milliseconds
  "Returns the number of milliseconds within the
   fragment. All datefields greater than the fragment will be ignored.

   Asking the milliseconds of any date will only return the number of milliseconds
   of the current second (resulting in a number between 0 and 999). This
   method will retrieve the number of milliseconds for any fragment.
   For example, if you want to calculate the number of milliseconds past today,
   your fragment is Calendar.DATE or Calendar.DAY_OF_YEAR. The result will
   be all milliseconds of the past hour(s), minutes(s) and second(s).

   Valid fragments are: Calendar.YEAR, Calendar.MONTH, both
   Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY,
   Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
   A fragment less than or equal to a SECOND field will return 0.


    January 1, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538
    January 6, 2008 7:15:10.538 with Calendar.SECOND as fragment will return 538
    January 6, 2008 7:15:10.538 with Calendar.MINUTE as fragment will return 10538 (10*1000  538)
    January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     (a millisecond cannot be split in milliseconds)

  date - the date to work with, not null - `java.util.Date`
  fragment - the Calendar field part of date to calculate - `int`

  returns: number of milliseconds within the fragment of date - `long`

  throws: java.lang.IllegalArgumentException - if the date is null or fragment is not supported"
  (^Long [^java.util.Date date ^Integer fragment]
    (DateUtils/getFragmentInMilliseconds date fragment)))

(defn *ceiling
  "Gets a date ceiling, leaving the field specified as the most
   significant field.

   For example, if you had the date-time of 28 Mar 2002
   13:45:01.231, if you passed with HOUR, it would return 28 Mar
   2002 14:00:00.000.  If this was passed with MONTH, it would
   return 1 Apr 2002 0:00:00.000.

  date - the date to work with, not null - `java.util.Date`
  field - the field from Calendar or SEMI_MONTH - `int`

  returns: the different ceil date, not null - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer field]
    (DateUtils/ceiling date field)))

(defn *same-local-time?
  "Checks if two calendar objects represent the same local time.

   This method compares the values of the fields of the two objects.
   In addition, both calendars must be the same of the same type.

  cal-1 - the first calendar, not altered, not null - `java.util.Calendar`
  cal-2 - the second calendar, not altered, not null - `java.util.Calendar`

  returns: true if they represent the same millisecond instant - `boolean`

  throws: java.lang.IllegalArgumentException - if either date is null"
  (^Boolean [^java.util.Calendar cal-1 ^java.util.Calendar cal-2]
    (DateUtils/isSameLocalTime cal-1 cal-2)))

(defn *get-fragment-in-hours
  "Returns the number of hours within the
   fragment. All datefields greater than the fragment will be ignored.

   Asking the hours of any date will only return the number of hours
   of the current day (resulting in a number between 0 and 23). This
   method will retrieve the number of hours for any fragment.
   For example, if you want to calculate the number of hours past this month,
   your fragment is Calendar.MONTH. The result will be all hours of the
   past day(s).

   Valid fragments are: Calendar.YEAR, Calendar.MONTH, both
   Calendar.DAY_OF_YEAR and Calendar.DATE, Calendar.HOUR_OF_DAY,
   Calendar.MINUTE, Calendar.SECOND and Calendar.MILLISECOND
   A fragment less than or equal to a HOUR field will return 0.


    January 1, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     (equivalent to deprecated date.getHours())
    January 6, 2008 7:15:10.538 with Calendar.DAY_OF_YEAR as fragment will return 7
     (equivalent to deprecated date.getHours())
    January 1, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 7
    January 6, 2008 7:15:10.538 with Calendar.MONTH as fragment will return 127 (5*24  7)
    January 16, 2008 7:15:10.538 with Calendar.MILLISECOND as fragment will return 0
     (a millisecond cannot be split in hours)

  date - the date to work with, not null - `java.util.Date`
  fragment - the Calendar field part of date to calculate - `int`

  returns: number of hours within the fragment of date - `long`

  throws: java.lang.IllegalArgumentException - if the date is null or fragment is not supported"
  (^Long [^java.util.Date date ^Integer fragment]
    (DateUtils/getFragmentInHours date fragment)))

(defn *round
  "Rounds a date, leaving the field specified as the most
   significant field.

   For example, if you had the date-time of 28 Mar 2002
   13:45:01.231, if this was passed with HOUR, it would return
   28 Mar 2002 14:00:00.000. If this was passed with MONTH, it
   would return 1 April 2002 0:00:00.000.

   For a date in a timezone that handles the change to daylight
   saving time, rounding to Calendar.HOUR_OF_DAY will behave as follows.
   Suppose daylight saving time begins at 02:00 on March 30. Rounding a
   date that crosses this time would produce the following values:


   March 30, 2003 01:10 rounds to March 30, 2003 01:00
   March 30, 2003 01:40 rounds to March 30, 2003 03:00
   March 30, 2003 02:10 rounds to March 30, 2003 03:00
   March 30, 2003 02:40 rounds to March 30, 2003 04:00

  date - the date to work with, not null - `java.util.Date`
  field - the field from Calendar or SEMI_MONTH - `int`

  returns: the different rounded date, not null - `java.util.Date`

  throws: java.lang.ArithmeticException - if the year is over 280 million"
  (^java.util.Date [^java.util.Date date ^Integer field]
    (DateUtils/round date field)))

(defn *same-instant?
  "Checks if two date objects represent the same instant in time.

   This method compares the long millisecond time of the two objects.

  date-1 - the first date, not altered, not null - `java.util.Date`
  date-2 - the second date, not altered, not null - `java.util.Date`

  returns: true if they represent the same millisecond instant - `boolean`

  throws: java.lang.IllegalArgumentException - if either date is null"
  (^Boolean [^java.util.Date date-1 ^java.util.Date date-2]
    (DateUtils/isSameInstant date-1 date-2)))

(defn *set-years
  "Sets the years field to a date returning a new object.
   The original Date is unchanged.

  date - the date, not null - `java.util.Date`
  amount - the amount to set - `int`

  returns: a new Date set with the specified value - `java.util.Date`

  throws: java.lang.IllegalArgumentException - if the date is null"
  (^java.util.Date [^java.util.Date date ^Integer amount]
    (DateUtils/setYears date amount)))

(defn *truncated-equals
  "Determines if two calendars are equal up to no more than the specified
   most significant field.

  cal-1 - the first calendar, not null - `java.util.Calendar`
  cal-2 - the second calendar, not null - `java.util.Calendar`
  field - the field from Calendar - `int`

  returns: true if equal; otherwise false - `boolean`

  throws: java.lang.IllegalArgumentException - if any argument is null"
  (^Boolean [^java.util.Calendar cal-1 ^java.util.Calendar cal-2 ^Integer field]
    (DateUtils/truncatedEquals cal-1 cal-2 field)))

