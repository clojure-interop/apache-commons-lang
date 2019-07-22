(ns org.apache.commons.lang3.concurrent.MultiBackgroundInitializer
  " A specialized BackgroundInitializer implementation that can deal with
  multiple background initialization tasks.


  This class has a similar purpose as BackgroundInitializer. However,
  it is not limited to a single background initialization task. Rather it
  manages an arbitrary number of BackgroundInitializer objects,
  executes them, and waits until they are completely initialized. This is
  useful for applications that have to perform multiple initialization tasks
  that can run in parallel (i.e. that do not depend on each other). This class
  takes care about the management of an ExecutorService and shares it
  with the BackgroundInitializer objects it is responsible for; so the
  using application need not bother with these details.


  The typical usage scenario for MultiBackgroundInitializer is as
  follows:


  Create a new instance of the class. Optionally pass in a pre-configured
  ExecutorService. Alternatively MultiBackgroundInitializer can
  create a temporary ExecutorService and delete it after initialization
  is complete.
  Create specialized BackgroundInitializer objects for the
  initialization tasks to be performed and add them to the MultiBackgroundInitializer using the
  addInitializer(String, BackgroundInitializer) method.
  After all initializers have been added, call the BackgroundInitializer.start() method.

  When access to the result objects produced by the BackgroundInitializer objects is needed call the BackgroundInitializer.get() method. The
  object returned here provides access to all result objects created during
  initialization. It also stores information about exceptions that have
  occurred.


  MultiBackgroundInitializer starts a special controller task that
  starts all BackgroundInitializer objects added to the instance.
  Before the an initializer is started it is checked whether this initializer
  already has an ExecutorService set. If this is the case, this ExecutorService is used for running the background task. Otherwise the
  current ExecutorService of this MultiBackgroundInitializer is
  shared with the initializer.


  The easiest way of using this class is to let it deal with the management of
  an ExecutorService itself: If no external ExecutorService is
  provided, the class creates a temporary ExecutorService (that is
  capable of executing all background tasks in parallel) and destroys it at the
  end of background processing.


  Alternatively an external ExecutorService can be provided - either at
  construction time or later by calling the
  BackgroundInitializer.setExternalExecutor(ExecutorService) method. In this case all
  background tasks are scheduled at this external ExecutorService.
  Important note: When using an external ExecutorService be sure that the number of threads managed by the service is
  large enough. Otherwise a deadlock can happen! This is the case in the
  following scenario: MultiBackgroundInitializer starts a task that
  starts all registered BackgroundInitializer objects and waits for
  their completion. If for instance a single threaded ExecutorService
  is used, none of the background tasks can be executed, and the task created
  by MultiBackgroundInitializer waits forever."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent MultiBackgroundInitializer]))

(defn ->multi-background-initializer
  "Constructor.

  Creates a new instance of MultiBackgroundInitializer and
   initializes it with the given external ExecutorService.

  exec - the ExecutorService for executing the background tasks - `java.util.concurrent.ExecutorService`"
  (^MultiBackgroundInitializer [^java.util.concurrent.ExecutorService exec]
    (new MultiBackgroundInitializer exec))
  (^MultiBackgroundInitializer []
    (new MultiBackgroundInitializer )))

(defn add-initializer
  "Adds a new BackgroundInitializer to this object. When this
   MultiBackgroundInitializer is started, the given initializer will
   be processed. This method must not be called after BackgroundInitializer.start() has
   been invoked.

  name - the name of the initializer (must not be null) - `java.lang.String`
  init - the BackgroundInitializer to add (must not be null) - `org.apache.commons.lang3.concurrent.BackgroundInitializer`

  throws: java.lang.IllegalArgumentException - if a required parameter is missing"
  ([^MultiBackgroundInitializer this ^java.lang.String name ^org.apache.commons.lang3.concurrent.BackgroundInitializer init]
    (-> this (.addInitializer name init))))

