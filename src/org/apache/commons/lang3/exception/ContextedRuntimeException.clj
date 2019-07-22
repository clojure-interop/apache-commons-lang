(ns org.apache.commons.lang3.exception.ContextedRuntimeException
  " A runtime exception that provides an easy and safe way to add contextual information.

  An exception trace itself is often insufficient to provide rapid diagnosis of the issue.
  Frequently what is needed is a select few pieces of local contextual data.
  Providing this data is tricky however, due to concerns over formatting and nulls.

  The contexted exception approach allows the exception to be created together with a
  list of context label-value pairs. This additional information is automatically included in
  the message and printed stack trace.

  A checked version of this exception is provided by ContextedException.


  To use this class write code as follows:



    try {
      ...
    } catch (Exception e) {
      throw new ContextedRuntimeException(\"Error posting account transaction\", e)
           .addContextValue(\"Account Number\", accountNumber)
           .addContextValue(\"Amount Posted\", amountPosted)
           .addContextValue(\"Previous Balance\", previousBalance)
    }
  }

  or improve diagnose data at a higher level:



    try {
      ...
    } catch (ContextedRuntimeException e) {
      throw e.setContextValue(\"Transaction Id\", transactionId);
    } catch (Exception e) {
      if (e instanceof ExceptionContext) {
        e.setContextValue(\"Transaction Id\", transactionId);
      }
      throw e;
    }
  }

  The output in a printStacktrace() (which often is written to a log) would look something like the following:



  org.apache.commons.lang3.exception.ContextedRuntimeException: java.lang.Exception: Error posting account transaction
   Exception Context:
   [1:Account Number=null]
   [2:Amount Posted=100.00]
   [3:Previous Balance=-2.17]
   [4:Transaction Id=94ef1d15-d443-46c4-822b-637f26244899]

   ---------------------------------
   at org.apache.commons.lang3.exception.ContextedRuntimeExceptionTest.testAddValue(ContextedExceptionTest.java:88)
   ..... (rest of trace)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.exception ContextedRuntimeException]))

(defn ->contexted-runtime-exception
  "Constructor.

  Instantiates ContextedRuntimeException with cause, message, and ExceptionContext.

  message - the exception message, may be null - `java.lang.String`
  cause - the underlying cause of the exception, may be null - `java.lang.Throwable`
  context - the context used to store the additional information, null uses default implementation - `org.apache.commons.lang3.exception.ExceptionContext`"
  (^ContextedRuntimeException [^java.lang.String message ^java.lang.Throwable cause ^org.apache.commons.lang3.exception.ExceptionContext context]
    (new ContextedRuntimeException message cause context))
  (^ContextedRuntimeException [^java.lang.String message ^java.lang.Throwable cause]
    (new ContextedRuntimeException message cause))
  (^ContextedRuntimeException [^java.lang.String message]
    (new ContextedRuntimeException message))
  (^ContextedRuntimeException []
    (new ContextedRuntimeException )))

(defn get-formatted-exception-message
  "Gets the contextualized error message based on a base message.
   This will add the context label-value pairs to the message.

  base-message - the base exception message without context information appended - `java.lang.String`

  returns: the exception message with context information appended, not null - `java.lang.String`"
  (^java.lang.String [^ContextedRuntimeException this ^java.lang.String base-message]
    (-> this (.getFormattedExceptionMessage base-message))))

(defn get-context-labels
  "Retrieves the full set of labels defined in the contextual data.

  returns: the set of labels, not null - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^ContextedRuntimeException this]
    (-> this (.getContextLabels))))

(defn get-first-context-value
  "Retrieves the first available contextual data value associated with the label.

  label - the label to get the contextual value for, may be null - `java.lang.String`

  returns: the first contextual value associated with the label, may be null - `java.lang.Object`"
  (^java.lang.Object [^ContextedRuntimeException this ^java.lang.String label]
    (-> this (.getFirstContextValue label))))

(defn get-context-values
  "Retrieves all the contextual data values associated with the label.

  label - the label to get the contextual values for, may be null - `java.lang.String`

  returns: the contextual values associated with the label, never null - `java.util.List<java.lang.Object>`"
  (^java.util.List [^ContextedRuntimeException this ^java.lang.String label]
    (-> this (.getContextValues label))))

(defn set-context-value
  "Sets information helpful to a developer in diagnosing and correcting the problem.
   For the information to be meaningful, the value passed should have a reasonable
   toString() implementation.
   Any existing values with the same labels are removed before the new one is added.

   Note: This exception is only serializable if the object added as value is serializable.

  label - a textual label associated with information, null not recommended - `java.lang.String`
  value - information needed to understand exception, may be null - `java.lang.Object`

  returns: this, for method chaining, not null - `org.apache.commons.lang3.exception.ContextedRuntimeException`"
  (^org.apache.commons.lang3.exception.ContextedRuntimeException [^ContextedRuntimeException this ^java.lang.String label ^java.lang.Object value]
    (-> this (.setContextValue label value))))

(defn add-context-value
  "Adds information helpful to a developer in diagnosing and correcting the problem.
   For the information to be meaningful, the value passed should have a reasonable
   toString() implementation.
   Different values can be added with the same label multiple times.

   Note: This exception is only serializable if the object added is serializable.

  label - a textual label associated with information, null not recommended - `java.lang.String`
  value - information needed to understand exception, may be null - `java.lang.Object`

  returns: this, for method chaining, not null - `org.apache.commons.lang3.exception.ContextedRuntimeException`"
  (^org.apache.commons.lang3.exception.ContextedRuntimeException [^ContextedRuntimeException this ^java.lang.String label ^java.lang.Object value]
    (-> this (.addContextValue label value))))

(defn get-context-entries
  "Retrieves the full list of label-value pairs defined in the contextual data.

  returns: the list of pairs, not null - `java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String,java.lang.Object>>`"
  (^java.util.List [^ContextedRuntimeException this]
    (-> this (.getContextEntries))))

(defn get-message
  "Provides the message explaining the exception, including the contextual data.

  returns: the message, never null - `java.lang.String`"
  (^java.lang.String [^ContextedRuntimeException this]
    (-> this (.getMessage))))

(defn get-raw-message
  "Provides the message explaining the exception without the contextual data.

  returns: the message - `java.lang.String`"
  (^java.lang.String [^ContextedRuntimeException this]
    (-> this (.getRawMessage))))

