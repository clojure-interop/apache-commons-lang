(ns org.apache.commons.lang3.concurrent.AtomicSafeInitializer
  " A specialized ConcurrentInitializer implementation which is similar
  to AtomicInitializer, but ensures that the initialize()
  method is called only once.


  As AtomicInitializer this class is based on atomic variables, so it
  can create an object under concurrent access without synchronization.
  However, it implements an additional check to guarantee that the
  initialize() method which actually creates the object cannot be
  called multiple times.


  Because of this additional check this implementation is slightly less
  efficient than AtomicInitializer, but if the object creation in the
  initialize() method is expensive or if multiple invocations of
  initialize() are problematic, it is the better alternative.


  From its semantics this class has the same properties as
  LazyInitializer. It is a \"save\" implementation of the lazy
  initializer pattern. Comparing both classes in terms of efficiency is
  difficult because which one is faster depends on multiple factors. Because
  AtomicSafeInitializer does not use synchronization at all it probably
  outruns LazyInitializer, at least under low or moderate concurrent
  access. Developers should run their own benchmarks on the expected target
  platform to decide which implementation is suitable for their specific use
  case."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent AtomicSafeInitializer]))

(defn ->atomic-safe-initializer
  "Constructor."
  (^AtomicSafeInitializer []
    (new AtomicSafeInitializer )))

(defn get
  "Get (and initialize, if not initialized yet) the required object

  returns: lazily initialized object - `T`

  throws: org.apache.commons.lang3.concurrent.ConcurrentException - if the initialization of the object causes an exception"
  ([^AtomicSafeInitializer this]
    (-> this (.get))))

