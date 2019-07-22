(ns org.apache.commons.lang3.concurrent.BasicThreadFactory
  " An implementation of the ThreadFactory interface that provides some
  configuration options for the threads it creates.


  A ThreadFactory is used for instance by an ExecutorService to
  create the threads it uses for executing tasks. In many cases users do not
  have to care about a ThreadFactory because the default one used by an
  ExecutorService will do. However, if there are special requirements
  for the threads, a custom ThreadFactory has to be created.


  This class provides some frequently needed configuration options for the
  threads it creates. These are the following:


  A name pattern for the threads created by this factory can be specified.
  This is often useful if an application uses multiple executor services for
  different purposes. If the names of the threads used by these services have
  meaningful names, log output or exception traces can be much easier to read.
  Naming patterns are format strings as used by the String.format() method. The string can contain the place holder %d
  which will be replaced by the number of the current thread (ThreadFactoryImpl keeps a counter of the threads it has already created).
  For instance, the naming pattern \"My %d. worker thread\" will result
  in thread names like \"My 1. worker thread\", \"My 2. worker thread\" and so on.
  A flag whether the threads created by this factory should be daemon
  threads. This can impact the exit behavior of the current Java application
  because the JVM shuts down if there are only daemon threads running.
  The priority of the thread. Here an integer value can be provided. The
  java.lang.Thread class defines constants for valid ranges of priority
  values.
  The UncaughtExceptionHandler for the thread. This handler is
  called if an uncaught exception occurs within the thread.


  BasicThreadFactory wraps another thread factory which actually
  creates new threads. The configuration options are set on the threads created
  by the wrapped thread factory. On construction time the factory to be wrapped
  can be specified. If none is provided, a default ThreadFactory is
  used.


  Instances of BasicThreadFactory are not created directly, but the
  nested Builder class is used for this purpose. Using the builder only
  the configuration options an application is interested in need to be set. The
  following example shows how a BasicThreadFactory is created and
  installed in an ExecutorService:




  // Create a factory that produces daemon threads with a naming pattern and
  // a priority
  BasicThreadFactory factory = new BasicThreadFactory.Builder()
      .namingPattern(\"workerthread-%d\")
      .daemon(true)
      .priority(Thread.MAX_PRIORITY)
      .build();
  // Create an executor service for single-threaded execution
  ExecutorService exec = Executors.newSingleThreadExecutor(factory);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent BasicThreadFactory]))

(defn get-wrapped-factory
  "Returns the wrapped ThreadFactory. This factory is used for
   actually creating threads. This method never returns null. If no
   ThreadFactory was passed when this object was created, a default
   thread factory is returned.

  returns: the wrapped ThreadFactory - `java.util.concurrent.ThreadFactory`"
  (^java.util.concurrent.ThreadFactory [^BasicThreadFactory this]
    (-> this (.getWrappedFactory))))

(defn get-naming-pattern
  "Returns the naming pattern for naming newly created threads. Result can
   be null if no naming pattern was provided.

  returns: the naming pattern - `java.lang.String`"
  (^java.lang.String [^BasicThreadFactory this]
    (-> this (.getNamingPattern))))

(defn get-daemon-flag?
  "Returns the daemon flag. This flag determines whether newly created
   threads should be daemon threads. If true, this factory object
   calls setDaemon(true) on the newly created threads. Result can be
   null if no daemon flag was provided at creation time.

  returns: the daemon flag - `java.lang.Boolean`"
  (^java.lang.Boolean [^BasicThreadFactory this]
    (-> this (.getDaemonFlag))))

(defn get-priority
  "Returns the priority of the threads created by this factory. Result can
   be null if no priority was specified.

  returns: the priority for newly created threads - `java.lang.Integer`"
  (^java.lang.Integer [^BasicThreadFactory this]
    (-> this (.getPriority))))

(defn get-uncaught-exception-handler
  "Returns the UncaughtExceptionHandler for the threads created by
   this factory. Result can be null if no handler was provided.

  returns: the UncaughtExceptionHandler - `java.lang.Thread$UncaughtExceptionHandler`"
  (^java.lang.Thread$UncaughtExceptionHandler [^BasicThreadFactory this]
    (-> this (.getUncaughtExceptionHandler))))

(defn get-thread-count
  "Returns the number of threads this factory has already created. This
   class maintains an internal counter that is incremented each time the
   newThread(Runnable) method is invoked.

  returns: the number of threads created by this factory - `long`"
  (^Long [^BasicThreadFactory this]
    (-> this (.getThreadCount))))

(defn new-thread
  "Creates a new thread. This implementation delegates to the wrapped
   factory for creating the thread. Then, on the newly created thread the
   corresponding configuration options are set.

  runnable - the Runnable to be executed by the new thread - `java.lang.Runnable`

  returns: the newly created thread - `java.lang.Thread`"
  (^java.lang.Thread [^BasicThreadFactory this ^java.lang.Runnable runnable]
    (-> this (.newThread runnable))))

