(ns org.apache.commons.lang3.CharUtils
  "Operations on char primitives and Character objects.

  This class tries to handle null input gracefully.
  An exception will not be thrown for a null input.
  Each method documents its behaviour in more detail.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 CharUtils]))

(defn ->char-utils
  "Constructor.

  CharUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as CharUtils.toString('c');.

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^CharUtils []
    (new CharUtils )))

(def *-lf
  "Static Constant.

  linefeed LF ('\\n').

  type: char"
  CharUtils/LF)

(def *-cr
  "Static Constant.

  carriage return CR ('\\r').

  type: char"
  CharUtils/CR)

(def *-nul
  "Static Constant.

  null control character ('\\0'), abbreviated NUL.

  type: char"
  CharUtils/NUL)

(defn *compare
  "Compares two char values numerically. This is the same functionality as provided in Java 7.

  x - the first char to compare - `char`
  y - the second char to compare - `char`

  returns: the value 0 if x == y;
           a value less than 0 if x < y; and
           a value greater than 0 if x > y - `int`"
  (^Integer [^Character x ^Character y]
    (CharUtils/compare x y)))

(defn *ascii-alpha-lower?
  "Checks whether the character is ASCII 7 bit alphabetic lower case.



     CharUtils.isAsciiAlphaLower('a')  = true
     CharUtils.isAsciiAlphaLower('A')  = false
     CharUtils.isAsciiAlphaLower('3')  = false
     CharUtils.isAsciiAlphaLower('-')  = false
     CharUtils.isAsciiAlphaLower('\\n') = false
     CharUtils.isAsciiAlphaLower('©') = false

  ch - the character to check - `char`

  returns: true if between 97 and 122 inclusive - `boolean`"
  (^Boolean [^Character ch]
    (CharUtils/isAsciiAlphaLower ch)))

(defn *unicode-escaped
  "Converts the string to the Unicode format ' '.

   This format is the Java source code format.



     CharUtils.unicodeEscaped(' ') = \" \"
     CharUtils.unicodeEscaped('A') = \"A\"

  ch - the character to convert - `char`

  returns: the escaped Unicode string - `java.lang.String`"
  (^java.lang.String [^Character ch]
    (CharUtils/unicodeEscaped ch)))

(defn *ascii-alpha?
  "Checks whether the character is ASCII 7 bit alphabetic.



     CharUtils.isAsciiAlpha('a')  = true
     CharUtils.isAsciiAlpha('A')  = true
     CharUtils.isAsciiAlpha('3')  = false
     CharUtils.isAsciiAlpha('-')  = false
     CharUtils.isAsciiAlpha('\\n') = false
     CharUtils.isAsciiAlpha('©') = false

  ch - the character to check - `char`

  returns: true if between 65 and 90 or 97 and 122 inclusive - `boolean`"
  (^Boolean [^Character ch]
    (CharUtils/isAsciiAlpha ch)))

(defn *ascii-alphanumeric?
  "Checks whether the character is ASCII 7 bit numeric.



     CharUtils.isAsciiAlphanumeric('a')  = true
     CharUtils.isAsciiAlphanumeric('A')  = true
     CharUtils.isAsciiAlphanumeric('3')  = true
     CharUtils.isAsciiAlphanumeric('-')  = false
     CharUtils.isAsciiAlphanumeric('\\n') = false
     CharUtils.isAsciiAlphanumeric('©') = false

  ch - the character to check - `char`

  returns: true if between 48 and 57 or 65 and 90 or 97 and 122 inclusive - `boolean`"
  (^Boolean [^Character ch]
    (CharUtils/isAsciiAlphanumeric ch)))

(defn *ascii?
  "Checks whether the character is ASCII 7 bit.



     CharUtils.isAscii('a')  = true
     CharUtils.isAscii('A')  = true
     CharUtils.isAscii('3')  = true
     CharUtils.isAscii('-')  = true
     CharUtils.isAscii('\\n') = true
     CharUtils.isAscii('©') = false

  ch - the character to check - `char`

  returns: true if less than 128 - `boolean`"
  (^Boolean [^Character ch]
    (CharUtils/isAscii ch)))

(defn *ascii-numeric?
  "Checks whether the character is ASCII 7 bit numeric.



     CharUtils.isAsciiNumeric('a')  = false
     CharUtils.isAsciiNumeric('A')  = false
     CharUtils.isAsciiNumeric('3')  = true
     CharUtils.isAsciiNumeric('-')  = false
     CharUtils.isAsciiNumeric('\\n') = false
     CharUtils.isAsciiNumeric('©') = false

  ch - the character to check - `char`

  returns: true if between 48 and 57 inclusive - `boolean`"
  (^Boolean [^Character ch]
    (CharUtils/isAsciiNumeric ch)))

(defn *to-string
  "Converts the character to a String that contains the one character.

   For ASCII 7 bit characters, this uses a cache that will return the
   same String object each time.



     CharUtils.toString(' ')  = \" \"
     CharUtils.toString('A')  = \"A\"

  ch - the character to convert - `char`

  returns: a String containing the one specified character - `java.lang.String`"
  (^java.lang.String [^Character ch]
    (CharUtils/toString ch)))

(defn *to-int-value
  "Converts the character to the Integer it represents, throwing an
   exception if the character is not numeric.

   This method converts the char '1' to the int 1 and so on.



     CharUtils.toIntValue('3', -1)  = 3
     CharUtils.toIntValue('A', -1)  = -1

  ch - the character to convert - `char`
  default-value - the default value to use if the character is not numeric - `int`

  returns: the int value of the character - `int`"
  (^Integer [^Character ch ^Integer default-value]
    (CharUtils/toIntValue ch default-value))
  (^Integer [^Character ch]
    (CharUtils/toIntValue ch)))

(defn *to-char
  "Converts the Character to a char handling null.



     CharUtils.toChar(null, 'X') = 'X'
     CharUtils.toChar(' ', 'X')  = ' '
     CharUtils.toChar('A', 'X')  = 'A'

  ch - the character to convert - `java.lang.Character`
  default-value - the value to use if the Character is null - `char`

  returns: the char value of the Character or the default if null - `char`"
  (^Character [^java.lang.Character ch ^Character default-value]
    (CharUtils/toChar ch default-value))
  (^Character [^java.lang.Character ch]
    (CharUtils/toChar ch)))

(defn *ascii-control?
  "Checks whether the character is ASCII 7 bit control.



     CharUtils.isAsciiControl('a')  = false
     CharUtils.isAsciiControl('A')  = false
     CharUtils.isAsciiControl('3')  = false
     CharUtils.isAsciiControl('-')  = false
     CharUtils.isAsciiControl('\\n') = true
     CharUtils.isAsciiControl('©') = false

  ch - the character to check - `char`

  returns: true if less than 32 or equals 127 - `boolean`"
  (^Boolean [^Character ch]
    (CharUtils/isAsciiControl ch)))

(defn *ascii-alpha-upper?
  "Checks whether the character is ASCII 7 bit alphabetic upper case.



     CharUtils.isAsciiAlphaUpper('a')  = false
     CharUtils.isAsciiAlphaUpper('A')  = true
     CharUtils.isAsciiAlphaUpper('3')  = false
     CharUtils.isAsciiAlphaUpper('-')  = false
     CharUtils.isAsciiAlphaUpper('\\n') = false
     CharUtils.isAsciiAlphaUpper('©') = false

  ch - the character to check - `char`

  returns: true if between 65 and 90 inclusive - `boolean`"
  (^Boolean [^Character ch]
    (CharUtils/isAsciiAlphaUpper ch)))

(defn *to-character-object
  "Deprecated. Java 5 introduced Character.valueOf(char) which caches chars 0 through 127.

  ch - the character to convert - `char`

  returns: a Character of the specified character - `java.lang.Character`"
  (^java.lang.Character [^Character ch]
    (CharUtils/toCharacterObject ch)))

(defn *ascii-printable?
  "Checks whether the character is ASCII 7 bit printable.



     CharUtils.isAsciiPrintable('a')  = true
     CharUtils.isAsciiPrintable('A')  = true
     CharUtils.isAsciiPrintable('3')  = true
     CharUtils.isAsciiPrintable('-')  = true
     CharUtils.isAsciiPrintable('\\n') = false
     CharUtils.isAsciiPrintable('©') = false

  ch - the character to check - `char`

  returns: true if between 32 and 126 inclusive - `boolean`"
  (^Boolean [^Character ch]
    (CharUtils/isAsciiPrintable ch)))

