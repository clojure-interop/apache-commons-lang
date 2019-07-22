(ns org.apache.commons.lang3.reflect.TypeLiteral
  "Type literal comparable to javax.enterprise.util.TypeLiteral,
  made generally available outside the JEE context. Allows the passing around of
  a \"token\" that represents a type in a typesafe manner, as opposed to
  passing the (non-parameterized) Type object itself. Consider:

  You might see such a typesafe API as:


  class Typesafe {
    <T> T obtain(Class<T> type, ...);
  }
  Consumed in the manner of:


  Foo foo = typesafe.obtain(Foo.class, ...);
  Yet, you run into problems when you want to do this with a parameterized type:


  List<String> listOfString = typesafe.obtain(List.class, ...); // could only give us a raw List
  java.lang.reflect.Type might provide some value:


  Type listOfStringType = ...; // firstly, how to obtain this? Doable, but not straightforward.
  List<String> listOfString = (List<String>) typesafe.obtain(listOfStringType, ...); // nongeneric Type would necessitate a cast
  The \"type literal\" concept was introduced to provide an alternative, i.e.:


  class Typesafe {
    <T> T obtain(TypeLiteral<T> type, ...);
  }
  Consuming code looks like:


  List<String> listOfString = typesafe.obtain(new TypeLiteral<List<String>>() {}, ...);

  This has the effect of \"jumping up\" a level to tie a java.lang.reflect.Type
  to a type variable while simultaneously making it short work to obtain a
  Type instance for any given type, inline.

  Additionally TypeLiteral implements the Typed interface which
  is a generalization of this concept, and which may be implemented in custom classes.
  It is suggested that APIs be defined in terms of the interface, in the following manner:



    <T> T obtain(Typed<T> typed, ...);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.reflect TypeLiteral]))

(defn value
  "Instance Constant.

  Represented type.

  type: java.lang.reflect.Type"
  (^java.lang.reflect.Type [^TypeLiteral this]
    (-> this .-value)))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TypeLiteral this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TypeLiteral this]
    (-> this (.hashCode))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TypeLiteral this]
    (-> this (.toString))))

(defn get-type
  "Description copied from interface: Typed

  returns: Type - `java.lang.reflect.Type`"
  (^java.lang.reflect.Type [^TypeLiteral this]
    (-> this (.getType))))

