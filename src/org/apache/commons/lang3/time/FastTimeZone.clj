(ns org.apache.commons.lang3.time.FastTimeZone
  "Faster methods to produce custom time zones."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time FastTimeZone]))

(defn *get-gmt-time-zone
  "Gets a TimeZone with GMT offsets.  A GMT offset must be either 'Z', or 'UTC', or match
   (GMT)? hh?(:?mm?)?, where h and m are digits representing hours and minutes.

  pattern - The GMT offset - `java.lang.String`

  returns: A TimeZone with offset from GMT or null, if pattern does not match. - `java.util.TimeZone`"
  (^java.util.TimeZone [^java.lang.String pattern]
    (FastTimeZone/getGmtTimeZone pattern))
  (^java.util.TimeZone []
    (FastTimeZone/getGmtTimeZone )))

(defn *get-time-zone
  "Gets a TimeZone, looking first for GMT custom ids, then falling back to Olson ids.
   A GMT custom id can be 'Z', or 'UTC', or has an optional prefix of GMT,
   followed by sign, hours digit(s), optional colon(':'), and optional minutes digits.
   i.e. [GMT] (+|-) Hours [[:] Minutes]

  id - A GMT custom id (or Olson id - `java.lang.String`

  returns: A timezone - `java.util.TimeZone`"
  (^java.util.TimeZone [^java.lang.String id]
    (FastTimeZone/getTimeZone id)))

