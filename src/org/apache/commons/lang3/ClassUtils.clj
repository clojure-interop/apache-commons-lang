(ns org.apache.commons.lang3.ClassUtils
  "Operates on classes without using reflection.

  This class handles invalid null inputs as best it can.
  Each method documents its behaviour in more detail.

  The notion of a canonical name includes the human
  readable name for the type, for example int[]. The
  non-canonical method variants work with the JVM names, such as
  [I."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ClassUtils]))

(defn ->class-utils
  "Constructor.

  ClassUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as
   ClassUtils.getShortClassName(cls).

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^ClassUtils []
    (new ClassUtils )))

(def *-package-separator-char
  "Static Constant.

  The package separator character: '.' == 46.

  type: char"
  ClassUtils/PACKAGE_SEPARATOR_CHAR)

(def *-package-separator
  "Static Constant.

  The package separator String: \".\".

  type: java.lang.String"
  ClassUtils/PACKAGE_SEPARATOR)

(def *-inner-class-separator-char
  "Static Constant.

  The inner class separator character: '$' == 36.

  type: char"
  ClassUtils/INNER_CLASS_SEPARATOR_CHAR)

(def *-inner-class-separator
  "Static Constant.

  The inner class separator String: \"$\".

  type: java.lang.String"
  ClassUtils/INNER_CLASS_SEPARATOR)

(defn *assignable?
  "Checks if an array of Classes can be assigned to another array of Classes.

   This method calls isAssignable for each
   Class pair in the input arrays. It can be used to check if a set of arguments
   (the first parameter) are suitably compatible with a set of method parameter types
   (the second parameter).

   Unlike the Class.isAssignableFrom(java.lang.Class) method, this
   method takes into account widenings of primitive classes and
   nulls.

   Primitive widenings allow an int to be assigned to a long,
   float or double. This method returns the correct
   result for these cases.

   Null may be assigned to any reference type. This method will
   return true if null is passed in and the toClass is
   non-primitive.

   Specifically, this method tests whether the type represented by the
   specified Class parameter can be converted to the type
   represented by this Class object via an identity conversion
   widening primitive or widening reference conversion. See
   The Java Language Specification,
   sections 5.1.1, 5.1.2 and 5.1.4 for details.

  class-array - the array of Classes to check, may be null - `java.lang.Class[]`
  to-class-array - the array of Classes to try to assign into, may be null - `java.lang.Class[]`
  autoboxing - whether to use implicit autoboxing/unboxing between primitives and wrappers - `boolean`

  returns: true if assignment possible - `boolean`"
  (^Boolean [class-array to-class-array ^Boolean autoboxing]
    (ClassUtils/isAssignable class-array to-class-array autoboxing))
  (^Boolean [class-array ^java.lang.Class to-class-array]
    (ClassUtils/isAssignable class-array to-class-array)))

(defn *get-package-name
  "Gets the package name of an Object.

  object - the class to get the package name for, may be null - `java.lang.Object`
  value-if-null - the value to return if null - `java.lang.String`

  returns: the package name of the object, or the null value - `java.lang.String`"
  (^java.lang.String [^java.lang.Object object ^java.lang.String value-if-null]
    (ClassUtils/getPackageName object value-if-null))
  (^java.lang.String [^java.lang.Class cls]
    (ClassUtils/getPackageName cls)))

(defn *get-public-method
  "Returns the desired Method much like Class.getMethod, however
   it ensures that the returned Method is from a public class or interface and not
   from an anonymous inner class. This means that the Method is invokable and
   doesn't fall foul of Java bug
   4071957).



    Set set = Collections.unmodifiableSet(...);
    Method method = ClassUtils.getPublicMethod(set.getClass(), \"isEmpty\",  new Class[0]);
    Object result = method.invoke(set, new Object[]);

  cls - the class to check, not null - `java.lang.Class`
  method-name - the name of the method - `java.lang.String`
  parameter-types - the list of parameters - `java.lang.Class`

  returns: the method - `java.lang.reflect.Method`

  throws: java.lang.NullPointerException - if the class is null"
  (^java.lang.reflect.Method [^java.lang.Class cls ^java.lang.String method-name ^java.lang.Class parameter-types]
    (ClassUtils/getPublicMethod cls method-name parameter-types)))

(defn *get-canonical-name
  "Gets the canonical name for a Class.

  cls - the class for which to get the canonical class name; may be null - `java.lang.Class`
  value-if-null - the return value if null - `java.lang.String`

  returns: the canonical name of the class, or valueIfNull - `java.lang.String`"
  (^java.lang.String [^java.lang.Class cls ^java.lang.String value-if-null]
    (ClassUtils/getCanonicalName cls value-if-null))
  (^java.lang.String [^java.lang.Class cls]
    (ClassUtils/getCanonicalName cls)))

(defn *primitive-to-wrapper
  "Converts the specified primitive Class object to its corresponding
   wrapper Class object.

   NOTE: From v2.2, this method handles Void.TYPE,
   returning Void.TYPE.

  cls - the class to convert, may be null - `java.lang.Class`

  returns: the wrapper class for cls or cls if
   cls is not a primitive. null if null input. - `java.lang.Class<?>`"
  (^java.lang.Class [^java.lang.Class cls]
    (ClassUtils/primitiveToWrapper cls)))

(defn *primitives-to-wrappers
  "Converts the specified array of primitive Class objects to an array of
   its corresponding wrapper Class objects.

  classes - the class array to convert, may be null or empty - `java.lang.Class`

  returns: an array which contains for each given class, the wrapper class or
   the original class if class is not a primitive. null if null input.
   Empty array if an empty array passed in. - `java.lang.Class<?>[]`"
  ([^java.lang.Class classes]
    (ClassUtils/primitivesToWrappers classes)))

(defn *convert-class-names-to-classes
  "Given a List of class names, this method converts them into classes.

   A new List is returned. If the class name cannot be found, null
   is stored in the List. If the class name in the List is
   null, null is stored in the output List.

  class-names - the classNames to change - `java.util.List`

  returns: a List of Class objects corresponding to the class names,
    null if null input - `java.util.List<java.lang.Class<?>>`

  throws: java.lang.ClassCastException - if classNames contains a non String entry"
  (^java.util.List [^java.util.List class-names]
    (ClassUtils/convertClassNamesToClasses class-names)))

(defn *get-all-superclasses
  "Gets a List of superclasses for the given class.

  cls - the class to look up, may be null - `java.lang.Class`

  returns: the List of superclasses in order going up from this one
    null if null input - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^java.lang.Class cls]
    (ClassUtils/getAllSuperclasses cls)))

(defn *get-all-interfaces
  "Gets a List of all interfaces implemented by the given
   class and its superclasses.

   The order is determined by looking through each interface in turn as
   declared in the source file and following its hierarchy up. Then each
   superclass is considered in the same way. Later duplicates are ignored,
   so the order is maintained.

  cls - the class to look up, may be null - `java.lang.Class`

  returns: the List of interfaces in order,
    null if null input - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^java.lang.Class cls]
    (ClassUtils/getAllInterfaces cls)))

(defn *to-class
  "Converts an array of Object in to an array of Class objects.
   If any of these objects is null, a null element will be inserted into the array.

   This method returns null for a null input array.

  array - an Object array - `java.lang.Object`

  returns: a Class array, null if null array input - `java.lang.Class<?>[]`"
  ([^java.lang.Object array]
    (ClassUtils/toClass array)))

(defn *get-name
  "Null-safe version of aClass.getName()

  cls - the class for which to get the class name; may be null - `java.lang.Class`
  value-if-null - the return value if cls is null - `java.lang.String`

  returns: the class name or valueIfNull - `java.lang.String`"
  (^java.lang.String [^java.lang.Class cls ^java.lang.String value-if-null]
    (ClassUtils/getName cls value-if-null))
  (^java.lang.String [^java.lang.Class cls]
    (ClassUtils/getName cls)))

(defn *hierarchy
  "Get an Iterable that can iterate over a class hierarchy in ascending (subclass to superclass) order.

  type - the type to get the class hierarchy from - `java.lang.Class`
  interfaces-behavior - switch indicating whether to include or exclude interfaces - `org.apache.commons.lang3.ClassUtils$Interfaces`

  returns: Iterable an Iterable over the class hierarchy of the given class - `java.lang.Iterable<java.lang.Class<?>>`"
  (^java.lang.Iterable [^java.lang.Class type ^org.apache.commons.lang3.ClassUtils$Interfaces interfaces-behavior]
    (ClassUtils/hierarchy type interfaces-behavior))
  (^java.lang.Iterable [^java.lang.Class type]
    (ClassUtils/hierarchy type)))

(defn *primitive-or-wrapper?
  "Returns whether the given type is a primitive or primitive wrapper (Boolean, Byte, Character,
   Short, Integer, Long, Double, Float).

  type - The class to query or null. - `java.lang.Class`

  returns: true if the given type is a primitive or primitive wrapper (Boolean, Byte, Character,
           Short, Integer, Long, Double, Float). - `boolean`"
  (^Boolean [^java.lang.Class type]
    (ClassUtils/isPrimitiveOrWrapper type)))

(defn *convert-classes-to-class-names
  "Given a List of Class objects, this method converts
   them into class names.

   A new List is returned. null objects will be copied into
   the returned list as null.

  classes - the classes to change - `java.util.List`

  returns: a List of class names corresponding to the Class objects,
    null if null input - `java.util.List<java.lang.String>`

  throws: java.lang.ClassCastException - if classes contains a non-Class entry"
  (^java.util.List [^java.util.List classes]
    (ClassUtils/convertClassesToClassNames classes)))

(defn *inner-class?
  "Is the specified class an inner class or static nested class.

  cls - the class to check, may be null - `java.lang.Class`

  returns: true if the class is an inner or static nested class,
    false if not or null - `boolean`"
  (^Boolean [^java.lang.Class cls]
    (ClassUtils/isInnerClass cls)))

(defn *get-short-canonical-name
  "Gets the canonical name minus the package name for an Object.

  object - the class to get the short name for, may be null - `java.lang.Object`
  value-if-null - the value to return if null - `java.lang.String`

  returns: the canonical name of the object without the package name, or the null value - `java.lang.String`"
  (^java.lang.String [^java.lang.Object object ^java.lang.String value-if-null]
    (ClassUtils/getShortCanonicalName object value-if-null))
  (^java.lang.String [^java.lang.Class cls]
    (ClassUtils/getShortCanonicalName cls)))

(defn *primitive-wrapper?
  "Returns whether the given type is a primitive wrapper (Boolean, Byte, Character, Short,
   Integer, Long, Double, Float).

  type - The class to query or null. - `java.lang.Class`

  returns: true if the given type is a primitive wrapper (Boolean, Byte, Character, Short,
           Integer, Long, Double, Float). - `boolean`"
  (^Boolean [^java.lang.Class type]
    (ClassUtils/isPrimitiveWrapper type)))

(defn *wrapper-to-primitive
  "Converts the specified wrapper class to its corresponding primitive
   class.

   This method is the counter part of primitiveToWrapper().
   If the passed in class is a wrapper class for a primitive type, this
   primitive type will be returned (e.g. Integer.TYPE for
   Integer.class). For other classes, or if the parameter is
   null, the return value is null.

  cls - the class to convert, may be null - `java.lang.Class`

  returns: the corresponding primitive type if cls is a
   wrapper class, null otherwise - `java.lang.Class<?>`"
  (^java.lang.Class [^java.lang.Class cls]
    (ClassUtils/wrapperToPrimitive cls)))

(defn *get-package-canonical-name
  "Gets the package name from the canonical name of an Object.

  object - the class to get the package name for, may be null - `java.lang.Object`
  value-if-null - the value to return if null - `java.lang.String`

  returns: the package name of the object, or the null value - `java.lang.String`"
  (^java.lang.String [^java.lang.Object object ^java.lang.String value-if-null]
    (ClassUtils/getPackageCanonicalName object value-if-null))
  (^java.lang.String [^java.lang.Class cls]
    (ClassUtils/getPackageCanonicalName cls)))

(defn *get-short-class-name
  "Gets the class name minus the package name for an Object.

  object - the class to get the short name for, may be null - `java.lang.Object`
  value-if-null - the value to return if null - `java.lang.String`

  returns: the class name of the object without the package name, or the null value - `java.lang.String`"
  (^java.lang.String [^java.lang.Object object ^java.lang.String value-if-null]
    (ClassUtils/getShortClassName object value-if-null))
  (^java.lang.String [^java.lang.Class cls]
    (ClassUtils/getShortClassName cls)))

(defn *get-abbreviated-name
  "Gets the abbreviated name of a Class.

  cls - the class to get the abbreviated name for, may be null - `java.lang.Class`
  len - the desired length of the abbreviated name - `int`

  returns: the abbreviated name or an empty string - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if len <= 0"
  (^java.lang.String [^java.lang.Class cls ^Integer len]
    (ClassUtils/getAbbreviatedName cls len)))

(defn *wrappers-to-primitives
  "Converts the specified array of wrapper Class objects to an array of
   its corresponding primitive Class objects.

   This method invokes wrapperToPrimitive() for each element
   of the passed in array.

  classes - the class array to convert, may be null or empty - `java.lang.Class`

  returns: an array which contains for each given class, the primitive class or
   null if the original class is not a wrapper class. null if null input.
   Empty array if an empty array passed in. - `java.lang.Class<?>[]`"
  ([^java.lang.Class classes]
    (ClassUtils/wrappersToPrimitives classes)))

(defn *get-simple-name
  "Null-safe version of aClass.getSimpleName()

  cls - the class for which to get the simple name; may be null - `java.lang.Class`
  value-if-null - the value to return if null - `java.lang.String`

  returns: the simple class name or valueIfNull - `java.lang.String`"
  (^java.lang.String [^java.lang.Class cls ^java.lang.String value-if-null]
    (ClassUtils/getSimpleName cls value-if-null))
  (^java.lang.String [^java.lang.Class cls]
    (ClassUtils/getSimpleName cls)))

(defn *get-class
  "Returns the class represented by className using the
   classLoader.  This implementation supports the syntaxes
   \"java.util.Map.Entry[]\", \"java.util.Map$Entry[]\",
   \"[Ljava.util.Map.Entry;\", and \"[Ljava.util.Map$Entry;\".

  class-loader - the class loader to use to load the class - `java.lang.ClassLoader`
  class-name - the class name - `java.lang.String`
  initialize - whether the class must be initialized - `boolean`

  returns: the class represented by className using the classLoader - `java.lang.Class<?>`

  throws: java.lang.ClassNotFoundException - if the class is not found"
  (^java.lang.Class [^java.lang.ClassLoader class-loader ^java.lang.String class-name ^Boolean initialize]
    (ClassUtils/getClass class-loader class-name initialize))
  (^java.lang.Class [^java.lang.ClassLoader class-loader ^java.lang.String class-name]
    (ClassUtils/getClass class-loader class-name))
  (^java.lang.Class [^java.lang.String class-name]
    (ClassUtils/getClass class-name)))

