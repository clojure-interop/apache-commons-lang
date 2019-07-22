(ns org.apache.commons.lang3.concurrent.CircuitBreaker
  " An interface describing a Circuit Breaker component.


  A circuit breaker can be used to protect an application against unreliable
  services or unexpected load. It typically monitors a specific resource. As long as this
  resource works as expected, it stays in state closed, meaning that the
  resource can be used. If problems are encountered when using the resource, the circuit
  breaker can switch into state open; then access to this resource is
  prohibited. Depending on a concrete implementation, it is possible that the circuit
  breaker switches back to state closed when the resource becomes available
  again.


  This interface defines a generic protocol of a circuit breaker component. It should be
  sufficiently generic to be applied to multiple different use cases."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent CircuitBreaker]))

(defn open?
  "Returns the current open state of this circuit breaker. A return value of
   true means that the circuit breaker is currently open indicating a
   problem in the monitored sub system.

  returns: the current open state of this circuit breaker - `boolean`"
  (^Boolean [^CircuitBreaker this]
    (-> this (.isOpen))))

(defn closed?
  "Returns the current closed state of this circuit breaker. A return value of
   true means that the circuit breaker is currently closed. This
   means that everything is okay with the monitored sub system.

  returns: the current closed state of this circuit breaker - `boolean`"
  (^Boolean [^CircuitBreaker this]
    (-> this (.isClosed))))

(defn check-state
  "Checks the state of this circuit breaker and changes it if necessary. The return
   value indicates whether the circuit breaker is now in state CLOSED; a value
   of true typically means that the current operation can continue.

  returns: true if the circuit breaker is now closed;
   false otherwise - `boolean`"
  (^Boolean [^CircuitBreaker this]
    (-> this (.checkState))))

(defn close
  "Closes this circuit breaker. Its state is changed to closed. If this circuit
   breaker is already closed, this method has no effect."
  ([^CircuitBreaker this]
    (-> this (.close))))

(defn open
  "Opens this circuit breaker. Its state is changed to open. Depending on a concrete
   implementation, it may close itself again if the monitored sub system becomes
   available. If this circuit breaker is already open, this method has no effect."
  ([^CircuitBreaker this]
    (-> this (.open))))

(defn increment-and-check-state
  "Increments the monitored value and performs a check of the current state of this
   circuit breaker. This method works like checkState(), but the monitored
   value is incremented before the state check is performed.

  increment - value to increment in the monitored value of the circuit breaker - `T`

  returns: true if the circuit breaker is now closed;
   false otherwise - `boolean`"
  (^Boolean [^CircuitBreaker this increment]
    (-> this (.incrementAndCheckState increment))))

