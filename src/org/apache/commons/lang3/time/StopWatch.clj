(ns org.apache.commons.lang3.time.StopWatch
  " StopWatch provides a convenient API for timings.



  To start the watch, call start() or createStarted(). At this point you can:


  split() the watch to get the time whilst the watch continues in the background. unsplit() will
  remove the effect of the split. At this point, these three options are available again.
  suspend() the watch to pause it. resume() allows the watch to continue. Any time between the
  suspend and resume will not be counted in the total. At this point, these three options are available again.
  stop() the watch to complete the timing session.



  It is intended that the output methods toString() and getTime() should only be called after stop,
  split or suspend, however a suitable result will be returned at other points.



  NOTE: As from v2.1, the methods protect against inappropriate calls. Thus you cannot now call stop before start,
  resume before suspend or unsplit before split.



  1. split(), suspend(), or stop() cannot be invoked twice
  2. unsplit() may only be called if the watch has been split()
  3. resume() may only be called if the watch has been suspend()
  4. start() cannot be called twice without calling reset()


  This class is not thread-safe"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.time StopWatch]))

(defn ->stop-watch
  "Constructor.

  Constructor."
  (^StopWatch []
    (new StopWatch )))

(defn *create-started
  "Provides a started stopwatch for convenience.

  returns: StopWatch a stopwatch that's already been started. - `org.apache.commons.lang3.time.StopWatch`"
  (^org.apache.commons.lang3.time.StopWatch []
    (StopWatch/createStarted )))

(defn stop
  "Stop the stopwatch.



   This method ends a new timing session, allowing the time to be retrieved.

  throws: java.lang.IllegalStateException - if the StopWatch is not running."
  ([^StopWatch this]
    (-> this (.stop))))

(defn stopped?
  "This method is used to find out whether the StopWatch is stopped. The
   stopwatch which's not yet started and explicitly stopped stopwatch is
   considered as stopped.

  returns: boolean
               If the StopWatch is stopped. - `boolean`"
  (^Boolean [^StopWatch this]
    (-> this (.isStopped))))

(defn get-split-nano-time
  "Get the split time on the stopwatch in nanoseconds.



   This is the time between start and latest split.

  returns: the split time in nanoseconds - `long`

  throws: java.lang.IllegalStateException - if the StopWatch has not yet been split."
  (^Long [^StopWatch this]
    (-> this (.getSplitNanoTime))))

(defn get-nano-time
  "Get the time on the stopwatch in nanoseconds.



   This is either the time between the start and the moment this method is called, or the amount of time between
   start and stop.

  returns: the time in nanoseconds - `long`"
  (^Long [^StopWatch this]
    (-> this (.getNanoTime))))

(defn get-start-time
  "Returns the time this stopwatch was started.

  returns: the time this stopwatch was started - `long`

  throws: java.lang.IllegalStateException - if this StopWatch has not been started"
  (^Long [^StopWatch this]
    (-> this (.getStartTime))))

(defn suspend
  "Suspend the stopwatch for later resumption.



   This method suspends the watch until it is resumed. The watch will not include time between the suspend and
   resume calls in the total time.

  throws: java.lang.IllegalStateException - if the StopWatch is not currently running."
  ([^StopWatch this]
    (-> this (.suspend))))

(defn to-string
  "Gets a summary of the time that the stopwatch recorded as a string.



   The format used is ISO 8601-like, hours:minutes:seconds.milliseconds.

  returns: the time as a String - `java.lang.String`"
  (^java.lang.String [^StopWatch this]
    (-> this (.toString))))

(defn reset
  "Resets the stopwatch. Stops it if need be.



   This method clears the internal values to allow the object to be reused."
  ([^StopWatch this]
    (-> this (.reset))))

(defn started?
  "The method is used to find out if the StopWatch is started. A suspended
   StopWatch is also started watch.

  returns: boolean
               If the StopWatch is started. - `boolean`"
  (^Boolean [^StopWatch this]
    (-> this (.isStarted))))

(defn start
  "Start the stopwatch.



   This method starts a new timing session, clearing any previous values.

  throws: java.lang.IllegalStateException - if the StopWatch is already running."
  ([^StopWatch this]
    (-> this (.start))))

(defn split
  "Split the time.



   This method sets the stop time of the watch to allow a time to be extracted. The start time is unaffected,
   enabling unsplit() to continue the timing from the original start point.

  throws: java.lang.IllegalStateException - if the StopWatch is not running."
  ([^StopWatch this]
    (-> this (.split))))

(defn suspended?
  "This method is used to find out whether the StopWatch is suspended.

  returns: boolean
               If the StopWatch is suspended. - `boolean`"
  (^Boolean [^StopWatch this]
    (-> this (.isSuspended))))

(defn to-split-string
  "Gets a summary of the split time that the stopwatch recorded as a string.



   The format used is ISO 8601-like, hours:minutes:seconds.milliseconds.

  returns: the split time as a String - `java.lang.String`"
  (^java.lang.String [^StopWatch this]
    (-> this (.toSplitString))))

(defn get-split-time
  "Get the split time on the stopwatch.



   This is the time between start and latest split.

  returns: the split time in milliseconds - `long`

  throws: java.lang.IllegalStateException - if the StopWatch has not yet been split."
  (^Long [^StopWatch this]
    (-> this (.getSplitTime))))

(defn get-time
  "Get the time on the stopwatch in the specified TimeUnit.



   This is either the time between the start and the moment this method is called, or the amount of time between
   start and stop. The resulting time will be expressed in the desired TimeUnit with any remainder rounded down.
   For example, if the specified unit is TimeUnit.HOURS and the stopwatch time is 59 minutes, then the
   result returned will be 0.

  time-unit - the unit of time, not null - `java.util.concurrent.TimeUnit`

  returns: the time in the specified TimeUnit, rounded down - `long`"
  (^Long [^StopWatch this ^java.util.concurrent.TimeUnit time-unit]
    (-> this (.getTime time-unit)))
  (^Long [^StopWatch this]
    (-> this (.getTime))))

(defn resume
  "Resume the stopwatch after a suspend.



   This method resumes the watch after it was suspended. The watch will not include time between the suspend and
   resume calls in the total time.

  throws: java.lang.IllegalStateException - if the StopWatch has not been suspended."
  ([^StopWatch this]
    (-> this (.resume))))

(defn unsplit
  "Remove a split.



   This method clears the stop time. The start time is unaffected, enabling timing from the original start point to
   continue.

  throws: java.lang.IllegalStateException - if the StopWatch has not been split."
  ([^StopWatch this]
    (-> this (.unsplit))))

