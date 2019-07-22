(ns org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults
  "A data class for storing the results of the background initialization
  performed by MultiBackgroundInitializer. Objects of this inner
  class are returned by MultiBackgroundInitializer.initialize().
  They allow access to all result objects produced by the
  BackgroundInitializer objects managed by the owning instance. It
  is also possible to retrieve status information about single
  BackgroundInitializers, i.e. whether they completed normally or
  caused an exception."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent MultiBackgroundInitializer$MultiBackgroundInitializerResults]))

(defn get-initializer
  "Returns the BackgroundInitializer with the given name. If the
   name cannot be resolved, an exception is thrown.

  name - the name of the BackgroundInitializer - `java.lang.String`

  returns: the BackgroundInitializer with this name - `org.apache.commons.lang3.concurrent.BackgroundInitializer<?>`

  throws: java.util.NoSuchElementException - if the name cannot be resolved"
  (^org.apache.commons.lang3.concurrent.BackgroundInitializer [^MultiBackgroundInitializer$MultiBackgroundInitializerResults this ^java.lang.String name]
    (-> this (.getInitializer name))))

(defn get-result-object
  "Returns the result object produced by the BackgroundInitializer with the given name. This is the object
   returned by the initializer's initialize() method. If this
   BackgroundInitializer caused an exception, null is
   returned. If the name cannot be resolved, an exception is thrown.

  name - the name of the BackgroundInitializer - `java.lang.String`

  returns: the result object produced by this BackgroundInitializer - `java.lang.Object`

  throws: java.util.NoSuchElementException - if the name cannot be resolved"
  (^java.lang.Object [^MultiBackgroundInitializer$MultiBackgroundInitializerResults this ^java.lang.String name]
    (-> this (.getResultObject name))))

(defn exception?
  "Returns a flag whether the BackgroundInitializer with the
   given name caused an exception.

  name - the name of the BackgroundInitializer - `java.lang.String`

  returns: a flag whether this initializer caused an exception - `boolean`

  throws: java.util.NoSuchElementException - if the name cannot be resolved"
  (^Boolean [^MultiBackgroundInitializer$MultiBackgroundInitializerResults this ^java.lang.String name]
    (-> this (.isException name))))

(defn get-exception
  "Returns the ConcurrentException object that was thrown by the
   BackgroundInitializer with the given name. If this
   initializer did not throw an exception, the return value is
   null. If the name cannot be resolved, an exception is thrown.

  name - the name of the BackgroundInitializer - `java.lang.String`

  returns: the exception thrown by this initializer - `org.apache.commons.lang3.concurrent.ConcurrentException`

  throws: java.util.NoSuchElementException - if the name cannot be resolved"
  (^org.apache.commons.lang3.concurrent.ConcurrentException [^MultiBackgroundInitializer$MultiBackgroundInitializerResults this ^java.lang.String name]
    (-> this (.getException name))))

(defn initializer-names
  "Returns a set with the names of all BackgroundInitializer
   objects managed by the MultiBackgroundInitializer.

  returns: an (unmodifiable) set with the names of the managed BackgroundInitializer objects - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^MultiBackgroundInitializer$MultiBackgroundInitializerResults this]
    (-> this (.initializerNames))))

(defn successful?
  "Returns a flag whether the whole initialization was successful. This
   is the case if no child initializer has thrown an exception.

  returns: a flag whether the initialization was successful - `boolean`"
  (^Boolean [^MultiBackgroundInitializer$MultiBackgroundInitializerResults this]
    (-> this (.isSuccessful))))

