(ns org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder
  " A builder class for creating instances of BasicThreadFactory.


  Using this builder class instances of BasicThreadFactory can be
  created and initialized. The class provides methods that correspond to
  the configuration options supported by BasicThreadFactory. Method
  chaining is supported. Refer to the documentation of BasicThreadFactory for a usage example."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent BasicThreadFactory$Builder]))

(defn ->builder
  "Constructor."
  (^BasicThreadFactory$Builder []
    (new BasicThreadFactory$Builder )))

(defn wrapped-factory
  "Sets the ThreadFactory to be wrapped by the new BasicThreadFactory.

  factory - the wrapped ThreadFactory (must not be null) - `java.util.concurrent.ThreadFactory`

  returns: a reference to this Builder - `org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder`

  throws: java.lang.NullPointerException - if the passed in ThreadFactory is null"
  (^org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder [^BasicThreadFactory$Builder this ^java.util.concurrent.ThreadFactory factory]
    (-> this (.wrappedFactory factory))))

(defn naming-pattern
  "Sets the naming pattern to be used by the new BasicThreadFactory.

  pattern - the naming pattern (must not be null) - `java.lang.String`

  returns: a reference to this Builder - `org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder`

  throws: java.lang.NullPointerException - if the naming pattern is null"
  (^org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder [^BasicThreadFactory$Builder this ^java.lang.String pattern]
    (-> this (.namingPattern pattern))))

(defn daemon
  "Sets the daemon flag for the new BasicThreadFactory. If this
   flag is set to true the new thread factory will create daemon
   threads.

  daemon - the value of the daemon flag - `boolean`

  returns: a reference to this Builder - `org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder`"
  (^org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder [^BasicThreadFactory$Builder this ^Boolean daemon]
    (-> this (.daemon daemon))))

(defn priority
  "Sets the priority for the threads created by the new BasicThreadFactory.

  priority - the priority - `int`

  returns: a reference to this Builder - `org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder`"
  (^org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder [^BasicThreadFactory$Builder this ^Integer priority]
    (-> this (.priority priority))))

(defn uncaught-exception-handler
  "Sets the uncaught exception handler for the threads created by the
   new BasicThreadFactory.

  handler - the UncaughtExceptionHandler (must not be null) - `java.lang.Thread$UncaughtExceptionHandler`

  returns: a reference to this Builder - `org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder`

  throws: java.lang.NullPointerException - if the exception handler is null"
  (^org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder [^BasicThreadFactory$Builder this ^java.lang.Thread$UncaughtExceptionHandler handler]
    (-> this (.uncaughtExceptionHandler handler))))

(defn reset
  "Resets this builder. All configuration options are set to default
   values. Note: If the build() method was called, it is not
   necessary to call reset() explicitly because this is done
   automatically."
  ([^BasicThreadFactory$Builder this]
    (-> this (.reset))))

(defn build
  "Creates a new BasicThreadFactory with all configuration
   options that have been specified by calling methods on this builder.
   After creating the factory reset() is called.

  returns: the new BasicThreadFactory - `org.apache.commons.lang3.concurrent.BasicThreadFactory`"
  (^org.apache.commons.lang3.concurrent.BasicThreadFactory [^BasicThreadFactory$Builder this]
    (-> this (.build))))

