(ns org.apache.commons.lang3.concurrent.EventCountCircuitBreaker
  " A simple implementation of the Circuit Breaker pattern
  that counts specific events.


  A circuit breaker can be used to protect an application against unreliable
  services or unexpected load. A newly created EventCountCircuitBreaker object is
  initially in state closed meaning that no problem has been detected. When the
  application encounters specific events (like errors or service timeouts), it tells the
  circuit breaker to increment an internal counter. If the number of events reported in a
  specific time interval exceeds a configurable threshold, the circuit breaker changes
  into state open. This means that there is a problem with the associated sub
  system; the application should no longer call it, but give it some time to settle down.
  The circuit breaker can be configured to switch back to closed state after a
  certain time frame if the number of events received goes below a threshold.


  When a EventCountCircuitBreaker object is constructed the following parameters
  can be provided:


  A threshold for the number of events that causes a state transition to
  open state. If more events are received in the configured check interval, the
  circuit breaker switches to open state.
  The interval for checks whether the circuit breaker should open. So it is possible
  to specify something like \"The circuit breaker should open if more than 10 errors are
  encountered in a minute.\"
  The same parameters can be specified for automatically closing the circuit breaker
  again, as in \"If the number of requests goes down to 100 per minute, the circuit
  breaker should close itself again\". Depending on the use case, it may make sense to use
  a slightly lower threshold for closing the circuit breaker than for opening it to avoid
  continuously flipping when the number of events received is close to the threshold.


  This class supports the following typical use cases:


  Protecting against load peaks


  Imagine you have a server which can handle a certain number of requests per minute.
  Suddenly, the number of requests increases significantly - maybe because a connected
  partner system is going mad or due to a denial of service attack. A
  EventCountCircuitBreaker can be configured to stop the application from
  processing requests when a sudden peak load is detected and to start request processing
  again when things calm down. The following code fragment shows a typical example of
  such a scenario. Here the EventCountCircuitBreaker allows up to 1000 requests
  per minute before it interferes. When the load goes down again to 800 requests per
  second it switches back to state closed:




  EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(1000, 1, TimeUnit.MINUTE, 800);
  ...
  public void handleRequest(Request request) {
      if (breaker.incrementAndCheckState()) {
          // actually handle this request
      } else {
          // do something else, e.g. send an error code
      }
  }

  Deal with an unreliable service


  In this scenario, an application uses an external service which may fail from time to
  time. If there are too many errors, the service is considered down and should not be
  called for a while. This can be achieved using the following pattern - in this concrete
  example we accept up to 5 errors in 2 minutes; if this limit is reached, the service is
  given a rest time of 10 minutes:




  EventCountCircuitBreaker breaker = new EventCountCircuitBreaker(5, 2, TimeUnit.MINUTE, 5, 10, TimeUnit.MINUTE);
  ...
  public void handleRequest(Request request) {
      if (breaker.checkState()) {
          try {
              service.doSomething();
          } catch (ServiceException ex) {
              breaker.incrementAndCheckState();
          }
      } else {
          // return an error code, use an alternative service, etc.
      }
  }

  In addition to automatic state transitions, the state of a circuit breaker can be
  changed manually using the methods open() and close(). It is also
  possible to register PropertyChangeListener objects that get notified whenever
  a state transition occurs. This is useful, for instance to directly react on a freshly
  detected error condition.


  Implementation notes:


  This implementation uses non-blocking algorithms to update the internal counter and
  state. This should be pretty efficient if there is not too much contention.
  This implementation is not intended to operate as a high-precision timer in very
  short check intervals. It is deliberately kept simple to avoid complex and
  time-consuming state checks. It should work well in time intervals from a few seconds
  up to minutes and longer. If the intervals become too short, there might be race
  conditions causing spurious state transitions.
  The handling of check intervals is a bit simplistic. Therefore, there is no
  guarantee that the circuit breaker is triggered at a specific point in time; there may
  be some delay (less than a check interval)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent EventCountCircuitBreaker]))

(defn ->event-count-circuit-breaker
  "Constructor.

  Creates a new instance of EventCountCircuitBreaker and initializes all properties for
   opening and closing it based on threshold values for events occurring in specific
   intervals.

  opening-threshold - the threshold for opening the circuit breaker; if this number of events is received in the time span determined by the opening interval, the circuit breaker is opened - `int`
  opening-interval - the interval for opening the circuit breaker - `long`
  opening-unit - the TimeUnit defining the opening interval - `java.util.concurrent.TimeUnit`
  closing-threshold - the threshold for closing the circuit breaker; if the number of events received in the time span determined by the closing interval goes below this threshold, the circuit breaker is closed again - `int`
  closing-interval - the interval for closing the circuit breaker - `long`
  closing-unit - the TimeUnit defining the closing interval - `java.util.concurrent.TimeUnit`"
  (^EventCountCircuitBreaker [^Integer opening-threshold ^Long opening-interval ^java.util.concurrent.TimeUnit opening-unit ^Integer closing-threshold ^Long closing-interval ^java.util.concurrent.TimeUnit closing-unit]
    (new EventCountCircuitBreaker opening-threshold opening-interval opening-unit closing-threshold closing-interval closing-unit))
  (^EventCountCircuitBreaker [^Integer opening-threshold ^Long check-interval ^java.util.concurrent.TimeUnit check-unit ^Integer closing-threshold]
    (new EventCountCircuitBreaker opening-threshold check-interval check-unit closing-threshold))
  (^EventCountCircuitBreaker [^Integer threshold ^Long check-interval ^java.util.concurrent.TimeUnit check-unit]
    (new EventCountCircuitBreaker threshold check-interval check-unit)))

(defn get-opening-threshold
  "Returns the threshold value for opening the circuit breaker. If this number of
   events is received in the time span determined by the opening interval, the circuit
   breaker is opened.

  returns: the opening threshold - `int`"
  (^Integer [^EventCountCircuitBreaker this]
    (-> this (.getOpeningThreshold))))

(defn get-opening-interval
  "Returns the interval (in nanoseconds) for checking for the opening threshold.

  returns: the opening check interval - `long`"
  (^Long [^EventCountCircuitBreaker this]
    (-> this (.getOpeningInterval))))

(defn get-closing-threshold
  "Returns the threshold value for closing the circuit breaker. If the number of
   events received in the time span determined by the closing interval goes below this
   threshold, the circuit breaker is closed again.

  returns: the closing threshold - `int`"
  (^Integer [^EventCountCircuitBreaker this]
    (-> this (.getClosingThreshold))))

(defn get-closing-interval
  "Returns the interval (in nanoseconds) for checking for the closing threshold.

  returns: the opening check interval - `long`"
  (^Long [^EventCountCircuitBreaker this]
    (-> this (.getClosingInterval))))

(defn check-state
  "Checks the state of this circuit breaker and changes it if necessary. The return
   value indicates whether the circuit breaker is now in state CLOSED; a value
   of true typically means that the current operation can continue. This implementation checks the internal event counter against the
   threshold values and the check intervals. This may cause a state change of this
   circuit breaker.

  returns: true if the circuit breaker is now closed;
   false otherwise - `boolean`"
  (^Boolean [^EventCountCircuitBreaker this]
    (-> this (.checkState))))

(defn increment-and-check-state
  "Increments the monitored value and performs a check of the current state of this
   circuit breaker. This method works like CircuitBreaker.checkState(), but the monitored
   value is incremented before the state check is performed.

  increment - value to increment in the monitored value of the circuit breaker - `java.lang.Integer`

  returns: true if the circuit breaker is now closed;
   false otherwise - `boolean`"
  (^Boolean [^EventCountCircuitBreaker this ^java.lang.Integer increment]
    (-> this (.incrementAndCheckState increment)))
  (^Boolean [^EventCountCircuitBreaker this]
    (-> this (.incrementAndCheckState))))

(defn open
  "Opens this circuit breaker. Its state is changed to open. Depending on a concrete
   implementation, it may close itself again if the monitored sub system becomes
   available. If this circuit breaker is already open, this method has no effect. This circuit breaker may close itself again if the number of events
   received during a check interval goes below the closing threshold. If this circuit
   breaker is already open, this method has no effect, except that a new check
   interval is started."
  ([^EventCountCircuitBreaker this]
    (-> this (.open))))

(defn close
  "Closes this circuit breaker. Its state is changed to closed. If this circuit
   breaker is already closed, this method has no effect. A new check interval is started. If too many events are received in
   this interval, the circuit breaker changes again to state open. If this circuit
   breaker is already closed, this method has no effect, except that a new check
   interval is started."
  ([^EventCountCircuitBreaker this]
    (-> this (.close))))

