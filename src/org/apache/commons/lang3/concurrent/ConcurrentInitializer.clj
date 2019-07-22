(ns org.apache.commons.lang3.concurrent.ConcurrentInitializer
  " Definition of an interface for the thread-safe initialization of objects.


  The idea behind this interface is to provide access to an object in a
  thread-safe manner. A ConcurrentInitializer can be passed to multiple
  threads which can all access the object produced by the initializer. Through
  the get() method the object can be queried.


  Concrete implementations of this interface will use different strategies for
  the creation of the managed object, e.g. lazy initialization or
  initialization in a background thread. This is completely transparent to
  client code, so it is possible to change the initialization strategy without
  affecting clients."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent ConcurrentInitializer]))

(defn get
  "Returns the fully initialized object produced by this ConcurrentInitializer. A concrete implementation here returns the
   results of the initialization process. This method may block until
   results are available. Typically, once created the result object is
   always the same.

  returns: the object created by this ConcurrentException - `T`

  throws: org.apache.commons.lang3.concurrent.ConcurrentException - if an error occurred during initialization of the object"
  ([^ConcurrentInitializer this]
    (-> this (.get))))

