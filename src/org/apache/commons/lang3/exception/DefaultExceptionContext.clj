(ns org.apache.commons.lang3.exception.DefaultExceptionContext
  "Default implementation of the context storing the label-value pairs for contexted exceptions.

  This implementation is serializable, however this is dependent on the values that
  are added also being serializable."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.exception DefaultExceptionContext]))

(defn ->default-exception-context
  "Constructor."
  (^DefaultExceptionContext []
    (new DefaultExceptionContext )))

(defn add-context-value
  "Adds a contextual label-value pair into this context.

   The pair will be added to the context, independently of an already
   existing pair with the same label.

  label - the label of the item to add, null not recommended - `java.lang.String`
  value - the value of item to add, may be null - `java.lang.Object`

  returns: this, for method chaining, not null - `org.apache.commons.lang3.exception.DefaultExceptionContext`"
  (^org.apache.commons.lang3.exception.DefaultExceptionContext [^DefaultExceptionContext this ^java.lang.String label ^java.lang.Object value]
    (-> this (.addContextValue label value))))

(defn set-context-value
  "Sets a contextual label-value pair into this context.

   The pair will be added normally, but any existing label-value pair with
   the same label is removed from the context.

  label - the label of the item to add, null not recommended - `java.lang.String`
  value - the value of item to add, may be null - `java.lang.Object`

  returns: this, for method chaining, not null - `org.apache.commons.lang3.exception.DefaultExceptionContext`"
  (^org.apache.commons.lang3.exception.DefaultExceptionContext [^DefaultExceptionContext this ^java.lang.String label ^java.lang.Object value]
    (-> this (.setContextValue label value))))

(defn get-context-values
  "Retrieves all the contextual data values associated with the label.

  label - the label to get the contextual values for, may be null - `java.lang.String`

  returns: the contextual values associated with the label, never null - `java.util.List<java.lang.Object>`"
  (^java.util.List [^DefaultExceptionContext this ^java.lang.String label]
    (-> this (.getContextValues label))))

(defn get-first-context-value
  "Retrieves the first available contextual data value associated with the label.

  label - the label to get the contextual value for, may be null - `java.lang.String`

  returns: the first contextual value associated with the label, may be null - `java.lang.Object`"
  (^java.lang.Object [^DefaultExceptionContext this ^java.lang.String label]
    (-> this (.getFirstContextValue label))))

(defn get-context-labels
  "Retrieves the full set of labels defined in the contextual data.

  returns: the set of labels, not null - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^DefaultExceptionContext this]
    (-> this (.getContextLabels))))

(defn get-context-entries
  "Retrieves the full list of label-value pairs defined in the contextual data.

  returns: the list of pairs, not null - `java.util.List<org.apache.commons.lang3.tuple.Pair<java.lang.String,java.lang.Object>>`"
  (^java.util.List [^DefaultExceptionContext this]
    (-> this (.getContextEntries))))

(defn get-formatted-exception-message
  "Builds the message containing the contextual information.

  base-message - the base exception message without context information appended - `java.lang.String`

  returns: the exception message with context information appended, never null - `java.lang.String`"
  (^java.lang.String [^DefaultExceptionContext this ^java.lang.String base-message]
    (-> this (.getFormattedExceptionMessage base-message))))

