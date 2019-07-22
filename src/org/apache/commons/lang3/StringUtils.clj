(ns org.apache.commons.lang3.StringUtils
  "Operations on String that are
  null safe.


   IsEmpty/IsBlank
       - checks if a String contains text
   Trim/Strip
       - removes leading and trailing whitespace
   Equals/Compare
       - compares two strings null-safe
   startsWith
       - check if a String starts with a prefix null-safe
   endsWith
       - check if a String ends with a suffix null-safe
   IndexOf/LastIndexOf/Contains
       - null-safe index-of checks
   IndexOfAny/LastIndexOfAny/IndexOfAnyBut/LastIndexOfAnyBut
       - index-of any of a set of Strings
   ContainsOnly/ContainsNone/ContainsAny
       - does String contains only/none/any of these characters
   Substring/Left/Right/Mid
       - null-safe substring extractions
   SubstringBefore/SubstringAfter/SubstringBetween
       - substring extraction relative to other strings
   Split/Join
       - splits a String into an array of substrings and vice versa
   Remove/Delete
       - removes part of a String
   Replace/Overlay
       - Searches a String and replaces one String with another
   Chomp/Chop
       - removes the last part of a String
   AppendIfMissing
       - appends a suffix to the end of the String if not present
   PrependIfMissing
       - prepends a prefix to the start of the String if not present
   LeftPad/RightPad/Center/Repeat
       - pads a String
   UpperCase/LowerCase/SwapCase/Capitalize/Uncapitalize
       - changes the case of a String
   CountMatches
       - counts the number of occurrences of one String in another
   IsAlpha/IsNumeric/IsWhitespace/IsAsciiPrintable
       - checks the characters in a String
   DefaultString
       - protects against a null input String
   Rotate
       - rotate (circular shift) a String
   Reverse/ReverseDelimited
       - reverses a String
   Abbreviate
       - abbreviates a string using ellipsis or another given String
   Difference
       - compares Strings and reports on their differences
   LevenshteinDistance
       - the number of changes needed to change one String into another


  The StringUtils class defines certain words related to
  String handling.


   null - null
   empty - a zero-length string (\"\")
   space - the space character (' ', char 32)
   whitespace - the characters defined by Character.isWhitespace(char)
   trim - the characters <= 32 as in String.trim()


  StringUtils handles null input Strings quietly.
  That is to say that a null input will return null.
  Where a boolean or int is being returned
  details vary by method.

  A side effect of the null handling is that a
  NullPointerException should be considered a bug in
  StringUtils.

  Methods in this class give sample code to explain their operation.
  The symbol * is used to indicate any input including null.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 StringUtils]))

(defn ->string-utils
  "Constructor.

  StringUtils instances should NOT be constructed in
   standard programming. Instead, the class should be used as
   StringUtils.trim(\" foo \");.

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^StringUtils []
    (new StringUtils )))

(def *-space
  "Static Constant.

  A String for a space character.

  type: java.lang.String"
  StringUtils/SPACE)

(def *-empty
  "Static Constant.

  The empty String \"\".

  type: java.lang.String"
  StringUtils/EMPTY)

(def *-lf
  "Static Constant.

  A String for linefeed LF (\"\\n\").

  type: java.lang.String"
  StringUtils/LF)

(def *-cr
  "Static Constant.

  A String for carriage return CR (\"\\r\").

  type: java.lang.String"
  StringUtils/CR)

(def *-index-not-found
  "Static Constant.

  Represents a failed index search.

  type: int"
  StringUtils/INDEX_NOT_FOUND)

(defn *trim-to-empty
  "Removes control characters (char <= 32) from both
   ends of this String returning an empty String (\"\") if the String
   is empty (\"\") after the trim or if it is null.

   The String is trimmed using String.trim().
   Trim removes start and end characters <= 32.
   To strip whitespace use stripToEmpty(String).



   StringUtils.trimToEmpty(null)          = \"\"
   StringUtils.trimToEmpty(\"\")            = \"\"
   StringUtils.trimToEmpty(\"     \")       = \"\"
   StringUtils.trimToEmpty(\"abc\")         = \"abc\"
   StringUtils.trimToEmpty(\"    abc    \") = \"abc\"

  str - the String to be trimmed, may be null - `java.lang.String`

  returns: the trimmed String, or an empty String if null input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/trimToEmpty str)))

(defn *normalize-space
  "Similar to http://www.w3.org/TR/xpath/#function-normalize
   -space


   The function returns the argument string with whitespace normalized by using
   trim(String) to remove leading and trailing whitespace
   and then replacing sequences of whitespace characters by a single space.

   In XML Whitespace characters are the same as those allowed by the S production, which is S ::= (#x20 | #x9 | #xD | #xA)+

   Java's regexp pattern \\s defines whitespace as [ \\t\\n\\x0B\\f\\r]

   For reference:

   \\x0B = vertical tab
   \\f = #xC = form feed
   #x20 = space
   #x9 = \\t
   #xA = \\n
   #xD = \\r



   The difference is that Java's whitespace includes vertical tab and form feed, which this functional will also
   normalize. Additionally trim(String) removes control characters (char <= 32) from both
   ends of this String.

  str - the source String to normalize whitespaces from, may be null - `java.lang.String`

  returns: the modified string with whitespace normalized, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/normalizeSpace str)))

(defn *append-if-missing-ignore-case
  "Appends the suffix to the end of the string if the string does not
   already end, case insensitive, with any of the suffixes.



   StringUtils.appendIfMissingIgnoreCase(null, null) = null
   StringUtils.appendIfMissingIgnoreCase(\"abc\", null) = \"abc\"
   StringUtils.appendIfMissingIgnoreCase(\"\", \"xyz\") = \"xyz\"
   StringUtils.appendIfMissingIgnoreCase(\"abc\", \"xyz\") = \"abcxyz\"
   StringUtils.appendIfMissingIgnoreCase(\"abcxyz\", \"xyz\") = \"abcxyz\"
   StringUtils.appendIfMissingIgnoreCase(\"abcXYZ\", \"xyz\") = \"abcXYZ\"
   With additional suffixes,


   StringUtils.appendIfMissingIgnoreCase(null, null, null) = null
   StringUtils.appendIfMissingIgnoreCase(\"abc\", null, null) = \"abc\"
   StringUtils.appendIfMissingIgnoreCase(\"\", \"xyz\", null) = \"xyz\"
   StringUtils.appendIfMissingIgnoreCase(\"abc\", \"xyz\", new CharSequence[]{null}) = \"abcxyz\"
   StringUtils.appendIfMissingIgnoreCase(\"abc\", \"xyz\", \"\") = \"abc\"
   StringUtils.appendIfMissingIgnoreCase(\"abc\", \"xyz\", \"mno\") = \"axyz\"
   StringUtils.appendIfMissingIgnoreCase(\"abcxyz\", \"xyz\", \"mno\") = \"abcxyz\"
   StringUtils.appendIfMissingIgnoreCase(\"abcmno\", \"xyz\", \"mno\") = \"abcmno\"
   StringUtils.appendIfMissingIgnoreCase(\"abcXYZ\", \"xyz\", \"mno\") = \"abcXYZ\"
   StringUtils.appendIfMissingIgnoreCase(\"abcMNO\", \"xyz\", \"mno\") = \"abcMNO\"

  str - The string. - `java.lang.String`
  suffix - The suffix to append to the end of the string. - `java.lang.CharSequence`
  suffixes - Additional suffixes that are valid terminators. - `java.lang.CharSequence`

  returns: A new String if suffix was appended, the same string otherwise. - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.CharSequence suffix ^java.lang.CharSequence suffixes]
    (StringUtils/appendIfMissingIgnoreCase str suffix suffixes)))

(defn *contains-only
  "Checks if the CharSequence contains only certain characters.

   A null CharSequence will return false.
   A null valid character array will return false.
   An empty CharSequence (length()=0) always returns true.



   StringUtils.containsOnly(null, *)       = false
   StringUtils.containsOnly(*, null)       = false
   StringUtils.containsOnly(\"\", *)         = true
   StringUtils.containsOnly(\"ab\", '')      = false
   StringUtils.containsOnly(\"abab\", 'abc') = true
   StringUtils.containsOnly(\"ab1\", 'abc')  = false
   StringUtils.containsOnly(\"abz\", 'abc')  = false

  cs - the String to check, may be null - `java.lang.CharSequence`
  valid - an array of valid chars, may be null - `char`

  returns: true if it only contains valid chars and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs ^Character valid]
    (StringUtils/containsOnly cs valid)))

(defn *compare
  "Compare two Strings lexicographically, as per String.compareTo(String), returning :

    int = 0, if str1 is equal to str2 (or both null)
    int < 0, if str1 is less than str2
    int > 0, if str1 is greater than str2


   This is a null safe version of :


  str1.compareTo(str2)

   null inputs are handled according to the nullIsLess parameter.
   Two null references are considered equal.



   StringUtils.compare(null, null, *)     = 0
   StringUtils.compare(null , \"a\", true)  < 0
   StringUtils.compare(null , \"a\", false) > 0
   StringUtils.compare(\"a\", null, true)   > 0
   StringUtils.compare(\"a\", null, false)  < 0
   StringUtils.compare(\"abc\", \"abc\", *)   = 0
   StringUtils.compare(\"a\", \"b\", *)       < 0
   StringUtils.compare(\"b\", \"a\", *)       > 0
   StringUtils.compare(\"a\", \"B\", *)       > 0
   StringUtils.compare(\"ab\", \"abc\", *)    < 0

  str-1 - the String to compare from - `java.lang.String`
  str-2 - the String to compare to - `java.lang.String`
  null-is-less - whether consider null value less than non-null value - `boolean`

  returns: < 0, 0, > 0, if str1 is respectively less, equal ou greater than str2 - `int`"
  (^Integer [^java.lang.String str-1 ^java.lang.String str-2 ^Boolean null-is-less]
    (StringUtils/compare str-1 str-2 null-is-less))
  (^Integer [^java.lang.String str-1 ^java.lang.String str-2]
    (StringUtils/compare str-1 str-2)))

(defn *to-code-points
  "Converts a CharSequence into an array of code points.

   Valid pairs of surrogate code units will be converted into a single supplementary
   code point. Isolated surrogate code units (i.e. a high surrogate not followed by a low surrogate or
   a low surrogate not preceded by a high surrogate) will be returned as-is.



   StringUtils.toCodePoints(null)   =  null
   StringUtils.toCodePoints(\"\")     =  []  // empty array

  str - the character sequence to convert - `java.lang.CharSequence`

  returns: an array of code points - `int[]`"
  ([^java.lang.CharSequence str]
    (StringUtils/toCodePoints str)))

(defn *split-by-character-type-camel-case
  "Splits a String by Character type as returned by
   java.lang.Character.getType(char). Groups of contiguous
   characters of the same type are returned as complete tokens, with the
   following exception: the character of type
   Character.UPPERCASE_LETTER, if any, immediately
   preceding a token of type Character.LOWERCASE_LETTER
   will belong to the following token rather than to the preceding, if any,
   Character.UPPERCASE_LETTER token.


   StringUtils.splitByCharacterTypeCamelCase(null)         = null
   StringUtils.splitByCharacterTypeCamelCase(\"\")           = []
   StringUtils.splitByCharacterTypeCamelCase(\"ab de fg\")   = [\"ab\", \" \", \"de\", \" \", \"fg\"]
   StringUtils.splitByCharacterTypeCamelCase(\"ab   de fg\") = [\"ab\", \"   \", \"de\", \" \", \"fg\"]
   StringUtils.splitByCharacterTypeCamelCase(\"ab:cd:ef\")   = [\"ab\", \":\", \"cd\", \":\", \"ef\"]
   StringUtils.splitByCharacterTypeCamelCase(\"number5\")    = [\"number\", \"5\"]
   StringUtils.splitByCharacterTypeCamelCase(\"fooBar\")     = [\"foo\", \"Bar\"]
   StringUtils.splitByCharacterTypeCamelCase(\"foo200Bar\")  = [\"foo\", \"200\", \"Bar\"]
   StringUtils.splitByCharacterTypeCamelCase(\"ASFRules\")   = [\"ASF\", \"Rules\"]

  str - the String to split, may be null - `java.lang.String`

  returns: an array of parsed Strings, null if null String input - `java.lang.String[]`"
  ([^java.lang.String str]
    (StringUtils/splitByCharacterTypeCamelCase str)))

(defn *numeric?
  "Checks if the CharSequence contains only Unicode digits.
   A decimal point is not a Unicode digit and returns false.

   null will return false.
   An empty CharSequence (length()=0) will return false.

   Note that the method does not allow for a leading sign, either positive or negative.
   Also, if a String passes the numeric test, it may still generate a NumberFormatException
   when parsed by Integer.parseInt or Long.parseLong, e.g. if the value is outside the range
   for int or long respectively.



   StringUtils.isNumeric(null)   = false
   StringUtils.isNumeric(\"\")     = false
   StringUtils.isNumeric(\"  \")   = false
   StringUtils.isNumeric(\"123\")  = true
   StringUtils.isNumeric(\"१२३\")  = true
   StringUtils.isNumeric(\"12 3\") = false
   StringUtils.isNumeric(\"ab2c\") = false
   StringUtils.isNumeric(\"12-3\") = false
   StringUtils.isNumeric(\"12.3\") = false
   StringUtils.isNumeric(\"-123\") = false
   StringUtils.isNumeric(\"+123\") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if only contains digits, and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isNumeric cs)))

(defn *replace-each
  "Replaces all occurrences of Strings within another String.



   A null reference passed to this method is a no-op, or if
   any \"search string\" or \"string to replace\" is null, that replace will be
   ignored. This will not repeat. For repeating replaces, call the
   overloaded method.




    StringUtils.replaceEach(null, *, *)        = null
    StringUtils.replaceEach(\"\", *, *)          = \"\"
    StringUtils.replaceEach(\"aba\", null, null) = \"aba\"
    StringUtils.replaceEach(\"aba\", new String[0], null) = \"aba\"
    StringUtils.replaceEach(\"aba\", null, new String[0]) = \"aba\"
    StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, null)  = \"aba\"
    StringUtils.replaceEach(\"aba\", new String[]{\"a\"}, new String[]{\"\"})  = \"b\"
    StringUtils.replaceEach(\"aba\", new String[]{null}, new String[]{\"a\"})  = \"aba\"
    StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"})  = \"wcte\"
    (example of how it does not repeat)
    StringUtils.replaceEach(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"})  = \"dcte\"

  text - text to search and replace in, no-op if null - `java.lang.String`
  search-list - the Strings to search for, no-op if null - `java.lang.String[]`
  replacement-list - the Strings to replace them with, no-op if null - `java.lang.String[]`

  returns: the text with any replacements processed, null if
           null String input - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if the lengths of the arrays are not the same (null is ok, and/or size 0)"
  (^java.lang.String [^java.lang.String text search-list replacement-list]
    (StringUtils/replaceEach text search-list replacement-list)))

(defn *all-lower-case?
  "Checks if the CharSequence contains only lowercase characters.

   null will return false.
   An empty CharSequence (length()=0) will return false.



   StringUtils.isAllLowerCase(null)   = false
   StringUtils.isAllLowerCase(\"\")     = false
   StringUtils.isAllLowerCase(\"  \")   = false
   StringUtils.isAllLowerCase(\"abc\")  = true
   StringUtils.isAllLowerCase(\"abC\")  = false
   StringUtils.isAllLowerCase(\"ab c\") = false
   StringUtils.isAllLowerCase(\"ab1c\") = false
   StringUtils.isAllLowerCase(\"ab/c\") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if only contains lowercase characters, and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isAllLowerCase cs)))

(defn *get-digits
  "Checks if a String str contains Unicode digits,
   if yes then concatenate all the digits in str and return it as a String.

   An empty (\"\") String will be returned if no digits found in str.



   StringUtils.getDigits(null)  = null
   StringUtils.getDigits(\"\")    = \"\"
   StringUtils.getDigits(\"abc\") = \"\"
   StringUtils.getDigits(\"1000$\") = \"1000\"
   StringUtils.getDigits(\"1123~45\") = \"112345\"
   StringUtils.getDigits(\"(541) 754-3010\") = \"5417543010\"
   StringUtils.getDigits(\"१२३\") = \"१२३\"

  str - the String to extract digits from, may be null - `java.lang.String`

  returns: String with only digits,
             or an empty (\"\") String if no digits found,
             or null String if str is null - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/getDigits str)))

(defn *get-levenshtein-distance
  "Deprecated. as of 3.6, use commons-text

   LevenshteinDistance instead

  s - the first String, must not be null - `java.lang.CharSequence`
  t - the second String, must not be null - `java.lang.CharSequence`
  threshold - the target threshold, must not be negative - `int`

  returns: result distance, or -1 if the distance would be greater than the threshold - `int`

  throws: java.lang.IllegalArgumentException - if either String input null or negative threshold"
  (^Integer [^java.lang.CharSequence s ^java.lang.CharSequence t ^Integer threshold]
    (StringUtils/getLevenshteinDistance s t threshold))
  (^Integer [^java.lang.CharSequence s ^java.lang.CharSequence t]
    (StringUtils/getLevenshteinDistance s t)))

(defn *substring-after
  "Gets the substring after the first occurrence of a separator.
   The separator is not returned.

   A null string input will return null.
   An empty (\"\") string input will return the empty string.
   A null separator will return the empty string if the
   input string is not null.

   If nothing is found, the empty string is returned.



   StringUtils.substringAfter(null, *)      = null
   StringUtils.substringAfter(\"\", *)        = \"\"
   StringUtils.substringAfter(*, null)      = \"\"
   StringUtils.substringAfter(\"abc\", \"a\")   = \"bc\"
   StringUtils.substringAfter(\"abcba\", \"b\") = \"cba\"
   StringUtils.substringAfter(\"abc\", \"c\")   = \"\"
   StringUtils.substringAfter(\"abc\", \"d\")   = \"\"
   StringUtils.substringAfter(\"abc\", \"\")    = \"abc\"

  str - the String to get a substring from, may be null - `java.lang.String`
  separator - the String to search for, may be null - `java.lang.String`

  returns: the substring after the first occurrence of the separator,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String separator]
    (StringUtils/substringAfter str separator)))

(defn *index-of-any
  "Search a CharSequence to find the first index of any
   character in the given set of characters.

   A null String will return -1.
   A null or zero length search array will return -1.



   StringUtils.indexOfAny(null, *)                  = -1
   StringUtils.indexOfAny(\"\", *)                    = -1
   StringUtils.indexOfAny(*, null)                  = -1
   StringUtils.indexOfAny(*, [])                    = -1
   StringUtils.indexOfAny(\"zzabyycdxx\", ['z', 'a']) = 0
   StringUtils.indexOfAny(\"zzabyycdxx\", ['b', 'y']) = 3
   StringUtils.indexOfAny(\"aba\", ['z'])             = -1

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-chars - the chars to search for, may be null - `char`

  returns: the index of any of the chars, -1 if no match or null input - `int`"
  (^Integer [^java.lang.CharSequence cs ^Character search-chars]
    (StringUtils/indexOfAny cs search-chars)))

(defn *trim
  "Removes control characters (char <= 32) from both
   ends of this String, handling null by returning
   null.

   The String is trimmed using String.trim().
   Trim removes start and end characters <= 32.
   To strip whitespace use strip(String).

   To trim your choice of characters, use the
   strip(String, String) methods.



   StringUtils.trim(null)          = null
   StringUtils.trim(\"\")            = \"\"
   StringUtils.trim(\"     \")       = \"\"
   StringUtils.trim(\"abc\")         = \"abc\"
   StringUtils.trim(\"    abc    \") = \"abc\"

  str - the String to be trimmed, may be null - `java.lang.String`

  returns: the trimmed string, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/trim str)))

(defn *starts-with-ignore-case
  "Case insensitive check if a CharSequence starts with a specified prefix.

   nulls are handled without exceptions. Two null
   references are considered to be equal. The comparison is case insensitive.



   StringUtils.startsWithIgnoreCase(null, null)      = true
   StringUtils.startsWithIgnoreCase(null, \"abc\")     = false
   StringUtils.startsWithIgnoreCase(\"abcdef\", null)  = false
   StringUtils.startsWithIgnoreCase(\"abcdef\", \"abc\") = true
   StringUtils.startsWithIgnoreCase(\"ABCDEF\", \"abc\") = true

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  prefix - the prefix to find, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence starts with the prefix, case insensitive, or
    both null - `boolean`"
  (^Boolean [^java.lang.CharSequence str ^java.lang.CharSequence prefix]
    (StringUtils/startsWithIgnoreCase str prefix)))

(defn *split-by-character-type
  "Splits a String by Character type as returned by
   java.lang.Character.getType(char). Groups of contiguous
   characters of the same type are returned as complete tokens.


   StringUtils.splitByCharacterType(null)         = null
   StringUtils.splitByCharacterType(\"\")           = []
   StringUtils.splitByCharacterType(\"ab de fg\")   = [\"ab\", \" \", \"de\", \" \", \"fg\"]
   StringUtils.splitByCharacterType(\"ab   de fg\") = [\"ab\", \"   \", \"de\", \" \", \"fg\"]
   StringUtils.splitByCharacterType(\"ab:cd:ef\")   = [\"ab\", \":\", \"cd\", \":\", \"ef\"]
   StringUtils.splitByCharacterType(\"number5\")    = [\"number\", \"5\"]
   StringUtils.splitByCharacterType(\"fooBar\")     = [\"foo\", \"B\", \"ar\"]
   StringUtils.splitByCharacterType(\"foo200Bar\")  = [\"foo\", \"200\", \"B\", \"ar\"]
   StringUtils.splitByCharacterType(\"ASFRules\")   = [\"ASFR\", \"ules\"]

  str - the String to split, may be null - `java.lang.String`

  returns: an array of parsed Strings, null if null String input - `java.lang.String[]`"
  ([^java.lang.String str]
    (StringUtils/splitByCharacterType str)))

(defn *right
  "Gets the rightmost len characters of a String.

   If len characters are not available, or the String
   is null, the String will be returned without an
   an exception. An empty String is returned if len is negative.



   StringUtils.right(null, *)    = null
   StringUtils.right(*, -ve)     = \"\"
   StringUtils.right(\"\", *)      = \"\"
   StringUtils.right(\"abc\", 0)   = \"\"
   StringUtils.right(\"abc\", 2)   = \"bc\"
   StringUtils.right(\"abc\", 4)   = \"abc\"

  str - the String to get the rightmost characters from, may be null - `java.lang.String`
  len - the length of the required String - `int`

  returns: the rightmost characters, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer len]
    (StringUtils/right str len)))

(defn *replace-each-repeatedly
  "Replaces all occurrences of Strings within another String.



   A null reference passed to this method is a no-op, or if
   any \"search string\" or \"string to replace\" is null, that replace will be
   ignored.




    StringUtils.replaceEachRepeatedly(null, *, *) = null
    StringUtils.replaceEachRepeatedly(\"\", *, *) = \"\"
    StringUtils.replaceEachRepeatedly(\"aba\", null, null) = \"aba\"
    StringUtils.replaceEachRepeatedly(\"aba\", new String[0], null) = \"aba\"
    StringUtils.replaceEachRepeatedly(\"aba\", null, new String[0]) = \"aba\"
    StringUtils.replaceEachRepeatedly(\"aba\", new String[]{\"a\"}, null) = \"aba\"
    StringUtils.replaceEachRepeatedly(\"aba\", new String[]{\"a\"}, new String[]{\"\"}) = \"b\"
    StringUtils.replaceEachRepeatedly(\"aba\", new String[]{null}, new String[]{\"a\"}) = \"aba\"
    StringUtils.replaceEachRepeatedly(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"w\", \"t\"}) = \"wcte\"
    (example of how it repeats)
    StringUtils.replaceEachRepeatedly(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"t\"}) = \"tcte\"
    StringUtils.replaceEachRepeatedly(\"abcde\", new String[]{\"ab\", \"d\"}, new String[]{\"d\", \"ab\"}) = IllegalStateException

  text - text to search and replace in, no-op if null - `java.lang.String`
  search-list - the Strings to search for, no-op if null - `java.lang.String[]`
  replacement-list - the Strings to replace them with, no-op if null - `java.lang.String[]`

  returns: the text with any replacements processed, null if
           null String input - `java.lang.String`

  throws: java.lang.IllegalStateException - if the search is repeating and there is an endless loop due to outputs of one being inputs to another"
  (^java.lang.String [^java.lang.String text search-list replacement-list]
    (StringUtils/replaceEachRepeatedly text search-list replacement-list)))

(defn *value-of
  "Returns the string representation of the char array or null.

  value - the character array. - `char[]`

  returns: a String or null - `java.lang.String`"
  (^java.lang.String [value]
    (StringUtils/valueOf value)))

(defn *last-index-of-any
  "Find the latest index of any of a set of potential substrings.

   A null CharSequence will return -1.
   A null search array will return -1.
   A null or zero length search array entry will be ignored,
   but a search array containing \"\" will return the length of str
   if str is not null. This method uses String.indexOf(String) if possible



   StringUtils.lastIndexOfAny(null, *)                    = -1
   StringUtils.lastIndexOfAny(*, null)                    = -1
   StringUtils.lastIndexOfAny(*, [])                      = -1
   StringUtils.lastIndexOfAny(*, [null])                  = -1
   StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"ab\", \"cd\"]) = 6
   StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"cd\", \"ab\"]) = 6
   StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\", \"op\"]) = -1
   StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\", \"op\"]) = -1
   StringUtils.lastIndexOfAny(\"zzabyycdxx\", [\"mn\", \"\"])   = 10

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-strs - the CharSequences to search for, may be null - `java.lang.CharSequence`

  returns: the last index of any of the CharSequences, -1 if no match - `int`"
  (^Integer [^java.lang.CharSequence str ^java.lang.CharSequence search-strs]
    (StringUtils/lastIndexOfAny str search-strs)))

(defn *remove-pattern
  "Deprecated. Moved to RegExUtils.

  source - the source string - `java.lang.String`
  regex - the regular expression to which this string is to be matched - `java.lang.String`

  returns: The resulting String - `java.lang.String`"
  (^java.lang.String [^java.lang.String source ^java.lang.String regex]
    (StringUtils/removePattern source regex)))

(defn *replace-all
  "Deprecated. Moved to RegExUtils.

  text - text to search and replace in, may be null - `java.lang.String`
  regex - the regular expression to which this string is to be matched - `java.lang.String`
  replacement - the string to be substituted for each match - `java.lang.String`

  returns: the text with any replacements processed,
                null if null String input - `java.lang.String`

  throws: java.util.regex.PatternSyntaxException - if the regular expression's syntax is invalid"
  (^java.lang.String [^java.lang.String text ^java.lang.String regex ^java.lang.String replacement]
    (StringUtils/replaceAll text regex replacement)))

(defn *split-by-whole-separator
  "Splits the provided text into an array, separator string specified.
   Returns a maximum of max substrings.

   The separator(s) will not be included in the returned String array.
   Adjacent separators are treated as one separator.

   A null input String returns null.
   A null separator splits on whitespace.



   StringUtils.splitByWholeSeparator(null, *, *)               = null
   StringUtils.splitByWholeSeparator(\"\", *, *)                 = []
   StringUtils.splitByWholeSeparator(\"ab de fg\", null, 0)      = [\"ab\", \"de\", \"fg\"]
   StringUtils.splitByWholeSeparator(\"ab   de fg\", null, 0)    = [\"ab\", \"de\", \"fg\"]
   StringUtils.splitByWholeSeparator(\"ab:cd:ef\", \":\", 2)       = [\"ab\", \"cd:ef\"]
   StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 5) = [\"ab\", \"cd\", \"ef\"]
   StringUtils.splitByWholeSeparator(\"ab-!-cd-!-ef\", \"-!-\", 2) = [\"ab\", \"cd-!-ef\"]

  str - the String to parse, may be null - `java.lang.String`
  separator - String containing the String to be used as a delimiter, null splits on whitespace - `java.lang.String`
  max - the maximum number of elements to include in the returned array. A zero or negative value implies no limit. - `int`

  returns: an array of parsed Strings, null if null String was input - `java.lang.String[]`"
  ([^java.lang.String str ^java.lang.String separator ^Integer max]
    (StringUtils/splitByWholeSeparator str separator max))
  ([^java.lang.String str ^java.lang.String separator]
    (StringUtils/splitByWholeSeparator str separator)))

(defn *chomp
  "Deprecated. This feature will be removed in Lang 4.0, use removeEnd(String, String) instead

  str - the String to chomp from, may be null - `java.lang.String`
  separator - separator String, may be null - `java.lang.String`

  returns: String without trailing separator, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String separator]
    (StringUtils/chomp str separator))
  (^java.lang.String [^java.lang.String str]
    (StringUtils/chomp str)))

(defn *lower-case
  "Converts a String to lower case as per String.toLowerCase(Locale).

   A null input String returns null.



   StringUtils.lowerCase(null, Locale.ENGLISH)  = null
   StringUtils.lowerCase(\"\", Locale.ENGLISH)    = \"\"
   StringUtils.lowerCase(\"aBc\", Locale.ENGLISH) = \"abc\"

  str - the String to lower case, may be null - `java.lang.String`
  locale - the locale that defines the case transformation rules, must not be null - `java.util.Locale`

  returns: the lower cased String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.util.Locale locale]
    (StringUtils/lowerCase str locale))
  (^java.lang.String [^java.lang.String str]
    (StringUtils/lowerCase str)))

(defn *last-index-of-ignore-case
  "Case in-sensitive find of the last index within a CharSequence
   from the specified position.

   A null CharSequence will return -1.
   A negative start position returns -1.
   An empty (\"\") search CharSequence always matches unless the start position is negative.
   A start position greater than the string length searches the whole string.
   The search starts at the startPos and works backwards; matches starting after the start
   position are ignored.




   StringUtils.lastIndexOfIgnoreCase(null, *, *)          = -1
   StringUtils.lastIndexOfIgnoreCase(*, null, *)          = -1
   StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 8)  = 7
   StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 8)  = 5
   StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"AB\", 8) = 4
   StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  = 5
   StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", -1) = -1
   StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  = 0
   StringUtils.lastIndexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  = -1

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-str - the CharSequence to find, may be null - `java.lang.CharSequence`
  start-pos - the start position - `int`

  returns: the last index of the search CharSequence (always ≤ startPos),
    -1 if no match or null input - `int`"
  (^Integer [^java.lang.CharSequence str ^java.lang.CharSequence search-str ^Integer start-pos]
    (StringUtils/lastIndexOfIgnoreCase str search-str start-pos))
  (^Integer [^java.lang.CharSequence str ^java.lang.CharSequence search-str]
    (StringUtils/lastIndexOfIgnoreCase str search-str)))

(defn *substring-after-last
  "Gets the substring after the last occurrence of a separator.
   The separator is not returned.

   A null string input will return null.
   An empty (\"\") string input will return the empty string.
   An empty or null separator will return the empty string if
   the input string is not null.

   If nothing is found, the empty string is returned.



   StringUtils.substringAfterLast(null, *)      = null
   StringUtils.substringAfterLast(\"\", *)        = \"\"
   StringUtils.substringAfterLast(*, \"\")        = \"\"
   StringUtils.substringAfterLast(*, null)      = \"\"
   StringUtils.substringAfterLast(\"abc\", \"a\")   = \"bc\"
   StringUtils.substringAfterLast(\"abcba\", \"b\") = \"a\"
   StringUtils.substringAfterLast(\"abc\", \"c\")   = \"\"
   StringUtils.substringAfterLast(\"a\", \"a\")     = \"\"
   StringUtils.substringAfterLast(\"a\", \"z\")     = \"\"

  str - the String to get a substring from, may be null - `java.lang.String`
  separator - the String to search for, may be null - `java.lang.String`

  returns: the substring after the last occurrence of the separator,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String separator]
    (StringUtils/substringAfterLast str separator)))

(defn *abbreviate
  "Abbreviates a String using a given replacement marker. This will turn
   \"Now is the time for all good men\" into \"...is the time for...\" if \"...\" was defined
   as the replacement marker.

   Works like abbreviate(String, String, int), but allows you to specify
   a \"left edge\" offset.  Note that this left edge is not necessarily going to
   be the leftmost character in the result, or the first character following the
   replacement marker, but it will appear somewhere in the result.

   In no case will it return a String of length greater than maxWidth.



   StringUtils.abbreviate(null, null, *, *)                 = null
   StringUtils.abbreviate(\"abcdefghijklmno\", null, *, *)    = \"abcdefghijklmno\"
   StringUtils.abbreviate(\"\", \"...\", 0, 4)                  = \"\"
   StringUtils.abbreviate(\"abcdefghijklmno\", \"---\", -1, 10) = \"abcdefg---\"
   StringUtils.abbreviate(\"abcdefghijklmno\", \",\", 0, 10)    = \"abcdefghi,\"
   StringUtils.abbreviate(\"abcdefghijklmno\", \",\", 1, 10)    = \"abcdefghi,\"
   StringUtils.abbreviate(\"abcdefghijklmno\", \",\", 2, 10)    = \"abcdefghi,\"
   StringUtils.abbreviate(\"abcdefghijklmno\", \"::\", 4, 10)   = \"::efghij::\"
   StringUtils.abbreviate(\"abcdefghijklmno\", \"...\", 6, 10)  = \"...ghij...\"
   StringUtils.abbreviate(\"abcdefghijklmno\", \"*\", 9, 10)    = \"*ghijklmno\"
   StringUtils.abbreviate(\"abcdefghijklmno\", \"'\", 10, 10)   = \"'ghijklmno\"
   StringUtils.abbreviate(\"abcdefghijklmno\", \"!\", 12, 10)   = \"!ghijklmno\"
   StringUtils.abbreviate(\"abcdefghij\", \"abra\", 0, 4)       = IllegalArgumentException
   StringUtils.abbreviate(\"abcdefghij\", \"...\", 5, 6)        = IllegalArgumentException

  str - the String to check, may be null - `java.lang.String`
  abbrev-marker - the String used as replacement marker - `java.lang.String`
  offset - left edge of source String - `int`
  max-width - maximum length of result String, must be at least 4 - `int`

  returns: abbreviated String, null if null String input - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if the width is too small"
  (^java.lang.String [^java.lang.String str ^java.lang.String abbrev-marker ^Integer offset ^Integer max-width]
    (StringUtils/abbreviate str abbrev-marker offset max-width))
  (^java.lang.String [^java.lang.String str ^Integer offset ^Integer max-width]
    (StringUtils/abbreviate str offset max-width))
  (^java.lang.String [^java.lang.String str ^Integer max-width]
    (StringUtils/abbreviate str max-width)))

(defn *remove-start
  "Removes a substring only if it is at the beginning of a source string,
   otherwise returns the source string.

   A null source string will return null.
   An empty (\"\") source string will return the empty string.
   A null search string will return the source string.



   StringUtils.removeStart(null, *)      = null
   StringUtils.removeStart(\"\", *)        = \"\"
   StringUtils.removeStart(*, null)      = *
   StringUtils.removeStart(\"www.domain.com\", \"www.\")   = \"domain.com\"
   StringUtils.removeStart(\"domain.com\", \"www.\")       = \"domain.com\"
   StringUtils.removeStart(\"www.domain.com\", \"domain\") = \"www.domain.com\"
   StringUtils.removeStart(\"abc\", \"\")    = \"abc\"

  str - the source String to search, may be null - `java.lang.String`
  remove - the String to search for and remove, may be null - `java.lang.String`

  returns: the substring with the string removed if found,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String remove]
    (StringUtils/removeStart str remove)))

(defn *reverse-delimited
  "Reverses a String that is delimited by a specific character.

   The Strings between the delimiters are not reversed.
   Thus java.lang.String becomes String.lang.java (if the delimiter
   is '.').



   StringUtils.reverseDelimited(null, *)      = null
   StringUtils.reverseDelimited(\"\", *)        = \"\"
   StringUtils.reverseDelimited(\"a.b.c\", 'x') = \"a.b.c\"
   StringUtils.reverseDelimited(\"a.b.c\", \".\") = \"c.b.a\"

  str - the String to reverse, may be null - `java.lang.String`
  separator-char - the separator character to use - `char`

  returns: the reversed String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character separator-char]
    (StringUtils/reverseDelimited str separator-char)))

(defn *all-blank?
  "Checks if all of the CharSequences are empty (\"\"), null or whitespace only.

   Whitespace is defined by Character.isWhitespace(char).



   StringUtils.isAllBlank(null)             = true
   StringUtils.isAllBlank(null, \"foo\")      = false
   StringUtils.isAllBlank(null, null)       = true
   StringUtils.isAllBlank(\"\", \"bar\")        = false
   StringUtils.isAllBlank(\"bob\", \"\")        = false
   StringUtils.isAllBlank(\"  bob  \", null)  = false
   StringUtils.isAllBlank(\" \", \"bar\")       = false
   StringUtils.isAllBlank(\"foo\", \"bar\")     = false
   StringUtils.isAllBlank(new String[] {})  = true

  css - the CharSequences to check, may be null or empty - `java.lang.CharSequence`

  returns: true if all of the CharSequences are empty or null or whitespace only - `boolean`"
  (^Boolean [^java.lang.CharSequence css]
    (StringUtils/isAllBlank css)))

(defn *replace-once
  "Replaces a String with another String inside a larger String, once.

   A null reference passed to this method is a no-op.



   StringUtils.replaceOnce(null, *, *)        = null
   StringUtils.replaceOnce(\"\", *, *)          = \"\"
   StringUtils.replaceOnce(\"any\", null, *)    = \"any\"
   StringUtils.replaceOnce(\"any\", *, null)    = \"any\"
   StringUtils.replaceOnce(\"any\", \"\", *)      = \"any\"
   StringUtils.replaceOnce(\"aba\", \"a\", null)  = \"aba\"
   StringUtils.replaceOnce(\"aba\", \"a\", \"\")    = \"ba\"
   StringUtils.replaceOnce(\"aba\", \"a\", \"z\")   = \"zba\"

  text - text to search and replace in, may be null - `java.lang.String`
  search-string - the String to search for, may be null - `java.lang.String`
  replacement - the String to replace with, may be null - `java.lang.String`

  returns: the text with any replacements processed,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.lang.String search-string ^java.lang.String replacement]
    (StringUtils/replaceOnce text search-string replacement)))

(defn *not-blank?
  "Checks if a CharSequence is not empty (\"\"), not null and not whitespace only.

   Whitespace is defined by Character.isWhitespace(char).



   StringUtils.isNotBlank(null)      = false
   StringUtils.isNotBlank(\"\")        = false
   StringUtils.isNotBlank(\" \")       = false
   StringUtils.isNotBlank(\"bob\")     = true
   StringUtils.isNotBlank(\"  bob  \") = true

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence is
    not empty and not null and not whitespace only - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isNotBlank cs)))

(defn *prepend-if-missing-ignore-case
  "Prepends the prefix to the start of the string if the string does not
   already start, case insensitive, with any of the prefixes.



   StringUtils.prependIfMissingIgnoreCase(null, null) = null
   StringUtils.prependIfMissingIgnoreCase(\"abc\", null) = \"abc\"
   StringUtils.prependIfMissingIgnoreCase(\"\", \"xyz\") = \"xyz\"
   StringUtils.prependIfMissingIgnoreCase(\"abc\", \"xyz\") = \"xyzabc\"
   StringUtils.prependIfMissingIgnoreCase(\"xyzabc\", \"xyz\") = \"xyzabc\"
   StringUtils.prependIfMissingIgnoreCase(\"XYZabc\", \"xyz\") = \"XYZabc\"
   With additional prefixes,


   StringUtils.prependIfMissingIgnoreCase(null, null, null) = null
   StringUtils.prependIfMissingIgnoreCase(\"abc\", null, null) = \"abc\"
   StringUtils.prependIfMissingIgnoreCase(\"\", \"xyz\", null) = \"xyz\"
   StringUtils.prependIfMissingIgnoreCase(\"abc\", \"xyz\", new CharSequence[]{null}) = \"xyzabc\"
   StringUtils.prependIfMissingIgnoreCase(\"abc\", \"xyz\", \"\") = \"abc\"
   StringUtils.prependIfMissingIgnoreCase(\"abc\", \"xyz\", \"mno\") = \"xyzabc\"
   StringUtils.prependIfMissingIgnoreCase(\"xyzabc\", \"xyz\", \"mno\") = \"xyzabc\"
   StringUtils.prependIfMissingIgnoreCase(\"mnoabc\", \"xyz\", \"mno\") = \"mnoabc\"
   StringUtils.prependIfMissingIgnoreCase(\"XYZabc\", \"xyz\", \"mno\") = \"XYZabc\"
   StringUtils.prependIfMissingIgnoreCase(\"MNOabc\", \"xyz\", \"mno\") = \"MNOabc\"

  str - The string. - `java.lang.String`
  prefix - The prefix to prepend to the start of the string. - `java.lang.CharSequence`
  prefixes - Additional prefixes that are valid (optional). - `java.lang.CharSequence`

  returns: A new String if prefix was prepended, the same string otherwise. - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.CharSequence prefix ^java.lang.CharSequence prefixes]
    (StringUtils/prependIfMissingIgnoreCase str prefix prefixes)))

(defn *reverse
  "Reverses a String as per StringBuilder.reverse().

   A null String returns null.



   StringUtils.reverse(null)  = null
   StringUtils.reverse(\"\")    = \"\"
   StringUtils.reverse(\"bat\") = \"tab\"

  str - the String to reverse, may be null - `java.lang.String`

  returns: the reversed String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/reverse str)))

(defn *replace-once-ignore-case
  "Case insensitively replaces a String with another String inside a larger String, once.

   A null reference passed to this method is a no-op.



   StringUtils.replaceOnceIgnoreCase(null, *, *)        = null
   StringUtils.replaceOnceIgnoreCase(\"\", *, *)          = \"\"
   StringUtils.replaceOnceIgnoreCase(\"any\", null, *)    = \"any\"
   StringUtils.replaceOnceIgnoreCase(\"any\", *, null)    = \"any\"
   StringUtils.replaceOnceIgnoreCase(\"any\", \"\", *)      = \"any\"
   StringUtils.replaceOnceIgnoreCase(\"aba\", \"a\", null)  = \"aba\"
   StringUtils.replaceOnceIgnoreCase(\"aba\", \"a\", \"\")    = \"ba\"
   StringUtils.replaceOnceIgnoreCase(\"aba\", \"a\", \"z\")   = \"zba\"
   StringUtils.replaceOnceIgnoreCase(\"FoOFoofoo\", \"foo\", \"\") = \"Foofoo\"

  text - text to search and replace in, may be null - `java.lang.String`
  search-string - the String to search for (case insensitive), may be null - `java.lang.String`
  replacement - the String to replace with, may be null - `java.lang.String`

  returns: the text with any replacements processed,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.lang.String search-string ^java.lang.String replacement]
    (StringUtils/replaceOnceIgnoreCase text search-string replacement)))

(defn *first-non-empty
  "Returns the first value in the array which is not empty.

   If all values are empty or the array is null
   or empty then null is returned.



   StringUtils.firstNonEmpty(null, null, null)   = null
   StringUtils.firstNonEmpty(null, null, \"\")     = null
   StringUtils.firstNonEmpty(null, \"\", \" \")      = \" \"
   StringUtils.firstNonEmpty(\"abc\")              = \"abc\"
   StringUtils.firstNonEmpty(null, \"xyz\")        = \"xyz\"
   StringUtils.firstNonEmpty(\"\", \"xyz\")          = \"xyz\"
   StringUtils.firstNonEmpty(null, \"xyz\", \"abc\") = \"xyz\"
   StringUtils.firstNonEmpty()                   = null

  values - the values to test, may be null or empty - `T`

  returns: the first value from values which is not empty,
    or null if there are no non-empty values - `<T extends java.lang.CharSequence> T`"
  ([values]
    (StringUtils/firstNonEmpty values)))

(defn *mixed-case?
  "Checks if the CharSequence contains mixed casing of both uppercase and lowercase characters.

   null will return false. An empty CharSequence (length()=0) will return
   false.



   StringUtils.isMixedCase(null)    = false
   StringUtils.isMixedCase(\"\")      = false
   StringUtils.isMixedCase(\"ABC\")   = false
   StringUtils.isMixedCase(\"abc\")   = false
   StringUtils.isMixedCase(\"aBc\")   = true
   StringUtils.isMixedCase(\"A c\")   = true
   StringUtils.isMixedCase(\"A1c\")   = true
   StringUtils.isMixedCase(\"a/C\")   = true
   StringUtils.isMixedCase(\"aC\\t\")  = true

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence contains both uppercase and lowercase characters - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isMixedCase cs)))

(defn *contains
  "Checks if CharSequence contains a search character, handling null.
   This method uses String.indexOf(int) if possible.

   A null or empty (\"\") CharSequence will return false.



   StringUtils.contains(null, *)    = false
   StringUtils.contains(\"\", *)      = false
   StringUtils.contains(\"abc\", 'a') = true
   StringUtils.contains(\"abc\", 'z') = false

  seq - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-char - the character to find - `int`

  returns: true if the CharSequence contains the search character,
    false if not or null string input - `boolean`"
  (^Boolean [^java.lang.CharSequence seq ^Integer search-char]
    (StringUtils/contains seq search-char)))

(defn *blank?
  "Checks if a CharSequence is empty (\"\"), null or whitespace only.

   Whitespace is defined by Character.isWhitespace(char).



   StringUtils.isBlank(null)      = true
   StringUtils.isBlank(\"\")        = true
   StringUtils.isBlank(\" \")       = true
   StringUtils.isBlank(\"bob\")     = false
   StringUtils.isBlank(\"  bob  \") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence is null, empty or whitespace only - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isBlank cs)))

(defn *right-pad
  "Right pad a String with a specified character.

   The String is padded to the size of size.



   StringUtils.rightPad(null, *, *)     = null
   StringUtils.rightPad(\"\", 3, 'z')     = \"zzz\"
   StringUtils.rightPad(\"bat\", 3, 'z')  = \"bat\"
   StringUtils.rightPad(\"bat\", 5, 'z')  = \"batzz\"
   StringUtils.rightPad(\"bat\", 1, 'z')  = \"bat\"
   StringUtils.rightPad(\"bat\", -1, 'z') = \"bat\"

  str - the String to pad out, may be null - `java.lang.String`
  size - the size to pad to - `int`
  pad-char - the character to pad with - `char`

  returns: right padded String or original String if no padding is necessary,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer size ^Character pad-char]
    (StringUtils/rightPad str size pad-char))
  (^java.lang.String [^java.lang.String str ^Integer size]
    (StringUtils/rightPad str size)))

(defn *substring-between
  "Gets the String that is nested in between two Strings.
   Only the first match is returned.

   A null input String returns null.
   A null open/close returns null (no match).
   An empty (\"\") open and close returns an empty string.



   StringUtils.substringBetween(\"wx[b]yz\", \"[\", \"]\") = \"b\"
   StringUtils.substringBetween(null, *, *)          = null
   StringUtils.substringBetween(*, null, *)          = null
   StringUtils.substringBetween(*, *, null)          = null
   StringUtils.substringBetween(\"\", \"\", \"\")          = \"\"
   StringUtils.substringBetween(\"\", \"\", \"]\")         = null
   StringUtils.substringBetween(\"\", \"[\", \"]\")        = null
   StringUtils.substringBetween(\"yabcz\", \"\", \"\")     = \"\"
   StringUtils.substringBetween(\"yabcz\", \"y\", \"z\")   = \"abc\"
   StringUtils.substringBetween(\"yabczyabcz\", \"y\", \"z\")   = \"abc\"

  str - the String containing the substring, may be null - `java.lang.String`
  open - the String before the substring, may be null - `java.lang.String`
  close - the String after the substring, may be null - `java.lang.String`

  returns: the substring, null if no match - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String open ^java.lang.String close]
    (StringUtils/substringBetween str open close))
  (^java.lang.String [^java.lang.String str ^java.lang.String tag]
    (StringUtils/substringBetween str tag)))

(defn *contains-any
  "Checks if the CharSequence contains any character in the given
   set of characters.

   A null CharSequence will return false.
   A null or zero length search array will return false.



   StringUtils.containsAny(null, *)                  = false
   StringUtils.containsAny(\"\", *)                    = false
   StringUtils.containsAny(*, null)                  = false
   StringUtils.containsAny(*, [])                    = false
   StringUtils.containsAny(\"zzabyycdxx\", ['z', 'a']) = true
   StringUtils.containsAny(\"zzabyycdxx\", ['b', 'y']) = true
   StringUtils.containsAny(\"zzabyycdxx\", ['z', 'y']) = true
   StringUtils.containsAny(\"aba\", ['z'])             = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-chars - the chars to search for, may be null - `char`

  returns: the true if any of the chars are found,
   false if no match or null input - `boolean`"
  (^Boolean [^java.lang.CharSequence cs ^Character search-chars]
    (StringUtils/containsAny cs search-chars)))

(defn *repeat
  "Repeat a String repeat times to form a
   new String, with a String separator injected each time.



   StringUtils.repeat(null, null, 2) = null
   StringUtils.repeat(null, \"x\", 2)  = null
   StringUtils.repeat(\"\", null, 0)   = \"\"
   StringUtils.repeat(\"\", \"\", 2)     = \"\"
   StringUtils.repeat(\"\", \"x\", 3)    = \"xxx\"
   StringUtils.repeat(\"?\", \", \", 3)  = \"?, ?, ?\"

  str - the String to repeat, may be null - `java.lang.String`
  separator - the String to inject, may be null - `java.lang.String`
  repeat - number of times to repeat str, negative treated as zero - `int`

  returns: a new String consisting of the original String repeated,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String separator ^Integer repeat]
    (StringUtils/repeat str separator repeat))
  (^java.lang.String [^java.lang.String str ^Integer repeat]
    (StringUtils/repeat str repeat)))

(defn *ends-with
  "Check if a CharSequence ends with a specified suffix.

   nulls are handled without exceptions. Two null
   references are considered to be equal. The comparison is case sensitive.



   StringUtils.endsWith(null, null)      = true
   StringUtils.endsWith(null, \"def\")     = false
   StringUtils.endsWith(\"abcdef\", null)  = false
   StringUtils.endsWith(\"abcdef\", \"def\") = true
   StringUtils.endsWith(\"ABCDEF\", \"def\") = false
   StringUtils.endsWith(\"ABCDEF\", \"cde\") = false
   StringUtils.endsWith(\"ABCDEF\", \"\")    = true

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  suffix - the suffix to find, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence ends with the suffix, case sensitive, or
    both null - `boolean`"
  (^Boolean [^java.lang.CharSequence str ^java.lang.CharSequence suffix]
    (StringUtils/endsWith str suffix)))

(defn *replace-first
  "Deprecated. Moved to RegExUtils.

  text - text to search and replace in, may be null - `java.lang.String`
  regex - the regular expression to which this string is to be matched - `java.lang.String`
  replacement - the string to be substituted for the first match - `java.lang.String`

  returns: the text with the first replacement processed,
                null if null String input - `java.lang.String`

  throws: java.util.regex.PatternSyntaxException - if the regular expression's syntax is invalid"
  (^java.lang.String [^java.lang.String text ^java.lang.String regex ^java.lang.String replacement]
    (StringUtils/replaceFirst text regex replacement)))

(defn *numeric-space?
  "Checks if the CharSequence contains only Unicode digits or space
   (' ').
   A decimal point is not a Unicode digit and returns false.

   null will return false.
   An empty CharSequence (length()=0) will return true.



   StringUtils.isNumericSpace(null)   = false
   StringUtils.isNumericSpace(\"\")     = true
   StringUtils.isNumericSpace(\"  \")   = true
   StringUtils.isNumericSpace(\"123\")  = true
   StringUtils.isNumericSpace(\"12 3\") = true
   StringUtils.isNumeric(\"१२३\")  = true
   StringUtils.isNumeric(\"१२ ३\")  = true
   StringUtils.isNumericSpace(\"ab2c\") = false
   StringUtils.isNumericSpace(\"12-3\") = false
   StringUtils.isNumericSpace(\"12.3\") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if only contains digits or space,
    and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isNumericSpace cs)))

(defn *contains-none
  "Checks that the CharSequence does not contain certain characters.

   A null CharSequence will return true.
   A null invalid character array will return true.
   An empty CharSequence (length()=0) always returns true.



   StringUtils.containsNone(null, *)       = true
   StringUtils.containsNone(*, null)       = true
   StringUtils.containsNone(\"\", *)         = true
   StringUtils.containsNone(\"ab\", '')      = true
   StringUtils.containsNone(\"abab\", 'xyz') = true
   StringUtils.containsNone(\"ab1\", 'xyz')  = true
   StringUtils.containsNone(\"abz\", 'xyz')  = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-chars - an array of invalid chars, may be null - `char`

  returns: true if it contains none of the invalid chars, or is null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs ^Character search-chars]
    (StringUtils/containsNone cs search-chars)))

(defn *alpha-space?
  "Checks if the CharSequence contains only Unicode letters and
   space (' ').

   null will return false
   An empty CharSequence (length()=0) will return true.



   StringUtils.isAlphaSpace(null)   = false
   StringUtils.isAlphaSpace(\"\")     = true
   StringUtils.isAlphaSpace(\"  \")   = true
   StringUtils.isAlphaSpace(\"abc\")  = true
   StringUtils.isAlphaSpace(\"ab c\") = true
   StringUtils.isAlphaSpace(\"ab2c\") = false
   StringUtils.isAlphaSpace(\"ab-c\") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if only contains letters and space,
    and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isAlphaSpace cs)))

(defn *default-if-empty
  "Returns either the passed in CharSequence, or if the CharSequence is
   empty or null, the value of defaultStr.



   StringUtils.defaultIfEmpty(null, \"NULL\")  = \"NULL\"
   StringUtils.defaultIfEmpty(\"\", \"NULL\")    = \"NULL\"
   StringUtils.defaultIfEmpty(\" \", \"NULL\")   = \" \"
   StringUtils.defaultIfEmpty(\"bat\", \"NULL\") = \"bat\"
   StringUtils.defaultIfEmpty(\"\", null)      = null

  str - the CharSequence to check, may be null - `T`
  default-str - the default CharSequence to return if the input is empty (\"\") or null, may be null - `T`

  returns: the passed in CharSequence, or the default - `<T extends java.lang.CharSequence> T`"
  ([str default-str]
    (StringUtils/defaultIfEmpty str default-str)))

(defn *to-string
  "Deprecated. use toEncodedString(byte[], Charset) instead of String constants in your code

  bytes - the byte array to read from - `byte[]`
  charset-name - the encoding to use, if null then use the platform default - `java.lang.String`

  returns: a new String - `java.lang.String`

  throws: java.io.UnsupportedEncodingException - If the named charset is not supported"
  (^java.lang.String [bytes ^java.lang.String charset-name]
    (StringUtils/toString bytes charset-name)))

(defn *strip-to-null
  "Strips whitespace from the start and end of a String  returning
   null if the String is empty (\"\") after the strip.

   This is similar to trimToNull(String) but removes whitespace.
   Whitespace is defined by Character.isWhitespace(char).



   StringUtils.stripToNull(null)     = null
   StringUtils.stripToNull(\"\")       = null
   StringUtils.stripToNull(\"   \")    = null
   StringUtils.stripToNull(\"abc\")    = \"abc\"
   StringUtils.stripToNull(\"  abc\")  = \"abc\"
   StringUtils.stripToNull(\"abc  \")  = \"abc\"
   StringUtils.stripToNull(\" abc \")  = \"abc\"
   StringUtils.stripToNull(\" ab c \") = \"ab c\"

  str - the String to be stripped, may be null - `java.lang.String`

  returns: the stripped String,
    null if whitespace, empty or null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/stripToNull str)))

(defn *substring-before
  "Gets the substring before the first occurrence of a separator.
   The separator is not returned.

   A null string input will return null.
   An empty (\"\") string input will return the empty string.
   A null separator will return the input string.

   If nothing is found, the string input is returned.



   StringUtils.substringBefore(null, *)      = null
   StringUtils.substringBefore(\"\", *)        = \"\"
   StringUtils.substringBefore(\"abc\", \"a\")   = \"\"
   StringUtils.substringBefore(\"abcba\", \"b\") = \"a\"
   StringUtils.substringBefore(\"abc\", \"c\")   = \"ab\"
   StringUtils.substringBefore(\"abc\", \"d\")   = \"abc\"
   StringUtils.substringBefore(\"abc\", \"\")    = \"\"
   StringUtils.substringBefore(\"abc\", null)  = \"abc\"

  str - the String to get a substring from, may be null - `java.lang.String`
  separator - the String to search for, may be null - `java.lang.String`

  returns: the substring before the first occurrence of the separator,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String separator]
    (StringUtils/substringBefore str separator)))

(defn *unwrap
  "Unwraps a given string from anther string.




   StringUtils.unwrap(null, null)         = null
   StringUtils.unwrap(null, \"\")           = null
   StringUtils.unwrap(null, \"1\")          = null
   StringUtils.unwrap(\"\\'abc\\'\", \"\\'\")    = \"abc\"
   StringUtils.unwrap(\"\\\"abc\\\"\", \"\\\"\")    = \"abc\"
   StringUtils.unwrap(\"AABabcBAA\", \"AA\")  = \"BabcB\"
   StringUtils.unwrap(\"A\", \"#\")           = \"A\"
   StringUtils.unwrap(\"#A\", \"#\")          = \"#A\"
   StringUtils.unwrap(\"A#\", \"#\")          = \"A#\"

  str - the String to be unwrapped, can be null - `java.lang.String`
  wrap-token - the String used to unwrap - `java.lang.String`

  returns: unwrapped String or the original string
            if it is not quoted properly with the wrapToken - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String wrap-token]
    (StringUtils/unwrap str wrap-token)))

(defn *wrap
  "Wraps a string with a char.




   StringUtils.wrap(null, *)        = null
   StringUtils.wrap(\"\", *)          = \"\"
   StringUtils.wrap(\"ab\", '\\0')     = \"ab\"
   StringUtils.wrap(\"ab\", 'x')      = \"xabx\"
   StringUtils.wrap(\"ab\", '\\'')     = \"'ab'\"
   StringUtils.wrap(\"\\\"ab\\\"\", '\\\"') = \"\\\"\\\"ab\\\"\\\"\"

  str - the string to be wrapped, may be null - `java.lang.String`
  wrap-with - the char that will wrap str - `char`

  returns: the wrapped string, or null if str==null - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character wrap-with]
    (StringUtils/wrap str wrap-with)))

(defn *upper-case
  "Converts a String to upper case as per String.toUpperCase(Locale).

   A null input String returns null.



   StringUtils.upperCase(null, Locale.ENGLISH)  = null
   StringUtils.upperCase(\"\", Locale.ENGLISH)    = \"\"
   StringUtils.upperCase(\"aBc\", Locale.ENGLISH) = \"ABC\"

  str - the String to upper case, may be null - `java.lang.String`
  locale - the locale that defines the case transformation rules, must not be null - `java.util.Locale`

  returns: the upper cased String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.util.Locale locale]
    (StringUtils/upperCase str locale))
  (^java.lang.String [^java.lang.String str]
    (StringUtils/upperCase str)))

(defn *strip-all
  "Strips any of a set of characters from the start and end of every
   String in an array.
   Whitespace is defined by Character.isWhitespace(char).

   A new array is returned each time, except for length zero.
   A null array will return null.
   An empty array will return itself.
   A null array entry will be ignored.
   A null stripChars will strip whitespace as defined by
   Character.isWhitespace(char).



   StringUtils.stripAll(null, *)                = null
   StringUtils.stripAll([], *)                  = []
   StringUtils.stripAll([\"abc\", \"  abc\"], null) = [\"abc\", \"abc\"]
   StringUtils.stripAll([\"abc  \", null], null)  = [\"abc\", null]
   StringUtils.stripAll([\"abc  \", null], \"yz\")  = [\"abc  \", null]
   StringUtils.stripAll([\"yabcz\", null], \"yz\")  = [\"abc\", null]

  strs - the array to remove characters from, may be null - `java.lang.String[]`
  strip-chars - the characters to remove, null treated as whitespace - `java.lang.String`

  returns: the stripped Strings, null if null array input - `java.lang.String[]`"
  ([strs ^java.lang.String strip-chars]
    (StringUtils/stripAll strs strip-chars))
  ([^java.lang.String strs]
    (StringUtils/stripAll strs)))

(defn *append-if-missing
  "Appends the suffix to the end of the string if the string does not
   already end with any of the suffixes.



   StringUtils.appendIfMissing(null, null) = null
   StringUtils.appendIfMissing(\"abc\", null) = \"abc\"
   StringUtils.appendIfMissing(\"\", \"xyz\") = \"xyz\"
   StringUtils.appendIfMissing(\"abc\", \"xyz\") = \"abcxyz\"
   StringUtils.appendIfMissing(\"abcxyz\", \"xyz\") = \"abcxyz\"
   StringUtils.appendIfMissing(\"abcXYZ\", \"xyz\") = \"abcXYZxyz\"
   With additional suffixes,


   StringUtils.appendIfMissing(null, null, null) = null
   StringUtils.appendIfMissing(\"abc\", null, null) = \"abc\"
   StringUtils.appendIfMissing(\"\", \"xyz\", null) = \"xyz\"
   StringUtils.appendIfMissing(\"abc\", \"xyz\", new CharSequence[]{null}) = \"abcxyz\"
   StringUtils.appendIfMissing(\"abc\", \"xyz\", \"\") = \"abc\"
   StringUtils.appendIfMissing(\"abc\", \"xyz\", \"mno\") = \"abcxyz\"
   StringUtils.appendIfMissing(\"abcxyz\", \"xyz\", \"mno\") = \"abcxyz\"
   StringUtils.appendIfMissing(\"abcmno\", \"xyz\", \"mno\") = \"abcmno\"
   StringUtils.appendIfMissing(\"abcXYZ\", \"xyz\", \"mno\") = \"abcXYZxyz\"
   StringUtils.appendIfMissing(\"abcMNO\", \"xyz\", \"mno\") = \"abcMNOxyz\"

  str - The string. - `java.lang.String`
  suffix - The suffix to append to the end of the string. - `java.lang.CharSequence`
  suffixes - Additional suffixes that are valid terminators. - `java.lang.CharSequence`

  returns: A new String if suffix was appended, the same string otherwise. - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.CharSequence suffix ^java.lang.CharSequence suffixes]
    (StringUtils/appendIfMissing str suffix suffixes)))

(defn *substring
  "Gets a substring from the specified String avoiding exceptions.

   A negative start position can be used to start/end n
   characters from the end of the String.

   The returned substring starts with the character in the start
   position and ends before the end position. All position counting is
   zero-based -- i.e., to start at the beginning of the string use
   start = 0. Negative start and end positions can be used to
   specify offsets relative to the end of the String.

   If start is not strictly to the left of end, \"\"
   is returned.



   StringUtils.substring(null, *, *)    = null
   StringUtils.substring(\"\", * ,  *)    = \"\";
   StringUtils.substring(\"abc\", 0, 2)   = \"ab\"
   StringUtils.substring(\"abc\", 2, 0)   = \"\"
   StringUtils.substring(\"abc\", 2, 4)   = \"c\"
   StringUtils.substring(\"abc\", 4, 6)   = \"\"
   StringUtils.substring(\"abc\", 2, 2)   = \"\"
   StringUtils.substring(\"abc\", -2, -1) = \"b\"
   StringUtils.substring(\"abc\", -4, 2)  = \"ab\"

  str - the String to get the substring from, may be null - `java.lang.String`
  start - the position to start from, negative means count back from the end of the String by this many characters - `int`
  end - the position to end at (exclusive), negative means count back from the end of the String by this many characters - `int`

  returns: substring from start position to end position,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer start ^Integer end]
    (StringUtils/substring str start end))
  (^java.lang.String [^java.lang.String str ^Integer start]
    (StringUtils/substring str start)))

(defn *strip-to-empty
  "Strips whitespace from the start and end of a String  returning
   an empty String if null input.

   This is similar to trimToEmpty(String) but removes whitespace.
   Whitespace is defined by Character.isWhitespace(char).



   StringUtils.stripToEmpty(null)     = \"\"
   StringUtils.stripToEmpty(\"\")       = \"\"
   StringUtils.stripToEmpty(\"   \")    = \"\"
   StringUtils.stripToEmpty(\"abc\")    = \"abc\"
   StringUtils.stripToEmpty(\"  abc\")  = \"abc\"
   StringUtils.stripToEmpty(\"abc  \")  = \"abc\"
   StringUtils.stripToEmpty(\" abc \")  = \"abc\"
   StringUtils.stripToEmpty(\" ab c \") = \"ab c\"

  str - the String to be stripped, may be null - `java.lang.String`

  returns: the trimmed String, or an empty String if null input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/stripToEmpty str)))

(defn *get-jaro-winkler-distance
  "Deprecated. as of 3.6, use commons-text

   JaroWinklerDistance instead

  first - the first String, must not be null - `java.lang.CharSequence`
  second - the second String, must not be null - `java.lang.CharSequence`

  returns: result distance - `double`

  throws: java.lang.IllegalArgumentException - if either String input null"
  (^Double [^java.lang.CharSequence first ^java.lang.CharSequence second]
    (StringUtils/getJaroWinklerDistance first second)))

(defn *equals-ignore-case
  "Compares two CharSequences, returning true if they represent
   equal sequences of characters, ignoring case.

   nulls are handled without exceptions. Two null
   references are considered equal. The comparison is case insensitive.



   StringUtils.equalsIgnoreCase(null, null)   = true
   StringUtils.equalsIgnoreCase(null, \"abc\")  = false
   StringUtils.equalsIgnoreCase(\"abc\", null)  = false
   StringUtils.equalsIgnoreCase(\"abc\", \"abc\") = true
   StringUtils.equalsIgnoreCase(\"abc\", \"ABC\") = true

  cs-1 - the first CharSequence, may be null - `java.lang.CharSequence`
  cs-2 - the second CharSequence, may be null - `java.lang.CharSequence`

  returns: true if the CharSequences are equal (case-insensitive), or both null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs-1 ^java.lang.CharSequence cs-2]
    (StringUtils/equalsIgnoreCase cs-1 cs-2)))

(defn *replace
  "Replaces a String with another String inside a larger String,
   for the first max values of the search String.

   A null reference passed to this method is a no-op.



   StringUtils.replace(null, *, *, *)         = null
   StringUtils.replace(\"\", *, *, *)           = \"\"
   StringUtils.replace(\"any\", null, *, *)     = \"any\"
   StringUtils.replace(\"any\", *, null, *)     = \"any\"
   StringUtils.replace(\"any\", \"\", *, *)       = \"any\"
   StringUtils.replace(\"any\", *, *, 0)        = \"any\"
   StringUtils.replace(\"abaa\", \"a\", null, -1) = \"abaa\"
   StringUtils.replace(\"abaa\", \"a\", \"\", -1)   = \"b\"
   StringUtils.replace(\"abaa\", \"a\", \"z\", 0)   = \"abaa\"
   StringUtils.replace(\"abaa\", \"a\", \"z\", 1)   = \"zbaa\"
   StringUtils.replace(\"abaa\", \"a\", \"z\", 2)   = \"zbza\"
   StringUtils.replace(\"abaa\", \"a\", \"z\", -1)  = \"zbzz\"

  text - text to search and replace in, may be null - `java.lang.String`
  search-string - the String to search for, may be null - `java.lang.String`
  replacement - the String to replace it with, may be null - `java.lang.String`
  max - maximum number of values to replace, or -1 if no maximum - `int`

  returns: the text with any replacements processed,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.lang.String search-string ^java.lang.String replacement ^Integer max]
    (StringUtils/replace text search-string replacement max))
  (^java.lang.String [^java.lang.String text ^java.lang.String search-string ^java.lang.String replacement]
    (StringUtils/replace text search-string replacement)))

(defn *strip-start
  "Strips any of a set of characters from the start of a String.

   A null input String returns null.
   An empty string (\"\") input returns the empty string.

   If the stripChars String is null, whitespace is
   stripped as defined by Character.isWhitespace(char).



   StringUtils.stripStart(null, *)          = null
   StringUtils.stripStart(\"\", *)            = \"\"
   StringUtils.stripStart(\"abc\", \"\")        = \"abc\"
   StringUtils.stripStart(\"abc\", null)      = \"abc\"
   StringUtils.stripStart(\"  abc\", null)    = \"abc\"
   StringUtils.stripStart(\"abc  \", null)    = \"abc  \"
   StringUtils.stripStart(\" abc \", null)    = \"abc \"
   StringUtils.stripStart(\"yxabc  \", \"xyz\") = \"abc  \"

  str - the String to remove characters from, may be null - `java.lang.String`
  strip-chars - the characters to remove, null treated as whitespace - `java.lang.String`

  returns: the stripped String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String strip-chars]
    (StringUtils/stripStart str strip-chars)))

(defn *last-ordinal-index-of
  "Finds the n-th last index within a String, handling null.
   This method uses String.lastIndexOf(String).

   A null String will return -1.



   StringUtils.lastOrdinalIndexOf(null, *, *)          = -1
   StringUtils.lastOrdinalIndexOf(*, null, *)          = -1
   StringUtils.lastOrdinalIndexOf(\"\", \"\", *)           = 0
   StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 1)  = 7
   StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"a\", 2)  = 6
   StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 1)  = 5
   StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"b\", 2)  = 2
   StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 1) = 4
   StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"ab\", 2) = 1
   StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 1)   = 8
   StringUtils.lastOrdinalIndexOf(\"aabaabaa\", \"\", 2)   = 8

   Note that 'tail(CharSequence str, int n)' may be implemented as:



     str.substring(lastOrdinalIndexOf(str, \"\\n\", n)  1)

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-str - the CharSequence to find, may be null - `java.lang.CharSequence`
  ordinal - the n-th last searchStr to find - `int`

  returns: the n-th last index of the search CharSequence,
    -1 (INDEX_NOT_FOUND) if no match or null string input - `int`"
  (^Integer [^java.lang.CharSequence str ^java.lang.CharSequence search-str ^Integer ordinal]
    (StringUtils/lastOrdinalIndexOf str search-str ordinal)))

(defn *all-empty?
  "Checks if all of the CharSequences are empty (\"\") or null.



   StringUtils.isAllEmpty(null)             = true
   StringUtils.isAllEmpty(null, \"\")         = true
   StringUtils.isAllEmpty(new String[] {})  = true
   StringUtils.isAllEmpty(null, \"foo\")      = false
   StringUtils.isAllEmpty(\"\", \"bar\")        = false
   StringUtils.isAllEmpty(\"bob\", \"\")        = false
   StringUtils.isAllEmpty(\"  bob  \", null)  = false
   StringUtils.isAllEmpty(\" \", \"bar\")       = false
   StringUtils.isAllEmpty(\"foo\", \"bar\")     = false

  css - the CharSequences to check, may be null or empty - `java.lang.CharSequence`

  returns: true if all of the CharSequences are empty or null - `boolean`"
  (^Boolean [^java.lang.CharSequence css]
    (StringUtils/isAllEmpty css)))

(defn *center
  "Centers a String in a larger String of size size.
   Uses a supplied character as the value to pad the String with.

   If the size is less than the String length, the String is returned.
   A null String returns null.
   A negative size is treated as zero.



   StringUtils.center(null, *, *)     = null
   StringUtils.center(\"\", 4, ' ')     = \"    \"
   StringUtils.center(\"ab\", -1, ' ')  = \"ab\"
   StringUtils.center(\"ab\", 4, ' ')   = \" ab \"
   StringUtils.center(\"abcd\", 2, ' ') = \"abcd\"
   StringUtils.center(\"a\", 4, ' ')    = \" a  \"
   StringUtils.center(\"a\", 4, 'y')    = \"yayy\"

  str - the String to center, may be null - `java.lang.String`
  size - the int size of new String, negative treated as zero - `int`
  pad-char - the character to pad the new String with - `char`

  returns: centered String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer size ^Character pad-char]
    (StringUtils/center str size pad-char))
  (^java.lang.String [^java.lang.String str ^Integer size]
    (StringUtils/center str size)))

(defn *remove-first
  "Deprecated. Moved to RegExUtils.

  text - text to remove from, may be null - `java.lang.String`
  regex - the regular expression to which this string is to be matched - `java.lang.String`

  returns: the text with the first replacement processed,
                null if null String input - `java.lang.String`

  throws: java.util.regex.PatternSyntaxException - if the regular expression's syntax is invalid"
  (^java.lang.String [^java.lang.String text ^java.lang.String regex]
    (StringUtils/removeFirst text regex)))

(defn *last-index-of
  "Returns the index within seq of the last occurrence of
   the specified character, searching backward starting at the
   specified index. For values of searchChar in the range
   from 0 to 0xFFFF (inclusive), the index returned is the largest
   value k such that:


   (this.charAt(k) == searchChar) && (k <= startPos)
   is true. For other values of searchChar, it is the
   largest value k such that:


   (this.codePointAt(k) == searchChar) && (k <= startPos)
   is true. In either case, if no such character occurs in seq
   at or before position startPos, then
   -1 is returned. Furthermore, a null or empty (\"\")
   CharSequence will return -1. A start position greater
   than the string length searches the whole string.
   The search starts at the startPos and works backwards;
   matches starting after the start position are ignored.

   All indices are specified in char values
   (Unicode code units).



   StringUtils.lastIndexOf(null, *, *)          = -1
   StringUtils.lastIndexOf(\"\", *,  *)           = -1
   StringUtils.lastIndexOf(\"aabaabaa\", 'b', 8)  = 5
   StringUtils.lastIndexOf(\"aabaabaa\", 'b', 4)  = 2
   StringUtils.lastIndexOf(\"aabaabaa\", 'b', 0)  = -1
   StringUtils.lastIndexOf(\"aabaabaa\", 'b', 9)  = 5
   StringUtils.lastIndexOf(\"aabaabaa\", 'b', -1) = -1
   StringUtils.lastIndexOf(\"aabaabaa\", 'a', 0)  = 0

  seq - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-char - the character to find - `int`
  start-pos - the start position - `int`

  returns: the last index of the search character (always ≤ startPos),
    -1 if no match or null string input - `int`"
  (^Integer [^java.lang.CharSequence seq ^Integer search-char ^Integer start-pos]
    (StringUtils/lastIndexOf seq search-char start-pos))
  (^Integer [^java.lang.CharSequence seq ^Integer search-char]
    (StringUtils/lastIndexOf seq search-char)))

(defn *trim-to-null
  "Removes control characters (char <= 32) from both
   ends of this String returning null if the String is
   empty (\"\") after the trim or if it is null.

   The String is trimmed using String.trim().
   Trim removes start and end characters <= 32.
   To strip whitespace use stripToNull(String).



   StringUtils.trimToNull(null)          = null
   StringUtils.trimToNull(\"\")            = null
   StringUtils.trimToNull(\"     \")       = null
   StringUtils.trimToNull(\"abc\")         = \"abc\"
   StringUtils.trimToNull(\"    abc    \") = \"abc\"

  str - the String to be trimmed, may be null - `java.lang.String`

  returns: the trimmed String,
    null if only chars <= 32, empty or null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/trimToNull str)))

(defn *replace-chars
  "Replaces all occurrences of a character in a String with another.
   This is a null-safe version of String.replace(char, char).

   A null string input returns null.
   An empty (\"\") string input returns an empty string.



   StringUtils.replaceChars(null, *, *)        = null
   StringUtils.replaceChars(\"\", *, *)          = \"\"
   StringUtils.replaceChars(\"abcba\", 'b', 'y') = \"aycya\"
   StringUtils.replaceChars(\"abcba\", 'z', 'y') = \"abcba\"

  str - String to replace characters in, may be null - `java.lang.String`
  search-char - the character to search for, may be null - `char`
  replace-char - the character to replace, may be null - `char`

  returns: modified String, null if null string input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character search-char ^Character replace-char]
    (StringUtils/replaceChars str search-char replace-char)))

(defn *all-upper-case?
  "Checks if the CharSequence contains only uppercase characters.

   null will return false.
   An empty String (length()=0) will return false.



   StringUtils.isAllUpperCase(null)   = false
   StringUtils.isAllUpperCase(\"\")     = false
   StringUtils.isAllUpperCase(\"  \")   = false
   StringUtils.isAllUpperCase(\"ABC\")  = true
   StringUtils.isAllUpperCase(\"aBC\")  = false
   StringUtils.isAllUpperCase(\"A C\")  = false
   StringUtils.isAllUpperCase(\"A1C\")  = false
   StringUtils.isAllUpperCase(\"A/C\")  = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if only contains uppercase characters, and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isAllUpperCase cs)))

(defn *not-empty?
  "Checks if a CharSequence is not empty (\"\") and not null.



   StringUtils.isNotEmpty(null)      = false
   StringUtils.isNotEmpty(\"\")        = false
   StringUtils.isNotEmpty(\" \")       = true
   StringUtils.isNotEmpty(\"bob\")     = true
   StringUtils.isNotEmpty(\"  bob  \") = true

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence is not empty and not null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isNotEmpty cs)))

(defn *capitalize
  "Capitalizes a String changing the first character to title case as
   per Character.toTitleCase(int). No other characters are changed.

   For a word based algorithm, see WordUtils.capitalize(String).
   A null input String returns null.



   StringUtils.capitalize(null)  = null
   StringUtils.capitalize(\"\")    = \"\"
   StringUtils.capitalize(\"cat\") = \"Cat\"
   StringUtils.capitalize(\"cAt\") = \"CAt\"
   StringUtils.capitalize(\"'cat'\") = \"'cat'\"

  str - the String to capitalize, may be null - `java.lang.String`

  returns: the capitalized String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/capitalize str)))

(defn *split
  "Splits the provided text into an array with a maximum length,
   separators specified.

   The separator is not included in the returned String array.
   Adjacent separators are treated as one separator.

   A null input String returns null.
   A null separatorChars splits on whitespace.

   If more than max delimited substrings are found, the last
   returned string includes all characters after the first max - 1
   returned strings (including separator characters).



   StringUtils.split(null, *, *)            = null
   StringUtils.split(\"\", *, *)              = []
   StringUtils.split(\"ab cd ef\", null, 0)   = [\"ab\", \"cd\", \"ef\"]
   StringUtils.split(\"ab   cd ef\", null, 0) = [\"ab\", \"cd\", \"ef\"]
   StringUtils.split(\"ab:cd:ef\", \":\", 0)    = [\"ab\", \"cd\", \"ef\"]
   StringUtils.split(\"ab:cd:ef\", \":\", 2)    = [\"ab\", \"cd:ef\"]

  str - the String to parse, may be null - `java.lang.String`
  separator-chars - the characters used as the delimiters, null splits on whitespace - `java.lang.String`
  max - the maximum number of elements to include in the array. A zero or negative value implies no limit - `int`

  returns: an array of parsed Strings, null if null String input - `java.lang.String[]`"
  ([^java.lang.String str ^java.lang.String separator-chars ^Integer max]
    (StringUtils/split str separator-chars max))
  ([^java.lang.String str ^Character separator-char]
    (StringUtils/split str separator-char))
  ([^java.lang.String str]
    (StringUtils/split str)))

(defn *default-if-blank
  "Returns either the passed in CharSequence, or if the CharSequence is
   whitespace, empty (\"\") or null, the value of defaultStr.

   Whitespace is defined by Character.isWhitespace(char).



   StringUtils.defaultIfBlank(null, \"NULL\")  = \"NULL\"
   StringUtils.defaultIfBlank(\"\", \"NULL\")    = \"NULL\"
   StringUtils.defaultIfBlank(\" \", \"NULL\")   = \"NULL\"
   StringUtils.defaultIfBlank(\"bat\", \"NULL\") = \"bat\"
   StringUtils.defaultIfBlank(\"\", null)      = null

  str - the CharSequence to check, may be null - `T`
  default-str - the default CharSequence to return if the input is whitespace, empty (\"\") or null, may be null - `T`

  returns: the passed in CharSequence, or the default - `<T extends java.lang.CharSequence> T`"
  ([str default-str]
    (StringUtils/defaultIfBlank str default-str)))

(defn *remove
  "Removes all occurrences of a substring from within the source string.

   A null source string will return null.
   An empty (\"\") source string will return the empty string.
   A null remove string will return the source string.
   An empty (\"\") remove string will return the source string.



   StringUtils.remove(null, *)        = null
   StringUtils.remove(\"\", *)          = \"\"
   StringUtils.remove(*, null)        = *
   StringUtils.remove(*, \"\")          = *
   StringUtils.remove(\"queued\", \"ue\") = \"qd\"
   StringUtils.remove(\"queued\", \"zz\") = \"queued\"

  str - the source String to search, may be null - `java.lang.String`
  remove - the String to search for and remove, may be null - `java.lang.String`

  returns: the substring with the string removed if found,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String remove]
    (StringUtils/remove str remove)))

(defn *index-of-ignore-case
  "Case in-sensitive find of the first index within a CharSequence
   from the specified position.

   A null CharSequence will return -1.
   A negative start position is treated as zero.
   An empty (\"\") search CharSequence always matches.
   A start position greater than the string length only matches
   an empty search CharSequence.



   StringUtils.indexOfIgnoreCase(null, *, *)          = -1
   StringUtils.indexOfIgnoreCase(*, null, *)          = -1
   StringUtils.indexOfIgnoreCase(\"\", \"\", 0)           = 0
   StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"A\", 0)  = 0
   StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 0)  = 2
   StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"AB\", 0) = 1
   StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 3)  = 5
   StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", 9)  = -1
   StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"B\", -1) = 2
   StringUtils.indexOfIgnoreCase(\"aabaabaa\", \"\", 2)   = 2
   StringUtils.indexOfIgnoreCase(\"abc\", \"\", 9)        = -1

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-str - the CharSequence to find, may be null - `java.lang.CharSequence`
  start-pos - the start position, negative treated as zero - `int`

  returns: the first index of the search CharSequence (always ≥ startPos),
    -1 if no match or null string input - `int`"
  (^Integer [^java.lang.CharSequence str ^java.lang.CharSequence search-str ^Integer start-pos]
    (StringUtils/indexOfIgnoreCase str search-str start-pos))
  (^Integer [^java.lang.CharSequence str ^java.lang.CharSequence search-str]
    (StringUtils/indexOfIgnoreCase str search-str)))

(defn *split-by-whole-separator-preserve-all-tokens
  "Splits the provided text into an array, separator string specified.
   Returns a maximum of max substrings.

   The separator is not included in the returned String array.
   Adjacent separators are treated as separators for empty tokens.
   For more control over the split use the StrTokenizer class.

   A null input String returns null.
   A null separator splits on whitespace.



   StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               = null
   StringUtils.splitByWholeSeparatorPreserveAllTokens(\"\", *, *)                 = []
   StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab de fg\", null, 0)      = [\"ab\", \"de\", \"fg\"]
   StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab   de fg\", null, 0)    = [\"ab\", \"\", \"\", \"de\", \"fg\"]
   StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab:cd:ef\", \":\", 2)       = [\"ab\", \"cd:ef\"]
   StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 5) = [\"ab\", \"cd\", \"ef\"]
   StringUtils.splitByWholeSeparatorPreserveAllTokens(\"ab-!-cd-!-ef\", \"-!-\", 2) = [\"ab\", \"cd-!-ef\"]

  str - the String to parse, may be null - `java.lang.String`
  separator - String containing the String to be used as a delimiter, null splits on whitespace - `java.lang.String`
  max - the maximum number of elements to include in the returned array. A zero or negative value implies no limit. - `int`

  returns: an array of parsed Strings, null if null String was input - `java.lang.String[]`"
  ([^java.lang.String str ^java.lang.String separator ^Integer max]
    (StringUtils/splitByWholeSeparatorPreserveAllTokens str separator max))
  ([^java.lang.String str ^java.lang.String separator]
    (StringUtils/splitByWholeSeparatorPreserveAllTokens str separator)))

(defn *wrap-if-missing
  "Wraps a string with a char if that char is missing from the start or end of the given string.




   StringUtils.wrapIfMissing(null, *)        = null
   StringUtils.wrapIfMissing(\"\", *)          = \"\"
   StringUtils.wrapIfMissing(\"ab\", '\\0')     = \"ab\"
   StringUtils.wrapIfMissing(\"ab\", 'x')      = \"xabx\"
   StringUtils.wrapIfMissing(\"ab\", '\\'')     = \"'ab'\"
   StringUtils.wrapIfMissing(\"\\\"ab\\\"\", '\\\"') = \"\\\"ab\\\"\"
   StringUtils.wrapIfMissing(\"/\", '/')  = \"/\"
   StringUtils.wrapIfMissing(\"a/b/c\", '/')  = \"/a/b/c/\"
   StringUtils.wrapIfMissing(\"/a/b/c\", '/')  = \"/a/b/c/\"
   StringUtils.wrapIfMissing(\"a/b/c/\", '/')  = \"/a/b/c/\"

  str - the string to be wrapped, may be null - `java.lang.String`
  wrap-with - the char that will wrap str - `char`

  returns: the wrapped string, or null if str==null - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character wrap-with]
    (StringUtils/wrapIfMissing str wrap-with)))

(defn *alpha?
  "Checks if the CharSequence contains only Unicode letters.

   null will return false.
   An empty CharSequence (length()=0) will return false.



   StringUtils.isAlpha(null)   = false
   StringUtils.isAlpha(\"\")     = false
   StringUtils.isAlpha(\"  \")   = false
   StringUtils.isAlpha(\"abc\")  = true
   StringUtils.isAlpha(\"ab2c\") = false
   StringUtils.isAlpha(\"ab-c\") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if only contains letters, and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isAlpha cs)))

(defn *none-blank?
  "Checks if none of the CharSequences are empty (\"\"), null or whitespace only.

   Whitespace is defined by Character.isWhitespace(char).



   StringUtils.isNoneBlank((String) null)    = false
   StringUtils.isNoneBlank((String[]) null)  = true
   StringUtils.isNoneBlank(null, \"foo\")      = false
   StringUtils.isNoneBlank(null, null)       = false
   StringUtils.isNoneBlank(\"\", \"bar\")        = false
   StringUtils.isNoneBlank(\"bob\", \"\")        = false
   StringUtils.isNoneBlank(\"  bob  \", null)  = false
   StringUtils.isNoneBlank(\" \", \"bar\")       = false
   StringUtils.isNoneBlank(new String[] {})  = true
   StringUtils.isNoneBlank(new String[]{\"\"}) = false
   StringUtils.isNoneBlank(\"foo\", \"bar\")     = true

  css - the CharSequences to check, may be null or empty - `java.lang.CharSequence`

  returns: true if none of the CharSequences are empty or null or whitespace only - `boolean`"
  (^Boolean [^java.lang.CharSequence css]
    (StringUtils/isNoneBlank css)))

(defn *alphanumeric?
  "Checks if the CharSequence contains only Unicode letters or digits.

   null will return false.
   An empty CharSequence (length()=0) will return false.



   StringUtils.isAlphanumeric(null)   = false
   StringUtils.isAlphanumeric(\"\")     = false
   StringUtils.isAlphanumeric(\"  \")   = false
   StringUtils.isAlphanumeric(\"abc\")  = true
   StringUtils.isAlphanumeric(\"ab c\") = false
   StringUtils.isAlphanumeric(\"ab2c\") = true
   StringUtils.isAlphanumeric(\"ab-c\") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if only contains letters or digits,
    and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isAlphanumeric cs)))

(defn *remove-start-ignore-case
  "Case insensitive removal of a substring if it is at the beginning of a source string,
   otherwise returns the source string.

   A null source string will return null.
   An empty (\"\") source string will return the empty string.
   A null search string will return the source string.



   StringUtils.removeStartIgnoreCase(null, *)      = null
   StringUtils.removeStartIgnoreCase(\"\", *)        = \"\"
   StringUtils.removeStartIgnoreCase(*, null)      = *
   StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"www.\")   = \"domain.com\"
   StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"WWW.\")   = \"domain.com\"
   StringUtils.removeStartIgnoreCase(\"domain.com\", \"www.\")       = \"domain.com\"
   StringUtils.removeStartIgnoreCase(\"www.domain.com\", \"domain\") = \"www.domain.com\"
   StringUtils.removeStartIgnoreCase(\"abc\", \"\")    = \"abc\"

  str - the source String to search, may be null - `java.lang.String`
  remove - the String to search for (case insensitive) and remove, may be null - `java.lang.String`

  returns: the substring with the string removed if found,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String remove]
    (StringUtils/removeStartIgnoreCase str remove)))

(defn *default-string
  "Returns either the passed in String, or if the String is
   null, the value of defaultStr.



   StringUtils.defaultString(null, \"NULL\")  = \"NULL\"
   StringUtils.defaultString(\"\", \"NULL\")    = \"\"
   StringUtils.defaultString(\"bat\", \"NULL\") = \"bat\"

  str - the String to check, may be null - `java.lang.String`
  default-str - the default String to return if the input is null, may be null - `java.lang.String`

  returns: the passed in String, or the default if it was null - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String default-str]
    (StringUtils/defaultString str default-str))
  (^java.lang.String [^java.lang.String str]
    (StringUtils/defaultString str)))

(defn *any-empty?
  "Checks if any of the CharSequences are empty (\"\") or null.



   StringUtils.isAnyEmpty((String) null)    = true
   StringUtils.isAnyEmpty((String[]) null)  = false
   StringUtils.isAnyEmpty(null, \"foo\")      = true
   StringUtils.isAnyEmpty(\"\", \"bar\")        = true
   StringUtils.isAnyEmpty(\"bob\", \"\")        = true
   StringUtils.isAnyEmpty(\"  bob  \", null)  = true
   StringUtils.isAnyEmpty(\" \", \"bar\")       = false
   StringUtils.isAnyEmpty(\"foo\", \"bar\")     = false
   StringUtils.isAnyEmpty(new String[]{})   = false
   StringUtils.isAnyEmpty(new String[]{\"\"}) = true

  css - the CharSequences to check, may be null or empty - `java.lang.CharSequence`

  returns: true if any of the CharSequences are empty or null - `boolean`"
  (^Boolean [^java.lang.CharSequence css]
    (StringUtils/isAnyEmpty css)))

(defn *strip-accents
  "Removes diacritics (~= accents) from a string. The case will not be altered.
   For instance, 'à' will be replaced by 'a'.
   Note that ligatures will be left as is.



   StringUtils.stripAccents(null)                = null
   StringUtils.stripAccents(\"\")                  = \"\"
   StringUtils.stripAccents(\"control\")           = \"control\"
   StringUtils.stripAccents(\"éclair\")     = \"eclair\"

  input - String to be stripped - `java.lang.String`

  returns: input text with diacritics removed - `java.lang.String`"
  (^java.lang.String [^java.lang.String input]
    (StringUtils/stripAccents input)))

(defn *length
  "Gets a CharSequence length or 0 if the CharSequence is
   null.

  cs - a CharSequence or null - `java.lang.CharSequence`

  returns: CharSequence length or 0 if the CharSequence is
           null. - `int`"
  (^Integer [^java.lang.CharSequence cs]
    (StringUtils/length cs)))

(defn *truncate
  "Truncates a String. This will turn
   \"Now is the time for all good men\" into \"is the time for all\".

   Works like truncate(String, int), but allows you to specify
   a \"left edge\" offset.

   Specifically:

     If str is less than maxWidth characters
         long, return it.
     Else truncate it to substring(str, offset, maxWidth).
     If maxWidth is less than 0, throw an
         IllegalArgumentException.
     If offset is less than 0, throw an
         IllegalArgumentException.
     In no case will it return a String of length greater than
         maxWidth.




   StringUtils.truncate(null, 0, 0) = null
   StringUtils.truncate(null, 2, 4) = null
   StringUtils.truncate(\"\", 0, 10) = \"\"
   StringUtils.truncate(\"\", 2, 10) = \"\"
   StringUtils.truncate(\"abcdefghij\", 0, 3) = \"abc\"
   StringUtils.truncate(\"abcdefghij\", 5, 6) = \"fghij\"
   StringUtils.truncate(\"raspberry peach\", 10, 15) = \"peach\"
   StringUtils.truncate(\"abcdefghijklmno\", 0, 10) = \"abcdefghij\"
   StringUtils.truncate(\"abcdefghijklmno\", -1, 10) = throws an IllegalArgumentException
   StringUtils.truncate(\"abcdefghijklmno\", Integer.MIN_VALUE, 10) = \"abcdefghij\"
   StringUtils.truncate(\"abcdefghijklmno\", Integer.MIN_VALUE, Integer.MAX_VALUE) = \"abcdefghijklmno\"
   StringUtils.truncate(\"abcdefghijklmno\", 0, Integer.MAX_VALUE) = \"abcdefghijklmno\"
   StringUtils.truncate(\"abcdefghijklmno\", 1, 10) = \"bcdefghijk\"
   StringUtils.truncate(\"abcdefghijklmno\", 2, 10) = \"cdefghijkl\"
   StringUtils.truncate(\"abcdefghijklmno\", 3, 10) = \"defghijklm\"
   StringUtils.truncate(\"abcdefghijklmno\", 4, 10) = \"efghijklmn\"
   StringUtils.truncate(\"abcdefghijklmno\", 5, 10) = \"fghijklmno\"
   StringUtils.truncate(\"abcdefghijklmno\", 5, 5) = \"fghij\"
   StringUtils.truncate(\"abcdefghijklmno\", 5, 3) = \"fgh\"
   StringUtils.truncate(\"abcdefghijklmno\", 10, 3) = \"klm\"
   StringUtils.truncate(\"abcdefghijklmno\", 10, Integer.MAX_VALUE) = \"klmno\"
   StringUtils.truncate(\"abcdefghijklmno\", 13, 1) = \"n\"
   StringUtils.truncate(\"abcdefghijklmno\", 13, Integer.MAX_VALUE) = \"no\"
   StringUtils.truncate(\"abcdefghijklmno\", 14, 1) = \"o\"
   StringUtils.truncate(\"abcdefghijklmno\", 14, Integer.MAX_VALUE) = \"o\"
   StringUtils.truncate(\"abcdefghijklmno\", 15, 1) = \"\"
   StringUtils.truncate(\"abcdefghijklmno\", 15, Integer.MAX_VALUE) = \"\"
   StringUtils.truncate(\"abcdefghijklmno\", Integer.MAX_VALUE, Integer.MAX_VALUE) = \"\"
   StringUtils.truncate(\"abcdefghij\", 3, -1) = throws an IllegalArgumentException
   StringUtils.truncate(\"abcdefghij\", -2, 4) = throws an IllegalArgumentException

  str - the String to check, may be null - `java.lang.String`
  offset - left edge of source String - `int`
  max-width - maximum length of result String, must be positive - `int`

  returns: truncated String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer offset ^Integer max-width]
    (StringUtils/truncate str offset max-width))
  (^java.lang.String [^java.lang.String str ^Integer max-width]
    (StringUtils/truncate str max-width)))

(defn *alphanumeric-space?
  "Checks if the CharSequence contains only Unicode letters, digits
   or space (' ').

   null will return false.
   An empty CharSequence (length()=0) will return true.



   StringUtils.isAlphanumericSpace(null)   = false
   StringUtils.isAlphanumericSpace(\"\")     = true
   StringUtils.isAlphanumericSpace(\"  \")   = true
   StringUtils.isAlphanumericSpace(\"abc\")  = true
   StringUtils.isAlphanumericSpace(\"ab c\") = true
   StringUtils.isAlphanumericSpace(\"ab2c\") = true
   StringUtils.isAlphanumericSpace(\"ab-c\") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if only contains letters, digits or space,
    and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isAlphanumericSpace cs)))

(defn *substrings-between
  "Searches a String for substrings delimited by a start and end tag,
   returning all matching substrings in an array.

   A null input String returns null.
   A null open/close returns null (no match).
   An empty (\"\") open/close returns null (no match).



   StringUtils.substringsBetween(\"[a][b][c]\", \"[\", \"]\") = [\"a\",\"b\",\"c\"]
   StringUtils.substringsBetween(null, *, *)            = null
   StringUtils.substringsBetween(*, null, *)            = null
   StringUtils.substringsBetween(*, *, null)            = null
   StringUtils.substringsBetween(\"\", \"[\", \"]\")          = []

  str - the String containing the substrings, null returns null, empty returns empty - `java.lang.String`
  open - the String identifying the start of the substring, empty returns null - `java.lang.String`
  close - the String identifying the end of the substring, empty returns null - `java.lang.String`

  returns: a String Array of substrings, or null if no match - `java.lang.String[]`"
  ([^java.lang.String str ^java.lang.String open ^java.lang.String close]
    (StringUtils/substringsBetween str open close)))

(defn *remove-ignore-case
  "Case insensitive removal of all occurrences of a substring from within
   the source string.



   A null source string will return null. An empty (\"\")
   source string will return the empty string. A null remove string
   will return the source string. An empty (\"\") remove string will return
   the source string.




   StringUtils.removeIgnoreCase(null, *)        = null
   StringUtils.removeIgnoreCase(\"\", *)          = \"\"
   StringUtils.removeIgnoreCase(*, null)        = *
   StringUtils.removeIgnoreCase(*, \"\")          = *
   StringUtils.removeIgnoreCase(\"queued\", \"ue\") = \"qd\"
   StringUtils.removeIgnoreCase(\"queued\", \"zz\") = \"queued\"
   StringUtils.removeIgnoreCase(\"quEUed\", \"UE\") = \"qd\"
   StringUtils.removeIgnoreCase(\"queued\", \"zZ\") = \"queued\"

  str - the source String to search, may be null - `java.lang.String`
  remove - the String to search for (case insensitive) and remove, may be null - `java.lang.String`

  returns: the substring with the string removed if found, null if
           null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String remove]
    (StringUtils/removeIgnoreCase str remove)))

(defn *strip
  "Strips any of a set of characters from the start and end of a String.
   This is similar to String.trim() but allows the characters
   to be stripped to be controlled.

   A null input String returns null.
   An empty string (\"\") input returns the empty string.

   If the stripChars String is null, whitespace is
   stripped as defined by Character.isWhitespace(char).
   Alternatively use strip(String).



   StringUtils.strip(null, *)          = null
   StringUtils.strip(\"\", *)            = \"\"
   StringUtils.strip(\"abc\", null)      = \"abc\"
   StringUtils.strip(\"  abc\", null)    = \"abc\"
   StringUtils.strip(\"abc  \", null)    = \"abc\"
   StringUtils.strip(\" abc \", null)    = \"abc\"
   StringUtils.strip(\"  abcyx\", \"xyz\") = \"  abc\"

  str - the String to remove characters from, may be null - `java.lang.String`
  strip-chars - the characters to remove, null treated as whitespace - `java.lang.String`

  returns: the stripped String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String strip-chars]
    (StringUtils/strip str strip-chars))
  (^java.lang.String [^java.lang.String str]
    (StringUtils/strip str)))

(defn *left-pad
  "Left pad a String with a specified character.

   Pad to a size of size.



   StringUtils.leftPad(null, *, *)     = null
   StringUtils.leftPad(\"\", 3, 'z')     = \"zzz\"
   StringUtils.leftPad(\"bat\", 3, 'z')  = \"bat\"
   StringUtils.leftPad(\"bat\", 5, 'z')  = \"zzbat\"
   StringUtils.leftPad(\"bat\", 1, 'z')  = \"bat\"
   StringUtils.leftPad(\"bat\", -1, 'z') = \"bat\"

  str - the String to pad out, may be null - `java.lang.String`
  size - the size to pad to - `int`
  pad-char - the character to pad with - `char`

  returns: left padded String or original String if no padding is necessary,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer size ^Character pad-char]
    (StringUtils/leftPad str size pad-char))
  (^java.lang.String [^java.lang.String str ^Integer size]
    (StringUtils/leftPad str size)))

(defn *remove-end-ignore-case
  "Case insensitive removal of a substring if it is at the end of a source string,
   otherwise returns the source string.

   A null source string will return null.
   An empty (\"\") source string will return the empty string.
   A null search string will return the source string.



   StringUtils.removeEndIgnoreCase(null, *)      = null
   StringUtils.removeEndIgnoreCase(\"\", *)        = \"\"
   StringUtils.removeEndIgnoreCase(*, null)      = *
   StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com.\")  = \"www.domain.com\"
   StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".com\")   = \"www.domain\"
   StringUtils.removeEndIgnoreCase(\"www.domain.com\", \"domain\") = \"www.domain.com\"
   StringUtils.removeEndIgnoreCase(\"abc\", \"\")    = \"abc\"
   StringUtils.removeEndIgnoreCase(\"www.domain.com\", \".COM\") = \"www.domain\")
   StringUtils.removeEndIgnoreCase(\"www.domain.COM\", \".com\") = \"www.domain\")

  str - the source String to search, may be null - `java.lang.String`
  remove - the String to search for (case insensitive) and remove, may be null - `java.lang.String`

  returns: the substring with the string removed if found,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String remove]
    (StringUtils/removeEndIgnoreCase str remove)))

(defn *replace-ignore-case
  "Case insensitively replaces a String with another String inside a larger String,
   for the first max values of the search String.

   A null reference passed to this method is a no-op.



   StringUtils.replaceIgnoreCase(null, *, *, *)         = null
   StringUtils.replaceIgnoreCase(\"\", *, *, *)           = \"\"
   StringUtils.replaceIgnoreCase(\"any\", null, *, *)     = \"any\"
   StringUtils.replaceIgnoreCase(\"any\", *, null, *)     = \"any\"
   StringUtils.replaceIgnoreCase(\"any\", \"\", *, *)       = \"any\"
   StringUtils.replaceIgnoreCase(\"any\", *, *, 0)        = \"any\"
   StringUtils.replaceIgnoreCase(\"abaa\", \"a\", null, -1) = \"abaa\"
   StringUtils.replaceIgnoreCase(\"abaa\", \"a\", \"\", -1)   = \"b\"
   StringUtils.replaceIgnoreCase(\"abaa\", \"a\", \"z\", 0)   = \"abaa\"
   StringUtils.replaceIgnoreCase(\"abaa\", \"A\", \"z\", 1)   = \"zbaa\"
   StringUtils.replaceIgnoreCase(\"abAa\", \"a\", \"z\", 2)   = \"zbza\"
   StringUtils.replaceIgnoreCase(\"abAa\", \"a\", \"z\", -1)  = \"zbzz\"

  text - text to search and replace in, may be null - `java.lang.String`
  search-string - the String to search for (case insensitive), may be null - `java.lang.String`
  replacement - the String to replace it with, may be null - `java.lang.String`
  max - maximum number of values to replace, or -1 if no maximum - `int`

  returns: the text with any replacements processed,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.lang.String search-string ^java.lang.String replacement ^Integer max]
    (StringUtils/replaceIgnoreCase text search-string replacement max))
  (^java.lang.String [^java.lang.String text ^java.lang.String search-string ^java.lang.String replacement]
    (StringUtils/replaceIgnoreCase text search-string replacement)))

(defn *starts-with
  "Check if a CharSequence starts with a specified prefix.

   nulls are handled without exceptions. Two null
   references are considered to be equal. The comparison is case sensitive.



   StringUtils.startsWith(null, null)      = true
   StringUtils.startsWith(null, \"abc\")     = false
   StringUtils.startsWith(\"abcdef\", null)  = false
   StringUtils.startsWith(\"abcdef\", \"abc\") = true
   StringUtils.startsWith(\"ABCDEF\", \"abc\") = false

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  prefix - the prefix to find, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence starts with the prefix, case sensitive, or
    both null - `boolean`"
  (^Boolean [^java.lang.CharSequence str ^java.lang.CharSequence prefix]
    (StringUtils/startsWith str prefix)))

(defn *none-empty?
  "Checks if none of the CharSequences are empty (\"\") or null.



   StringUtils.isNoneEmpty((String) null)    = false
   StringUtils.isNoneEmpty((String[]) null)  = true
   StringUtils.isNoneEmpty(null, \"foo\")      = false
   StringUtils.isNoneEmpty(\"\", \"bar\")        = false
   StringUtils.isNoneEmpty(\"bob\", \"\")        = false
   StringUtils.isNoneEmpty(\"  bob  \", null)  = false
   StringUtils.isNoneEmpty(new String[] {})  = true
   StringUtils.isNoneEmpty(new String[]{\"\"}) = false
   StringUtils.isNoneEmpty(\" \", \"bar\")       = true
   StringUtils.isNoneEmpty(\"foo\", \"bar\")     = true

  css - the CharSequences to check, may be null or empty - `java.lang.CharSequence`

  returns: true if none of the CharSequences are empty or null - `boolean`"
  (^Boolean [^java.lang.CharSequence css]
    (StringUtils/isNoneEmpty css)))

(defn *equals-any-ignore-case
  "Compares given string to a CharSequences vararg of searchStrings,
   returning true if the string is equal to any of the searchStrings, ignoring case.



   StringUtils.equalsAnyIgnoreCase(null, (CharSequence[]) null) = false
   StringUtils.equalsAnyIgnoreCase(null, null, null)    = true
   StringUtils.equalsAnyIgnoreCase(null, \"abc\", \"def\")  = false
   StringUtils.equalsAnyIgnoreCase(\"abc\", null, \"def\")  = false
   StringUtils.equalsAnyIgnoreCase(\"abc\", \"abc\", \"def\") = true
   StringUtils.equalsAnyIgnoreCase(\"abc\", \"ABC\", \"DEF\") = true

  string - to compare, may be null. - `java.lang.CharSequence`
  search-strings - a vararg of strings, may be null. - `java.lang.CharSequence`

  returns: true if the string is equal (case-insensitive) to any other element of searchStrings;
   false if searchStrings is null or contains no matches. - `boolean`"
  (^Boolean [^java.lang.CharSequence string ^java.lang.CharSequence search-strings]
    (StringUtils/equalsAnyIgnoreCase string search-strings)))

(defn *uncapitalize
  "Uncapitalizes a String, changing the first character to lower case as
   per Character.toLowerCase(int). No other characters are changed.

   For a word based algorithm, see WordUtils.uncapitalize(String).
   A null input String returns null.



   StringUtils.uncapitalize(null)  = null
   StringUtils.uncapitalize(\"\")    = \"\"
   StringUtils.uncapitalize(\"cat\") = \"cat\"
   StringUtils.uncapitalize(\"Cat\") = \"cat\"
   StringUtils.uncapitalize(\"CAT\") = \"cAT\"

  str - the String to uncapitalize, may be null - `java.lang.String`

  returns: the uncapitalized String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/uncapitalize str)))

(defn *join
  "Joins the elements of the provided array into a single String
   containing the provided list of elements.

   No delimiter is added before or after the list.
   Null objects or empty strings within the array are represented by
   empty strings.



   StringUtils.join(null, *)               = null
   StringUtils.join([], *)                 = \"\"
   StringUtils.join([null], *)             = \"\"
   StringUtils.join([\"a\", \"b\", \"c\"], ';')  = \"a;b;c\"
   StringUtils.join([\"a\", \"b\", \"c\"], null) = \"abc\"
   StringUtils.join([null, \"\", \"a\"], ';')  = \";;a\"

  array - the array of values to join together, may be null - `java.lang.Object[]`
  separator - the separator character to use - `char`
  start-index - the first index to start joining from. It is an error to pass in a start index past the end of the array - `int`
  end-index - the index to stop joining from (exclusive). It is an error to pass in an end index past the end of the array - `int`

  returns: the joined String, null if null array input - `java.lang.String`"
  (^java.lang.String [array ^Character separator ^Integer start-index ^Integer end-index]
    (StringUtils/join array separator start-index end-index))
  (^java.lang.String [array ^Character separator]
    (StringUtils/join array separator))
  ([elements]
    (StringUtils/join elements)))

(defn *first-non-blank
  "Returns the first value in the array which is not empty (\"\"),
   null or whitespace only.

   Whitespace is defined by Character.isWhitespace(char).

   If all values are blank or the array is null
   or empty then null is returned.



   StringUtils.firstNonBlank(null, null, null)     = null
   StringUtils.firstNonBlank(null, \"\", \" \")        = null
   StringUtils.firstNonBlank(\"abc\")                = \"abc\"
   StringUtils.firstNonBlank(null, \"xyz\")          = \"xyz\"
   StringUtils.firstNonBlank(null, \"\", \" \", \"xyz\") = \"xyz\"
   StringUtils.firstNonBlank(null, \"xyz\", \"abc\")   = \"xyz\"
   StringUtils.firstNonBlank()                     = null

  values - the values to test, may be null or empty - `T`

  returns: the first value from values which is not blank,
    or null if there are no non-blank values - `<T extends java.lang.CharSequence> T`"
  ([values]
    (StringUtils/firstNonBlank values)))

(defn *abbreviate-middle
  "Abbreviates a String to the length passed, replacing the middle characters with the supplied
   replacement String.

   This abbreviation only occurs if the following criteria is met:

   Neither the String for abbreviation nor the replacement String are null or empty
   The length to truncate to is less than the length of the supplied String
   The length to truncate to is greater than 0
   The abbreviated String will have enough room for the length supplied replacement String
   and the first and last characters of the supplied String for abbreviation

   Otherwise, the returned String will be the same as the supplied String for abbreviation.




   StringUtils.abbreviateMiddle(null, null, 0)      = null
   StringUtils.abbreviateMiddle(\"abc\", null, 0)      = \"abc\"
   StringUtils.abbreviateMiddle(\"abc\", \".\", 0)      = \"abc\"
   StringUtils.abbreviateMiddle(\"abc\", \".\", 3)      = \"abc\"
   StringUtils.abbreviateMiddle(\"abcdef\", \".\", 4)     = \"ab.f\"

  str - the String to abbreviate, may be null - `java.lang.String`
  middle - the String to replace the middle characters with, may be null - `java.lang.String`
  length - the length to abbreviate str to. - `int`

  returns: the abbreviated String if the above criteria is met, or the original String supplied for abbreviation. - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String middle ^Integer length]
    (StringUtils/abbreviateMiddle str middle length)))

(defn *starts-with-any
  "Check if a CharSequence starts with any of the provided case-sensitive prefixes.



   StringUtils.startsWithAny(null, null)      = false
   StringUtils.startsWithAny(null, new String[] {\"abc\"})  = false
   StringUtils.startsWithAny(\"abcxyz\", null)     = false
   StringUtils.startsWithAny(\"abcxyz\", new String[] {\"\"}) = true
   StringUtils.startsWithAny(\"abcxyz\", new String[] {\"abc\"}) = true
   StringUtils.startsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) = true
   StringUtils.startsWithAny(\"abcxyz\", null, \"xyz\", \"ABCX\") = false
   StringUtils.startsWithAny(\"ABCXYZ\", null, \"xyz\", \"abc\") = false

  sequence - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-strings - the case-sensitive CharSequence prefixes, may be empty or contain null - `java.lang.CharSequence`

  returns: true if the input sequence is null AND no searchStrings are provided, or
     the input sequence begins with any of the provided case-sensitive searchStrings. - `boolean`"
  (^Boolean [^java.lang.CharSequence sequence ^java.lang.CharSequence search-strings]
    (StringUtils/startsWithAny sequence search-strings)))

(defn *get-common-prefix
  "Compares all Strings in an array and returns the initial sequence of
   characters that is common to all of them.

   For example,
   getCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) -> \"i am a \"



   StringUtils.getCommonPrefix(null) = \"\"
   StringUtils.getCommonPrefix(new String[] {}) = \"\"
   StringUtils.getCommonPrefix(new String[] {\"abc\"}) = \"abc\"
   StringUtils.getCommonPrefix(new String[] {null, null}) = \"\"
   StringUtils.getCommonPrefix(new String[] {\"\", \"\"}) = \"\"
   StringUtils.getCommonPrefix(new String[] {\"\", null}) = \"\"
   StringUtils.getCommonPrefix(new String[] {\"abc\", null, null}) = \"\"
   StringUtils.getCommonPrefix(new String[] {null, null, \"abc\"}) = \"\"
   StringUtils.getCommonPrefix(new String[] {\"\", \"abc\"}) = \"\"
   StringUtils.getCommonPrefix(new String[] {\"abc\", \"\"}) = \"\"
   StringUtils.getCommonPrefix(new String[] {\"abc\", \"abc\"}) = \"abc\"
   StringUtils.getCommonPrefix(new String[] {\"abc\", \"a\"}) = \"a\"
   StringUtils.getCommonPrefix(new String[] {\"ab\", \"abxyz\"}) = \"ab\"
   StringUtils.getCommonPrefix(new String[] {\"abcde\", \"abxyz\"}) = \"ab\"
   StringUtils.getCommonPrefix(new String[] {\"abcde\", \"xyz\"}) = \"\"
   StringUtils.getCommonPrefix(new String[] {\"xyz\", \"abcde\"}) = \"\"
   StringUtils.getCommonPrefix(new String[] {\"i am a machine\", \"i am a robot\"}) = \"i am a \"

  strs - array of String objects, entries may be null - `java.lang.String`

  returns: the initial sequence of characters that are common to all Strings
   in the array; empty String if the array is null, the elements are all null
   or if there is no common prefix. - `java.lang.String`"
  (^java.lang.String [^java.lang.String strs]
    (StringUtils/getCommonPrefix strs)))

(defn *chop
  "Remove the last character from a String.

   If the String ends in \\r\\n, then remove both
   of them.



   StringUtils.chop(null)          = null
   StringUtils.chop(\"\")            = \"\"
   StringUtils.chop(\"abc \\r\")      = \"abc \"
   StringUtils.chop(\"abc\\n\")       = \"abc\"
   StringUtils.chop(\"abc\\r\\n\")     = \"abc\"
   StringUtils.chop(\"abc\")         = \"ab\"
   StringUtils.chop(\"abc\\nabc\")    = \"abc\\nab\"
   StringUtils.chop(\"a\")           = \"\"
   StringUtils.chop(\"\\r\")          = \"\"
   StringUtils.chop(\"\\n\")          = \"\"
   StringUtils.chop(\"\\r\\n\")        = \"\"

  str - the String to chop last character from, may be null - `java.lang.String`

  returns: String without last character, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/chop str)))

(defn *contains-whitespace
  "Check whether the given CharSequence contains any whitespace characters.

   Whitespace is defined by Character.isWhitespace(char).

  seq - the CharSequence to check (may be null) - `java.lang.CharSequence`

  returns: true if the CharSequence is not empty and
   contains at least 1 (breaking) whitespace character - `boolean`"
  (^Boolean [^java.lang.CharSequence seq]
    (StringUtils/containsWhitespace seq)))

(defn *swap-case
  "Swaps the case of a String changing upper and title case to
   lower case, and lower case to upper case.


    Upper case character converts to Lower case
    Title case character converts to Lower case
    Lower case character converts to Upper case


   For a word based algorithm, see WordUtils.swapCase(String).
   A null input String returns null.



   StringUtils.swapCase(null)                 = null
   StringUtils.swapCase(\"\")                   = \"\"
   StringUtils.swapCase(\"The dog has a BONE\") = \"tHE DOG HAS A bone\"

   NOTE: This method changed in Lang version 2.0.
   It no longer performs a word based algorithm.
   If you only use ASCII, you will notice no change.
   That functionality is available in org.apache.commons.lang3.text.WordUtils.

  str - the String to swap case, may be null - `java.lang.String`

  returns: the changed String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/swapCase str)))

(defn *any-blank?
  "Checks if any of the CharSequences are empty (\"\") or null or whitespace only.

   Whitespace is defined by Character.isWhitespace(char).



   StringUtils.isAnyBlank((String) null)    = true
   StringUtils.isAnyBlank((String[]) null)  = false
   StringUtils.isAnyBlank(null, \"foo\")      = true
   StringUtils.isAnyBlank(null, null)       = true
   StringUtils.isAnyBlank(\"\", \"bar\")        = true
   StringUtils.isAnyBlank(\"bob\", \"\")        = true
   StringUtils.isAnyBlank(\"  bob  \", null)  = true
   StringUtils.isAnyBlank(\" \", \"bar\")       = true
   StringUtils.isAnyBlank(new String[] {})  = false
   StringUtils.isAnyBlank(new String[]{\"\"}) = true
   StringUtils.isAnyBlank(\"foo\", \"bar\")     = false

  css - the CharSequences to check, may be null or empty - `java.lang.CharSequence`

  returns: true if any of the CharSequences are empty or null or whitespace only - `boolean`"
  (^Boolean [^java.lang.CharSequence css]
    (StringUtils/isAnyBlank css)))

(defn *ordinal-index-of
  "Finds the n-th index within a CharSequence, handling null.
   This method uses String.indexOf(String) if possible.
   Note: The code starts looking for a match at the start of the target,
   incrementing the starting index by one after each successful match
   (unless searchStr is an empty string in which case the position
   is never incremented and 0 is returned immediately).
   This means that matches may overlap.
   A null CharSequence will return -1.



   StringUtils.ordinalIndexOf(null, *, *)          = -1
   StringUtils.ordinalIndexOf(*, null, *)          = -1
   StringUtils.ordinalIndexOf(\"\", \"\", *)           = 0
   StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 1)  = 0
   StringUtils.ordinalIndexOf(\"aabaabaa\", \"a\", 2)  = 1
   StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 1)  = 2
   StringUtils.ordinalIndexOf(\"aabaabaa\", \"b\", 2)  = 5
   StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 1) = 1
   StringUtils.ordinalIndexOf(\"aabaabaa\", \"ab\", 2) = 4
   StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 1)   = 0
   StringUtils.ordinalIndexOf(\"aabaabaa\", \"\", 2)   = 0

   Matches may overlap:


   StringUtils.ordinalIndexOf(\"ababab\", \"aba\", 1)   = 0
   StringUtils.ordinalIndexOf(\"ababab\", \"aba\", 2)   = 2
   StringUtils.ordinalIndexOf(\"ababab\", \"aba\", 3)   = -1

   StringUtils.ordinalIndexOf(\"abababab\", \"abab\", 1) = 0
   StringUtils.ordinalIndexOf(\"abababab\", \"abab\", 2) = 2
   StringUtils.ordinalIndexOf(\"abababab\", \"abab\", 3) = 4
   StringUtils.ordinalIndexOf(\"abababab\", \"abab\", 4) = -1

   Note that 'head(CharSequence str, int n)' may be implemented as:



     str.substring(0, lastOrdinalIndexOf(str, \"\\n\", n))

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-str - the CharSequence to find, may be null - `java.lang.CharSequence`
  ordinal - the n-th searchStr to find - `int`

  returns: the n-th index of the search CharSequence,
    -1 (INDEX_NOT_FOUND) if no match or null string input - `int`"
  (^Integer [^java.lang.CharSequence str ^java.lang.CharSequence search-str ^Integer ordinal]
    (StringUtils/ordinalIndexOf str search-str ordinal)))

(defn *empty?
  "Checks if a CharSequence is empty (\"\") or null.



   StringUtils.isEmpty(null)      = true
   StringUtils.isEmpty(\"\")        = true
   StringUtils.isEmpty(\" \")       = false
   StringUtils.isEmpty(\"bob\")     = false
   StringUtils.isEmpty(\"  bob  \") = false

   NOTE: This method changed in Lang version 2.0.
   It no longer trims the CharSequence.
   That functionality is available in isBlank().

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence is empty or null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isEmpty cs)))

(defn *to-encoded-string
  "Converts a byte[] to a String using the specified character encoding.

  bytes - the byte array to read from - `byte[]`
  charset - the encoding to use, if null then use the platform default - `java.nio.charset.Charset`

  returns: a new String - `java.lang.String`

  throws: java.lang.NullPointerException - if bytes is null"
  (^java.lang.String [bytes ^java.nio.charset.Charset charset]
    (StringUtils/toEncodedString bytes charset)))

(defn *remove-end
  "Removes a substring only if it is at the end of a source string,
   otherwise returns the source string.

   A null source string will return null.
   An empty (\"\") source string will return the empty string.
   A null search string will return the source string.



   StringUtils.removeEnd(null, *)      = null
   StringUtils.removeEnd(\"\", *)        = \"\"
   StringUtils.removeEnd(*, null)      = *
   StringUtils.removeEnd(\"www.domain.com\", \".com.\")  = \"www.domain.com\"
   StringUtils.removeEnd(\"www.domain.com\", \".com\")   = \"www.domain\"
   StringUtils.removeEnd(\"www.domain.com\", \"domain\") = \"www.domain.com\"
   StringUtils.removeEnd(\"abc\", \"\")    = \"abc\"

  str - the source String to search, may be null - `java.lang.String`
  remove - the String to search for and remove, may be null - `java.lang.String`

  returns: the substring with the string removed if found,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String remove]
    (StringUtils/removeEnd str remove)))

(defn *replace-pattern
  "Deprecated. Moved to RegExUtils.

  source - the source string - `java.lang.String`
  regex - the regular expression to which this string is to be matched - `java.lang.String`
  replacement - the string to be substituted for each match - `java.lang.String`

  returns: The resulting String - `java.lang.String`"
  (^java.lang.String [^java.lang.String source ^java.lang.String regex ^java.lang.String replacement]
    (StringUtils/replacePattern source regex replacement)))

(defn *index-of-any-but
  "Searches a CharSequence to find the first index of any
   character not in the given set of characters.

   A null CharSequence will return -1.
   A null or zero length search array will return -1.



   StringUtils.indexOfAnyBut(null, *)                              = -1
   StringUtils.indexOfAnyBut(\"\", *)                                = -1
   StringUtils.indexOfAnyBut(*, null)                              = -1
   StringUtils.indexOfAnyBut(*, [])                                = -1
   StringUtils.indexOfAnyBut(\"zzabyycdxx\", new char[] {'z', 'a'} ) = 3
   StringUtils.indexOfAnyBut(\"aba\", new char[] {'z'} )             = 0
   StringUtils.indexOfAnyBut(\"aba\", new char[] {'a', 'b'} )        = -1

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-chars - the chars to search for, may be null - `char`

  returns: the index of any of the chars, -1 if no match or null input - `int`"
  (^Integer [^java.lang.CharSequence cs ^Character search-chars]
    (StringUtils/indexOfAnyBut cs search-chars)))

(defn *prepend-if-missing
  "Prepends the prefix to the start of the string if the string does not
   already start with any of the prefixes.



   StringUtils.prependIfMissing(null, null) = null
   StringUtils.prependIfMissing(\"abc\", null) = \"abc\"
   StringUtils.prependIfMissing(\"\", \"xyz\") = \"xyz\"
   StringUtils.prependIfMissing(\"abc\", \"xyz\") = \"xyzabc\"
   StringUtils.prependIfMissing(\"xyzabc\", \"xyz\") = \"xyzabc\"
   StringUtils.prependIfMissing(\"XYZabc\", \"xyz\") = \"xyzXYZabc\"
   With additional prefixes,


   StringUtils.prependIfMissing(null, null, null) = null
   StringUtils.prependIfMissing(\"abc\", null, null) = \"abc\"
   StringUtils.prependIfMissing(\"\", \"xyz\", null) = \"xyz\"
   StringUtils.prependIfMissing(\"abc\", \"xyz\", new CharSequence[]{null}) = \"xyzabc\"
   StringUtils.prependIfMissing(\"abc\", \"xyz\", \"\") = \"abc\"
   StringUtils.prependIfMissing(\"abc\", \"xyz\", \"mno\") = \"xyzabc\"
   StringUtils.prependIfMissing(\"xyzabc\", \"xyz\", \"mno\") = \"xyzabc\"
   StringUtils.prependIfMissing(\"mnoabc\", \"xyz\", \"mno\") = \"mnoabc\"
   StringUtils.prependIfMissing(\"XYZabc\", \"xyz\", \"mno\") = \"xyzXYZabc\"
   StringUtils.prependIfMissing(\"MNOabc\", \"xyz\", \"mno\") = \"xyzMNOabc\"

  str - The string. - `java.lang.String`
  prefix - The prefix to prepend to the start of the string. - `java.lang.CharSequence`
  prefixes - Additional prefixes that are valid. - `java.lang.CharSequence`

  returns: A new String if prefix was prepended, the same string otherwise. - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.CharSequence prefix ^java.lang.CharSequence prefixes]
    (StringUtils/prependIfMissing str prefix prefixes)))

(defn *contains-ignore-case
  "Checks if CharSequence contains a search CharSequence irrespective of case,
   handling null. Case-insensitivity is defined as by
   String.equalsIgnoreCase(String).

   A null CharSequence will return false.



   StringUtils.containsIgnoreCase(null, *) = false
   StringUtils.containsIgnoreCase(*, null) = false
   StringUtils.containsIgnoreCase(\"\", \"\") = true
   StringUtils.containsIgnoreCase(\"abc\", \"\") = true
   StringUtils.containsIgnoreCase(\"abc\", \"a\") = true
   StringUtils.containsIgnoreCase(\"abc\", \"z\") = false
   StringUtils.containsIgnoreCase(\"abc\", \"A\") = true
   StringUtils.containsIgnoreCase(\"abc\", \"Z\") = false

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-str - the CharSequence to find, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence contains the search CharSequence irrespective of
   case or false if not or null string input - `boolean`"
  (^Boolean [^java.lang.CharSequence str ^java.lang.CharSequence search-str]
    (StringUtils/containsIgnoreCase str search-str)))

(defn *compare-ignore-case
  "Compare two Strings lexicographically, ignoring case differences,
   as per String.compareToIgnoreCase(String), returning :

    int = 0, if str1 is equal to str2 (or both null)
    int < 0, if str1 is less than str2
    int > 0, if str1 is greater than str2


   This is a null safe version of :


  str1.compareToIgnoreCase(str2)

   null inputs are handled according to the nullIsLess parameter.
   Two null references are considered equal.
   Comparison is case insensitive.



   StringUtils.compareIgnoreCase(null, null, *)     = 0
   StringUtils.compareIgnoreCase(null , \"a\", true)  < 0
   StringUtils.compareIgnoreCase(null , \"a\", false) > 0
   StringUtils.compareIgnoreCase(\"a\", null, true)   > 0
   StringUtils.compareIgnoreCase(\"a\", null, false)  < 0
   StringUtils.compareIgnoreCase(\"abc\", \"abc\", *)   = 0
   StringUtils.compareIgnoreCase(\"abc\", \"ABC\", *)   = 0
   StringUtils.compareIgnoreCase(\"a\", \"b\", *)       < 0
   StringUtils.compareIgnoreCase(\"b\", \"a\", *)       > 0
   StringUtils.compareIgnoreCase(\"a\", \"B\", *)       < 0
   StringUtils.compareIgnoreCase(\"A\", \"b\", *)       < 0
   StringUtils.compareIgnoreCase(\"ab\", \"abc\", *)    < 0

  str-1 - the String to compare from - `java.lang.String`
  str-2 - the String to compare to - `java.lang.String`
  null-is-less - whether consider null value less than non-null value - `boolean`

  returns: < 0, 0, > 0, if str1 is respectively less, equal ou greater than str2,
            ignoring case differences. - `int`"
  (^Integer [^java.lang.String str-1 ^java.lang.String str-2 ^Boolean null-is-less]
    (StringUtils/compareIgnoreCase str-1 str-2 null-is-less))
  (^Integer [^java.lang.String str-1 ^java.lang.String str-2]
    (StringUtils/compareIgnoreCase str-1 str-2)))

(defn *index-of
  "Returns the index within seq of the first occurrence of the
   specified character, starting the search at the specified index.

   If a character with value searchChar occurs in the
   character sequence represented by the seq CharSequence
   object at an index no smaller than startPos, then
   the index of the first such occurrence is returned. For values
   of searchChar in the range from 0 to 0xFFFF (inclusive),
   this is the smallest value k such that:


   (this.charAt(k) == searchChar) && (k >= startPos)
   is true. For other values of searchChar, it is the
   smallest value k such that:


   (this.codePointAt(k) == searchChar) && (k >= startPos)
   is true. In either case, if no such character occurs in seq
   at or after position startPos, then
   -1 is returned.


   There is no restriction on the value of startPos. If it
   is negative, it has the same effect as if it were zero: this entire
   string may be searched. If it is greater than the length of this
   string, it has the same effect as if it were equal to the length of
   this string: (INDEX_NOT_FOUND) -1 is returned. Furthermore, a
   null or empty (\"\") CharSequence will
   return (INDEX_NOT_FOUND) -1.

   All indices are specified in char values
   (Unicode code units).



   StringUtils.indexOf(null, *, *)          = -1
   StringUtils.indexOf(\"\", *, *)            = -1
   StringUtils.indexOf(\"aabaabaa\", 'b', 0)  = 2
   StringUtils.indexOf(\"aabaabaa\", 'b', 3)  = 5
   StringUtils.indexOf(\"aabaabaa\", 'b', 9)  = -1
   StringUtils.indexOf(\"aabaabaa\", 'b', -1) = 2

  seq - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-char - the character to find - `int`
  start-pos - the start position, negative treated as zero - `int`

  returns: the first index of the search character (always ≥ startPos),
    -1 if no match or null string input - `int`"
  (^Integer [^java.lang.CharSequence seq ^Integer search-char ^Integer start-pos]
    (StringUtils/indexOf seq search-char start-pos))
  (^Integer [^java.lang.CharSequence seq ^Integer search-char]
    (StringUtils/indexOf seq search-char)))

(defn *whitespace?
  "Checks if the CharSequence contains only whitespace.

   Whitespace is defined by Character.isWhitespace(char).

   null will return false.
   An empty CharSequence (length()=0) will return true.



   StringUtils.isWhitespace(null)   = false
   StringUtils.isWhitespace(\"\")     = true
   StringUtils.isWhitespace(\"  \")   = true
   StringUtils.isWhitespace(\"abc\")  = false
   StringUtils.isWhitespace(\"ab2c\") = false
   StringUtils.isWhitespace(\"ab-c\") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if only contains whitespace, and is non-null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isWhitespace cs)))

(defn *delete-whitespace
  "Deletes all whitespaces from a String as defined by
   Character.isWhitespace(char).



   StringUtils.deleteWhitespace(null)         = null
   StringUtils.deleteWhitespace(\"\")           = \"\"
   StringUtils.deleteWhitespace(\"abc\")        = \"abc\"
   StringUtils.deleteWhitespace(\"   ab  c  \") = \"abc\"

  str - the String to delete whitespace from, may be null - `java.lang.String`

  returns: the String without whitespaces, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (StringUtils/deleteWhitespace str)))

(defn *ends-with-any
  "Check if a CharSequence ends with any of the provided case-sensitive suffixes.



   StringUtils.endsWithAny(null, null)      = false
   StringUtils.endsWithAny(null, new String[] {\"abc\"})  = false
   StringUtils.endsWithAny(\"abcxyz\", null)     = false
   StringUtils.endsWithAny(\"abcxyz\", new String[] {\"\"}) = true
   StringUtils.endsWithAny(\"abcxyz\", new String[] {\"xyz\"}) = true
   StringUtils.endsWithAny(\"abcxyz\", new String[] {null, \"xyz\", \"abc\"}) = true
   StringUtils.endsWithAny(\"abcXYZ\", \"def\", \"XYZ\") = true
   StringUtils.endsWithAny(\"abcXYZ\", \"def\", \"xyz\") = false

  sequence - the CharSequence to check, may be null - `java.lang.CharSequence`
  search-strings - the case-sensitive CharSequences to find, may be empty or contain null - `java.lang.CharSequence`

  returns: true if the input sequence is null AND no searchStrings are provided, or
     the input sequence ends in any of the provided case-sensitive searchStrings. - `boolean`"
  (^Boolean [^java.lang.CharSequence sequence ^java.lang.CharSequence search-strings]
    (StringUtils/endsWithAny sequence search-strings)))

(defn *mid
  "Gets len characters from the middle of a String.

   If len characters are not available, the remainder
   of the String will be returned without an exception. If the
   String is null, null will be returned.
   An empty String is returned if len is negative or exceeds the
   length of str.



   StringUtils.mid(null, *, *)    = null
   StringUtils.mid(*, *, -ve)     = \"\"
   StringUtils.mid(\"\", 0, *)      = \"\"
   StringUtils.mid(\"abc\", 0, 2)   = \"ab\"
   StringUtils.mid(\"abc\", 0, 4)   = \"abc\"
   StringUtils.mid(\"abc\", 2, 4)   = \"c\"
   StringUtils.mid(\"abc\", 4, 2)   = \"\"
   StringUtils.mid(\"abc\", -2, 2)  = \"ab\"

  str - the String to get the characters from, may be null - `java.lang.String`
  pos - the position to start from, negative treated as zero - `int`
  len - the length of the required String - `int`

  returns: the middle characters, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer pos ^Integer len]
    (StringUtils/mid str pos len)))

(defn *difference
  "Compares two Strings, and returns the portion where they differ.
   More precisely, return the remainder of the second String,
   starting from where it's different from the first. This means that
   the difference between \"abc\" and \"ab\" is the empty String and not \"c\".

   For example,
   difference(\"i am a machine\", \"i am a robot\") -> \"robot\".



   StringUtils.difference(null, null) = null
   StringUtils.difference(\"\", \"\") = \"\"
   StringUtils.difference(\"\", \"abc\") = \"abc\"
   StringUtils.difference(\"abc\", \"\") = \"\"
   StringUtils.difference(\"abc\", \"abc\") = \"\"
   StringUtils.difference(\"abc\", \"ab\") = \"\"
   StringUtils.difference(\"ab\", \"abxyz\") = \"xyz\"
   StringUtils.difference(\"abcde\", \"abxyz\") = \"xyz\"
   StringUtils.difference(\"abcde\", \"xyz\") = \"xyz\"

  str-1 - the first String, may be null - `java.lang.String`
  str-2 - the second String, may be null - `java.lang.String`

  returns: the portion of str2 where it differs from str1; returns the
   empty String if they are equal - `java.lang.String`"
  (^java.lang.String [^java.lang.String str-1 ^java.lang.String str-2]
    (StringUtils/difference str-1 str-2)))

(defn *remove-all
  "Deprecated. Moved to RegExUtils.

  text - text to remove from, may be null - `java.lang.String`
  regex - the regular expression to which this string is to be matched - `java.lang.String`

  returns: the text with any removes processed,
                null if null String input - `java.lang.String`

  throws: java.util.regex.PatternSyntaxException - if the regular expression's syntax is invalid"
  (^java.lang.String [^java.lang.String text ^java.lang.String regex]
    (StringUtils/removeAll text regex)))

(defn *overlay
  "Overlays part of a String with another String.

   A null string input returns null.
   A negative index is treated as zero.
   An index greater than the string length is treated as the string length.
   The start index is always the smaller of the two indices.



   StringUtils.overlay(null, *, *, *)            = null
   StringUtils.overlay(\"\", \"abc\", 0, 0)          = \"abc\"
   StringUtils.overlay(\"abcdef\", null, 2, 4)     = \"abef\"
   StringUtils.overlay(\"abcdef\", \"\", 2, 4)       = \"abef\"
   StringUtils.overlay(\"abcdef\", \"\", 4, 2)       = \"abef\"
   StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 4)   = \"abzzzzef\"
   StringUtils.overlay(\"abcdef\", \"zzzz\", 4, 2)   = \"abzzzzef\"
   StringUtils.overlay(\"abcdef\", \"zzzz\", -1, 4)  = \"zzzzef\"
   StringUtils.overlay(\"abcdef\", \"zzzz\", 2, 8)   = \"abzzzz\"
   StringUtils.overlay(\"abcdef\", \"zzzz\", -2, -3) = \"zzzzabcdef\"
   StringUtils.overlay(\"abcdef\", \"zzzz\", 8, 10)  = \"abcdefzzzz\"

  str - the String to do overlaying in, may be null - `java.lang.String`
  overlay - the String to overlay, may be null - `java.lang.String`
  start - the position to start overlaying at - `int`
  end - the position to stop overlaying before - `int`

  returns: overlayed String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String overlay ^Integer start ^Integer end]
    (StringUtils/overlay str overlay start end)))

(defn *rotate
  "Rotate (circular shift) a String of shift characters.

    If shift > 0, right circular shift (ex : ABCDEF => FABCDE)
    If shift < 0, left circular shift (ex : ABCDEF => BCDEFA)




   StringUtils.rotate(null, *)        = null
   StringUtils.rotate(\"\", *)          = \"\"
   StringUtils.rotate(\"abcdefg\", 0)   = \"abcdefg\"
   StringUtils.rotate(\"abcdefg\", 2)   = \"fgabcde\"
   StringUtils.rotate(\"abcdefg\", -2)  = \"cdefgab\"
   StringUtils.rotate(\"abcdefg\", 7)   = \"abcdefg\"
   StringUtils.rotate(\"abcdefg\", -7)  = \"abcdefg\"
   StringUtils.rotate(\"abcdefg\", 9)   = \"fgabcde\"
   StringUtils.rotate(\"abcdefg\", -9)  = \"cdefgab\"

  str - the String to rotate, may be null - `java.lang.String`
  shift - number of time to shift (positive : right shift, negative : left shift) - `int`

  returns: the rotated String,
            or the original String if shift == 0,
            or null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer shift]
    (StringUtils/rotate str shift)))

(defn *ascii-printable?
  "Checks if the CharSequence contains only ASCII printable characters.

   null will return false.
   An empty CharSequence (length()=0) will return true.



   StringUtils.isAsciiPrintable(null)     = false
   StringUtils.isAsciiPrintable(\"\")       = true
   StringUtils.isAsciiPrintable(\" \")      = true
   StringUtils.isAsciiPrintable(\"Ceki\")   = true
   StringUtils.isAsciiPrintable(\"ab2c\")   = true
   StringUtils.isAsciiPrintable(\"!ab-c~\") = true
   StringUtils.isAsciiPrintable(\" \") = true
   StringUtils.isAsciiPrintable(\"!\") = true
   StringUtils.isAsciiPrintable(\"~\") = true
   StringUtils.isAsciiPrintable(\"\") = false
   StringUtils.isAsciiPrintable(\"Ceki Gülcü\") = false

  cs - the CharSequence to check, may be null - `java.lang.CharSequence`

  returns: true if every character is in the range
    32 thru 126 - `boolean`"
  (^Boolean [^java.lang.CharSequence cs]
    (StringUtils/isAsciiPrintable cs)))

(defn *strip-end
  "Strips any of a set of characters from the end of a String.

   A null input String returns null.
   An empty string (\"\") input returns the empty string.

   If the stripChars String is null, whitespace is
   stripped as defined by Character.isWhitespace(char).



   StringUtils.stripEnd(null, *)          = null
   StringUtils.stripEnd(\"\", *)            = \"\"
   StringUtils.stripEnd(\"abc\", \"\")        = \"abc\"
   StringUtils.stripEnd(\"abc\", null)      = \"abc\"
   StringUtils.stripEnd(\"  abc\", null)    = \"  abc\"
   StringUtils.stripEnd(\"abc  \", null)    = \"abc\"
   StringUtils.stripEnd(\" abc \", null)    = \" abc\"
   StringUtils.stripEnd(\"  abcyx\", \"xyz\") = \"  abc\"
   StringUtils.stripEnd(\"120.00\", \".0\")   = \"12\"

  str - the String to remove characters from, may be null - `java.lang.String`
  strip-chars - the set of characters to remove, null treated as whitespace - `java.lang.String`

  returns: the stripped String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String strip-chars]
    (StringUtils/stripEnd str strip-chars)))

(defn *equals
  "Compares two CharSequences, returning true if they represent
   equal sequences of characters.

   nulls are handled without exceptions. Two null
   references are considered to be equal. The comparison is case sensitive.



   StringUtils.equals(null, null)   = true
   StringUtils.equals(null, \"abc\")  = false
   StringUtils.equals(\"abc\", null)  = false
   StringUtils.equals(\"abc\", \"abc\") = true
   StringUtils.equals(\"abc\", \"ABC\") = false

  cs-1 - the first CharSequence, may be null - `java.lang.CharSequence`
  cs-2 - the second CharSequence, may be null - `java.lang.CharSequence`

  returns: true if the CharSequences are equal (case-sensitive), or both null - `boolean`"
  (^Boolean [^java.lang.CharSequence cs-1 ^java.lang.CharSequence cs-2]
    (StringUtils/equals cs-1 cs-2)))

(defn *ends-with-ignore-case
  "Case insensitive check if a CharSequence ends with a specified suffix.

   nulls are handled without exceptions. Two null
   references are considered to be equal. The comparison is case insensitive.



   StringUtils.endsWithIgnoreCase(null, null)      = true
   StringUtils.endsWithIgnoreCase(null, \"def\")     = false
   StringUtils.endsWithIgnoreCase(\"abcdef\", null)  = false
   StringUtils.endsWithIgnoreCase(\"abcdef\", \"def\") = true
   StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"def\") = true
   StringUtils.endsWithIgnoreCase(\"ABCDEF\", \"cde\") = false

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  suffix - the suffix to find, may be null - `java.lang.CharSequence`

  returns: true if the CharSequence ends with the suffix, case insensitive, or
    both null - `boolean`"
  (^Boolean [^java.lang.CharSequence str ^java.lang.CharSequence suffix]
    (StringUtils/endsWithIgnoreCase str suffix)))

(defn *equals-any
  "Compares given string to a CharSequences vararg of searchStrings,
   returning true if the string is equal to any of the searchStrings.



   StringUtils.equalsAny(null, (CharSequence[]) null) = false
   StringUtils.equalsAny(null, null, null)    = true
   StringUtils.equalsAny(null, \"abc\", \"def\")  = false
   StringUtils.equalsAny(\"abc\", null, \"def\")  = false
   StringUtils.equalsAny(\"abc\", \"abc\", \"def\") = true
   StringUtils.equalsAny(\"abc\", \"ABC\", \"DEF\") = false

  string - to compare, may be null. - `java.lang.CharSequence`
  search-strings - a vararg of strings, may be null. - `java.lang.CharSequence`

  returns: true if the string is equal (case-sensitive) to any other element of searchStrings;
   false if searchStrings is null or contains no matches. - `boolean`"
  (^Boolean [^java.lang.CharSequence string ^java.lang.CharSequence search-strings]
    (StringUtils/equalsAny string search-strings)))

(defn *substring-before-last
  "Gets the substring before the last occurrence of a separator.
   The separator is not returned.

   A null string input will return null.
   An empty (\"\") string input will return the empty string.
   An empty or null separator will return the input string.

   If nothing is found, the string input is returned.



   StringUtils.substringBeforeLast(null, *)      = null
   StringUtils.substringBeforeLast(\"\", *)        = \"\"
   StringUtils.substringBeforeLast(\"abcba\", \"b\") = \"abc\"
   StringUtils.substringBeforeLast(\"abc\", \"c\")   = \"ab\"
   StringUtils.substringBeforeLast(\"a\", \"a\")     = \"\"
   StringUtils.substringBeforeLast(\"a\", \"z\")     = \"a\"
   StringUtils.substringBeforeLast(\"a\", null)    = \"a\"
   StringUtils.substringBeforeLast(\"a\", \"\")      = \"a\"

  str - the String to get a substring from, may be null - `java.lang.String`
  separator - the String to search for, may be null - `java.lang.String`

  returns: the substring before the last occurrence of the separator,
    null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^java.lang.String separator]
    (StringUtils/substringBeforeLast str separator)))

(defn *left
  "Gets the leftmost len characters of a String.

   If len characters are not available, or the
   String is null, the String will be returned without
   an exception. An empty String is returned if len is negative.



   StringUtils.left(null, *)    = null
   StringUtils.left(*, -ve)     = \"\"
   StringUtils.left(\"\", *)      = \"\"
   StringUtils.left(\"abc\", 0)   = \"\"
   StringUtils.left(\"abc\", 2)   = \"ab\"
   StringUtils.left(\"abc\", 4)   = \"abc\"

  str - the String to get the leftmost characters from, may be null - `java.lang.String`
  len - the length of the required String - `int`

  returns: the leftmost characters, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer len]
    (StringUtils/left str len)))

(defn *index-of-difference
  "Compares two CharSequences, and returns the index at which the
   CharSequences begin to differ.

   For example,
   indexOfDifference(\"i am a machine\", \"i am a robot\") -> 7



   StringUtils.indexOfDifference(null, null) = -1
   StringUtils.indexOfDifference(\"\", \"\") = -1
   StringUtils.indexOfDifference(\"\", \"abc\") = 0
   StringUtils.indexOfDifference(\"abc\", \"\") = 0
   StringUtils.indexOfDifference(\"abc\", \"abc\") = -1
   StringUtils.indexOfDifference(\"ab\", \"abxyz\") = 2
   StringUtils.indexOfDifference(\"abcde\", \"abxyz\") = 2
   StringUtils.indexOfDifference(\"abcde\", \"xyz\") = 0

  cs-1 - the first CharSequence, may be null - `java.lang.CharSequence`
  cs-2 - the second CharSequence, may be null - `java.lang.CharSequence`

  returns: the index where cs1 and cs2 begin to differ; -1 if they are equal - `int`"
  (^Integer [^java.lang.CharSequence cs-1 ^java.lang.CharSequence cs-2]
    (StringUtils/indexOfDifference cs-1 cs-2))
  (^Integer [^java.lang.CharSequence css]
    (StringUtils/indexOfDifference css)))

(defn *count-matches
  "Counts how many times the substring appears in the larger string.

   A null or empty (\"\") String input returns 0.



   StringUtils.countMatches(null, *)       = 0
   StringUtils.countMatches(\"\", *)         = 0
   StringUtils.countMatches(\"abba\", null)  = 0
   StringUtils.countMatches(\"abba\", \"\")    = 0
   StringUtils.countMatches(\"abba\", \"a\")   = 2
   StringUtils.countMatches(\"abba\", \"ab\")  = 1
   StringUtils.countMatches(\"abba\", \"xxx\") = 0

  str - the CharSequence to check, may be null - `java.lang.CharSequence`
  sub - the substring to count, may be null - `java.lang.CharSequence`

  returns: the number of occurrences, 0 if either CharSequence is null - `int`"
  (^Integer [^java.lang.CharSequence str ^java.lang.CharSequence sub]
    (StringUtils/countMatches str sub)))

(defn *split-preserve-all-tokens
  "Splits the provided text into an array with a maximum length,
   separators specified, preserving all tokens, including empty tokens
   created by adjacent separators.

   The separator is not included in the returned String array.
   Adjacent separators are treated as separators for empty tokens.
   Adjacent separators are treated as one separator.

   A null input String returns null.
   A null separatorChars splits on whitespace.

   If more than max delimited substrings are found, the last
   returned string includes all characters after the first max - 1
   returned strings (including separator characters).



   StringUtils.splitPreserveAllTokens(null, *, *)            = null
   StringUtils.splitPreserveAllTokens(\"\", *, *)              = []
   StringUtils.splitPreserveAllTokens(\"ab de fg\", null, 0)   = [\"ab\", \"cd\", \"ef\"]
   StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 0) = [\"ab\", \"cd\", \"ef\"]
   StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 0)    = [\"ab\", \"cd\", \"ef\"]
   StringUtils.splitPreserveAllTokens(\"ab:cd:ef\", \":\", 2)    = [\"ab\", \"cd:ef\"]
   StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 2) = [\"ab\", \"  de fg\"]
   StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 3) = [\"ab\", \"\", \" de fg\"]
   StringUtils.splitPreserveAllTokens(\"ab   de fg\", null, 4) = [\"ab\", \"\", \"\", \"de fg\"]

  str - the String to parse, may be null - `java.lang.String`
  separator-chars - the characters used as the delimiters, null splits on whitespace - `java.lang.String`
  max - the maximum number of elements to include in the array. A zero or negative value implies no limit - `int`

  returns: an array of parsed Strings, null if null String input - `java.lang.String[]`"
  ([^java.lang.String str ^java.lang.String separator-chars ^Integer max]
    (StringUtils/splitPreserveAllTokens str separator-chars max))
  ([^java.lang.String str ^Character separator-char]
    (StringUtils/splitPreserveAllTokens str separator-char))
  ([^java.lang.String str]
    (StringUtils/splitPreserveAllTokens str)))

(defn *get-fuzzy-distance
  "Deprecated. as of 3.6, use commons-text

   FuzzyScore instead

  term - a full term that should be matched against, must not be null - `java.lang.CharSequence`
  query - the query that will be matched against a term, must not be null - `java.lang.CharSequence`
  locale - This string matching logic is case insensitive. A locale is necessary to normalize both Strings to lower case. - `java.util.Locale`

  returns: result score - `int`

  throws: java.lang.IllegalArgumentException - if either String input null or Locale input null"
  (^Integer [^java.lang.CharSequence term ^java.lang.CharSequence query ^java.util.Locale locale]
    (StringUtils/getFuzzyDistance term query locale)))

(defn *join-with
  "Joins the elements of the provided varargs into a
   single String containing the provided elements.

   No delimiter is added before or after the list.
   null elements and separator are treated as empty Strings (\"\").



   StringUtils.joinWith(\",\", {\"a\", \"b\"})        = \"a,b\"
   StringUtils.joinWith(\",\", {\"a\", \"b\",\"\"})     = \"a,b,\"
   StringUtils.joinWith(\",\", {\"a\", null, \"b\"})  = \"a,,b\"
   StringUtils.joinWith(null, {\"a\", \"b\"})       = \"ab\"

  separator - the separator character to use, null treated as \"\" - `java.lang.String`
  objects - the varargs providing the values to join together. null elements are treated as \"\" - `java.lang.Object`

  returns: the joined String. - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if a null varargs is provided"
  (^java.lang.String [^java.lang.String separator ^java.lang.Object objects]
    (StringUtils/joinWith separator objects)))

