(ns org.apache.commons.lang3.exception.CloneFailedException
  "Exception thrown when a clone cannot be created. In contrast to
  CloneNotSupportedException this is a RuntimeException."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.exception CloneFailedException]))

(defn ->clone-failed-exception
  "Constructor.

  Constructs a CloneFailedException.

  message - description of the exception - `java.lang.String`
  cause - cause of the exception - `java.lang.Throwable`"
  (^CloneFailedException [^java.lang.String message ^java.lang.Throwable cause]
    (new CloneFailedException message cause))
  (^CloneFailedException [^java.lang.String message]
    (new CloneFailedException message)))

