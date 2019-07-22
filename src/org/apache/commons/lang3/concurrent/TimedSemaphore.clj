(ns org.apache.commons.lang3.concurrent.TimedSemaphore
  " A specialized semaphore implementation that provides a number of
  permits in a given time frame.


  This class is similar to the java.util.concurrent.Semaphore class
  provided by the JDK in that it manages a configurable number of permits.
  Using the acquire() method a permit can be requested by a thread.
  However, there is an additional timing dimension: there is no release() method for freeing a permit, but all permits are automatically
  released at the end of a configurable time frame. If a thread calls
  acquire() and the available permits are already exhausted for this
  time frame, the thread is blocked. When the time frame ends all permits
  requested so far are restored, and blocking threads are waked up again, so
  that they can try to acquire a new permit. This basically means that in the
  specified time frame only the given number of operations is possible.


  A use case for this class is to artificially limit the load produced by a
  process. As an example consider an application that issues database queries
  on a production system in a background process to gather statistical
  information. This background processing should not produce so much database
  load that the functionality and the performance of the production system are
  impacted. Here a TimedSemaphore could be installed to guarantee that
  only a given number of database queries are issued per second.


  A thread class for performing database queries could look as follows:




  public class StatisticsThread extends Thread {
      // The semaphore for limiting database load.
      private final TimedSemaphore semaphore;
      // Create an instance and set the semaphore
      public StatisticsThread(TimedSemaphore timedSemaphore) {
          semaphore = timedSemaphore;
      }
      // Gather statistics
      public void run() {
          try {
              while (true) {
                  semaphore.acquire();   // limit database load
                  performQuery();        // issue a query
              }
          } catch(InterruptedException) {
              // fall through
          }
      }
      ...
  }


  The following code fragment shows how a TimedSemaphore is created
  that allows only 10 operations per second and passed to the statistics
  thread:




  TimedSemaphore sem = new TimedSemaphore(1, TimeUnit.SECOND, 10);
  StatisticsThread thread = new StatisticsThread(sem);
  thread.start();


  When creating an instance the time period for the semaphore must be
  specified. TimedSemaphore uses an executor service with a
  corresponding period to monitor this interval. The ScheduledExecutorService to be used for this purpose can be provided at
  construction time. Alternatively the class creates an internal executor
  service.


  Client code that uses TimedSemaphore has to call the
  acquire() method in each processing step. TimedSemaphore
  keeps track of the number of invocations of the acquire() method and
  blocks the calling thread if the counter exceeds the limit specified. When
  the timer signals the end of the time period the counter is reset and all
  waiting threads are released. Then another cycle can start.


  An alternative to acquire() is the tryAcquire() method. This
  method checks whether the semaphore is under the specified limit and
  increases the internal counter if this is the case. The return value is then
  true, and the calling thread can continue with its action.
  If the semaphore is already at its limit, tryAcquire() immediately
  returns false without blocking; the calling thread must
  then abort its action. This usage scenario prevents blocking of threads.


  It is possible to modify the limit at any time using the
  setLimit(int) method. This is useful if the load produced by an
  operation has to be adapted dynamically. In the example scenario with the
  thread collecting statistics it may make sense to specify a low limit during
  day time while allowing a higher load in the night time. Reducing the limit
  takes effect immediately by blocking incoming callers. If the limit is
  increased, waiting threads are not released immediately, but wake up when the
  timer runs out. Then, in the next period more processing steps can be
  performed without blocking. By setting the limit to 0 the semaphore can be
  switched off: in this mode the acquire() method never blocks, but
  lets all callers pass directly.


  When the TimedSemaphore is no more needed its shutdown()
  method should be called. This causes the periodic task that monitors the time
  interval to be canceled. If the ScheduledExecutorService has been
  created by the semaphore at construction time, it is also shut down.
  resources. After that acquire() must not be called any more."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent TimedSemaphore]))

(defn ->timed-semaphore
  "Constructor.

  Creates a new instance of TimedSemaphore and initializes it with
   an executor service, the given time period, and the limit. The executor
   service will be used for creating a periodic task for monitoring the time
   period. It can be null, then a default service will be created.

  service - the executor service - `java.util.concurrent.ScheduledExecutorService`
  time-period - the time period - `long`
  time-unit - the unit for the period - `java.util.concurrent.TimeUnit`
  limit - the limit for the semaphore - `int`

  throws: java.lang.IllegalArgumentException - if the period is less or equals 0"
  (^TimedSemaphore [^java.util.concurrent.ScheduledExecutorService service ^Long time-period ^java.util.concurrent.TimeUnit time-unit ^Integer limit]
    (new TimedSemaphore service time-period time-unit limit))
  (^TimedSemaphore [^Long time-period ^java.util.concurrent.TimeUnit time-unit ^Integer limit]
    (new TimedSemaphore time-period time-unit limit)))

(def *-no-limit
  "Static Constant.

  Constant for a value representing no limit. If the limit is set to a
   value less or equal this constant, the TimedSemaphore will be
   effectively switched off.

  type: int"
  TimedSemaphore/NO_LIMIT)

(defn get-average-calls-per-period
  "Returns the average number of successful (i.e. non-blocking)
   acquire() invocations for the entire life-time of this TimedSemaphore. This method can be used for instance for statistical
   calculations.

  returns: the average number of acquire() invocations per time
   unit - `double`"
  (^Double [^TimedSemaphore this]
    (-> this (.getAverageCallsPerPeriod))))

(defn get-period
  "Returns the time period. This is the time monitored by this semaphore.
   Only a given number of invocations of the acquire() method is
   possible in this period.

  returns: the time period - `long`"
  (^Long [^TimedSemaphore this]
    (-> this (.getPeriod))))

(defn get-acquire-count
  "Returns the number of invocations of the acquire() method for
   the current period. This may be useful for testing or debugging purposes.

  returns: the current number of acquire() invocations - `int`"
  (^Integer [^TimedSemaphore this]
    (-> this (.getAcquireCount))))

(defn shutdown?
  "Tests whether the shutdown() method has been called on this
   object. If this method returns true, this instance cannot be used
   any longer.

  returns: a flag whether a shutdown has been performed - `boolean`"
  (^Boolean [^TimedSemaphore this]
    (-> this (.isShutdown))))

(defn shutdown
  "Initializes a shutdown. After that the object cannot be used any more.
   This method can be invoked an arbitrary number of times. All invocations
   after the first one do not have any effect."
  ([^TimedSemaphore this]
    (-> this (.shutdown))))

(defn set-limit
  "Sets the limit. This is the number of times the acquire() method
   can be called within the time period specified. If this limit is reached,
   further invocations of acquire() will block. Setting the limit
   to a value <= NO_LIMIT will cause the limit to be disabled,
   i.e. an arbitrary number ofacquire() invocations is allowed in
   the time period.

  limit - the limit - `int`"
  ([^TimedSemaphore this ^Integer limit]
    (-> this (.setLimit limit))))

(defn try-acquire
  "Tries to acquire a permit from this semaphore. If the limit of this semaphore has
   not yet been reached, a permit is acquired, and this method returns
   true. Otherwise, this method returns immediately with the result
   false.

  returns: true if a permit could be acquired; false
   otherwise - `boolean`

  throws: java.lang.IllegalStateException - if this semaphore is already shut down"
  (^Boolean [^TimedSemaphore this]
    (-> this (.tryAcquire))))

(defn get-available-permits
  "Returns the number of calls to the acquire() method that can
   still be performed in the current period without blocking. This method
   can give an indication whether it is safe to call the acquire()
   method without risking to be suspended. However, there is no guarantee
   that a subsequent call to acquire() actually is not-blocking
   because in the mean time other threads may have invoked the semaphore.

  returns: the current number of available acquire() calls in the
   current period - `int`"
  (^Integer [^TimedSemaphore this]
    (-> this (.getAvailablePermits))))

(defn get-limit
  "Returns the limit enforced by this semaphore. The limit determines how
   many invocations of acquire() are allowed within the monitored
   period.

  returns: the limit - `int`"
  (^Integer [^TimedSemaphore this]
    (-> this (.getLimit))))

(defn get-unit
  "Returns the time unit. This is the unit used by getPeriod().

  returns: the time unit - `java.util.concurrent.TimeUnit`"
  (^java.util.concurrent.TimeUnit [^TimedSemaphore this]
    (-> this (.getUnit))))

(defn acquire
  "Acquires a permit from this semaphore. This method will block if
   the limit for the current period has already been reached. If
   shutdown() has already been invoked, calling this method will
   cause an exception. The very first call of this method starts the timer
   task which monitors the time period set for this TimedSemaphore.
   From now on the semaphore is active.

  throws: java.lang.InterruptedException - if the thread gets interrupted"
  ([^TimedSemaphore this]
    (-> this (.acquire))))

(defn get-last-acquires-per-period
  "Returns the number of (successful) acquire invocations during the last
   period. This is the number of times the acquire() method was
   called without blocking. This can be useful for testing or debugging
   purposes or to determine a meaningful threshold value. If a limit is set,
   the value returned by this method won't be greater than this limit.

  returns: the number of non-blocking invocations of the acquire()
   method - `int`"
  (^Integer [^TimedSemaphore this]
    (-> this (.getLastAcquiresPerPeriod))))

