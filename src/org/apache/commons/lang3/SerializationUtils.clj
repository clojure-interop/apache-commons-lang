(ns org.apache.commons.lang3.SerializationUtils
  "Assists with the serialization process and performs additional functionality based
  on serialization.


  Deep clone using serialization
  Serialize managing finally and IOException
  Deserialize managing finally and IOException


  This class throws exceptions for invalid null inputs.
  Each method documents its behaviour in more detail.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 SerializationUtils]))

(defn ->serialization-utils
  "Constructor.

  SerializationUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as SerializationUtils.clone(object).

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^SerializationUtils []
    (new SerializationUtils )))

(defn *clone
  "Deep clone an Object using serialization.

   This is many times slower than writing clone methods by hand
   on all objects in your object graph. However, for complex object
   graphs, or for those that don't support deep cloning this can
   be a simple alternative implementation. Of course all the objects
   must be Serializable.

  object - the Serializable object to clone - `T`

  returns: the cloned object - `<T extends java.io.Serializable> T`

  throws: org.apache.commons.lang3.SerializationException - (runtime) if the serialization fails"
  ([object]
    (SerializationUtils/clone object)))

(defn *roundtrip
  "Performs a serialization roundtrip. Serializes and deserializes the given object, great for testing objects that
   implement Serializable.

  msg - the object to roundtrip - `T`

  returns: the serialized and deserialized object - `<T extends java.io.Serializable> T`"
  ([msg]
    (SerializationUtils/roundtrip msg)))

(defn *serialize
  "Serializes an Object to the specified stream.

   The stream will be closed once the object is written.
   This avoids the need for a finally clause, and maybe also exception
   handling, in the application code.

   The stream passed in is not buffered internally within this method.
   This is the responsibility of your application if desired.

  obj - the object to serialize to bytes, may be null - `java.io.Serializable`
  output-stream - the stream to write to, must not be null - `java.io.OutputStream`

  throws: java.lang.IllegalArgumentException - if outputStream is null"
  ([^java.io.Serializable obj ^java.io.OutputStream output-stream]
    (SerializationUtils/serialize obj output-stream))
  ([^java.io.Serializable obj]
    (SerializationUtils/serialize obj)))

(defn *deserialize
  "Deserializes an Object from the specified stream.



   The stream will be closed once the object is written. This avoids the need for a finally clause, and maybe also
   exception handling, in the application code.



   The stream passed in is not buffered internally within this method. This is the responsibility of your
   application if desired.



   If the call site incorrectly types the return value, a ClassCastException is thrown from the call site.
   Without Generics in this declaration, the call site must type cast and can cause the same ClassCastException.
   Note that in both cases, the ClassCastException is in the call site, not in this method.

  input-stream - the serialized object input stream, must not be null - `java.io.InputStream`

  returns: the deserialized object - `<T> T`

  throws: java.lang.IllegalArgumentException - if inputStream is null"
  ([^java.io.InputStream input-stream]
    (SerializationUtils/deserialize input-stream)))

