(ns org.apache.commons.lang3.concurrent.CallableBackgroundInitializer
  " A specialized BackgroundInitializer implementation that wraps a
  Callable object.


  An instance of this class is initialized with a Callable object when
  it is constructed. The implementation of the initialize() method
  defined in the super class delegates to this Callable so that the
  Callable is executed in the background thread.


  The java.util.concurrent.Callable interface is a standard mechanism
  of the JDK to define tasks to be executed by another thread. The CallableBackgroundInitializer class allows combining this standard interface
  with the background initializer API.


  Usage of this class is very similar to the default usage pattern of the
  BackgroundInitializer class: Just create an instance and provide the
  Callable object to be executed, then call the initializer's
  BackgroundInitializer.start() method. This causes the Callable to be executed in
  another thread. When the results of the Callable are needed the
  initializer's BackgroundInitializer.get() method can be called (which may block until
  background execution is complete). The following code fragment shows a
  typical usage example:




  // a Callable that performs a complex computation
  Callable<Integer> computationCallable = new MyComputationCallable();
  // setup the background initializer
  CallableBackgroundInitializer<Integer> initializer =
      new CallableBackgroundInitializer(computationCallable);
  initializer.start();
  // Now do some other things. Initialization runs in a parallel thread
  ...
  // Wait for the end of initialization and access the result
  Integer result = initializer.get();"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent CallableBackgroundInitializer]))

(defn ->callable-background-initializer
  "Constructor.

  Creates a new instance of CallableBackgroundInitializer and
   initializes it with the Callable to be executed in a background
   thread and the ExecutorService for managing the background
   execution.

  call - the Callable (must not be null) - `java.util.concurrent.Callable`
  exec - an external ExecutorService to be used for task execution - `java.util.concurrent.ExecutorService`

  throws: java.lang.IllegalArgumentException - if the Callable is null"
  (^CallableBackgroundInitializer [^java.util.concurrent.Callable call ^java.util.concurrent.ExecutorService exec]
    (new CallableBackgroundInitializer call exec))
  (^CallableBackgroundInitializer [^java.util.concurrent.Callable call]
    (new CallableBackgroundInitializer call)))

