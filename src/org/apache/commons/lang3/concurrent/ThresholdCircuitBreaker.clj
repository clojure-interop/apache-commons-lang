(ns org.apache.commons.lang3.concurrent.ThresholdCircuitBreaker
  " A simple implementation of the Circuit Breaker pattern
  that opens if the requested increment amount is greater than a given threshold.



  It contains an internal counter that starts in zero, and each call increments the counter by a given amount.
  If the threshold is zero, the circuit breaker will be in a permanent open state.



  An example of use case could be a memory circuit breaker.




  long threshold = 10L;
  ThresholdCircuitBreaker breaker = new ThresholdCircuitBreaker(10L);
  ...
  public void handleRequest(Request request) {
      long memoryUsed = estimateMemoryUsage(request);
      if (breaker.incrementAndCheckState(memoryUsed)) {
          // actually handle this request
      } else {
          // do something else, e.g. send an error code
      }
  }

  #Thread safe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent ThresholdCircuitBreaker]))

(defn ->threshold-circuit-breaker
  "Constructor.

  Creates a new instance of ThresholdCircuitBreaker and initializes the threshold.

  threshold - the threshold. - `long`"
  (^ThresholdCircuitBreaker [^Long threshold]
    (new ThresholdCircuitBreaker threshold)))

(defn get-threshold
  "Gets the threshold.

  returns: the threshold - `long`"
  (^Long [^ThresholdCircuitBreaker this]
    (-> this (.getThreshold))))

(defn check-state
  "Checks the state of this circuit breaker and changes it if necessary. The return
   value indicates whether the circuit breaker is now in state CLOSED; a value
   of true typically means that the current operation can continue.

  returns: true if the circuit breaker is now closed;
   false otherwise - `boolean`"
  (^Boolean [^ThresholdCircuitBreaker this]
    (-> this (.checkState))))

(defn close
  "Closes this circuit breaker. Its state is changed to closed. If this circuit
   breaker is already closed, this method has no effect.

   Resets the internal counter back to its initial value (zero)."
  ([^ThresholdCircuitBreaker this]
    (-> this (.close))))

(defn increment-and-check-state
  "Increments the monitored value and performs a check of the current state of this
   circuit breaker. This method works like CircuitBreaker.checkState(), but the monitored
   value is incremented before the state check is performed.

   If the threshold is zero, the circuit breaker will be in a permanent open state.

  increment - value to increment in the monitored value of the circuit breaker - `java.lang.Long`

  returns: true if the circuit breaker is now closed;
   false otherwise - `boolean`"
  (^Boolean [^ThresholdCircuitBreaker this ^java.lang.Long increment]
    (-> this (.incrementAndCheckState increment))))

