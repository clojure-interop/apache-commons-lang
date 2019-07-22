(ns org.apache.commons.lang3.reflect.TypeUtils
  " Utility methods focusing on type inspection, particularly with regard to
  generics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.reflect TypeUtils]))

(defn ->type-utils
  "Constructor.

  TypeUtils instances should NOT be constructed in standard
   programming. Instead, the class should be used as
   TypeUtils.isAssignable(cls, toClass). This
   constructor is public to permit tools that require a JavaBean instance to
   operate."
  (^TypeUtils []
    (new TypeUtils )))

(def *-wildcard-all
  "Static Constant.

  A wildcard instance matching ?.

  type: java.lang.reflect.WildcardType"
  TypeUtils/WILDCARD_ALL)

(defn *parameterize
  "Create a parameterized type instance.

  raw - the raw class to create a parameterized type instance for - `java.lang.Class`
  type-arguments - the types used for parameterization - `java.lang.reflect.Type`

  returns: ParameterizedType - `java.lang.reflect.ParameterizedType`"
  (^java.lang.reflect.ParameterizedType [^java.lang.Class raw ^java.lang.reflect.Type type-arguments]
    (TypeUtils/parameterize raw type-arguments)))

(defn *assignable?
  "Checks if the subject type may be implicitly cast to the target type
   following the Java generics rules. If both types are Class
   objects, the method returns the result of
   ClassUtils.isAssignable(Class, Class).

  type - the subject type to be assigned to the target type - `java.lang.reflect.Type`
  to-type - the target type - `java.lang.reflect.Type`

  returns: true if type is assignable to toType. - `boolean`"
  (^Boolean [^java.lang.reflect.Type type ^java.lang.reflect.Type to-type]
    (TypeUtils/isAssignable type to-type)))

(defn *contains-type-variables
  "Learn, recursively, whether any of the type parameters associated with type are bound to variables.

  type - the type to check for type variables - `java.lang.reflect.Type`

  returns: boolean - `boolean`"
  (^Boolean [^java.lang.reflect.Type type]
    (TypeUtils/containsTypeVariables type)))

(defn *get-implicit-bounds
  "Returns an array containing the sole type of Object if
   TypeVariable.getBounds() returns an empty array. Otherwise, it
   returns the result of TypeVariable.getBounds() passed into
   normalizeUpperBounds(java.lang.reflect.Type[]).

  type-variable - the subject type variable, not null - `java.lang.reflect.TypeVariable`

  returns: a non-empty array containing the bounds of the type variable. - `java.lang.reflect.Type[]`"
  ([^java.lang.reflect.TypeVariable type-variable]
    (TypeUtils/getImplicitBounds type-variable)))

(defn *get-array-component-type
  "Get the array component type of type.

  type - the type to be checked - `java.lang.reflect.Type`

  returns: component type or null if type is not an array type - `java.lang.reflect.Type`"
  (^java.lang.reflect.Type [^java.lang.reflect.Type type]
    (TypeUtils/getArrayComponentType type)))

(defn *array-type?
  "Learn whether the specified type denotes an array type.

  type - the type to be checked - `java.lang.reflect.Type`

  returns: true if type is an array class or a GenericArrayType. - `boolean`"
  (^Boolean [^java.lang.reflect.Type type]
    (TypeUtils/isArrayType type)))

(defn *to-string
  "Present a given type as a Java-esque String.

  type - the type to create a String representation for, not null - `java.lang.reflect.Type`

  returns: String - `java.lang.String`"
  (^java.lang.String [^java.lang.reflect.Type type]
    (TypeUtils/toString type)))

(defn *get-type-arguments
  "Gets the type arguments of a class/interface based on a subtype. For
   instance, this method will determine that both of the parameters for the
   interface Map are Object for the subtype
   Properties even though the subtype does not
   directly implement the Map interface.
   This method returns null if type is not assignable to
   toClass. It returns an empty map if none of the classes or
   interfaces in its inheritance hierarchy specify any type arguments.
   A side effect of this method is that it also retrieves the type
   arguments for the classes and interfaces that are part of the hierarchy
   between type and toClass. So with the above
   example, this method will also determine that the type arguments for
   Hashtable are also both Object.
   In cases where the interface specified by toClass is
   (indirectly) implemented more than once (e.g. where toClass
   specifies the interface Iterable and
   type specifies a parameterized type that implements both
   Set and Collection),
   this method will look at the inheritance hierarchy of only one of the
   implementations/subclasses; the first interface encountered that isn't a
   subinterface to one of the others in the type to
   toClass hierarchy.

  type - the type from which to determine the type parameters of toClass - `java.lang.reflect.Type`
  to-class - the class whose type parameters are to be determined based on the subtype type - `java.lang.Class`

  returns: a Map of the type assignments for the type variables in
   each type in the inheritance hierarchy from type to
   toClass inclusive. - `java.util.Map<java.lang.reflect.TypeVariable<?>,java.lang.reflect.Type>`"
  (^java.util.Map [^java.lang.reflect.Type type ^java.lang.Class to-class]
    (TypeUtils/getTypeArguments type to-class))
  (^java.util.Map [^java.lang.reflect.ParameterizedType type]
    (TypeUtils/getTypeArguments type)))

(defn *normalize-upper-bounds
  "This method strips out the redundant upper bound types in type
   variable types and wildcard types (or it would with wildcard types if
   multiple upper bounds were allowed). Example, with the variable
   type declaration:



  <K extends java.util.Collection<String> &
   java.util.List<String>>


   since List is a subinterface of Collection,
   this method will return the bounds as if the declaration had been:




  <K extends java.util.List<String>>

  bounds - an array of types representing the upper bounds of either WildcardType or TypeVariable, not null. - `java.lang.reflect.Type[]`

  returns: an array containing the values from bounds minus the
   redundant types. - `java.lang.reflect.Type[]`"
  ([bounds]
    (TypeUtils/normalizeUpperBounds bounds)))

(defn *wrap
  "Wrap the specified Type in a Typed wrapper.

  type - to wrap - `java.lang.reflect.Type`

  returns: Typed<T> - `<T> org.apache.commons.lang3.reflect.Typed<T>`"
  ([^java.lang.reflect.Type type]
    (TypeUtils/wrap type)))

(defn *parameterize-with-owner
  "Create a parameterized type instance.

  owner - the owning type - `java.lang.reflect.Type`
  raw - the raw class to create a parameterized type instance for - `java.lang.Class`
  type-arguments - the types used for parameterization - `java.lang.reflect.Type`

  returns: ParameterizedType - `java.lang.reflect.ParameterizedType`"
  (^java.lang.reflect.ParameterizedType [^java.lang.reflect.Type owner ^java.lang.Class raw ^java.lang.reflect.Type type-arguments]
    (TypeUtils/parameterizeWithOwner owner raw type-arguments)))

(defn *instance?
  "Checks if the given value can be assigned to the target type
   following the Java generics rules.

  value - the value to be checked - `java.lang.Object`
  type - the target type - `java.lang.reflect.Type`

  returns: true if value is an instance of type. - `boolean`"
  (^Boolean [^java.lang.Object value ^java.lang.reflect.Type type]
    (TypeUtils/isInstance value type)))

(defn *generic-array-type
  "Create a generic array type instance.

  component-type - the type of the elements of the array. For example the component type of boolean[] is boolean - `java.lang.reflect.Type`

  returns: GenericArrayType - `java.lang.reflect.GenericArrayType`"
  (^java.lang.reflect.GenericArrayType [^java.lang.reflect.Type component-type]
    (TypeUtils/genericArrayType component-type)))

(defn *get-implicit-upper-bounds
  "Returns an array containing the sole value of Object if
   WildcardType.getUpperBounds() returns an empty array. Otherwise,
   it returns the result of WildcardType.getUpperBounds()
   passed into normalizeUpperBounds(java.lang.reflect.Type[]).

  wildcard-type - the subject wildcard type, not null - `java.lang.reflect.WildcardType`

  returns: a non-empty array containing the upper bounds of the wildcard
   type. - `java.lang.reflect.Type[]`"
  ([^java.lang.reflect.WildcardType wildcard-type]
    (TypeUtils/getImplicitUpperBounds wildcard-type)))

(defn *unroll-variables
  "Get a type representing type with variable assignments \"unrolled.\"

  type-arguments - as from getTypeArguments(Type, Class) - `java.util.Map`
  type - the type to unroll variable assignments for - `java.lang.reflect.Type`

  returns: Type - `java.lang.reflect.Type`"
  (^java.lang.reflect.Type [^java.util.Map type-arguments ^java.lang.reflect.Type type]
    (TypeUtils/unrollVariables type-arguments type)))

(defn *get-implicit-lower-bounds
  "Returns an array containing a single value of null if
   WildcardType.getLowerBounds() returns an empty array. Otherwise,
   it returns the result of WildcardType.getLowerBounds().

  wildcard-type - the subject wildcard type, not null - `java.lang.reflect.WildcardType`

  returns: a non-empty array containing the lower bounds of the wildcard
   type. - `java.lang.reflect.Type[]`"
  ([^java.lang.reflect.WildcardType wildcard-type]
    (TypeUtils/getImplicitLowerBounds wildcard-type)))

(defn *to-long-string
  "Format a TypeVariable including its GenericDeclaration.

  var - the type variable to create a String representation for, not null - `java.lang.reflect.TypeVariable`

  returns: String - `java.lang.String`"
  (^java.lang.String [^java.lang.reflect.TypeVariable var]
    (TypeUtils/toLongString var)))

(defn *get-raw-type
  "Get the raw type of a Java type, given its context. Primarily for use
   with TypeVariables and GenericArrayTypes, or when you do
   not know the runtime type of type: if you know you have a
   Class instance, it is already raw; if you know you have a
   ParameterizedType, its raw type is only a method call away.

  type - to resolve - `java.lang.reflect.Type`
  assigning-type - type to be resolved against - `java.lang.reflect.Type`

  returns: the resolved Class object or null if
   the type could not be resolved - `java.lang.Class<?>`"
  (^java.lang.Class [^java.lang.reflect.Type type ^java.lang.reflect.Type assigning-type]
    (TypeUtils/getRawType type assigning-type)))

(defn *wildcard-type
  "Get a TypeUtils.WildcardTypeBuilder.

  returns: TypeUtils.WildcardTypeBuilder - `org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder`"
  (^org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder []
    (TypeUtils/wildcardType )))

(defn *types-satisfy-variables
  "Determines whether or not specified types satisfy the bounds of their
   mapped type variables. When a type parameter extends another (such as
   <T, S extends T>), uses another as a type parameter (such as
   <T, S extends Comparable>>), or otherwise depends on
   another type variable to be specified, the dependencies must be included
   in typeVarAssigns.

  type-var-assigns - specifies the potential types to be assigned to the type variables, not null. - `java.util.Map`

  returns: whether or not the types can be assigned to their respective type
   variables. - `boolean`"
  (^Boolean [^java.util.Map type-var-assigns]
    (TypeUtils/typesSatisfyVariables type-var-assigns)))

(defn *equals
  "Check equality of types.

  t-1 - the first type - `java.lang.reflect.Type`
  t-2 - the second type - `java.lang.reflect.Type`

  returns: boolean - `boolean`"
  (^Boolean [^java.lang.reflect.Type t-1 ^java.lang.reflect.Type t-2]
    (TypeUtils/equals t-1 t-2)))

(defn *determine-type-arguments
  "Tries to determine the type arguments of a class/interface based on a
   super parameterized type's type arguments. This method is the inverse of
   getTypeArguments(Type, Class) which gets a class/interface's
   type arguments based on a subtype. It is far more limited in determining
   the type arguments for the subject class's type variables in that it can
   only determine those parameters that map from the subject Class
   object to the supertype. Example: TreeSet sets its parameter as the parameter for
   NavigableSet, which in turn sets the
   parameter of SortedSet, which in turn sets the
   parameter of Set, which in turn sets the parameter of
   Collection, which in turn sets the parameter of
   Iterable. Since TreeSet's parameter maps
   (indirectly) to Iterable's parameter, it will be able to
   determine that based on the super type Iterable<? extends
   Map<Integer, ? extends Collection<?>>>, the parameter of
   TreeSet is ? extends Map<Integer, ? extends
   Collection<?>>.

  cls - the class whose type parameters are to be determined, not null - `java.lang.Class`
  super-type - the super type from which cls's type arguments are to be determined, not null - `java.lang.reflect.ParameterizedType`

  returns: a Map of the type assignments that could be determined
   for the type variables in each type in the inheritance hierarchy from
   type to toClass inclusive. - `java.util.Map<java.lang.reflect.TypeVariable<?>,java.lang.reflect.Type>`"
  (^java.util.Map [^java.lang.Class cls ^java.lang.reflect.ParameterizedType super-type]
    (TypeUtils/determineTypeArguments cls super-type)))

