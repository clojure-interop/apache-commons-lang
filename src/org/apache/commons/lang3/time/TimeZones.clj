(ns org.apache.commons.lang3.time.TimeZones
  "Helps to deal with TimeZones."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time TimeZones]))

(def *-gmt-id
  "Static Constant.

  A public version of TimeZone's package private GMT_ID field.

  type: java.lang.String"
  TimeZones/GMT_ID)

