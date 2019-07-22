(ns org.apache.commons.lang3.concurrent.BackgroundInitializer
  " A class that allows complex initialization operations in a background task.


  Applications often have to do some expensive initialization steps when they
  are started, e.g. constructing a connection to a database, reading a
  configuration file, etc. Doing these things in parallel can enhance
  performance as the CPU load can be improved. However, when access to the
  resources initialized in a background thread is actually required,
  synchronization has to be performed to ensure that their initialization is
  complete.


  This abstract base class provides support for this use case. A concrete
  subclass must implement the initialize() method. Here an arbitrary
  initialization can be implemented, and a result object can be returned. With
  this method in place the basic usage of this class is as follows (where
  MyBackgroundInitializer is a concrete subclass):




  MyBackgroundInitializer initializer = new MyBackgroundInitializer();
  initializer.start();
  // Now do some other things. Initialization runs in a parallel thread
  ...
  // Wait for the end of initialization and access the result object
  Object result = initializer.get();


  After the construction of a BackgroundInitializer object its
  start() method has to be called. This starts the background
  processing. The application can now continue to do other things. When it
  needs access to the object produced by the BackgroundInitializer it
  calls its get() method. If initialization is already complete,
  get() returns the result object immediately. Otherwise it blocks
  until the result object is fully constructed.


  BackgroundInitializer is a thin wrapper around a Future
  object and uses an ExecutorService for running the background
  initialization task. It is possible to pass in an ExecutorService at
  construction time or set one using setExternalExecutor() before
  start() was called. Then this object is used to spawn the background
  task. If no ExecutorService has been provided, BackgroundInitializer creates a temporary ExecutorService and
  destroys it when initialization is complete.


  The methods provided by BackgroundInitializer provide for minimal
  interaction with the wrapped Future object. It is also possible to
  obtain the Future object directly. Then the enhanced functionality
  offered by Future can be used, e.g. to check whether the background
  operation is complete or to cancel the operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent BackgroundInitializer]))

(defn get-external-executor
  "Returns the external ExecutorService to be used by this class.

  returns: the ExecutorService - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^BackgroundInitializer this]
    (-> this (.getExternalExecutor))))

(defn started?
  "Returns a flag whether this BackgroundInitializer has already
   been started.

  returns: a flag whether the start() method has already been
   called - `boolean`"
  (^Boolean [^BackgroundInitializer this]
    (-> this (.isStarted))))

(defn set-external-executor
  "Sets an ExecutorService to be used by this class. The ExecutorService passed to this method is used for executing the
   background task. Thus it is possible to re-use an already existing
   ExecutorService or to use a specially configured one. If no
   ExecutorService is set, this instance creates a temporary one and
   destroys it after background initialization is complete. Note that this
   method must be called before start(); otherwise an exception is
   thrown.

  external-executor - the ExecutorService to be used - `java.util.concurrent.ExecutorService`

  throws: java.lang.IllegalStateException - if this initializer has already been started"
  ([^BackgroundInitializer this ^java.util.concurrent.ExecutorService external-executor]
    (-> this (.setExternalExecutor external-executor))))

(defn start
  "Starts the background initialization. With this method the initializer
   becomes active and invokes the initialize() method in a
   background task. A BackgroundInitializer can be started exactly
   once. The return value of this method determines whether the start was
   successful: only the first invocation of this method returns true,
   following invocations will return false.

  returns: a flag whether the initializer could be started successfully - `boolean`"
  (^Boolean [^BackgroundInitializer this]
    (-> this (.start))))

(defn get
  "Returns the result of the background initialization. This method blocks
   until initialization is complete. If the background processing caused a
   runtime exception, it is directly thrown by this method. Checked
   exceptions, including InterruptedException are wrapped in a
   ConcurrentException. Calling this method before start()
   was called causes an IllegalStateException exception to be
   thrown.

  returns: the object produced by this initializer - `T`

  throws: org.apache.commons.lang3.concurrent.ConcurrentException - if a checked exception occurred during background processing"
  ([^BackgroundInitializer this]
    (-> this (.get))))

(defn get-future
  "Returns the Future object that was created when start()
   was called. Therefore this method can only be called after start().

  returns: the Future object wrapped by this initializer - `java.util.concurrent.Future<T>`

  throws: java.lang.IllegalStateException - if start() has not been called"
  (^java.util.concurrent.Future [^BackgroundInitializer this]
    (-> this (.getFuture))))

