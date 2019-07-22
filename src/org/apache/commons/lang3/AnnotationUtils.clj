(ns org.apache.commons.lang3.AnnotationUtils
  "Helper methods for working with Annotation instances.

  This class contains various utility methods that make working with
  annotations simpler.

  Annotation instances are always proxy objects; unfortunately
  dynamic proxies cannot be depended upon to know how to implement certain
  methods in the same manner as would be done by \"natural\" Annotations.
  The methods presented in this class can be used to avoid that possibility. It
  is of course also possible for dynamic proxies to actually delegate their
  e.g. Annotation.equals(Object)/Annotation.hashCode()/
  Annotation.toString() implementations to AnnotationUtils.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 AnnotationUtils]))

(defn ->annotation-utils
  "Constructor.

  AnnotationUtils instances should NOT be constructed in
   standard programming. Instead, the class should be used statically.

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^AnnotationUtils []
    (new AnnotationUtils )))

(defn *equals
  "Checks if two annotations are equal using the criteria for equality
   presented in the Annotation.equals(Object) API docs.

  a-1 - the first Annotation to compare, null returns false unless both are null - `java.lang.annotation.Annotation`
  a-2 - the second Annotation to compare, null returns false unless both are null - `java.lang.annotation.Annotation`

  returns: true if the two annotations are equal or both
   null - `boolean`"
  (^Boolean [^java.lang.annotation.Annotation a-1 ^java.lang.annotation.Annotation a-2]
    (AnnotationUtils/equals a-1 a-2)))

(defn *hash-code
  "Generate a hash code for the given annotation using the algorithm
   presented in the Annotation.hashCode() API docs.

  a - the Annotation for a hash code calculation is desired, not null - `java.lang.annotation.Annotation`

  returns: the calculated hash code - `int`

  throws: java.lang.RuntimeException - if an Exception is encountered during annotation member access"
  (^Integer [^java.lang.annotation.Annotation a]
    (AnnotationUtils/hashCode a)))

(defn *to-string
  "Generate a string representation of an Annotation, as suggested by
   Annotation.toString().

  a - the annotation of which a string representation is desired - `java.lang.annotation.Annotation`

  returns: the standard string representation of an annotation, not
   null - `java.lang.String`"
  (^java.lang.String [^java.lang.annotation.Annotation a]
    (AnnotationUtils/toString a)))

(defn *valid-annotation-member-type?
  "Checks if the specified type is permitted as an annotation member.

   The Java language specification only permits certain types to be used
   in annotations. These include String, Class, primitive
   types, Annotation, Enum, and single-dimensional arrays of
   these types.

  type - the type to check, null - `java.lang.Class`

  returns: true if the type is a valid type to use in an annotation - `boolean`"
  (^Boolean [^java.lang.Class type]
    (AnnotationUtils/isValidAnnotationMemberType type)))

