(ns org.apache.commons.lang3.concurrent.AbstractCircuitBreaker
  "Base class for circuit breakers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent AbstractCircuitBreaker]))

(defn ->abstract-circuit-breaker
  "Constructor.

  Creates an AbstractCircuitBreaker. It also creates an internal PropertyChangeSupport."
  (^AbstractCircuitBreaker []
    (new AbstractCircuitBreaker )))

(def *-property-name
  "Static Constant.

  The name of the open property as it is passed to registered
   change listeners.

  type: java.lang.String"
  AbstractCircuitBreaker/PROPERTY_NAME)

(defn open?
  "Returns the current open state of this circuit breaker. A return value of
   true means that the circuit breaker is currently open indicating a
   problem in the monitored sub system.

  returns: the current open state of this circuit breaker - `boolean`"
  (^Boolean [^AbstractCircuitBreaker this]
    (-> this (.isOpen))))

(defn closed?
  "Returns the current closed state of this circuit breaker. A return value of
   true means that the circuit breaker is currently closed. This
   means that everything is okay with the monitored sub system.

  returns: the current closed state of this circuit breaker - `boolean`"
  (^Boolean [^AbstractCircuitBreaker this]
    (-> this (.isClosed))))

(defn check-state
  "Checks the state of this circuit breaker and changes it if necessary. The return
   value indicates whether the circuit breaker is now in state CLOSED; a value
   of true typically means that the current operation can continue.

  returns: true if the circuit breaker is now closed;
   false otherwise - `boolean`"
  (^Boolean [^AbstractCircuitBreaker this]
    (-> this (.checkState))))

(defn increment-and-check-state
  "Increments the monitored value and performs a check of the current state of this
   circuit breaker. This method works like CircuitBreaker.checkState(), but the monitored
   value is incremented before the state check is performed.

  increment - value to increment in the monitored value of the circuit breaker - `T`

  returns: true if the circuit breaker is now closed;
   false otherwise - `boolean`"
  (^Boolean [^AbstractCircuitBreaker this increment]
    (-> this (.incrementAndCheckState increment))))

(defn close
  "Closes this circuit breaker. Its state is changed to closed. If this circuit
   breaker is already closed, this method has no effect."
  ([^AbstractCircuitBreaker this]
    (-> this (.close))))

(defn open
  "Opens this circuit breaker. Its state is changed to open. Depending on a concrete
   implementation, it may close itself again if the monitored sub system becomes
   available. If this circuit breaker is already open, this method has no effect."
  ([^AbstractCircuitBreaker this]
    (-> this (.open))))

(defn add-change-listener
  "Adds a change listener to this circuit breaker. This listener is notified whenever
   the state of this circuit breaker changes. If the listener is
   null, it is silently ignored.

  listener - the listener to be added - `java.beans.PropertyChangeListener`"
  ([^AbstractCircuitBreaker this ^java.beans.PropertyChangeListener listener]
    (-> this (.addChangeListener listener))))

(defn remove-change-listener
  "Removes the specified change listener from this circuit breaker.

  listener - the listener to be removed - `java.beans.PropertyChangeListener`"
  ([^AbstractCircuitBreaker this ^java.beans.PropertyChangeListener listener]
    (-> this (.removeChangeListener listener))))

