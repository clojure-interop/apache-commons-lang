(ns org.apache.commons.lang3.ObjectUtils
  "Operations on Object.

  This class tries to handle null input gracefully.
  An exception will generally not be thrown for a null input.
  Each method documents its behaviour in more detail.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ObjectUtils]))

(defn ->object-utils
  "Constructor.

  ObjectUtils instances should NOT be constructed in
   standard programming. Instead, the static methods on the class should
   be used, such as ObjectUtils.defaultIfNull(\"a\",\"b\");.

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^ObjectUtils []
    (new ObjectUtils )))

(def *-null
  "Static Constant.

  Singleton used as a null placeholder where
   null has another meaning.

   For example, in a HashMap the
   HashMap.get(java.lang.Object) method returns
   null if the Map contains null or if there
   is no matching key. The Null placeholder can be used to
   distinguish between these two cases.

   Another example is Hashtable, where null
   cannot be stored.

   This instance is Serializable.

  type: org.apache.commons.lang3.ObjectUtils$Null"
  ObjectUtils/NULL)

(defn *compare
  "Null safe comparison of Comparables.

  c-1 - the first comparable, may be null - `T`
  c-2 - the second comparable, may be null - `T`
  null-greater - if true null is considered greater than a non-null value or if false null is considered less than a Non-null value - `boolean`

  returns: a negative value if c1 < c2, zero if c1 = c2
    and a positive value if c1 > c2 - `<T extends java.lang.Comparable<? super T>> int`"
  ([c-1 c-2 ^Boolean null-greater]
    (ObjectUtils/compare c-1 c-2 null-greater))
  ([c-1 c-2]
    (ObjectUtils/compare c-1 c-2)))

(defn *const
  "This method returns the provided value unchanged.
   This can prevent javac from inlining a constant
   field, e.g.,



       public final static boolean MAGIC_FLAG = ObjectUtils.CONST(true);

   This way any jars that refer to this field do not
   have to recompile themselves if the field's value
   changes at some future date.

  v - the boolean value to return - `boolean`

  returns: the boolean v, unchanged - `boolean`"
  (^Boolean [^Boolean v]
    (ObjectUtils/CONST v)))

(defn *min
  "Null safe comparison of Comparables.

  values - the set of comparable values, may be null - `T`

  returns: If any objects are non-null and unequal, the lesser object.
     If all objects are non-null and equal, the first.
     If any of the comparables are null, the lesser of the non-null objects.
     If all the comparables are null, null is returned. - `<T extends java.lang.Comparable<? super T>> T`"
  ([values]
    (ObjectUtils/min values)))

(defn *not-equal
  "Compares two objects for inequality, where either one or both
   objects may be null.



   ObjectUtils.notEqual(null, null)                  = false
   ObjectUtils.notEqual(null, \"\")                    = true
   ObjectUtils.notEqual(\"\", null)                    = true
   ObjectUtils.notEqual(\"\", \"\")                      = false
   ObjectUtils.notEqual(Boolean.TRUE, null)          = true
   ObjectUtils.notEqual(Boolean.TRUE, \"true\")        = true
   ObjectUtils.notEqual(Boolean.TRUE, Boolean.TRUE)  = false
   ObjectUtils.notEqual(Boolean.TRUE, Boolean.FALSE) = true

  object-1 - the first object, may be null - `java.lang.Object`
  object-2 - the second object, may be null - `java.lang.Object`

  returns: false if the values of both objects are the same - `boolean`"
  (^Boolean [^java.lang.Object object-1 ^java.lang.Object object-2]
    (ObjectUtils/notEqual object-1 object-2)))

(defn *any-not-null
  "Checks if any value in the given array is not null.


   If all the values are null or the array is null
   or empty then false is returned. Otherwise true is returned.




   ObjectUtils.anyNotNull(*)                = true
   ObjectUtils.anyNotNull(*, null)          = true
   ObjectUtils.anyNotNull(null, *)          = true
   ObjectUtils.anyNotNull(null, null, *, *) = true
   ObjectUtils.anyNotNull(null)             = false
   ObjectUtils.anyNotNull(null, null)       = false

  values - the values to test, may be null or empty - `java.lang.Object`

  returns: true if there is at least one non-null value in the array,
   false if all values in the array are nulls.
   If the array is null or empty false is also returned. - `boolean`"
  (^Boolean [^java.lang.Object values]
    (ObjectUtils/anyNotNull values)))

(defn *max
  "Null safe comparison of Comparables.

  values - the set of comparable values, may be null - `T`

  returns: If any objects are non-null and unequal, the greater object.
     If all objects are non-null and equal, the first.
     If any of the comparables are null, the greater of the non-null objects.
     If all the comparables are null, null is returned. - `<T extends java.lang.Comparable<? super T>> T`"
  ([values]
    (ObjectUtils/max values)))

(defn *to-string
  "Deprecated. this method has been replaced by java.util.Objects.toString(Object, String) in Java 7 and
   will be removed in future releases.

  obj - the Object to toString, may be null - `java.lang.Object`
  null-str - the String to return if null input, may be null - `java.lang.String`

  returns: the passed in Object's toString, or nullStr if null input - `java.lang.String`"
  (^java.lang.String [^java.lang.Object obj ^java.lang.String null-str]
    (ObjectUtils/toString obj null-str))
  (^java.lang.String [^java.lang.Object obj]
    (ObjectUtils/toString obj)))

(defn *hash-code-multi
  "Deprecated. this method has been replaced by java.util.Objects.hash(Object...) in Java 7 and will be
   removed in future releases.

  objects - the objects to obtain the hash code of, may be null - `java.lang.Object`

  returns: the hash code of the objects, or zero if null - `int`"
  (^Integer [^java.lang.Object objects]
    (ObjectUtils/hashCodeMulti objects)))

(defn *mode
  "Find the most frequently occurring item.

  items - to check - `T`

  returns: most populous T, null if non-unique or no items supplied - `<T> T`"
  ([items]
    (ObjectUtils/mode items)))

(defn *all-not-null
  "Checks if all values in the array are not nulls.


   If any value is null or the array is null then
   false is returned. If all elements in array are not
   null or the array is empty (contains no elements) true
   is returned.




   ObjectUtils.allNotNull(*)             = true
   ObjectUtils.allNotNull(*, *)          = true
   ObjectUtils.allNotNull(null)          = false
   ObjectUtils.allNotNull(null, null)    = false
   ObjectUtils.allNotNull(null, *)       = false
   ObjectUtils.allNotNull(*, null)       = false
   ObjectUtils.allNotNull(*, *, null, *) = false

  values - the values to test, may be null or empty - `java.lang.Object`

  returns: false if there is at least one null value in the array or the array is null,
   true if all values in the array are not nulls or array contains no elements. - `boolean`"
  (^Boolean [^java.lang.Object values]
    (ObjectUtils/allNotNull values)))

(defn *not-empty?
  "Checks if an Object is not empty and not null.

   The following types are supported:

   CharSequence: Considered empty if its length is zero.
   Array: Considered empty if its length is zero.
   Collection: Considered empty if it has zero elements.
   Map: Considered empty if it has zero key-value mappings.




   ObjectUtils.isNotEmpty(null)             = false
   ObjectUtils.isNotEmpty(\"\")               = false
   ObjectUtils.isNotEmpty(\"ab\")             = true
   ObjectUtils.isNotEmpty(new int[]{})      = false
   ObjectUtils.isNotEmpty(new int[]{1,2,3}) = true
   ObjectUtils.isNotEmpty(1234)             = true

  object - the Object to test, may be null - `java.lang.Object`

  returns: true if the object has an unsupported type or is not empty
   and not null, false otherwise - `boolean`"
  (^Boolean [^java.lang.Object object]
    (ObjectUtils/isNotEmpty object)))

(defn *const-byte
  "This method returns the provided value unchanged.
   This can prevent javac from inlining a constant
   field, e.g.,



       public final static byte MAGIC_BYTE = ObjectUtils.CONST_BYTE(127);

   This way any jars that refer to this field do not
   have to recompile themselves if the field's value
   changes at some future date.

  v - the byte literal (as an int) value to return - `int`

  returns: the byte v, unchanged - `byte`

  throws: java.lang.IllegalArgumentException - if the value passed to v is larger than a byte, that is, smaller than -128 or larger than 127."
  (^Byte [^Integer v]
    (ObjectUtils/CONST_BYTE v)))

(defn *first-non-null
  "Returns the first value in the array which is not null.
   If all the values are null or the array is null
   or empty then null is returned.



   ObjectUtils.firstNonNull(null, null)      = null
   ObjectUtils.firstNonNull(null, \"\")        = \"\"
   ObjectUtils.firstNonNull(null, null, \"\")  = \"\"
   ObjectUtils.firstNonNull(null, \"zz\")      = \"zz\"
   ObjectUtils.firstNonNull(\"abc\", *)        = \"abc\"
   ObjectUtils.firstNonNull(null, \"xyz\", *)  = \"xyz\"
   ObjectUtils.firstNonNull(Boolean.TRUE, *) = Boolean.TRUE
   ObjectUtils.firstNonNull()                = null

  values - the values to test, may be null or empty - `T`

  returns: the first value from values which is not null,
    or null if there are no non-null values - `<T> T`"
  ([values]
    (ObjectUtils/firstNonNull values)))

(defn *clone-if-possible
  "Clone an object if possible.

   This method is similar to clone(Object), but will return the provided
   instance as the return value instead of null if the instance
   is not cloneable. This is more convenient if the caller uses different
   implementations (e.g. of a service) and some of the implementations do not allow concurrent
   processing or have state. In such cases the implementation can simply provide a proper
   clone implementation and the caller's code does not have to change.

  obj - the object to clone, null returns null - `T`

  returns: the clone if the object implements Cloneable otherwise the object itself - `<T> T`

  throws: org.apache.commons.lang3.exception.CloneFailedException - if the object is cloneable and the clone operation fails"
  ([obj]
    (ObjectUtils/cloneIfPossible obj)))

(defn *clone
  "Clone an object.

  obj - the object to clone, null returns null - `T`

  returns: the clone if the object implements Cloneable otherwise null - `<T> T`

  throws: org.apache.commons.lang3.exception.CloneFailedException - if the object is cloneable and the clone operation fails"
  ([obj]
    (ObjectUtils/clone obj)))

(defn *const-short
  "This method returns the provided value unchanged.
   This can prevent javac from inlining a constant
   field, e.g.,



       public final static short MAGIC_SHORT = ObjectUtils.CONST_SHORT(127);

   This way any jars that refer to this field do not
   have to recompile themselves if the field's value
   changes at some future date.

  v - the short literal (as an int) value to return - `int`

  returns: the byte v, unchanged - `short`

  throws: java.lang.IllegalArgumentException - if the value passed to v is larger than a short, that is, smaller than -32768 or larger than 32767."
  (^Short [^Integer v]
    (ObjectUtils/CONST_SHORT v)))

(defn *hash-code
  "Deprecated. this method has been replaced by java.util.Objects.hashCode(Object) in Java 7 and will be
   removed in future releases

  obj - the object to obtain the hash code of, may be null - `java.lang.Object`

  returns: the hash code of the object, or zero if null - `int`"
  (^Integer [^java.lang.Object obj]
    (ObjectUtils/hashCode obj)))

(defn *empty?
  "Checks if an Object is empty or null.

   The following types are supported:

   CharSequence: Considered empty if its length is zero.
   Array: Considered empty if its length is zero.
   Collection: Considered empty if it has zero elements.
   Map: Considered empty if it has zero key-value mappings.




   ObjectUtils.isEmpty(null)             = true
   ObjectUtils.isEmpty(\"\")               = true
   ObjectUtils.isEmpty(\"ab\")             = false
   ObjectUtils.isEmpty(new int[]{})      = true
   ObjectUtils.isEmpty(new int[]{1,2,3}) = false
   ObjectUtils.isEmpty(1234)             = false

  object - the Object to test, may be null - `java.lang.Object`

  returns: true if the object has a supported type and is empty or null,
   false otherwise - `boolean`"
  (^Boolean [^java.lang.Object object]
    (ObjectUtils/isEmpty object)))

(defn *default-if-null
  "Returns a default value if the object passed is null.



   ObjectUtils.defaultIfNull(null, null)      = null
   ObjectUtils.defaultIfNull(null, \"\")        = \"\"
   ObjectUtils.defaultIfNull(null, \"zz\")      = \"zz\"
   ObjectUtils.defaultIfNull(\"abc\", *)        = \"abc\"
   ObjectUtils.defaultIfNull(Boolean.TRUE, *) = Boolean.TRUE

  object - the Object to test, may be null - `T`
  default-value - the default value to return, may be null - `T`

  returns: object if it is not null, defaultValue otherwise - `<T> T`"
  ([object default-value]
    (ObjectUtils/defaultIfNull object default-value)))

(defn *equals
  "Deprecated. this method has been replaced by java.util.Objects.equals(Object, Object) in Java 7 and will
   be removed from future releases.

  object-1 - the first object, may be null - `java.lang.Object`
  object-2 - the second object, may be null - `java.lang.Object`

  returns: true if the values of both objects are the same - `boolean`"
  (^Boolean [^java.lang.Object object-1 ^java.lang.Object object-2]
    (ObjectUtils/equals object-1 object-2)))

(defn *identity-to-string
  "Appends the toString that would be produced by Object
   if a class did not override toString itself. null
   will throw a NullPointerException for either of the two parameters.



   ObjectUtils.identityToString(appendable, \"\")            = appendable.append(\"java.lang.String@1e23\"
   ObjectUtils.identityToString(appendable, Boolean.TRUE)  = appendable.append(\"java.lang.Boolean@7fa\"
   ObjectUtils.identityToString(appendable, Boolean.TRUE)  = appendable.append(\"java.lang.Boolean@7fa\")

  appendable - the appendable to append to - `java.lang.Appendable`
  object - the object to create a toString for - `java.lang.Object`

  throws: java.io.IOException - if an I/O error occurs"
  ([^java.lang.Appendable appendable ^java.lang.Object object]
    (ObjectUtils/identityToString appendable object))
  (^java.lang.String [^java.lang.Object object]
    (ObjectUtils/identityToString object)))

(defn *median
  "Find the \"best guess\" middle value among comparables. If there is an even
   number of total values, the lower of the two middle values will be returned.

  comparator - to use for comparisons - `java.util.Comparator`
  items - to compare - `T`

  returns: T at middle position - `<T> T`

  throws: java.lang.NullPointerException - if items or comparator is null"
  ([^java.util.Comparator comparator items]
    (ObjectUtils/median comparator items))
  ([items]
    (ObjectUtils/median items)))

