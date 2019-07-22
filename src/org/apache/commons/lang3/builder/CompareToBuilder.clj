(ns org.apache.commons.lang3.builder.CompareToBuilder
  "Assists in implementing Comparable.compareTo(Object) methods.

  It is consistent with equals(Object) and
  hashcode() built with EqualsBuilder and
  HashCodeBuilder.

  Two Objects that compare equal using equals(Object) should normally
  also compare equal using compareTo(Object).

  All relevant fields should be included in the calculation of the
  comparison. Derived fields may be ignored. The same fields, in the same
  order, should be used in both compareTo(Object) and
  equals(Object).

  To use this class write code as follows:



  public class MyClass {
    String field1;
    int field2;
    boolean field3;

    ...

    public int compareTo(Object o) {
      MyClass myClass = (MyClass) o;
      return new CompareToBuilder()
        .appendSuper(super.compareTo(o)
        .append(this.field1, myClass.field1)
        .append(this.field2, myClass.field2)
        .append(this.field3, myClass.field3)
        .toComparison();
    }
  }

  Values are compared in the order they are appended to the builder. If any comparison returns
  a non-zero result, then that value will be the result returned by toComparison() and all
  subsequent comparisons are skipped.

  Alternatively, there are reflectionCompare methods that use
  reflection to determine the fields to append. Because fields can be private,
  reflectionCompare uses AccessibleObject.setAccessible(boolean) to
  bypass normal access control checks. This will fail under a security manager,
  unless the appropriate permissions are set up correctly. It is also
  slower than appending explicitly.

  A typical implementation of compareTo(Object) using
  reflectionCompare looks like:



  public int compareTo(Object o) {
    return CompareToBuilder.reflectionCompare(this, o);
  }

  The reflective methods compare object fields in the order returned by
  Class.getDeclaredFields(). The fields of the class are compared first, followed by those
  of its parent classes (in order from the bottom to the top of the class hierarchy)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder CompareToBuilder]))

(defn ->compare-to-builder
  "Constructor.

  Constructor for CompareToBuilder.

   Starts off assuming that the objects are equal. Multiple calls are
   then made to the various append methods, followed by a call to
   toComparison() to get the result."
  (^CompareToBuilder []
    (new CompareToBuilder )))

(defn *reflection-compare
  "Compares two Objects via reflection.

   Fields can be private, thus AccessibleObject.setAccessible
   is used to bypass normal access control checks. This will fail under a
   security manager unless the appropriate permissions are set.


   Static fields will not be compared
   If the compareTransients is true,
       compares transient members.  Otherwise ignores them, as they
       are likely derived fields.
   Compares superclass fields up to and including reflectUpToClass.
       If reflectUpToClass is null, compares all superclass fields.


   If both lhs and rhs are null,
   they are considered equal.

  lhs - left-hand object - `java.lang.Object`
  rhs - right-hand object - `java.lang.Object`
  compare-transients - whether to compare transient fields - `boolean`
  reflect-up-to-class - last superclass for which fields are compared - `java.lang.Class`
  exclude-fields - fields to exclude - `java.lang.String`

  returns: a negative integer, zero, or a positive integer as lhs
    is less than, equal to, or greater than rhs - `int`

  throws: java.lang.NullPointerException - if either lhs or rhs (but not both) is null"
  (^Integer [^java.lang.Object lhs ^java.lang.Object rhs ^Boolean compare-transients ^java.lang.Class reflect-up-to-class ^java.lang.String exclude-fields]
    (CompareToBuilder/reflectionCompare lhs rhs compare-transients reflect-up-to-class exclude-fields))
  (^Integer [^java.lang.Object lhs ^java.lang.Object rhs ^Boolean compare-transients]
    (CompareToBuilder/reflectionCompare lhs rhs compare-transients))
  (^Integer [^java.lang.Object lhs ^java.lang.Object rhs]
    (CompareToBuilder/reflectionCompare lhs rhs)))

(defn append-super
  "Appends to the builder the compareTo(Object)
   result of the superclass.

  super-compare-to - result of calling super.compareTo(Object) - `int`

  returns: this - used to chain append calls - `org.apache.commons.lang3.builder.CompareToBuilder`"
  (^org.apache.commons.lang3.builder.CompareToBuilder [^CompareToBuilder this ^Integer super-compare-to]
    (-> this (.appendSuper super-compare-to))))

(defn append
  "Appends to the builder the comparison of
   two Objects.


   Check if lhs == rhs
   Check if either lhs or rhs is null,
       a null object is less than a non-null object
   Check the object contents


   If lhs is an array, array comparison methods will be used.
   Otherwise comparator will be used to compare the objects.
   If comparator is null, lhs must
   implement Comparable instead.

  lhs - left-hand object - `java.lang.Object`
  rhs - right-hand object - `java.lang.Object`
  comparator - Comparator used to compare the objects, null means treat lhs as Comparable - `java.util.Comparator`

  returns: this - used to chain append calls - `org.apache.commons.lang3.builder.CompareToBuilder`

  throws: java.lang.ClassCastException - if rhs is not assignment-compatible with lhs"
  (^org.apache.commons.lang3.builder.CompareToBuilder [^CompareToBuilder this ^java.lang.Object lhs ^java.lang.Object rhs ^java.util.Comparator comparator]
    (-> this (.append lhs rhs comparator)))
  (^org.apache.commons.lang3.builder.CompareToBuilder [^CompareToBuilder this ^java.lang.Object lhs ^java.lang.Object rhs]
    (-> this (.append lhs rhs))))

(defn to-comparison
  "Returns a negative integer, a positive integer, or zero as
   the builder has judged the \"left-hand\" side
   as less than, greater than, or equal to the \"right-hand\"
   side.

  returns: final comparison result - `int`"
  (^Integer [^CompareToBuilder this]
    (-> this (.toComparison))))

(defn build
  "Returns a negative Integer, a positive Integer, or zero as
   the builder has judged the \"left-hand\" side
   as less than, greater than, or equal to the \"right-hand\"
   side.

  returns: final comparison result as an Integer - `java.lang.Integer`"
  (^java.lang.Integer [^CompareToBuilder this]
    (-> this (.build))))

