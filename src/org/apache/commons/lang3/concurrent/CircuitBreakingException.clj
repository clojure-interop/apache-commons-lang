(ns org.apache.commons.lang3.concurrent.CircuitBreakingException
  " An exception class used for reporting runtime error conditions related to
  circuit breakers."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent CircuitBreakingException]))

(defn ->circuit-breaking-exception
  "Constructor.

  Creates a new instance of CircuitBreakingException and initializes it with the given message and cause.

  message - the error message - `java.lang.String`
  cause - the cause of this exception - `java.lang.Throwable`"
  (^CircuitBreakingException [^java.lang.String message ^java.lang.Throwable cause]
    (new CircuitBreakingException message cause))
  (^CircuitBreakingException [^java.lang.String message]
    (new CircuitBreakingException message))
  (^CircuitBreakingException []
    (new CircuitBreakingException )))

