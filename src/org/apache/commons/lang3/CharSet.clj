(ns org.apache.commons.lang3.CharSet
  "A set of characters.

  Instances are immutable, but instances of subclasses may not be.

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 CharSet]))

(def *-empty
  "Static Constant.

  A CharSet defining no characters.

  type: org.apache.commons.lang3.CharSet"
  CharSet/EMPTY)

(def *-ascii-alpha
  "Static Constant.

  A CharSet defining ASCII alphabetic characters \"a-zA-Z\".

  type: org.apache.commons.lang3.CharSet"
  CharSet/ASCII_ALPHA)

(def *-ascii-alpha-lower
  "Static Constant.

  A CharSet defining ASCII alphabetic characters \"a-z\".

  type: org.apache.commons.lang3.CharSet"
  CharSet/ASCII_ALPHA_LOWER)

(def *-ascii-alpha-upper
  "Static Constant.

  A CharSet defining ASCII alphabetic characters \"A-Z\".

  type: org.apache.commons.lang3.CharSet"
  CharSet/ASCII_ALPHA_UPPER)

(def *-ascii-numeric
  "Static Constant.

  A CharSet defining ASCII alphabetic characters \"0-9\".

  type: org.apache.commons.lang3.CharSet"
  CharSet/ASCII_NUMERIC)

(defn *get-instance
  "Factory method to create a new CharSet using a special syntax.


    null or empty string (\"\")
   - set containing no characters
    Single character, such as \"a\"
    - set containing just that character
    Multi character, such as \"a-e\"
    - set containing characters from one character to the other
    Negated, such as \"^a\" or \"^a-e\"
    - set containing all characters except those defined
    Combinations, such as \"abe-g\"
    - set containing all the characters from the individual sets


   The matching order is:

    Negated multi character range, such as \"^a-e\"
    Ordinary multi character range, such as \"a-e\"
    Negated single character, such as \"^a\"
    Ordinary single character, such as \"a\"


   Matching works left to right. Once a match is found the
   search starts again from the next character.

   If the same range is defined twice using the same syntax, only
   one range will be kept.
   Thus, \"a-ca-c\" creates only one range of \"a-c\".

   If the start and end of a range are in the wrong order,
   they are reversed. Thus \"a-e\" is the same as \"e-a\".
   As a result, \"a-ee-a\" would create only one range,
   as the \"a-e\" and \"e-a\" are the same.

   The set of characters represented is the union of the specified ranges.

   There are two ways to add a literal negation character (^):

       As the last character in a string, e.g. CharSet.getInstance(\"a-z^\")
       As a separate element, e.g. CharSet.getInstance(\"^\", \"a-z\")


   Examples using the negation character:


       CharSet.getInstance(\"^a-c\").contains('a') = false
       CharSet.getInstance(\"^a-c\").contains('d') = true
       CharSet.getInstance(\"^^a-c\").contains('a') = true // (only '^' is negated)
       CharSet.getInstance(\"^^a-c\").contains('^') = false
       CharSet.getInstance(\"^a-cd-f\").contains('d') = true
       CharSet.getInstance(\"a-c^\").contains('^') = true
       CharSet.getInstance(\"^\", \"a-c\").contains('^') = true

   All CharSet objects returned by this method will be immutable.

  set-strs - Strings to merge into the set, may be null - `java.lang.String`

  returns: a CharSet instance - `org.apache.commons.lang3.CharSet`"
  (^org.apache.commons.lang3.CharSet [^java.lang.String set-strs]
    (CharSet/getInstance set-strs)))

(defn contains
  "Does the CharSet contain the specified
   character ch.

  ch - the character to check for - `char`

  returns: true if the set contains the characters - `boolean`"
  (^Boolean [^CharSet this ^Character ch]
    (-> this (.contains ch))))

(defn equals
  "Compares two CharSet objects, returning true if they represent
   exactly the same set of characters defined in the same way.

   The two sets abc and a-c are not
   equal according to this method.

  obj - the object to compare to - `java.lang.Object`

  returns: true if equal - `boolean`"
  (^Boolean [^CharSet this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn hash-code
  "Gets a hash code compatible with the equals method.

  returns: a suitable hash code - `int`"
  (^Integer [^CharSet this]
    (-> this (.hashCode))))

(defn to-string
  "Gets a string representation of the set.

  returns: string representation of the set - `java.lang.String`"
  (^java.lang.String [^CharSet this]
    (-> this (.toString))))

