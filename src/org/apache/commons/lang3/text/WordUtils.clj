(ns org.apache.commons.lang3.text.WordUtils
  "Deprecated.
 as of 3.6, use commons-text

  WordUtils instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text WordUtils]))

(defn ->word-utils
  "Constructor.

  Deprecated."
  (^WordUtils []
    (new WordUtils )))

(defn *wrap
  "Deprecated.

  str - the String to be word wrapped, may be null - `java.lang.String`
  wrap-length - the column to wrap the words at, less than 1 is treated as 1 - `int`
  new-line-str - the string to insert for a new line, null uses the system property line separator - `java.lang.String`
  wrap-long-words - true if long words (such as URLs) should be wrapped - `boolean`
  wrap-on - regex expression to be used as a breakable characters, if blank string is provided a space character will be used - `java.lang.String`

  returns: a line with newlines inserted, null if null input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Integer wrap-length ^java.lang.String new-line-str ^Boolean wrap-long-words ^java.lang.String wrap-on]
    (WordUtils/wrap str wrap-length new-line-str wrap-long-words wrap-on))
  (^java.lang.String [^java.lang.String str ^Integer wrap-length ^java.lang.String new-line-str ^Boolean wrap-long-words]
    (WordUtils/wrap str wrap-length new-line-str wrap-long-words))
  (^java.lang.String [^java.lang.String str ^Integer wrap-length]
    (WordUtils/wrap str wrap-length)))

(defn *capitalize
  "Deprecated.

  str - the String to capitalize, may be null - `java.lang.String`
  delimiters - set of characters to determine capitalization, null means whitespace - `char`

  returns: capitalized String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character delimiters]
    (WordUtils/capitalize str delimiters))
  (^java.lang.String [^java.lang.String str]
    (WordUtils/capitalize str)))

(defn *capitalize-fully
  "Deprecated.

  str - the String to capitalize, may be null - `java.lang.String`
  delimiters - set of characters to determine capitalization, null means whitespace - `char`

  returns: capitalized String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character delimiters]
    (WordUtils/capitalizeFully str delimiters))
  (^java.lang.String [^java.lang.String str]
    (WordUtils/capitalizeFully str)))

(defn *uncapitalize
  "Deprecated.

  str - the String to uncapitalize, may be null - `java.lang.String`
  delimiters - set of characters to determine uncapitalization, null means whitespace - `char`

  returns: uncapitalized String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character delimiters]
    (WordUtils/uncapitalize str delimiters))
  (^java.lang.String [^java.lang.String str]
    (WordUtils/uncapitalize str)))

(defn *swap-case
  "Deprecated.

  str - the String to swap case, may be null - `java.lang.String`

  returns: the changed String, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str]
    (WordUtils/swapCase str)))

(defn *initials
  "Deprecated.

  str - the String to get initials from, may be null - `java.lang.String`
  delimiters - set of characters to determine words, null means whitespace - `char`

  returns: String of initial characters, null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String str ^Character delimiters]
    (WordUtils/initials str delimiters))
  (^java.lang.String [^java.lang.String str]
    (WordUtils/initials str)))

(defn *contains-all-words
  "Deprecated.

  word - The CharSequence to check, may be null - `java.lang.CharSequence`
  words - The array of String words to search for, may be null - `java.lang.CharSequence`

  returns: true if all search words are found, false otherwise - `boolean`"
  (^Boolean [^java.lang.CharSequence word ^java.lang.CharSequence words]
    (WordUtils/containsAllWords word words)))

