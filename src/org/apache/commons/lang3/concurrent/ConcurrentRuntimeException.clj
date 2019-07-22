(ns org.apache.commons.lang3.concurrent.ConcurrentRuntimeException
  " An exception class used for reporting runtime error conditions related to
  accessing data of background tasks.


  This class is an analogue of the ConcurrentException exception class.
  However, it is a runtime exception and thus does not need explicit catch
  clauses. Some methods of ConcurrentUtils throw ConcurrentRuntimeException exceptions rather than
  ConcurrentException exceptions. They can be used by client code that
  does not want to be bothered with checked exceptions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent ConcurrentRuntimeException]))

(defn ->concurrent-runtime-exception
  "Constructor.

  Creates a new instance of ConcurrentRuntimeException and
   initializes it with the given message and cause.

  msg - the error message - `java.lang.String`
  cause - the cause of this exception - `java.lang.Throwable`

  throws: java.lang.IllegalArgumentException - if the cause is not a checked exception"
  (^ConcurrentRuntimeException [^java.lang.String msg ^java.lang.Throwable cause]
    (new ConcurrentRuntimeException msg cause))
  (^ConcurrentRuntimeException [^java.lang.Throwable cause]
    (new ConcurrentRuntimeException cause)))

