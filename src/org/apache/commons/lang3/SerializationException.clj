(ns org.apache.commons.lang3.SerializationException
  "Exception thrown when the Serialization process fails.

  The original error is wrapped within this one.

  #NotThreadSafe# because Throwable is not thread-safe"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 SerializationException]))

(defn ->serialization-exception
  "Constructor.

  Constructs a new SerializationException with specified
   detail message and nested Throwable.

  msg - The error message. - `java.lang.String`
  cause - The Exception or Error that caused this exception to be thrown. - `java.lang.Throwable`"
  (^SerializationException [^java.lang.String msg ^java.lang.Throwable cause]
    (new SerializationException msg cause))
  (^SerializationException [^java.lang.String msg]
    (new SerializationException msg))
  (^SerializationException []
    (new SerializationException )))

