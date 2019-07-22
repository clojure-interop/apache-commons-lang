(ns org.apache.commons.lang3.reflect.MethodUtils
  "Utility reflection methods focused on Methods, originally from Commons BeanUtils.
  Differences from the BeanUtils version may be noted, especially where similar functionality
  already existed within Lang.


  Known Limitations
  Accessing Public Methods In A Default Access Superclass
  There is an issue when invoking public methods contained in a default access superclass on JREs prior to 1.4.
  Reflection locates these methods fine and correctly assigns them as public.
  However, an IllegalAccessException is thrown if the method is invoked.

  MethodUtils contains a workaround for this situation.
  It will attempt to call AccessibleObject.setAccessible(boolean) on this method.
  If this call succeeds, then the method can be invoked as normal.
  This call will only succeed when the application has sufficient security privileges.
  If this call fails then the method may fail."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.reflect MethodUtils]))

(defn ->method-utils
  "Constructor.

  MethodUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as
   MethodUtils.getAccessibleMethod(method).

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^MethodUtils []
    (new MethodUtils )))

(defn *get-methods-list-with-annotation
  "Gets all methods of the given class that are annotated with the given annotation.

  cls - the Class to query - `java.lang.Class`
  annotation-cls - the Annotation that must be present on a method to be matched - `java.lang.Class`
  search-supers - determines if a lookup in the entire inheritance hierarchy of the given class should be performed - `boolean`
  ignore-access - determines if non public methods should be considered - `boolean`

  returns: a list of Methods (possibly empty). - `java.util.List<java.lang.reflect.Method>`

  throws: java.lang.IllegalArgumentException - if the class or annotation are null"
  (^java.util.List [^java.lang.Class cls ^java.lang.Class annotation-cls ^Boolean search-supers ^Boolean ignore-access]
    (MethodUtils/getMethodsListWithAnnotation cls annotation-cls search-supers ignore-access))
  (^java.util.List [^java.lang.Class cls ^java.lang.Class annotation-cls]
    (MethodUtils/getMethodsListWithAnnotation cls annotation-cls)))

(defn *get-methods-with-annotation
  "Gets all methods of the given class that are annotated with the given annotation.

  cls - the Class to query - `java.lang.Class`
  annotation-cls - the Annotation that must be present on a method to be matched - `java.lang.Class`
  search-supers - determines if a lookup in the entire inheritance hierarchy of the given class should be performed - `boolean`
  ignore-access - determines if non public methods should be considered - `boolean`

  returns: an array of Methods (possibly empty). - `java.lang.reflect.Method[]`

  throws: java.lang.IllegalArgumentException - if the class or annotation are null"
  ([^java.lang.Class cls ^java.lang.Class annotation-cls ^Boolean search-supers ^Boolean ignore-access]
    (MethodUtils/getMethodsWithAnnotation cls annotation-cls search-supers ignore-access))
  ([^java.lang.Class cls ^java.lang.Class annotation-cls]
    (MethodUtils/getMethodsWithAnnotation cls annotation-cls)))

(defn *get-accessible-method
  "Returns an accessible method (that is, one that can be invoked via
   reflection) with given name and parameters. If no such method
   can be found, return null.
   This is just a convenience wrapper for
   getAccessibleMethod(Method).

  cls - get method from this class - `java.lang.Class`
  method-name - get method with this name - `java.lang.String`
  parameter-types - with these parameters types - `java.lang.Class`

  returns: The accessible method - `java.lang.reflect.Method`"
  (^java.lang.reflect.Method [^java.lang.Class cls ^java.lang.String method-name ^java.lang.Class parameter-types]
    (MethodUtils/getAccessibleMethod cls method-name parameter-types))
  (^java.lang.reflect.Method [^java.lang.reflect.Method method]
    (MethodUtils/getAccessibleMethod method)))

(defn *invoke-method
  "Invokes a named method whose parameter type matches the object type.

   This method supports calls to methods taking primitive parameters
   via passing in wrapping classes. So, for example, a Boolean object
   would match a boolean primitive.

  object - invoke method on this object - `java.lang.Object`
  force-access - force access to invoke method even if it's not accessible - `boolean`
  method-name - get method with this name - `java.lang.String`
  args - use these arguments - treat null as empty array - `java.lang.Object[]`
  parameter-types - match these parameters - treat null as empty array - `java.lang.Class[]`

  returns: The value returned by the invoked method - `java.lang.Object`

  throws: java.lang.NoSuchMethodException - if there is no such accessible method"
  (^java.lang.Object [^java.lang.Object object ^Boolean force-access ^java.lang.String method-name args parameter-types]
    (MethodUtils/invokeMethod object force-access method-name args parameter-types))
  (^java.lang.Object [^java.lang.Object object ^Boolean force-access ^java.lang.String method-name ^java.lang.Object args]
    (MethodUtils/invokeMethod object force-access method-name args))
  (^java.lang.Object [^java.lang.Object object ^Boolean force-access ^java.lang.String method-name]
    (MethodUtils/invokeMethod object force-access method-name))
  (^java.lang.Object [^java.lang.Object object ^java.lang.String method-name]
    (MethodUtils/invokeMethod object method-name)))

(defn *invoke-exact-method
  "Invokes a method whose parameter types match exactly the parameter
   types given.

   This uses reflection to invoke the method obtained from a call to
   getAccessibleMethod(Class, String, Class[]).

  object - invoke method on this object - `java.lang.Object`
  method-name - get method with this name - `java.lang.String`
  args - use these arguments - treat null as empty array - `java.lang.Object[]`
  parameter-types - match these parameters - treat null as empty array - `java.lang.Class[]`

  returns: The value returned by the invoked method - `java.lang.Object`

  throws: java.lang.NoSuchMethodException - if there is no such accessible method"
  (^java.lang.Object [^java.lang.Object object ^java.lang.String method-name args parameter-types]
    (MethodUtils/invokeExactMethod object method-name args parameter-types))
  (^java.lang.Object [^java.lang.Object object ^java.lang.String method-name ^java.lang.Object args]
    (MethodUtils/invokeExactMethod object method-name args))
  (^java.lang.Object [^java.lang.Object object ^java.lang.String method-name]
    (MethodUtils/invokeExactMethod object method-name)))

(defn *get-annotation
  "Gets the annotation object with the given annotation type that is present on the given method
   or optionally on any equivalent method in super classes and interfaces. Returns null if the annotation
   type was not present.

   Stops searching for an annotation once the first annotation of the specified type has been
   found. Additional annotations of the specified type will be silently ignored.

  method - the Method to query - `java.lang.reflect.Method`
  annotation-cls - the Annotation to check if is present on the method - `java.lang.Class`
  search-supers - determines if a lookup in the entire inheritance hierarchy of the given class is performed if the annotation was not directly present - `boolean`
  ignore-access - determines if underlying method has to be accessible - `boolean`

  returns: the first matching annotation, or null if not found - `<A extends java.lang.annotation.Annotation> A`

  throws: java.lang.IllegalArgumentException - if the method or annotation are null"
  ([^java.lang.reflect.Method method ^java.lang.Class annotation-cls ^Boolean search-supers ^Boolean ignore-access]
    (MethodUtils/getAnnotation method annotation-cls search-supers ignore-access)))

(defn *get-matching-accessible-method
  "Finds an accessible method that matches the given name and has compatible parameters.
   Compatible parameters mean that every method parameter is assignable from
   the given parameters.
   In other words, it finds a method with the given name
   that will take the parameters given.

   This method is used by
   invokeMethod(Object object, String methodName, Object[] args, Class[] parameterTypes).


   This method can match primitive parameter by passing in wrapper classes.
   For example, a Boolean will match a primitive boolean
   parameter.

  cls - find method in this class - `java.lang.Class`
  method-name - find method with this name - `java.lang.String`
  parameter-types - find method with most compatible parameters - `java.lang.Class`

  returns: The accessible method - `java.lang.reflect.Method`"
  (^java.lang.reflect.Method [^java.lang.Class cls ^java.lang.String method-name ^java.lang.Class parameter-types]
    (MethodUtils/getMatchingAccessibleMethod cls method-name parameter-types)))

(defn *get-override-hierarchy
  "Get the hierarchy of overridden methods down to result respecting generics.

  method - lowest to consider - `java.lang.reflect.Method`
  interfaces-behavior - whether to search interfaces, null implies false - `org.apache.commons.lang3.ClassUtils$Interfaces`

  returns: Set<Method> in ascending order from sub- to superclass - `java.util.Set<java.lang.reflect.Method>`

  throws: java.lang.NullPointerException - if the specified method is null"
  (^java.util.Set [^java.lang.reflect.Method method ^org.apache.commons.lang3.ClassUtils$Interfaces interfaces-behavior]
    (MethodUtils/getOverrideHierarchy method interfaces-behavior)))

(defn *invoke-static-method
  "Invokes a named static method whose parameter type matches the object type.

   This method delegates the method search to getMatchingAccessibleMethod(Class, String, Class[]).

   This method supports calls to methods taking primitive parameters
   via passing in wrapping classes. So, for example, a Boolean class
   would match a boolean primitive.

  cls - invoke static method on this class - `java.lang.Class`
  method-name - get method with this name - `java.lang.String`
  args - use these arguments - treat null as empty array - `java.lang.Object[]`
  parameter-types - match these parameters - treat null as empty array - `java.lang.Class[]`

  returns: The value returned by the invoked method - `java.lang.Object`

  throws: java.lang.NoSuchMethodException - if there is no such accessible method"
  (^java.lang.Object [^java.lang.Class cls ^java.lang.String method-name args parameter-types]
    (MethodUtils/invokeStaticMethod cls method-name args parameter-types))
  (^java.lang.Object [^java.lang.Class cls ^java.lang.String method-name ^java.lang.Object args]
    (MethodUtils/invokeStaticMethod cls method-name args)))

(defn *get-matching-method
  "Retrieves a method whether or not it's accessible. If no such method
   can be found, return null.

  cls - The class that will be subjected to the method search - `java.lang.Class`
  method-name - The method that we wish to call - `java.lang.String`
  parameter-types - Argument class types - `java.lang.Class`

  returns: The method - `java.lang.reflect.Method`"
  (^java.lang.reflect.Method [^java.lang.Class cls ^java.lang.String method-name ^java.lang.Class parameter-types]
    (MethodUtils/getMatchingMethod cls method-name parameter-types)))

(defn *invoke-exact-static-method
  "Invokes a static method whose parameter types match exactly the parameter
   types given.

   This uses reflection to invoke the method obtained from a call to
   getAccessibleMethod(Class, String, Class[]).

  cls - invoke static method on this class - `java.lang.Class`
  method-name - get method with this name - `java.lang.String`
  args - use these arguments - treat null as empty array - `java.lang.Object[]`
  parameter-types - match these parameters - treat null as empty array - `java.lang.Class[]`

  returns: The value returned by the invoked method - `java.lang.Object`

  throws: java.lang.NoSuchMethodException - if there is no such accessible method"
  (^java.lang.Object [^java.lang.Class cls ^java.lang.String method-name args parameter-types]
    (MethodUtils/invokeExactStaticMethod cls method-name args parameter-types))
  (^java.lang.Object [^java.lang.Class cls ^java.lang.String method-name ^java.lang.Object args]
    (MethodUtils/invokeExactStaticMethod cls method-name args)))

