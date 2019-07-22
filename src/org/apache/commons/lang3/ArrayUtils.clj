(ns org.apache.commons.lang3.ArrayUtils
  "Operations on arrays, primitive arrays (like int[]) and
  primitive wrapper arrays (like Integer[]).

  This class tries to handle null input gracefully.
  An exception will not be thrown for a null
  array input. However, an Object array that contains a null
  element may throw an exception. Each method documents its behaviour.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ArrayUtils]))

(defn ->array-utils
  "Constructor.

  ArrayUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as ArrayUtils.clone(new int[] {2}).

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^ArrayUtils []
    (new ArrayUtils )))

(def *-empty-object-array
  "Static Constant.

  An empty immutable Object array.

  type: java.lang.Object[]"
  ArrayUtils/EMPTY_OBJECT_ARRAY)

(def *-empty-class-array
  "Static Constant.

  An empty immutable Class array.

  type: java.lang.Class<?>[]"
  ArrayUtils/EMPTY_CLASS_ARRAY)

(def *-empty-string-array
  "Static Constant.

  An empty immutable String array.

  type: java.lang.String[]"
  ArrayUtils/EMPTY_STRING_ARRAY)

(def *-empty-long-array
  "Static Constant.

  An empty immutable long array.

  type: long[]"
  ArrayUtils/EMPTY_LONG_ARRAY)

(def *-empty-long-object-array
  "Static Constant.

  An empty immutable Long array.

  type: java.lang.Long[]"
  ArrayUtils/EMPTY_LONG_OBJECT_ARRAY)

(def *-empty-int-array
  "Static Constant.

  An empty immutable int array.

  type: int[]"
  ArrayUtils/EMPTY_INT_ARRAY)

(def *-empty-integer-object-array
  "Static Constant.

  An empty immutable Integer array.

  type: java.lang.Integer[]"
  ArrayUtils/EMPTY_INTEGER_OBJECT_ARRAY)

(def *-empty-short-array
  "Static Constant.

  An empty immutable short array.

  type: short[]"
  ArrayUtils/EMPTY_SHORT_ARRAY)

(def *-empty-short-object-array
  "Static Constant.

  An empty immutable Short array.

  type: java.lang.Short[]"
  ArrayUtils/EMPTY_SHORT_OBJECT_ARRAY)

(def *-empty-byte-array
  "Static Constant.

  An empty immutable byte array.

  type: byte[]"
  ArrayUtils/EMPTY_BYTE_ARRAY)

(def *-empty-byte-object-array
  "Static Constant.

  An empty immutable Byte array.

  type: java.lang.Byte[]"
  ArrayUtils/EMPTY_BYTE_OBJECT_ARRAY)

(def *-empty-double-array
  "Static Constant.

  An empty immutable double array.

  type: double[]"
  ArrayUtils/EMPTY_DOUBLE_ARRAY)

(def *-empty-double-object-array
  "Static Constant.

  An empty immutable Double array.

  type: java.lang.Double[]"
  ArrayUtils/EMPTY_DOUBLE_OBJECT_ARRAY)

(def *-empty-float-array
  "Static Constant.

  An empty immutable float array.

  type: float[]"
  ArrayUtils/EMPTY_FLOAT_ARRAY)

(def *-empty-float-object-array
  "Static Constant.

  An empty immutable Float array.

  type: java.lang.Float[]"
  ArrayUtils/EMPTY_FLOAT_OBJECT_ARRAY)

(def *-empty-boolean-array
  "Static Constant.

  An empty immutable boolean array.

  type: boolean[]"
  ArrayUtils/EMPTY_BOOLEAN_ARRAY)

(def *-empty-boolean-object-array
  "Static Constant.

  An empty immutable Boolean array.

  type: java.lang.Boolean[]"
  ArrayUtils/EMPTY_BOOLEAN_OBJECT_ARRAY)

(def *-empty-char-array
  "Static Constant.

  An empty immutable char array.

  type: char[]"
  ArrayUtils/EMPTY_CHAR_ARRAY)

(def *-empty-character-object-array
  "Static Constant.

  An empty immutable Character array.

  type: java.lang.Character[]"
  ArrayUtils/EMPTY_CHARACTER_OBJECT_ARRAY)

(def *-index-not-found
  "Static Constant.

  The index value when an element is not found in a list or array: -1.
   This value is returned by methods in this class and can also be used in comparisons with values returned by
   various method from List.

  type: int"
  ArrayUtils/INDEX_NOT_FOUND)

(defn *add-all
  "Adds all the elements of the given arrays into a new array.
   The new array contains all of the element of array1 followed
   by all of the elements array2. When an array is returned, it is always
   a new array.



   ArrayUtils.addAll(null, null)     = null
   ArrayUtils.addAll(array1, null)   = cloned copy of array1
   ArrayUtils.addAll(null, array2)   = cloned copy of array2
   ArrayUtils.addAll([], [])         = []
   ArrayUtils.addAll([null], [null]) = [null, null]
   ArrayUtils.addAll([\"a\", \"b\", \"c\"], [\"1\", \"2\", \"3\"]) = [\"a\", \"b\", \"c\", \"1\", \"2\", \"3\"]

  array-1 - the first array whose elements are added to the new array, may be null - `T[]`
  array-2 - the second array whose elements are added to the new array, may be null - `T`

  returns: The new array, null if both arrays are null.
        The type of the new array is the type of the first array,
        unless the first array is null, in which case the type is the same as the second array. - `<T> T[]`

  throws: java.lang.IllegalArgumentException - if the array types are incompatible"
  ([array-1 array-2]
    (ArrayUtils/addAll array-1 array-2)))

(defn *subarray
  "Produces a new array containing the elements between
   the start and end indices.

   The start index is inclusive, the end index exclusive.
   Null array input produces null output.

   The component type of the subarray is always the same as
   that of the input array. Thus, if the input is an array of type
   Date, the following usage is envisaged:



   Date[] someDates = (Date[]) ArrayUtils.subarray(allDates, 2, 5);

  array - the array - `T[]`
  start-index-inclusive - the starting index. Undervalue (<0) is promoted to 0, overvalue (>array.length) results in an empty array. - `int`
  end-index-exclusive - elements up to endIndex-1 are present in the returned subarray. Undervalue (< startIndex) produces empty array, overvalue (>array.length) is demoted to array length. - `int`

  returns: a new array containing the elements between
        the start and end indices. - `<T> T[]`"
  ([array ^Integer start-index-inclusive ^Integer end-index-exclusive]
    (ArrayUtils/subarray array start-index-inclusive end-index-exclusive)))

(defn *to-object
  "Converts an array of primitive chars to objects.

   This method returns null for a null input array.

  array - a char array - `char[]`

  returns: a Character array, null if null array input - `java.lang.Character[]`"
  ([array]
    (ArrayUtils/toObject array)))

(defn *reverse
  "Reverses the order of the given array in the given range.


   This method does nothing for a null input array.

  array - the array to reverse, may be null - `boolean[]`
  start-index-inclusive - the starting index. Undervalue (<0) is promoted to 0, overvalue (>array.length) results in no change. - `int`
  end-index-exclusive - elements up to endIndex-1 are reversed in the array. Undervalue (< start index) results in no change. Overvalue (>array.length) is demoted to array length. - `int`"
  ([array ^Integer start-index-inclusive ^Integer end-index-exclusive]
    (ArrayUtils/reverse array start-index-inclusive end-index-exclusive))
  ([array]
    (ArrayUtils/reverse array)))

(defn *contains
  "Checks if a value falling within the given tolerance is in the
   given array.  If the array contains a value within the inclusive range
   defined by (value - tolerance) to (value  tolerance).

   The method returns false if a null array
   is passed in.

  array - the array to search - `double[]`
  value-to-find - the value to find - `double`
  tolerance - the array contains the tolerance of the search - `double`

  returns: true if value falling within tolerance is in array - `boolean`"
  (^Boolean [array ^Double value-to-find ^Double tolerance]
    (ArrayUtils/contains array value-to-find tolerance))
  (^Boolean [array ^java.lang.Object object-to-find]
    (ArrayUtils/contains array object-to-find)))

(defn *to-primitive
  "Converts an array of object Character to primitives handling null.

   This method returns null for a null input array.

  array - a Character array, may be null - `java.lang.Character[]`
  value-for-null - the value to insert if null found - `char`

  returns: a char array, null if null array input - `char[]`"
  ([array ^Character value-for-null]
    (ArrayUtils/toPrimitive array value-for-null))
  ([array]
    (ArrayUtils/toPrimitive array)))

(defn *to-string
  "Outputs an array as a String handling nulls.

   Multi-dimensional arrays are handled correctly, including
   multi-dimensional primitive arrays.

   The format is that of Java source code, for example {a,b}.

  array - the array to get a toString for, may be null - `java.lang.Object`
  string-if-null - the String to return if the array is null - `java.lang.String`

  returns: a String representation of the array - `java.lang.String`"
  (^java.lang.String [^java.lang.Object array ^java.lang.String string-if-null]
    (ArrayUtils/toString array string-if-null))
  (^java.lang.String [^java.lang.Object array]
    (ArrayUtils/toString array)))

(defn *shuffle
  "Randomly permutes the elements of the specified array using the Fisher-Yates algorithm.

  array - the array to shuffle - `java.lang.Object[]`
  random - the source of randomness used to permute the elements - `java.util.Random`"
  ([array ^java.util.Random random]
    (ArrayUtils/shuffle array random))
  ([array]
    (ArrayUtils/shuffle array)))

(defn *remove-all-occurences
  "Removes the occurrences of the specified element from the specified boolean array.


   All subsequent elements are shifted to the left (subtracts one from their indices).
   If the array doesn't contains such an element, no elements are removed from the array.
   null will be returned if the input array is null.

  array - the input array - `boolean[]`
  element - the element to remove - `boolean`

  returns: A new array containing the existing elements except the occurrences of the specified element. - `boolean[]`"
  ([array ^Boolean element]
    (ArrayUtils/removeAllOccurences array element)))

(defn *same-type?
  "Checks whether two arrays are the same type taking into account
   multi-dimensional arrays.

  array-1 - the first array, must not be null - `java.lang.Object`
  array-2 - the second array, must not be null - `java.lang.Object`

  returns: true if type of arrays matches - `boolean`

  throws: java.lang.IllegalArgumentException - if either array is null"
  (^Boolean [^java.lang.Object array-1 ^java.lang.Object array-2]
    (ArrayUtils/isSameType array-1 array-2)))

(defn *same-length?
  "Checks whether two arrays are the same length, treating
   null arrays as length 0.

   Any multi-dimensional aspects of the arrays are ignored.

  array-1 - the first array, may be null - `java.lang.Object[]`
  array-2 - the second array, may be null - `java.lang.Object[]`

  returns: true if length of arrays matches, treating
    null as an empty array - `boolean`"
  (^Boolean [array-1 array-2]
    (ArrayUtils/isSameLength array-1 array-2)))

(defn *to-string-array
  "Returns an array containing the string representation of each element in the argument
   array handling null elements.

   This method returns null for a null input array.

  array - the Object[] to be processed, may be null - `java.lang.Object[]`
  value-for-null-elements - the value to insert if null is found - `java.lang.String`

  returns: a String array, null if null array input - `java.lang.String[]`"
  ([array ^java.lang.String value-for-null-elements]
    (ArrayUtils/toStringArray array value-for-null-elements))
  ([array]
    (ArrayUtils/toStringArray array)))

(defn *last-index-of
  "Finds the last index of the given value in the array starting at the given index.
   This method will return the index of the last value which falls between the region
   defined by valueToFind - tolerance and valueToFind  tolerance.

   This method returns INDEX_NOT_FOUND (-1) for a null input array.

   A negative startIndex will return INDEX_NOT_FOUND (-1). A startIndex larger than the
   array length will search from the end of the array.

  array - the array to traverse for looking for the object, may be null - `double[]`
  value-to-find - the value to find - `double`
  start-index - the start index to traverse backwards from - `int`
  tolerance - search for value within plus/minus this amount - `double`

  returns: the last index of the value within the array,
    INDEX_NOT_FOUND (-1) if not found or null array input - `int`"
  (^Integer [array ^Double value-to-find ^Integer start-index ^Double tolerance]
    (ArrayUtils/lastIndexOf array value-to-find start-index tolerance))
  (^Integer [array ^java.lang.Object object-to-find ^Integer start-index]
    (ArrayUtils/lastIndexOf array object-to-find start-index))
  (^Integer [array ^java.lang.Object object-to-find]
    (ArrayUtils/lastIndexOf array object-to-find)))

(defn *shift
  "Shifts the order of a series of elements in the given boolean array.

   There is no special handling for multi-dimensional arrays. This method
   does nothing for null or empty input arrays.

  array - the array to shift, may be null - `boolean[]`
  start-index-inclusive - the starting index. Undervalue (<0) is promoted to 0, overvalue (>array.length) results in no change. - `int`
  end-index-exclusive - elements up to endIndex-1 are shifted in the array. Undervalue (< start index) results in no change. Overvalue (>array.length) is demoted to array length. - `int`
  offset - The number of positions to rotate the elements. If the offset is larger than the number of elements to rotate, than the effective offset is modulo the number of elements to rotate. - `int`"
  ([array ^Integer start-index-inclusive ^Integer end-index-exclusive ^Integer offset]
    (ArrayUtils/shift array start-index-inclusive end-index-exclusive offset))
  ([array ^Integer offset]
    (ArrayUtils/shift array offset)))

(defn *remove-element
  "Removes the first occurrence of the specified element from the
   specified array. All subsequent elements are shifted to the left
   (subtracts one from their indices). If the array doesn't contains
   such an element, no elements are removed from the array.

   This method returns a new array with the same elements of the input
   array except the first occurrence of the specified element. The component
   type of the returned array is always the same as that of the input
   array.



   ArrayUtils.removeElement(null, \"a\")            = null
   ArrayUtils.removeElement([], \"a\")              = []
   ArrayUtils.removeElement([\"a\"], \"b\")           = [\"a\"]
   ArrayUtils.removeElement([\"a\", \"b\"], \"a\")      = [\"b\"]
   ArrayUtils.removeElement([\"a\", \"b\", \"a\"], \"a\") = [\"b\", \"a\"]

  array - the array to remove the element from, may be null - `T[]`
  element - the element to be removed - `java.lang.Object`

  returns: A new array containing the existing elements except the first
           occurrence of the specified element. - `<T> T[]`"
  ([array ^java.lang.Object element]
    (ArrayUtils/removeElement array element)))

(defn *is-not-empty
  "Checks if an array of Objects is not empty and not null.

  array - the array to test - `T[]`

  returns: true if the array is not empty and not null - `<T> boolean`"
  ([array]
    (ArrayUtils/isNotEmpty array)))

(defn *null-to-empty
  "Defensive programming technique to change a null
   reference to an empty one.

   This method returns an empty array for a null input array.

  array - the array to check for null or empty - `T[]`
  type - the class representation of the desired array - `java.lang.Class`

  returns: the same array, public static empty array if null - `<T> T[]`

  throws: java.lang.IllegalArgumentException - if the type argument is null"
  ([array ^java.lang.Class type]
    (ArrayUtils/nullToEmpty array type))
  ([array]
    (ArrayUtils/nullToEmpty array)))

(defn *is-array-index-valid
  "Returns whether a given array can safely be accessed at the given index.

  array - the array to inspect, may be null - `T[]`
  index - the index of the array to be inspected - `int`

  returns: Whether the given index is safely-accessible in the given array - `<T> boolean`"
  ([array ^Integer index]
    (ArrayUtils/isArrayIndexValid array index)))

(defn *is-sorted
  "This method checks whether the provided array is sorted according to the provided Comparator.

  array - the array to check - `T[]`
  comparator - the Comparator to compare over - `java.util.Comparator`

  returns: whether the array is sorted - `<T> boolean`"
  ([array ^java.util.Comparator comparator]
    (ArrayUtils/isSorted array comparator))
  ([array]
    (ArrayUtils/isSorted array)))

(defn *remove
  "Removes the element at the specified position from the specified array.
   All subsequent elements are shifted to the left (subtracts one from
   their indices).

   This method returns a new array with the same elements of the input
   array except the element on the specified position. The component
   type of the returned array is always the same as that of the input
   array.

   If the input array is null, an IndexOutOfBoundsException
   will be thrown, because in that case no valid index can be specified.



   ArrayUtils.remove([\"a\"], 0)           = []
   ArrayUtils.remove([\"a\", \"b\"], 0)      = [\"b\"]
   ArrayUtils.remove([\"a\", \"b\"], 1)      = [\"a\"]
   ArrayUtils.remove([\"a\", \"b\", \"c\"], 1) = [\"a\", \"c\"]

  array - the array to remove the element from, may not be null - `T[]`
  index - the position of the element to be removed - `int`

  returns: A new array containing the existing elements except the element
           at the specified position. - `<T> T[]`

  throws: java.lang.IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= array.length), or if the array is null."
  ([array ^Integer index]
    (ArrayUtils/remove array index)))

(defn *to-map
  "Converts the given array into a Map. Each element of the array
   must be either a Map.Entry or an Array, containing at least two
   elements, where the first element is used as key and the second as
   value.

   This method can be used to initialize:


   // Create a Map mapping colors.
   Map colorMap = ArrayUtils.toMap(new String[][] {
       {\"RED\", \"#FF0000\"},
       {\"GREEN\", \"#00FF00\"},
       {\"BLUE\", \"#0000FF\"}});

   This method returns null for a null input array.

  array - an array whose elements are either a Map.Entry or an Array containing at least two elements, may be null - `java.lang.Object[]`

  returns: a Map that was created from the array - `java.util.Map<java.lang.Object,java.lang.Object>`

  throws: java.lang.IllegalArgumentException - if the array contains elements other than Map.Entry and an Array"
  (^java.util.Map [array]
    (ArrayUtils/toMap array)))

(defn *get-length
  "Returns the length of the specified array.
   This method can deal with Object arrays and with primitive arrays.

   If the input array is null, 0 is returned.



   ArrayUtils.getLength(null)            = 0
   ArrayUtils.getLength([])              = 0
   ArrayUtils.getLength([null])          = 1
   ArrayUtils.getLength([true, false])   = 2
   ArrayUtils.getLength([1, 2, 3])       = 3
   ArrayUtils.getLength([\"a\", \"b\", \"c\"]) = 3

  array - the array to retrieve the length from, may be null - `java.lang.Object`

  returns: The length of the array, or 0 if the array is null - `int`

  throws: java.lang.IllegalArgumentException - if the object argument is not an array."
  (^Integer [^java.lang.Object array]
    (ArrayUtils/getLength array)))

(defn *equals?
  "Deprecated. this method has been replaced by java.util.Objects.deepEquals(Object, Object) and will be
   removed from future releases.

  array-1 - the left hand array to compare, may be null - `java.lang.Object`
  array-2 - the right hand array to compare, may be null - `java.lang.Object`

  returns: true if the arrays are equal - `boolean`"
  (^Boolean [^java.lang.Object array-1 ^java.lang.Object array-2]
    (ArrayUtils/isEquals array-1 array-2)))

(defn *insert
  "Inserts elements into an array at the given index (starting from zero).

   When an array is returned, it is always a new array.



   ArrayUtils.insert(index, null, null)      = null
   ArrayUtils.insert(index, array, null)     = cloned copy of 'array'
   ArrayUtils.insert(index, null, values)    = null

  index - the position within array to insert the new values - `int`
  array - the array to insert the values into, may be null - `boolean[]`
  values - the new values to insert, may be null - `boolean`

  returns: The new array. - `boolean[]`

  throws: java.lang.IndexOutOfBoundsException - if array is provided and either index < 0 or index > array.length"
  ([^Integer index array ^Boolean values]
    (ArrayUtils/insert index array values)))

(defn *clone
  "Shallow clones an array returning a typecast result and handling
   null.

   The objects in the array are not cloned, thus there is no special
   handling for multi-dimensional arrays.

   This method returns null for a null input array.

  array - the array to shallow clone, may be null - `T[]`

  returns: the cloned array, null if null input - `<T> T[]`"
  ([array]
    (ArrayUtils/clone array)))

(defn *remove-elements
  "Removes occurrences of specified elements, in specified quantities,
   from the specified array. All subsequent elements are shifted left.
   For any element-to-be-removed specified in greater quantities than
   contained in the original array, no change occurs beyond the
   removal of the existing matching items.

   This method returns a new array with the same elements of the input
   array except for the earliest-encountered occurrences of the specified
   elements. The component type of the returned array is always the same
   as that of the input array.



   ArrayUtils.removeElements(null, \"a\", \"b\")            = null
   ArrayUtils.removeElements([], \"a\", \"b\")              = []
   ArrayUtils.removeElements([\"a\"], \"b\", \"c\")           = [\"a\"]
   ArrayUtils.removeElements([\"a\", \"b\"], \"a\", \"c\")      = [\"b\"]
   ArrayUtils.removeElements([\"a\", \"b\", \"a\"], \"a\")      = [\"b\", \"a\"]
   ArrayUtils.removeElements([\"a\", \"b\", \"a\"], \"a\", \"a\") = [\"b\"]

  array - the array to remove the element from, may be null - `T[]`
  values - the elements to be removed - `T`

  returns: A new array containing the existing elements except the
           earliest-encountered occurrences of the specified elements. - `<T> T[]`"
  ([array values]
    (ArrayUtils/removeElements array values)))

(defn *hash-code
  "Get a hash code for an array handling multi-dimensional arrays correctly.

   Multi-dimensional primitive arrays are also handled correctly by this method.

  array - the array to get a hash code for, null returns zero - `java.lang.Object`

  returns: a hash code for the array - `int`"
  (^Integer [^java.lang.Object array]
    (ArrayUtils/hashCode array)))

(defn *add
  "Deprecated. this method has been superseded by insert(int, T[], T...) and
   may be removed in a future release. Please note the handling of null input arrays differs
   in the new method: inserting X into a null array results in null not X.

  array - the array to add the element to, may be null - `T[]`
  index - the position of the new object - `int`
  element - the object to add - `T`

  returns: A new array containing the existing elements and the new element - `<T> T[]`

  throws: java.lang.IndexOutOfBoundsException - if the index is out of range (index < 0 || index > array.length)."
  ([array ^Integer index element]
    (ArrayUtils/add array index element))
  ([array element]
    (ArrayUtils/add array element)))

(defn *empty?
  "Checks if an array of Objects is empty or null.

  array - the array to test - `java.lang.Object[]`

  returns: true if the array is empty or null - `boolean`"
  (^Boolean [array]
    (ArrayUtils/isEmpty array)))

(defn *index-of
  "Finds the index of the given value in the array starting at the given index.
   This method will return the index of the first value which falls between the region
   defined by valueToFind - tolerance and valueToFind  tolerance.

   This method returns INDEX_NOT_FOUND (-1) for a null input array.

   A negative startIndex is treated as zero. A startIndex larger than the array
   length will return INDEX_NOT_FOUND (-1).

  array - the array to search through for the object, may be null - `double[]`
  value-to-find - the value to find - `double`
  start-index - the index to start searching at - `int`
  tolerance - tolerance of the search - `double`

  returns: the index of the value within the array,
    INDEX_NOT_FOUND (-1) if not found or null array input - `int`"
  (^Integer [array ^Double value-to-find ^Integer start-index ^Double tolerance]
    (ArrayUtils/indexOf array value-to-find start-index tolerance))
  (^Integer [array ^java.lang.Object object-to-find ^Integer start-index]
    (ArrayUtils/indexOf array object-to-find start-index))
  (^Integer [array ^java.lang.Object object-to-find]
    (ArrayUtils/indexOf array object-to-find)))

(defn *to-array
  "Create a type-safe generic array.

   The Java language does not allow an array to be created from a generic type:



      public static <T> T[] createAnArray(int size) {
          return new T[size]; // compiler error here
      }
      public static <T> T[] createAnArray(int size) {
          return (T[]) new Object[size]; // ClassCastException at runtime
      }

   Therefore new arrays of generic types can be created with this method.
   For example, an array of Strings can be created:



      String[] array = ArrayUtils.toArray(\"1\", \"2\");
      String[] emptyArray = ArrayUtils.<String>toArray();

   The method is typically used in scenarios, where the caller itself uses generic types
   that have to be combined into an array.

   Note, this method makes only sense to provide arguments of the same type so that the
   compiler can deduce the type of the array itself. While it is possible to select the
   type explicitly like in
   Number[] array = ArrayUtils.<Number>toArray(Integer.valueOf(42), Double.valueOf(Math.PI)),
   there is no real advantage when compared to
   new Number[] {Integer.valueOf(42), Double.valueOf(Math.PI)}.

  items - the varargs array items, null allowed - `T`

  returns: the array, not null unless a null array is passed in - `<T> T[]`"
  ([items]
    (ArrayUtils/toArray items)))

(defn *remove-all
  "Removes the elements at the specified positions from the specified array.
   All remaining elements are shifted to the left.

   This method returns a new array with the same elements of the input
   array except those at the specified positions. The component
   type of the returned array is always the same as that of the input
   array.

   If the input array is null, an IndexOutOfBoundsException
   will be thrown, because in that case no valid index can be specified.



   ArrayUtils.removeAll([\"a\", \"b\", \"c\"], 0, 2) = [\"b\"]
   ArrayUtils.removeAll([\"a\", \"b\", \"c\"], 1, 2) = [\"a\"]

  array - the array to remove the element from, may not be null - `T[]`
  indices - the positions of the elements to be removed - `int`

  returns: A new array containing the existing elements except those
           at the specified positions. - `<T> T[]`

  throws: java.lang.IndexOutOfBoundsException - if any index is out of range (index < 0 || index >= array.length), or if the array is null."
  ([array ^Integer indices]
    (ArrayUtils/removeAll array indices)))

(defn *swap
  "Swaps a series of elements in the given boolean array.

   This method does nothing for a null or empty input array or
   for overflow indices. Negative indices are promoted to 0(zero). If any
   of the sub-arrays to swap falls outside of the given array, then the
   swap is stopped at the end of the array and as many as possible elements
   are swapped.

   Examples:

       ArrayUtils.swap([true, false, true, false], 0, 2, 1) -> [true, false, true, false]
       ArrayUtils.swap([true, false, true, false], 0, 0, 1) -> [true, false, true, false]
       ArrayUtils.swap([true, false, true, false], 0, 2, 2) -> [true, false, true, false]
       ArrayUtils.swap([true, false, true, false], -3, 2, 2) -> [true, false, true, false]
       ArrayUtils.swap([true, false, true, false], 0, 3, 3) -> [false, false, true, true]

  array - the array to swap, may be null - `boolean[]`
  offset-1 - the index of the first element in the series to swap - `int`
  offset-2 - the index of the second element in the series to swap - `int`
  len - the number of elements to swap starting with the given indices - `int`"
  ([array ^Integer offset-1 ^Integer offset-2 ^Integer len]
    (ArrayUtils/swap array offset-1 offset-2 len))
  ([array ^Integer offset-1 ^Integer offset-2]
    (ArrayUtils/swap array offset-1 offset-2)))

