(ns org.apache.commons.lang3.builder.EqualsBuilder
  "Assists in implementing Object.equals(Object) methods.

   This class provides methods to build a good equals method for any
  class. It follows rules laid out in
  Effective Java
  , by Joshua Bloch. In particular the rule for comparing doubles,
  floats, and arrays can be tricky. Also, making sure that
  equals() and hashCode() are consistent can be
  difficult.

  Two Objects that compare as equals must generate the same hash code,
  but two Objects with the same hash code do not have to be equal.

  All relevant fields should be included in the calculation of equals.
  Derived fields may be ignored. In particular, any field used in
  generating a hash code must be used in the equals method, and vice
  versa.

  Typical use for the code is as follows:


  public boolean equals(Object obj) {
    if (obj == null) { return false; }
    if (obj == this) { return true; }
    if (obj.getClass() != getClass()) {
      return false;
    }
    MyClass rhs = (MyClass) obj;
    return new EqualsBuilder()
                  .appendSuper(super.equals(obj))
                  .append(field1, rhs.field1)
                  .append(field2, rhs.field2)
                  .append(field3, rhs.field3)
                  .isEquals();
   }

   Alternatively, there is a method that uses reflection to determine
  the fields to test. Because these fields are usually private, the method,
  reflectionEquals, uses AccessibleObject.setAccessible to
  change the visibility of the fields. This will fail under a security
  manager, unless the appropriate permissions are set up correctly. It is
  also slower than testing explicitly.  Non-primitive fields are compared using
  equals().

   A typical invocation for this method would look like:


  public boolean equals(Object obj) {
    return EqualsBuilder.reflectionEquals(this, obj);
  }

  The EqualsExclude annotation can be used to exclude fields from being
  used by the reflectionEquals methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder EqualsBuilder]))

(defn ->equals-builder
  "Constructor.

  Constructor for EqualsBuilder.

   Starts off assuming that equals is true."
  (^EqualsBuilder []
    (new EqualsBuilder )))

(defn *reflection-equals
  "This method uses reflection to determine if the two Objects
   are equal.

   It uses AccessibleObject.setAccessible to gain access to private
   fields. This means that it will throw a security exception if run under
   a security manager, if the permissions are not set up correctly. It is also
   not as efficient as testing explicitly. Non-primitive fields are compared using
   equals().

   If the testTransients parameter is set to true, transient
   members will be tested, otherwise they are ignored, as they are likely
   derived fields, and not part of the value of the Object.

   Static fields will not be included. Superclass fields will be appended
   up to and including the specified superclass. A null superclass is treated
   as java.lang.Object.

   If the testRecursive parameter is set to true, non primitive
   (and non primitive wrapper) field types will be compared by
   EqualsBuilder recursively instead of invoking their
   equals() method. Leading to a deep reflection equals test.

  lhs - this object - `java.lang.Object`
  rhs - the other object - `java.lang.Object`
  test-transients - whether to include transient fields - `boolean`
  reflect-up-to-class - the superclass to reflect up to (inclusive), may be null - `java.lang.Class`
  test-recursive - whether to call reflection equals on non primitive fields recursively. - `boolean`
  exclude-fields - array of field names to exclude from testing - `java.lang.String`

  returns: true if the two Objects have tested equals. - `boolean`"
  (^Boolean [^java.lang.Object lhs ^java.lang.Object rhs ^Boolean test-transients ^java.lang.Class reflect-up-to-class ^Boolean test-recursive ^java.lang.String exclude-fields]
    (EqualsBuilder/reflectionEquals lhs rhs test-transients reflect-up-to-class test-recursive exclude-fields))
  (^Boolean [^java.lang.Object lhs ^java.lang.Object rhs ^Boolean test-transients ^java.lang.Class reflect-up-to-class ^java.lang.String exclude-fields]
    (EqualsBuilder/reflectionEquals lhs rhs test-transients reflect-up-to-class exclude-fields))
  (^Boolean [^java.lang.Object lhs ^java.lang.Object rhs ^java.util.Collection exclude-fields]
    (EqualsBuilder/reflectionEquals lhs rhs exclude-fields)))

(defn append-super
  "Adds the result of super.equals() to this builder.

  super-equals - the result of calling super.equals() - `boolean`

  returns: EqualsBuilder - used to chain calls. - `org.apache.commons.lang3.builder.EqualsBuilder`"
  (^org.apache.commons.lang3.builder.EqualsBuilder [^EqualsBuilder this ^Boolean super-equals]
    (-> this (.appendSuper super-equals))))

(defn set-test-recursive
  "Set whether to include transient fields when reflectively comparing objects.

  test-recursive - whether to do a recursive test - `boolean`

  returns: EqualsBuilder - used to chain calls. - `org.apache.commons.lang3.builder.EqualsBuilder`"
  (^org.apache.commons.lang3.builder.EqualsBuilder [^EqualsBuilder this ^Boolean test-recursive]
    (-> this (.setTestRecursive test-recursive))))

(defn set-exclude-fields
  "Set field names to be excluded by reflection tests.

  exclude-fields - the fields to exclude - `java.lang.String`

  returns: EqualsBuilder - used to chain calls. - `org.apache.commons.lang3.builder.EqualsBuilder`"
  (^org.apache.commons.lang3.builder.EqualsBuilder [^EqualsBuilder this ^java.lang.String exclude-fields]
    (-> this (.setExcludeFields exclude-fields))))

(defn reset
  "Reset the EqualsBuilder so you can use the same object again"
  ([^EqualsBuilder this]
    (-> this (.reset))))

(defn build
  "Returns true if the fields that have been checked
   are all equal.

  returns: true if all of the fields that have been checked
           are equal, false otherwise. - `java.lang.Boolean`"
  (^java.lang.Boolean [^EqualsBuilder this]
    (-> this (.build))))

(defn set-bypass-reflection-classes
  "Set Classes whose instances should be compared by calling their equals
   although being in recursive mode. So the fields of theses classes will not be compared recursively by reflection.

   Here you should name classes having non-transient fields which are cache fields being set lazily.
   Prominent example being String class with its hash code cache field. Due to the importance
   of the String class, it is included in the default bypasses classes. Usually, if you use
   your own set of classes here, remember to include String class, too.

  bypass-reflection-classes - classes to bypass reflection test - `java.util.List`

  returns: EqualsBuilder - used to chain calls. - `org.apache.commons.lang3.builder.EqualsBuilder`"
  (^org.apache.commons.lang3.builder.EqualsBuilder [^EqualsBuilder this ^java.util.List bypass-reflection-classes]
    (-> this (.setBypassReflectionClasses bypass-reflection-classes))))

(defn set-test-transients
  "Set whether to include transient fields when reflectively comparing objects.

  test-transients - whether to test transient fields - `boolean`

  returns: EqualsBuilder - used to chain calls. - `org.apache.commons.lang3.builder.EqualsBuilder`"
  (^org.apache.commons.lang3.builder.EqualsBuilder [^EqualsBuilder this ^Boolean test-transients]
    (-> this (.setTestTransients test-transients))))

(defn equals?
  "Returns true if the fields that have been checked
   are all equal.

  returns: boolean - `boolean`"
  (^Boolean [^EqualsBuilder this]
    (-> this (.isEquals))))

(defn append
  "Test if two Objects are equal using either
   #reflectionAppend(Object, Object), if object are non
   primitives (or wrapper of primitives) or if field testRecursive
   is set to false. Otherwise, using their
   equals method.

  lhs - the left hand object - `java.lang.Object`
  rhs - the right hand object - `java.lang.Object`

  returns: EqualsBuilder - used to chain calls. - `org.apache.commons.lang3.builder.EqualsBuilder`"
  (^org.apache.commons.lang3.builder.EqualsBuilder [^EqualsBuilder this ^java.lang.Object lhs ^java.lang.Object rhs]
    (-> this (.append lhs rhs))))

(defn reflection-append
  "Tests if two objects by using reflection.

   It uses AccessibleObject.setAccessible to gain access to private
   fields. This means that it will throw a security exception if run under
   a security manager, if the permissions are not set up correctly. It is also
   not as efficient as testing explicitly. Non-primitive fields are compared using
   equals().

   If the testTransients field is set to true, transient
   members will be tested, otherwise they are ignored, as they are likely
   derived fields, and not part of the value of the Object.

   Static fields will not be included. Superclass fields will be appended
   up to and including the specified superclass in field reflectUpToClass.
   A null superclass is treated as java.lang.Object.

   Field names listed in field excludeFields will be ignored.

   If either class of the compared objects is contained in
   bypassReflectionClasses, both objects are compared by calling
   the equals method of the left hand object with the right hand object as an argument.

  lhs - the left hand object - `java.lang.Object`
  rhs - the left hand object - `java.lang.Object`

  returns: EqualsBuilder - used to chain calls. - `org.apache.commons.lang3.builder.EqualsBuilder`"
  (^org.apache.commons.lang3.builder.EqualsBuilder [^EqualsBuilder this ^java.lang.Object lhs ^java.lang.Object rhs]
    (-> this (.reflectionAppend lhs rhs))))

(defn set-reflect-up-to-class
  "Set the superclass to reflect up to at reflective tests.

  reflect-up-to-class - the super class to reflect up to - `java.lang.Class`

  returns: EqualsBuilder - used to chain calls. - `org.apache.commons.lang3.builder.EqualsBuilder`"
  (^org.apache.commons.lang3.builder.EqualsBuilder [^EqualsBuilder this ^java.lang.Class reflect-up-to-class]
    (-> this (.setReflectUpToClass reflect-up-to-class))))

