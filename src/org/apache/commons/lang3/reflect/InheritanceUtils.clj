(ns org.apache.commons.lang3.reflect.InheritanceUtils
  "Utility methods focusing on inheritance."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.reflect InheritanceUtils]))

(defn ->inheritance-utils
  "Constructor.

  InheritanceUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as
   MethodUtils.getAccessibleMethod(method).

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^InheritanceUtils []
    (new InheritanceUtils )))

(defn *distance
  "Returns the number of inheritance hops between two classes.

  child - the child class, may be null - `java.lang.Class`
  parent - the parent class, may be null - `java.lang.Class`

  returns: the number of generations between the child and parent; 0 if the same class;
   -1 if the classes are not related as child and parent (includes where either class is null) - `int`"
  (^Integer [^java.lang.Class child ^java.lang.Class parent]
    (InheritanceUtils/distance child parent)))

