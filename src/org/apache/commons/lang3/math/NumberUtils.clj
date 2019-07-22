(ns org.apache.commons.lang3.math.NumberUtils
  "Provides extra functionality for Java Number classes."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.math NumberUtils]))

(defn ->number-utils
  "Constructor.

  NumberUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as NumberUtils.toInt(\"6\");.

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^NumberUtils []
    (new NumberUtils )))

(def *-long-zero
  "Static Constant.

  Reusable Long constant for zero.

  type: java.lang.Long"
  NumberUtils/LONG_ZERO)

(def *-long-one
  "Static Constant.

  Reusable Long constant for one.

  type: java.lang.Long"
  NumberUtils/LONG_ONE)

(def *-long-minus-one
  "Static Constant.

  Reusable Long constant for minus one.

  type: java.lang.Long"
  NumberUtils/LONG_MINUS_ONE)

(def *-integer-zero
  "Static Constant.

  Reusable Integer constant for zero.

  type: java.lang.Integer"
  NumberUtils/INTEGER_ZERO)

(def *-integer-one
  "Static Constant.

  Reusable Integer constant for one.

  type: java.lang.Integer"
  NumberUtils/INTEGER_ONE)

(def *-integer-two
  "Static Constant.

  Reusable Integer constant for two

  type: java.lang.Integer"
  NumberUtils/INTEGER_TWO)

(def *-integer-minus-one
  "Static Constant.

  Reusable Integer constant for minus one.

  type: java.lang.Integer"
  NumberUtils/INTEGER_MINUS_ONE)

(def *-short-zero
  "Static Constant.

  Reusable Short constant for zero.

  type: java.lang.Short"
  NumberUtils/SHORT_ZERO)

(def *-short-one
  "Static Constant.

  Reusable Short constant for one.

  type: java.lang.Short"
  NumberUtils/SHORT_ONE)

(def *-short-minus-one
  "Static Constant.

  Reusable Short constant for minus one.

  type: java.lang.Short"
  NumberUtils/SHORT_MINUS_ONE)

(def *-byte-zero
  "Static Constant.

  Reusable Byte constant for zero.

  type: java.lang.Byte"
  NumberUtils/BYTE_ZERO)

(def *-byte-one
  "Static Constant.

  Reusable Byte constant for one.

  type: java.lang.Byte"
  NumberUtils/BYTE_ONE)

(def *-byte-minus-one
  "Static Constant.

  Reusable Byte constant for minus one.

  type: java.lang.Byte"
  NumberUtils/BYTE_MINUS_ONE)

(def *-double-zero
  "Static Constant.

  Reusable Double constant for zero.

  type: java.lang.Double"
  NumberUtils/DOUBLE_ZERO)

(def *-double-one
  "Static Constant.

  Reusable Double constant for one.

  type: java.lang.Double"
  NumberUtils/DOUBLE_ONE)

(def *-double-minus-one
  "Static Constant.

  Reusable Double constant for minus one.

  type: java.lang.Double"
  NumberUtils/DOUBLE_MINUS_ONE)

(def *-float-zero
  "Static Constant.

  Reusable Float constant for zero.

  type: java.lang.Float"
  NumberUtils/FLOAT_ZERO)

(def *-float-one
  "Static Constant.

  Reusable Float constant for one.

  type: java.lang.Float"
  NumberUtils/FLOAT_ONE)

(def *-float-minus-one
  "Static Constant.

  Reusable Float constant for minus one.

  type: java.lang.Float"
  NumberUtils/FLOAT_MINUS_ONE)

(defn *compare
  "Compares two int values numerically. This is the same functionality as provided in Java 7.

  x - the first int to compare - `int`
  y - the second int to compare - `int`

  returns: the value 0 if x == y;
           a value less than 0 if x < y; and
           a value greater than 0 if x > y - `int`"
  (^Integer [^Integer x ^Integer y]
    (NumberUtils/compare x y)))

(defn *number?
  "Deprecated. This feature will be removed in Lang 4.0,
               use isCreatable(String) instead

  str - the String to check - `java.lang.String`

  returns: true if the string is a correctly formatted number - `boolean`"
  (^Boolean [^java.lang.String str]
    (NumberUtils/isNumber str)))

(defn *min
  "Gets the minimum of three long values.

  a - value 1 - `long`
  b - value 2 - `long`
  c - value 3 - `long`

  returns: the smallest of the values - `long`"
  (^Long [^Long a ^Long b ^Long c]
    (NumberUtils/min a b c))
  (^Long [^Long array]
    (NumberUtils/min array)))

(defn *parsable?
  "Checks whether the given String is a parsable number.

   Parsable numbers include those Strings understood by Integer.parseInt(String),
   Long.parseLong(String), Float.parseFloat(String) or
   Double.parseDouble(String). This method can be used instead of catching ParseException
   when calling one of those methods.

   Hexadecimal and scientific notations are not considered parsable.
   See isCreatable(String) on those cases.

   Null and empty String will return false.

  str - the String to check. - `java.lang.String`

  returns: true if the string is a parsable number. - `boolean`"
  (^Boolean [^java.lang.String str]
    (NumberUtils/isParsable str)))

(defn *to-scaled-big-decimal
  "Convert a BigDecimal to a BigDecimal whose scale is the
   specified value with a RoundingMode applied. If the input value
   is null, we simply return BigDecimal.ZERO.

  value - the BigDecimal to convert, may be null. - `java.math.BigDecimal`
  scale - the number of digits to the right of the decimal point. - `int`
  rounding-mode - a rounding behavior for numerical operations capable of discarding precision. - `java.math.RoundingMode`

  returns: the scaled, with appropriate rounding, BigDecimal. - `java.math.BigDecimal`"
  (^java.math.BigDecimal [^java.math.BigDecimal value ^Integer scale ^java.math.RoundingMode rounding-mode]
    (NumberUtils/toScaledBigDecimal value scale rounding-mode))
  (^java.math.BigDecimal [^java.math.BigDecimal value]
    (NumberUtils/toScaledBigDecimal value)))

(defn *create-double
  "Convert a String to a Double.

   Returns null if the string is null.

  str - a String to convert, may be null - `java.lang.String`

  returns: converted Double (or null if the input is null) - `java.lang.Double`

  throws: java.lang.NumberFormatException - if the value cannot be converted"
  (^java.lang.Double [^java.lang.String str]
    (NumberUtils/createDouble str)))

(defn *create-long
  "Convert a String to a Long;
   since 3.1 it handles hex (0Xhhhh) and octal (0ddd) notations.
   N.B. a leading zero means octal; spaces are not trimmed.

   Returns null if the string is null.

  str - a String to convert, may be null - `java.lang.String`

  returns: converted Long (or null if the input is null) - `java.lang.Long`

  throws: java.lang.NumberFormatException - if the value cannot be converted"
  (^java.lang.Long [^java.lang.String str]
    (NumberUtils/createLong str)))

(defn *creatable?
  "Checks whether the String a valid Java number.

   Valid numbers include hexadecimal marked with the 0x or
   0X qualifier, octal numbers, scientific notation and
   numbers marked with a type qualifier (e.g. 123L).

   Non-hexadecimal strings beginning with a leading zero are
   treated as octal values. Thus the string 09 will return
   false, since 9 is not a valid octal value.
   However, numbers beginning with 0. are treated as decimal.

   null and empty/blank String will return
   false.

   Note, createNumber(String) should return a number for every
   input resulting in true.

  str - the String to check - `java.lang.String`

  returns: true if the string is a correctly formatted number - `boolean`"
  (^Boolean [^java.lang.String str]
    (NumberUtils/isCreatable str)))

(defn *to-double
  "Convert a String to a double, returning a
   default value if the conversion fails.

   If the string str is null, the default
   value is returned.



     NumberUtils.toDouble(null, 1.1d)   = 1.1d
     NumberUtils.toDouble(\"\", 1.1d)     = 1.1d
     NumberUtils.toDouble(\"1.5\", 0.0d)  = 1.5d

  str - the string to convert, may be null - `java.lang.String`
  default-value - the default value - `double`

  returns: the double represented by the string, or defaultValue
    if conversion fails - `double`"
  (^Double [^java.lang.String str ^Double default-value]
    (NumberUtils/toDouble str default-value))
  (^Double [^java.lang.String str]
    (NumberUtils/toDouble str)))

(defn *create-float
  "Convert a String to a Float.

   Returns null if the string is null.

  str - a String to convert, may be null - `java.lang.String`

  returns: converted Float (or null if the input is null) - `java.lang.Float`

  throws: java.lang.NumberFormatException - if the value cannot be converted"
  (^java.lang.Float [^java.lang.String str]
    (NumberUtils/createFloat str)))

(defn *max
  "Gets the maximum of three long values.

  a - value 1 - `long`
  b - value 2 - `long`
  c - value 3 - `long`

  returns: the largest of the values - `long`"
  (^Long [^Long a ^Long b ^Long c]
    (NumberUtils/max a b c))
  (^Long [^Long array]
    (NumberUtils/max array)))

(defn *create-integer
  "Convert a String to a Integer, handling
   hex (0xhhhh) and octal (0dddd) notations.
   N.B. a leading zero means octal; spaces are not trimmed.

   Returns null if the string is null.

  str - a String to convert, may be null - `java.lang.String`

  returns: converted Integer (or null if the input is null) - `java.lang.Integer`

  throws: java.lang.NumberFormatException - if the value cannot be converted"
  (^java.lang.Integer [^java.lang.String str]
    (NumberUtils/createInteger str)))

(defn *to-byte
  "Convert a String to a byte, returning a
   default value if the conversion fails.

   If the string is null, the default value is returned.



     NumberUtils.toByte(null, 1) = 1
     NumberUtils.toByte(\"\", 1)   = 1
     NumberUtils.toByte(\"1\", 0)  = 1

  str - the string to convert, may be null - `java.lang.String`
  default-value - the default value - `byte`

  returns: the byte represented by the string, or the default if conversion fails - `byte`"
  (^Byte [^java.lang.String str ^Byte default-value]
    (NumberUtils/toByte str default-value))
  (^Byte [^java.lang.String str]
    (NumberUtils/toByte str)))

(defn *to-float
  "Convert a String to a float, returning a
   default value if the conversion fails.

   If the string str is null, the default
   value is returned.



     NumberUtils.toFloat(null, 1.1f)   = 1.0f
     NumberUtils.toFloat(\"\", 1.1f)     = 1.1f
     NumberUtils.toFloat(\"1.5\", 0.0f)  = 1.5f

  str - the string to convert, may be null - `java.lang.String`
  default-value - the default value - `float`

  returns: the float represented by the string, or defaultValue
    if conversion fails - `float`"
  (^Float [^java.lang.String str ^Float default-value]
    (NumberUtils/toFloat str default-value))
  (^Float [^java.lang.String str]
    (NumberUtils/toFloat str)))

(defn *digits?
  "Checks whether the String contains only
   digit characters.

   Null and empty String will return
   false.

  str - the String to check - `java.lang.String`

  returns: true if str contains only Unicode numeric - `boolean`"
  (^Boolean [^java.lang.String str]
    (NumberUtils/isDigits str)))

(defn *create-big-integer
  "Convert a String to a BigInteger;
   since 3.2 it handles hex (0x or #) and octal (0) notations.

   Returns null if the string is null.

  str - a String to convert, may be null - `java.lang.String`

  returns: converted BigInteger (or null if the input is null) - `java.math.BigInteger`

  throws: java.lang.NumberFormatException - if the value cannot be converted"
  (^java.math.BigInteger [^java.lang.String str]
    (NumberUtils/createBigInteger str)))

(defn *to-short
  "Convert a String to an short, returning a
   default value if the conversion fails.

   If the string is null, the default value is returned.



     NumberUtils.toShort(null, 1) = 1
     NumberUtils.toShort(\"\", 1)   = 1
     NumberUtils.toShort(\"1\", 0)  = 1

  str - the string to convert, may be null - `java.lang.String`
  default-value - the default value - `short`

  returns: the short represented by the string, or the default if conversion fails - `short`"
  (^Short [^java.lang.String str ^Short default-value]
    (NumberUtils/toShort str default-value))
  (^Short [^java.lang.String str]
    (NumberUtils/toShort str)))

(defn *to-long
  "Convert a String to a long, returning a
   default value if the conversion fails.

   If the string is null, the default value is returned.



     NumberUtils.toLong(null, 1L) = 1L
     NumberUtils.toLong(\"\", 1L)   = 1L
     NumberUtils.toLong(\"1\", 0L)  = 1L

  str - the string to convert, may be null - `java.lang.String`
  default-value - the default value - `long`

  returns: the long represented by the string, or the default if conversion fails - `long`"
  (^Long [^java.lang.String str ^Long default-value]
    (NumberUtils/toLong str default-value))
  (^Long [^java.lang.String str]
    (NumberUtils/toLong str)))

(defn *to-int
  "Convert a String to an int, returning a
   default value if the conversion fails.

   If the string is null, the default value is returned.



     NumberUtils.toInt(null, 1) = 1
     NumberUtils.toInt(\"\", 1)   = 1
     NumberUtils.toInt(\"1\", 0)  = 1

  str - the string to convert, may be null - `java.lang.String`
  default-value - the default value - `int`

  returns: the int represented by the string, or the default if conversion fails - `int`"
  (^Integer [^java.lang.String str ^Integer default-value]
    (NumberUtils/toInt str default-value))
  (^Integer [^java.lang.String str]
    (NumberUtils/toInt str)))

(defn *create-big-decimal
  "Convert a String to a BigDecimal.

   Returns null if the string is null.

  str - a String to convert, may be null - `java.lang.String`

  returns: converted BigDecimal (or null if the input is null) - `java.math.BigDecimal`

  throws: java.lang.NumberFormatException - if the value cannot be converted"
  (^java.math.BigDecimal [^java.lang.String str]
    (NumberUtils/createBigDecimal str)))

(defn *create-number
  "Turns a string value into a java.lang.Number.

   If the string starts with 0x or -0x (lower or upper case) or # or -#, it
   will be interpreted as a hexadecimal Integer - or Long, if the number of digits after the
   prefix is more than 8 - or BigInteger if there are more than 16 digits.

   Then, the value is examined for a type qualifier on the end, i.e. one of
   'f', 'F', 'd', 'D', 'l', 'L'.  If it is found, it starts
   trying to create successively larger types from the type specified
   until one is found that can represent the value.

   If a type specifier is not found, it will check for a decimal point
   and then try successively larger types from Integer to
   BigInteger and from Float to
   BigDecimal.


   Integral values with a leading 0 will be interpreted as octal; the returned number will
   be Integer, Long or BigDecimal as appropriate.


   Returns null if the string is null.

   This method does not trim the input string, i.e., strings with leading
   or trailing spaces will generate NumberFormatExceptions.

  str - String containing a number, may be null - `java.lang.String`

  returns: Number created from the string (or null if the input is null) - `java.lang.Number`

  throws: java.lang.NumberFormatException - if the value cannot be converted"
  (^java.lang.Number [^java.lang.String str]
    (NumberUtils/createNumber str)))

