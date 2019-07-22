(ns org.apache.commons.lang3.concurrent.ConcurrentException
  " An exception class used for reporting error conditions related to accessing
  data of background tasks.


  The purpose of this exception class is analogous to the default JDK exception
  class ExecutionException, i.e. it wraps an
  exception that occurred during the execution of a task. However, in contrast
  to ExecutionException, it wraps only checked exceptions. Runtime
  exceptions are thrown directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent ConcurrentException]))

(defn ->concurrent-exception
  "Constructor.

  Creates a new instance of ConcurrentException and initializes it
   with the given message and cause.

  msg - the error message - `java.lang.String`
  cause - the cause of this exception - `java.lang.Throwable`

  throws: java.lang.IllegalArgumentException - if the cause is not a checked exception"
  (^ConcurrentException [^java.lang.String msg ^java.lang.Throwable cause]
    (new ConcurrentException msg cause))
  (^ConcurrentException [^java.lang.Throwable cause]
    (new ConcurrentException cause)))

