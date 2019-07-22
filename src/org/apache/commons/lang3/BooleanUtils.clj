(ns org.apache.commons.lang3.BooleanUtils
  "Operations on boolean primitives and Boolean objects.

  This class tries to handle null input gracefully.
  An exception will not be thrown for a null input.
  Each method documents its behaviour in more detail.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 BooleanUtils]))

(defn ->boolean-utils
  "Constructor.

  BooleanUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as BooleanUtils.negate(true);.

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^BooleanUtils []
    (new BooleanUtils )))

(defn *compare
  "Compares two boolean values. This is the same functionality as provided in Java 7.

  x - the first boolean to compare - `boolean`
  y - the second boolean to compare - `boolean`

  returns: the value 0 if x == y;
           a value less than 0 if !x && y; and
           a value greater than 0 if x && !y - `int`"
  (^Integer [^Boolean x ^Boolean y]
    (BooleanUtils/compare x y)))

(defn *to-integer
  "Converts a Boolean to an int specifying the conversion values.



     BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2)  = 1
     BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2) = 0
     BooleanUtils.toInteger(null, 1, 0, 2)          = 2

  bool - the Boolean to convert - `java.lang.Boolean`
  true-value - the value to return if true - `int`
  false-value - the value to return if false - `int`
  null-value - the value to return if null - `int`

  returns: the appropriate value - `int`"
  (^Integer [^java.lang.Boolean bool ^Integer true-value ^Integer false-value ^Integer null-value]
    (BooleanUtils/toInteger bool true-value false-value null-value))
  (^Integer [^Boolean bool ^Integer true-value ^Integer false-value]
    (BooleanUtils/toInteger bool true-value false-value))
  (^Integer [^Boolean bool]
    (BooleanUtils/toInteger bool)))

(defn *to-integer-object
  "Converts a Boolean to an Integer specifying the conversion values.



     BooleanUtils.toIntegerObject(Boolean.TRUE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2))  = Integer.valueOf(1)
     BooleanUtils.toIntegerObject(Boolean.FALSE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2)) = Integer.valueOf(0)
     BooleanUtils.toIntegerObject(null, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2))          = Integer.valueOf(2)

  bool - the Boolean to convert - `java.lang.Boolean`
  true-value - the value to return if true, may be null - `java.lang.Integer`
  false-value - the value to return if false, may be null - `java.lang.Integer`
  null-value - the value to return if null, may be null - `java.lang.Integer`

  returns: the appropriate value - `java.lang.Integer`"
  (^java.lang.Integer [^java.lang.Boolean bool ^java.lang.Integer true-value ^java.lang.Integer false-value ^java.lang.Integer null-value]
    (BooleanUtils/toIntegerObject bool true-value false-value null-value))
  (^java.lang.Integer [^Boolean bool ^java.lang.Integer true-value ^java.lang.Integer false-value]
    (BooleanUtils/toIntegerObject bool true-value false-value))
  (^java.lang.Integer [^Boolean bool]
    (BooleanUtils/toIntegerObject bool)))

(defn *not-true?
  "Checks if a Boolean value is not true,
   handling null by returning true.



     BooleanUtils.isNotTrue(Boolean.TRUE)  = false
     BooleanUtils.isNotTrue(Boolean.FALSE) = true
     BooleanUtils.isNotTrue(null)          = true

  bool - the boolean to check, null returns true - `java.lang.Boolean`

  returns: true if the input is null or false - `boolean`"
  (^Boolean [^java.lang.Boolean bool]
    (BooleanUtils/isNotTrue bool)))

(defn *not-false?
  "Checks if a Boolean value is not false,
   handling null by returning true.



     BooleanUtils.isNotFalse(Boolean.TRUE)  = true
     BooleanUtils.isNotFalse(Boolean.FALSE) = false
     BooleanUtils.isNotFalse(null)          = true

  bool - the boolean to check, null returns true - `java.lang.Boolean`

  returns: true if the input is null or true - `boolean`"
  (^Boolean [^java.lang.Boolean bool]
    (BooleanUtils/isNotFalse bool)))

(defn *negate
  "Negates the specified boolean.

   If null is passed in, null will be returned.

   NOTE: This returns null and will throw a NullPointerException if unboxed to a boolean.



     BooleanUtils.negate(Boolean.TRUE)  = Boolean.FALSE;
     BooleanUtils.negate(Boolean.FALSE) = Boolean.TRUE;
     BooleanUtils.negate(null)          = null;

  bool - the Boolean to negate, may be null - `java.lang.Boolean`

  returns: the negated Boolean, or null if null input - `java.lang.Boolean`"
  (^java.lang.Boolean [^java.lang.Boolean bool]
    (BooleanUtils/negate bool)))

(defn *to-string
  "Converts a Boolean to a String returning one of the input Strings.



     BooleanUtils.toString(Boolean.TRUE, \"true\", \"false\", null)   = \"true\"
     BooleanUtils.toString(Boolean.FALSE, \"true\", \"false\", null)  = \"false\"
     BooleanUtils.toString(null, \"true\", \"false\", null)           = null;

  bool - the Boolean to check - `java.lang.Boolean`
  true-string - the String to return if true, may be null - `java.lang.String`
  false-string - the String to return if false, may be null - `java.lang.String`
  null-string - the String to return if null, may be null - `java.lang.String`

  returns: one of the three input Strings - `java.lang.String`"
  (^java.lang.String [^java.lang.Boolean bool ^java.lang.String true-string ^java.lang.String false-string ^java.lang.String null-string]
    (BooleanUtils/toString bool true-string false-string null-string))
  (^java.lang.String [^Boolean bool ^java.lang.String true-string ^java.lang.String false-string]
    (BooleanUtils/toString bool true-string false-string)))

(defn *true?
  "Checks if a Boolean value is true,
   handling null by returning false.



     BooleanUtils.isTrue(Boolean.TRUE)  = true
     BooleanUtils.isTrue(Boolean.FALSE) = false
     BooleanUtils.isTrue(null)          = false

  bool - the boolean to check, null returns false - `java.lang.Boolean`

  returns: true only if the input is non-null and true - `boolean`"
  (^Boolean [^java.lang.Boolean bool]
    (BooleanUtils/isTrue bool)))

(defn *to-boolean-object
  "Converts an int to a Boolean specifying the conversion values.

   NOTE: This returns null and will throw a NullPointerException if unboxed to a boolean.



     BooleanUtils.toBooleanObject(0, 0, 2, 3) = Boolean.TRUE
     BooleanUtils.toBooleanObject(2, 1, 2, 3) = Boolean.FALSE
     BooleanUtils.toBooleanObject(3, 1, 2, 3) = null

  value - the Integer to convert - `int`
  true-value - the value to match for true - `int`
  false-value - the value to match for false - `int`
  null-value - the value to to match for null - `int`

  returns: Boolean.TRUE, Boolean.FALSE, or null - `java.lang.Boolean`

  throws: java.lang.IllegalArgumentException - if no match"
  (^java.lang.Boolean [^Integer value ^Integer true-value ^Integer false-value ^Integer null-value]
    (BooleanUtils/toBooleanObject value true-value false-value null-value))
  (^java.lang.Boolean [^Integer value]
    (BooleanUtils/toBooleanObject value)))

(defn *or
  "Performs an or on a set of booleans.



     BooleanUtils.or(true, true)          = true
     BooleanUtils.or(false, false)        = false
     BooleanUtils.or(true, false)         = true
     BooleanUtils.or(true, true, false)   = true
     BooleanUtils.or(true, true, true)    = true
     BooleanUtils.or(false, false, false) = false

  array - an array of booleans - `boolean`

  returns: true if the or is successful. - `boolean`

  throws: java.lang.IllegalArgumentException - if array is empty."
  (^Boolean [^Boolean array]
    (BooleanUtils/or array)))

(defn *to-boolean
  "Converts an int to a boolean specifying the conversion values.



     BooleanUtils.toBoolean(0, 1, 0) = false
     BooleanUtils.toBoolean(1, 1, 0) = true
     BooleanUtils.toBoolean(2, 1, 2) = false
     BooleanUtils.toBoolean(2, 2, 0) = true

  value - the Integer to convert - `int`
  true-value - the value to match for true - `int`
  false-value - the value to match for false - `int`

  returns: true or false - `boolean`

  throws: java.lang.IllegalArgumentException - if no match"
  (^Boolean [^Integer value ^Integer true-value ^Integer false-value]
    (BooleanUtils/toBoolean value true-value false-value))
  (^Boolean [^java.lang.Boolean bool]
    (BooleanUtils/toBoolean bool)))

(defn *and
  "Performs an and on a set of booleans.



     BooleanUtils.and(true, true)         = true
     BooleanUtils.and(false, false)       = false
     BooleanUtils.and(true, false)        = false
     BooleanUtils.and(true, true, false)  = false
     BooleanUtils.and(true, true, true)   = true

  array - an array of booleans - `boolean`

  returns: true if the and is successful. - `boolean`

  throws: java.lang.IllegalArgumentException - if array is empty."
  (^Boolean [^Boolean array]
    (BooleanUtils/and array)))

(defn *to-boolean-default-if-null
  "Converts a Boolean to a boolean handling null.



     BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false) = true
     BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true) = false
     BooleanUtils.toBooleanDefaultIfNull(null, true)          = true

  bool - the boolean to convert - `java.lang.Boolean`
  value-if-null - the boolean value to return if null - `boolean`

  returns: true or false - `boolean`"
  (^Boolean [^java.lang.Boolean bool ^Boolean value-if-null]
    (BooleanUtils/toBooleanDefaultIfNull bool value-if-null)))

(defn *to-string-yes-no
  "Converts a Boolean to a String returning 'yes',
   'no', or null.



     BooleanUtils.toStringYesNo(Boolean.TRUE)  = \"yes\"
     BooleanUtils.toStringYesNo(Boolean.FALSE) = \"no\"
     BooleanUtils.toStringYesNo(null)          = null;

  bool - the Boolean to check - `java.lang.Boolean`

  returns: 'yes', 'no', or null - `java.lang.String`"
  (^java.lang.String [^java.lang.Boolean bool]
    (BooleanUtils/toStringYesNo bool)))

(defn *false?
  "Checks if a Boolean value is false,
   handling null by returning false.



     BooleanUtils.isFalse(Boolean.TRUE)  = false
     BooleanUtils.isFalse(Boolean.FALSE) = true
     BooleanUtils.isFalse(null)          = false

  bool - the boolean to check, null returns false - `java.lang.Boolean`

  returns: true only if the input is non-null and false - `boolean`"
  (^Boolean [^java.lang.Boolean bool]
    (BooleanUtils/isFalse bool)))

(defn *to-string-on-off
  "Converts a Boolean to a String returning 'on',
   'off', or null.



     BooleanUtils.toStringOnOff(Boolean.TRUE)  = \"on\"
     BooleanUtils.toStringOnOff(Boolean.FALSE) = \"off\"
     BooleanUtils.toStringOnOff(null)          = null;

  bool - the Boolean to check - `java.lang.Boolean`

  returns: 'on', 'off', or null - `java.lang.String`"
  (^java.lang.String [^java.lang.Boolean bool]
    (BooleanUtils/toStringOnOff bool)))

(defn *to-string-true-false
  "Converts a Boolean to a String returning 'true',
   'false', or null.



     BooleanUtils.toStringTrueFalse(Boolean.TRUE)  = \"true\"
     BooleanUtils.toStringTrueFalse(Boolean.FALSE) = \"false\"
     BooleanUtils.toStringTrueFalse(null)          = null;

  bool - the Boolean to check - `java.lang.Boolean`

  returns: 'true', 'false', or null - `java.lang.String`"
  (^java.lang.String [^java.lang.Boolean bool]
    (BooleanUtils/toStringTrueFalse bool)))

(defn *xor
  "Performs an xor on a set of booleans.



     BooleanUtils.xor(true, true)   = false
     BooleanUtils.xor(false, false) = false
     BooleanUtils.xor(true, false)  = true

  array - an array of booleans - `boolean`

  returns: true if the xor is successful. - `boolean`

  throws: java.lang.IllegalArgumentException - if array is empty."
  (^Boolean [^Boolean array]
    (BooleanUtils/xor array)))

