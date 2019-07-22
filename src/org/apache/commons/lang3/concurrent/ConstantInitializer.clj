(ns org.apache.commons.lang3.concurrent.ConstantInitializer
  " A very simple implementation of the ConcurrentInitializer interface
  which always returns the same object.


  An instance of this class is passed a reference to an object when it is
  constructed. The get() method just returns this object. No
  synchronization is required.


  This class is useful for instance for unit testing or in cases where a
  specific object has to be passed to an object which expects a
  ConcurrentInitializer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent ConstantInitializer]))

(defn ->constant-initializer
  "Constructor.

  Creates a new instance of ConstantInitializer and initializes it
   with the object to be managed. The get() method will always
   return the object passed here. This class does not place any restrictions
   on the object. It may be null, then get() will return
   null, too.

  obj - the object to be managed by this initializer - `T`"
  (^ConstantInitializer [obj]
    (new ConstantInitializer obj)))

(defn get-object
  "Directly returns the object that was passed to the constructor. This is
   the same object as returned by get(). However, this method does
   not declare that it throws an exception.

  returns: the object managed by this initializer - `T`"
  ([^ConstantInitializer this]
    (-> this (.getObject))))

(defn get
  "Returns the object managed by this initializer. This implementation just
   returns the object passed to the constructor.

  returns: the object managed by this initializer - `T`

  throws: org.apache.commons.lang3.concurrent.ConcurrentException - if an error occurs"
  ([^ConstantInitializer this]
    (-> this (.get))))

(defn hash-code
  "Returns a hash code for this object. This implementation returns the hash
   code of the managed object.

  returns: a hash code for this object - `int`"
  (^Integer [^ConstantInitializer this]
    (-> this (.hashCode))))

(defn equals
  "Compares this object with another one. This implementation returns
   true if and only if the passed in object is an instance of
   ConstantInitializer which refers to an object equals to the
   object managed by this instance.

  obj - the object to compare to - `java.lang.Object`

  returns: a flag whether the objects are equal - `boolean`"
  (^Boolean [^ConstantInitializer this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn to-string
  "Returns a string representation for this object. This string also
   contains a string representation of the object managed by this
   initializer.

  returns: a string for this object - `java.lang.String`"
  (^java.lang.String [^ConstantInitializer this]
    (-> this (.toString))))

