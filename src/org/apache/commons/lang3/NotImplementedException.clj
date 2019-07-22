(ns org.apache.commons.lang3.NotImplementedException
  "Thrown to indicate that a block of code has not been implemented.
  This exception supplements UnsupportedOperationException
  by providing a more semantically rich description of the problem.

  NotImplementedException represents the case where the
  author has yet to implement the logic at this point in the program.
  This can act as an exception based TODO tag.



  public void foo() {
    try {
      // do something that throws an Exception
    } catch (Exception ex) {
      // don't know what to do here yet
      throw new NotImplementedException(\"TODO\", ex);
    }
  }

  This class was originally added in Lang 2.0, but removed in 3.0."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 NotImplementedException]))

(defn ->not-implemented-exception
  "Constructor.

  Constructs a NotImplementedException.

  message - description of the exception - `java.lang.String`
  cause - cause of the exception - `java.lang.Throwable`
  code - code indicating a resource for more information regarding the lack of implementation - `java.lang.String`"
  (^NotImplementedException [^java.lang.String message ^java.lang.Throwable cause ^java.lang.String code]
    (new NotImplementedException message cause code))
  (^NotImplementedException [^java.lang.String message ^java.lang.Throwable cause]
    (new NotImplementedException message cause))
  (^NotImplementedException [^java.lang.String message]
    (new NotImplementedException message)))

(defn get-code
  "Obtain the not implemented code. This is an unformatted piece of text intended to point to
   further information regarding the lack of implementation. It might, for example, be an issue
   tracker ID or a URL.

  returns: a code indicating a resource for more information regarding the lack of implementation - `java.lang.String`"
  (^java.lang.String [^NotImplementedException this]
    (-> this (.getCode))))

