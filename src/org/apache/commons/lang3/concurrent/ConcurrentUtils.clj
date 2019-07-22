(ns org.apache.commons.lang3.concurrent.ConcurrentUtils
  " An utility class providing functionality related to the java.util.concurrent package."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent ConcurrentUtils]))

(defn *create-if-absent
  "Checks if a concurrent map contains a key and creates a corresponding
   value if not. This method first checks the presence of the key in the
   given map. If it is already contained, its value is returned. Otherwise
   the get() method of the passed in ConcurrentInitializer
   is called. With the resulting object
   putIfAbsent(ConcurrentMap, Object, Object) is called. This
   handles the case that in the meantime another thread has added the key to
   the map. Both the map and the initializer can be null; in this
   case this method simply returns null.

  map - the map to be modified - `java.util.concurrent.ConcurrentMap`
  key - the key of the value to be added - `K`
  init - the ConcurrentInitializer for creating the value - `org.apache.commons.lang3.concurrent.ConcurrentInitializer`

  returns: the value stored in the map after this operation; this may or may
   not be the object created by the ConcurrentInitializer - `<K,V> V`

  throws: org.apache.commons.lang3.concurrent.ConcurrentException - if the initializer throws an exception"
  ([^java.util.concurrent.ConcurrentMap map key ^org.apache.commons.lang3.concurrent.ConcurrentInitializer init]
    (ConcurrentUtils/createIfAbsent map key init)))

(defn *put-if-absent
  "Puts a value in the specified ConcurrentMap if the key is not yet
   present. This method works similar to the putIfAbsent() method of
   the ConcurrentMap interface, but the value returned is different.
   Basically, this method is equivalent to the following code fragment:




   if (!map.containsKey(key)) {
       map.put(key, value);
       return value;
   } else {
       return map.get(key);
   }


   except that the action is performed atomically. So this method always
   returns the value which is stored in the map.


   This method is null-safe: It accepts a null map as input
   without throwing an exception. In this case the return value is
   null, too.

  map - the map to be modified - `java.util.concurrent.ConcurrentMap`
  key - the key of the value to be added - `K`
  value - the value to be added - `V`

  returns: the value stored in the map after this operation - `<K,V> V`"
  ([^java.util.concurrent.ConcurrentMap map key value]
    (ConcurrentUtils/putIfAbsent map key value)))

(defn *handle-cause-unchecked
  "Handles the specified ExecutionException and transforms it into a
   runtime exception. This method works exactly like
   handleCause(ExecutionException), but instead of a
   ConcurrentException it throws a
   ConcurrentRuntimeException. This is an alternative for client
   code that does not want to deal with checked exceptions.

  ex - the exception to be handled - `java.util.concurrent.ExecutionException`

  throws: org.apache.commons.lang3.concurrent.ConcurrentRuntimeException - if the cause of the ExecutionException is a checked exception; this exception is then wrapped in the thrown runtime exception"
  ([^java.util.concurrent.ExecutionException ex]
    (ConcurrentUtils/handleCauseUnchecked ex)))

(defn *initialize-unchecked
  "Invokes the specified ConcurrentInitializer and transforms
   occurring exceptions to runtime exceptions. This method works like
   initialize(ConcurrentInitializer), but if the ConcurrentInitializer throws a ConcurrentException, it is
   caught, and the cause is wrapped in a ConcurrentRuntimeException.
   So client code does not have to deal with checked exceptions.

  initializer - the ConcurrentInitializer to be invoked - `org.apache.commons.lang3.concurrent.ConcurrentInitializer`

  returns: the object managed by the ConcurrentInitializer - `<T> T`

  throws: org.apache.commons.lang3.concurrent.ConcurrentRuntimeException - if the initializer throws an exception"
  ([^org.apache.commons.lang3.concurrent.ConcurrentInitializer initializer]
    (ConcurrentUtils/initializeUnchecked initializer)))

(defn *extract-cause-unchecked
  "Inspects the cause of the specified ExecutionException and
   creates a ConcurrentRuntimeException with the checked cause if
   necessary. This method works exactly like
   extractCause(ExecutionException). The only difference is that
   the cause of the specified ExecutionException is extracted as a
   runtime exception. This is an alternative for client code that does not
   want to deal with checked exceptions.

  ex - the exception to be processed - `java.util.concurrent.ExecutionException`

  returns: a ConcurrentRuntimeException with the checked cause - `org.apache.commons.lang3.concurrent.ConcurrentRuntimeException`"
  (^org.apache.commons.lang3.concurrent.ConcurrentRuntimeException [^java.util.concurrent.ExecutionException ex]
    (ConcurrentUtils/extractCauseUnchecked ex)))

(defn *extract-cause
  "Inspects the cause of the specified ExecutionException and
   creates a ConcurrentException with the checked cause if
   necessary. This method performs the following checks on the cause of the
   passed in exception:

   If the passed in exception is null or the cause is
   null, this method returns null.
   If the cause is a runtime exception, it is directly thrown.
   If the cause is an error, it is directly thrown, too.
   In any other case the cause is a checked exception. The method then
   creates a ConcurrentException, initializes it with the cause, and
   returns it.

  ex - the exception to be processed - `java.util.concurrent.ExecutionException`

  returns: a ConcurrentException with the checked cause - `org.apache.commons.lang3.concurrent.ConcurrentException`"
  (^org.apache.commons.lang3.concurrent.ConcurrentException [^java.util.concurrent.ExecutionException ex]
    (ConcurrentUtils/extractCause ex)))

(defn *create-if-absent-unchecked
  "Checks if a concurrent map contains a key and creates a corresponding
   value if not, suppressing checked exceptions. This method calls
   createIfAbsent(). If a ConcurrentException is thrown, it
   is caught and re-thrown as a ConcurrentRuntimeException.

  map - the map to be modified - `java.util.concurrent.ConcurrentMap`
  key - the key of the value to be added - `K`
  init - the ConcurrentInitializer for creating the value - `org.apache.commons.lang3.concurrent.ConcurrentInitializer`

  returns: the value stored in the map after this operation; this may or may
   not be the object created by the ConcurrentInitializer - `<K,V> V`

  throws: org.apache.commons.lang3.concurrent.ConcurrentRuntimeException - if the initializer throws an exception"
  ([^java.util.concurrent.ConcurrentMap map key ^org.apache.commons.lang3.concurrent.ConcurrentInitializer init]
    (ConcurrentUtils/createIfAbsentUnchecked map key init)))

(defn *initialize
  "Invokes the specified ConcurrentInitializer and returns the
   object produced by the initializer. This method just invokes the get() method of the given ConcurrentInitializer. It is
   null-safe: if the argument is null, result is also
   null.

  initializer - the ConcurrentInitializer to be invoked - `org.apache.commons.lang3.concurrent.ConcurrentInitializer`

  returns: the object managed by the ConcurrentInitializer - `<T> T`

  throws: org.apache.commons.lang3.concurrent.ConcurrentException - if the ConcurrentInitializer throws an exception"
  ([^org.apache.commons.lang3.concurrent.ConcurrentInitializer initializer]
    (ConcurrentUtils/initialize initializer)))

(defn *handle-cause
  "Handles the specified ExecutionException. This method calls
   extractCause(ExecutionException) for obtaining the cause of the
   exception - which might already cause an unchecked exception or an error
   being thrown. If the cause is a checked exception however, it is wrapped
   in a ConcurrentException, which is thrown. If the passed in
   exception is null or has no cause, the method simply returns
   without throwing an exception.

  ex - the exception to be handled - `java.util.concurrent.ExecutionException`

  throws: org.apache.commons.lang3.concurrent.ConcurrentException - if the cause of the ExecutionException is a checked exception"
  ([^java.util.concurrent.ExecutionException ex]
    (ConcurrentUtils/handleCause ex)))

(defn *constant-future
  "Gets an implementation of Future that is immediately done
   and returns the specified constant value.


   This can be useful to return a simple constant immediately from the
   concurrent processing, perhaps as part of avoiding nulls.
   A constant future can also be useful in testing.

  value - the constant value to return, may be null - `T`

  returns: an instance of Future that will return the value, never null - `<T> java.util.concurrent.Future<T>`"
  ([value]
    (ConcurrentUtils/constantFuture value)))

