(ns org.apache.commons.lang3.EnumUtils
  "Utility library to provide helper methods for Java enums.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 EnumUtils]))

(defn ->enum-utils
  "Constructor.

  This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^EnumUtils []
    (new EnumUtils )))

(defn *process-bit-vector
  "Convert a long value created by generateBitVector(java.lang.Class<E>, java.lang.Iterable<? extends E>) into the set of
   enum values that it represents.

   If you store this value, beware any changes to the enum that would affect ordinal values.

  enum-class - the class of the enum we are working with, not null - `java.lang.Class`
  value - the long value representation of a set of enum values - `long`

  returns: a set of enum values - `<E extends java.lang.Enum<E>> java.util.EnumSet<E>`

  throws: java.lang.NullPointerException - if enumClass is null"
  ([^java.lang.Class enum-class ^Long value]
    (EnumUtils/processBitVector enum-class value)))

(defn *generate-bit-vectors
  "Creates a bit vector representation of the given subset of an Enum using as many longs as needed.

   This generates a value that is usable by processBitVectors(java.lang.Class<E>, long...).

   Use this method if you have more than 64 values in your Enum.

  enum-class - the class of the enum we are working with, not null - `java.lang.Class`
  values - the values we want to convert, not null, neither containing null - `java.lang.Iterable`

  returns: a long[] whose values provide a binary representation of the given set of enum values
           with least significant digits rightmost. - `<E extends java.lang.Enum<E>> long[]`

  throws: java.lang.NullPointerException - if enumClass or values is null"
  ([^java.lang.Class enum-class ^java.lang.Iterable values]
    (EnumUtils/generateBitVectors enum-class values)))

(defn *is-valid-enum
  "Checks if the specified name is a valid enum for the class.

   This method differs from Enum.valueOf(java.lang.Class<T>, java.lang.String) in that checks if the name is
   a valid enum without needing to catch the exception.

  enum-class - the class of the enum to query, not null - `java.lang.Class`
  enum-name - the enum name, null returns false - `java.lang.String`

  returns: true if the enum name is valid, otherwise false - `<E extends java.lang.Enum<E>> boolean`"
  ([^java.lang.Class enum-class ^java.lang.String enum-name]
    (EnumUtils/isValidEnum enum-class enum-name)))

(defn *generate-bit-vector
  "Creates a long bit vector representation of the given subset of an Enum.

   This generates a value that is usable by processBitVector(java.lang.Class<E>, long).

   Do not use this method if you have more than 64 values in your Enum, as this
   would create a value greater than a long can hold.

  enum-class - the class of the enum we are working with, not null - `java.lang.Class`
  values - the values we want to convert, not null, neither containing null - `java.lang.Iterable`

  returns: a long whose value provides a binary representation of the given set of enum values. - `<E extends java.lang.Enum<E>> long`

  throws: java.lang.NullPointerException - if enumClass or values is null"
  ([^java.lang.Class enum-class ^java.lang.Iterable values]
    (EnumUtils/generateBitVector enum-class values)))

(defn *is-valid-enum-ignore-case
  "Checks if the specified name is a valid enum for the class.

   This method differs from Enum.valueOf(java.lang.Class<T>, java.lang.String) in that checks if the name is
   a valid enum without needing to catch the exception
   and performs case insensitive matching of the name.

  enum-class - the class of the enum to query, not null - `java.lang.Class`
  enum-name - the enum name, null returns false - `java.lang.String`

  returns: true if the enum name is valid, otherwise false - `<E extends java.lang.Enum<E>> boolean`"
  ([^java.lang.Class enum-class ^java.lang.String enum-name]
    (EnumUtils/isValidEnumIgnoreCase enum-class enum-name)))

(defn *get-enum
  "Gets the enum for the class, returning null if not found.

   This method differs from Enum.valueOf(java.lang.Class<T>, java.lang.String) in that it does not throw an exception
   for an invalid enum name.

  enum-class - the class of the enum to query, not null - `java.lang.Class`
  enum-name - the enum name, null returns null - `java.lang.String`

  returns: the enum, null if not found - `<E extends java.lang.Enum<E>> E`"
  ([^java.lang.Class enum-class ^java.lang.String enum-name]
    (EnumUtils/getEnum enum-class enum-name)))

(defn *get-enum-ignore-case
  "Gets the enum for the class, returning null if not found.

   This method differs from Enum.valueOf(java.lang.Class<T>, java.lang.String) in that it does not throw an exception
   for an invalid enum name and performs case insensitive matching of the name.

  enum-class - the class of the enum to query, not null - `java.lang.Class`
  enum-name - the enum name, null returns null - `java.lang.String`

  returns: the enum, null if not found - `<E extends java.lang.Enum<E>> E`"
  ([^java.lang.Class enum-class ^java.lang.String enum-name]
    (EnumUtils/getEnumIgnoreCase enum-class enum-name)))

(defn *get-enum-map
  "Gets the Map of enums by name.

   This method is useful when you need a map of enums by name.

  enum-class - the class of the enum to query, not null - `java.lang.Class`

  returns: the modifiable map of enum names to enums, never null - `<E extends java.lang.Enum<E>> java.util.Map<java.lang.String,E>`"
  ([^java.lang.Class enum-class]
    (EnumUtils/getEnumMap enum-class)))

(defn *get-enum-list
  "Gets the List of enums.

   This method is useful when you need a list of enums rather than an array.

  enum-class - the class of the enum to query, not null - `java.lang.Class`

  returns: the modifiable list of enums, never null - `<E extends java.lang.Enum<E>> java.util.List<E>`"
  ([^java.lang.Class enum-class]
    (EnumUtils/getEnumList enum-class)))

(defn *process-bit-vectors
  "Convert a long[] created by generateBitVectors(java.lang.Class<E>, java.lang.Iterable<? extends E>) into the set of
   enum values that it represents.

   If you store this value, beware any changes to the enum that would affect ordinal values.

  enum-class - the class of the enum we are working with, not null - `java.lang.Class`
  values - the long[] bearing the representation of a set of enum values, least significant digits rightmost, not null - `long`

  returns: a set of enum values - `<E extends java.lang.Enum<E>> java.util.EnumSet<E>`

  throws: java.lang.NullPointerException - if enumClass is null"
  ([^java.lang.Class enum-class ^Long values]
    (EnumUtils/processBitVectors enum-class values)))

