(ns org.apache.commons.lang3.concurrent.AtomicInitializer
  " A specialized implementation of the ConcurrentInitializer interface
  based on an AtomicReference variable.


  This class maintains a member field of type AtomicReference. It
  implements the following algorithm to create and initialize an object in its
  get() method:


  First it is checked whether the AtomicReference variable contains
  already a value. If this is the case, the value is directly returned.
  Otherwise the initialize() method is called. This method must be
  defined in concrete subclasses to actually create the managed object.
  After the object was created by initialize() it is checked
  whether the AtomicReference variable is still undefined. This has to
  be done because in the meantime another thread may have initialized the
  object. If the reference is still empty, the newly created object is stored
  in it and returned by this method.
  Otherwise the value stored in the AtomicReference is returned.


  Because atomic variables are used this class does not need any
  synchronization. So there is no danger of deadlock, and access to the managed
  object is efficient. However, if multiple threads access the AtomicInitializer object before it has been initialized almost at the same
  time, it can happen that initialize() is called multiple times. The
  algorithm outlined above guarantees that get() always returns the
  same object though.


  Compared with the LazyInitializer class, this class can be more
  efficient because it does not need synchronization. The drawback is that the
  initialize() method can be called multiple times which may be
  problematic if the creation of the managed object is expensive. As a rule of
  thumb this initializer implementation is preferable if there are not too many
  threads involved and the probability that multiple threads access an
  uninitialized object is small. If there is high parallelism,
  LazyInitializer is more appropriate."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent AtomicInitializer]))

(defn ->atomic-initializer
  "Constructor."
  (^AtomicInitializer []
    (new AtomicInitializer )))

(defn get
  "Returns the object managed by this initializer. The object is created if
   it is not available yet and stored internally. This method always returns
   the same object.

  returns: the object created by this AtomicInitializer - `T`

  throws: org.apache.commons.lang3.concurrent.ConcurrentException - if an error occurred during initialization of the object"
  ([^AtomicInitializer this]
    (-> this (.get))))

