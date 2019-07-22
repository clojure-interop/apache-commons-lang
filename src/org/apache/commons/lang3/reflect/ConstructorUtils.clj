(ns org.apache.commons.lang3.reflect.ConstructorUtils
  " Utility reflection methods focused on constructors, modeled after
  MethodUtils.

  Known Limitations Accessing Public Constructors In A Default
  Access Superclass There is an issue when invoking public constructors
  contained in a default access superclass. Reflection correctly locates these
  constructors and assigns them as public. However, an
  IllegalAccessException is thrown if the constructor is
  invoked.

  ConstructorUtils contains a workaround for this situation: it
  will attempt to call AccessibleObject.setAccessible(boolean) on this constructor. If this
  call succeeds, then the method can be invoked as normal. This call will only
  succeed when the application has sufficient security privileges. If this call
  fails then a warning will be logged and the method may fail."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.reflect ConstructorUtils]))

(defn ->constructor-utils
  "Constructor.

  ConstructorUtils instances should NOT be constructed in standard
   programming. Instead, the class should be used as
   ConstructorUtils.invokeConstructor(cls, args).

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^ConstructorUtils []
    (new ConstructorUtils )))

(defn *invoke-constructor
  "Returns a new instance of the specified class choosing the right constructor
   from the list of parameter types.

   This locates and calls a constructor.
   The constructor signature must match the parameter types by assignment compatibility.

  cls - the class to be constructed, not null - `java.lang.Class`
  args - the array of arguments, null treated as empty - `java.lang.Object[]`
  parameter-types - the array of parameter types, null treated as empty - `java.lang.Class[]`

  returns: new instance of cls, not null - `<T> T`

  throws: java.lang.NullPointerException - if cls is null"
  ([^java.lang.Class cls args parameter-types]
    (ConstructorUtils/invokeConstructor cls args parameter-types))
  ([^java.lang.Class cls ^java.lang.Object args]
    (ConstructorUtils/invokeConstructor cls args)))

(defn *invoke-exact-constructor
  "Returns a new instance of the specified class choosing the right constructor
   from the list of parameter types.

   This locates and calls a constructor.
   The constructor signature must match the parameter types exactly.

  cls - the class to be constructed, not null - `java.lang.Class`
  args - the array of arguments, null treated as empty - `java.lang.Object[]`
  parameter-types - the array of parameter types, null treated as empty - `java.lang.Class[]`

  returns: new instance of cls, not null - `<T> T`

  throws: java.lang.NullPointerException - if cls is null"
  ([^java.lang.Class cls args parameter-types]
    (ConstructorUtils/invokeExactConstructor cls args parameter-types))
  ([^java.lang.Class cls ^java.lang.Object args]
    (ConstructorUtils/invokeExactConstructor cls args)))

(defn *get-accessible-constructor
  "Finds a constructor given a class and signature, checking accessibility.

   This finds the constructor and ensures that it is accessible.
   The constructor signature must match the parameter types exactly.

  cls - the class to find a constructor for, not null - `java.lang.Class`
  parameter-types - the array of parameter types, null treated as empty - `java.lang.Class`

  returns: the constructor, null if no matching accessible constructor found - `<T> java.lang.reflect.Constructor<T>`

  throws: java.lang.NullPointerException - if cls is null"
  ([^java.lang.Class cls ^java.lang.Class parameter-types]
    (ConstructorUtils/getAccessibleConstructor cls parameter-types))
  ([^java.lang.reflect.Constructor ctor]
    (ConstructorUtils/getAccessibleConstructor ctor)))

(defn *get-matching-accessible-constructor
  "Finds an accessible constructor with compatible parameters.

   This checks all the constructor and finds one with compatible parameters
   This requires that every parameter is assignable from the given parameter types.
   This is a more flexible search than the normal exact matching algorithm.

   First it checks if there is a constructor matching the exact signature.
   If not then all the constructors of the class are checked to see if their
   signatures are assignment-compatible with the parameter types.
   The first assignment-compatible matching constructor is returned.

  cls - the class to find a constructor for, not null - `java.lang.Class`
  parameter-types - find method with compatible parameters - `java.lang.Class`

  returns: the constructor, null if no matching accessible constructor found - `<T> java.lang.reflect.Constructor<T>`

  throws: java.lang.NullPointerException - if cls is null"
  ([^java.lang.Class cls ^java.lang.Class parameter-types]
    (ConstructorUtils/getMatchingAccessibleConstructor cls parameter-types)))

