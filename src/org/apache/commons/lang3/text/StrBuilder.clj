(ns org.apache.commons.lang3.text.StrBuilder
  "Deprecated.
 as of 3.6, use commons-text

  TextStringBuilder instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text StrBuilder]))

(defn ->str-builder
  "Constructor.

  Deprecated.

  initial-capacity - the initial capacity, zero or less will be converted to 32 - `int`"
  (^StrBuilder [^Integer initial-capacity]
    (new StrBuilder initial-capacity))
  (^StrBuilder []
    (new StrBuilder )))

(defn get-chars
  "Deprecated.

  start-index - first index to copy, inclusive, must be valid - `int`
  end-index - last index, exclusive, must be valid - `int`
  destination - the destination array, must not be null or too small - `char[]`
  destination-index - the index to start copying in destination - `int`

  throws: java.lang.NullPointerException - if the array is null"
  ([^StrBuilder this ^Integer start-index ^Integer end-index destination ^Integer destination-index]
    (-> this (.getChars start-index end-index destination destination-index)))
  ([^StrBuilder this destination]
    (-> this (.getChars destination))))

(defn minimize-capacity
  "Deprecated.

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this]
    (-> this (.minimizeCapacity))))

(defn delete-all
  "Deprecated.

  ch - the character to delete - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Character ch]
    (-> this (.deleteAll ch))))

(defn to-string-builder
  "Deprecated.

  returns: the builder as a StringBuilder - `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StrBuilder this]
    (-> this (.toStringBuilder))))

(defn append-fixed-width-pad-left
  "Deprecated.

  obj - the object to append, null uses null text - `java.lang.Object`
  width - the fixed field width, zero or negative has no effect - `int`
  pad-char - the pad character to use - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.Object obj ^Integer width ^Character pad-char]
    (-> this (.appendFixedWidthPadLeft obj width pad-char))))

(defn left-string
  "Deprecated.

  length - the number of characters to extract, negative returns empty string - `int`

  returns: the new string - `java.lang.String`"
  (^java.lang.String [^StrBuilder this ^Integer length]
    (-> this (.leftString length))))

(defn trim
  "Deprecated.

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this]
    (-> this (.trim))))

(defn replace-all
  "Deprecated.

  search - the search character - `char`
  replace - the replace character - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Character search ^Character replace]
    (-> this (.replaceAll search replace))))

(defn append-to
  "Deprecated.

  appendable - the appendable to append data to - `java.lang.Appendable`

  throws: java.io.IOException - if an I/O error occurs"
  ([^StrBuilder this ^java.lang.Appendable appendable]
    (-> this (.appendTo appendable))))

(defn delete
  "Deprecated.

  start-index - the start index, inclusive, must be valid - `int`
  end-index - the end index, exclusive, must be valid except that if too large it is treated as end of string - `int`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Integer start-index ^Integer end-index]
    (-> this (.delete start-index end-index))))

(defn get-null-text
  "Deprecated.

  returns: the null text, null means no append - `java.lang.String`"
  (^java.lang.String [^StrBuilder this]
    (-> this (.getNullText))))

(defn reverse
  "Deprecated.

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this]
    (-> this (.reverse))))

(defn appendln
  "Deprecated.

  str - the string to append - `java.lang.String`
  start-index - the start index, inclusive, must be valid - `int`
  length - the length to append, must be valid - `int`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.String str ^Integer start-index ^Integer length]
    (-> this (.appendln str start-index length)))
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.String format ^java.lang.Object objs]
    (-> this (.appendln format objs)))
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.Object obj]
    (-> this (.appendln obj))))

(defn contains
  "Deprecated.

  ch - the character to find - `char`

  returns: true if the builder contains the character - `boolean`"
  (^Boolean [^StrBuilder this ^Character ch]
    (-> this (.contains ch))))

(defn read-from
  "Deprecated.

  readable - object to read from - `java.lang.Readable`

  returns: the number of characters read - `int`

  throws: java.io.IOException - if an I/O error occurs"
  (^Integer [^StrBuilder this ^java.lang.Readable readable]
    (-> this (.readFrom readable))))

(defn ends-with
  "Deprecated.

  str - the string to search for, null returns false - `java.lang.String`

  returns: true if the builder ends with the string - `boolean`"
  (^Boolean [^StrBuilder this ^java.lang.String str]
    (-> this (.endsWith str))))

(defn replace-first
  "Deprecated.

  search - the search character - `char`
  replace - the replace character - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Character search ^Character replace]
    (-> this (.replaceFirst search replace))))

(defn append-separator
  "Deprecated.

  standard - the separator if builder is not empty, null means no separator - `java.lang.String`
  default-if-empty - the separator if builder is empty, null means no separator - `java.lang.String`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.String standard ^java.lang.String default-if-empty]
    (-> this (.appendSeparator standard default-if-empty)))
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.String separator]
    (-> this (.appendSeparator separator))))

(defn set-null-text
  "Deprecated.

  null-text - the null text, null means no append - `java.lang.String`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.String null-text]
    (-> this (.setNullText null-text))))

(defn to-string
  "Deprecated.

  returns: the builder as a String - `java.lang.String`"
  (^java.lang.String [^StrBuilder this]
    (-> this (.toString))))

(defn mid-string
  "Deprecated.

  index - the index to start at, negative means zero - `int`
  length - the number of characters to extract, negative returns empty string - `int`

  returns: the new string - `java.lang.String`"
  (^java.lang.String [^StrBuilder this ^Integer index ^Integer length]
    (-> this (.midString index length))))

(defn append-fixed-width-pad-right
  "Deprecated.

  obj - the object to append, null uses null text - `java.lang.Object`
  width - the fixed field width, zero or negative has no effect - `int`
  pad-char - the pad character to use - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.Object obj ^Integer width ^Character pad-char]
    (-> this (.appendFixedWidthPadRight obj width pad-char))))

(defn right-string
  "Deprecated.

  length - the number of characters to extract, negative returns empty string - `int`

  returns: the new string - `java.lang.String`"
  (^java.lang.String [^StrBuilder this ^Integer length]
    (-> this (.rightString length))))

(defn set-length
  "Deprecated.

  length - the length to set to, must be zero or positive - `int`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`

  throws: java.lang.IndexOutOfBoundsException - if the length is negative"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Integer length]
    (-> this (.setLength length))))

(defn get-new-line-text
  "Deprecated.

  returns: the new line text, null means use system default - `java.lang.String`"
  (^java.lang.String [^StrBuilder this]
    (-> this (.getNewLineText))))

(defn sub-sequence
  "Deprecated.

  start-index - `int`
  end-index - `int`

  returns: `java.lang.CharSequence`"
  (^java.lang.CharSequence [^StrBuilder this ^Integer start-index ^Integer end-index]
    (-> this (.subSequence start-index end-index))))

(defn as-tokenizer
  "Deprecated.

  returns: a tokenizer that is linked to this builder - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrBuilder this]
    (-> this (.asTokenizer))))

(defn substring
  "Deprecated.

  start-index - the start index, inclusive, must be valid - `int`
  end-index - the end index, exclusive, must be valid except that if too large it is treated as end of string - `int`

  returns: the new string - `java.lang.String`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  (^java.lang.String [^StrBuilder this ^Integer start-index ^Integer end-index]
    (-> this (.substring start-index end-index)))
  (^java.lang.String [^StrBuilder this ^Integer start]
    (-> this (.substring start))))

(defn equals-ignore-case
  "Deprecated.

  other - the object to check, null returns false - `org.apache.commons.lang3.text.StrBuilder`

  returns: true if the builders contain the same characters in the same order - `boolean`"
  (^Boolean [^StrBuilder this ^org.apache.commons.lang3.text.StrBuilder other]
    (-> this (.equalsIgnoreCase other))))

(defn append-padding
  "Deprecated.

  length - the length to append, negative means no append - `int`
  pad-char - the character to append - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Integer length ^Character pad-char]
    (-> this (.appendPadding length pad-char))))

(defn replace
  "Deprecated.

  matcher - the matcher to use to find the deletion, null causes no action - `org.apache.commons.lang3.text.StrMatcher`
  replace-str - the string to replace the match with, null is a delete - `java.lang.String`
  start-index - the start index, inclusive, must be valid - `int`
  end-index - the end index, exclusive, must be valid except that if too large it is treated as end of string - `int`
  replace-count - the number of times to replace, -1 for replace all - `int`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`

  throws: java.lang.IndexOutOfBoundsException - if start index is invalid"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^org.apache.commons.lang3.text.StrMatcher matcher ^java.lang.String replace-str ^Integer start-index ^Integer end-index ^Integer replace-count]
    (-> this (.replace matcher replace-str start-index end-index replace-count)))
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Integer start-index ^Integer end-index ^java.lang.String replace-str]
    (-> this (.replace start-index end-index replace-str))))

(defn delete-char-at
  "Deprecated.

  index - the index to delete - `int`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Integer index]
    (-> this (.deleteCharAt index))))

(defn set-new-line-text
  "Deprecated.

  new-line - the new line text, null means use system default - `java.lang.String`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.String new-line]
    (-> this (.setNewLineText new-line))))

(defn to-char-array
  "Deprecated.

  start-index - the start index, inclusive, must be valid - `int`
  end-index - the end index, exclusive, must be valid except that if too large it is treated as end of string - `int`

  returns: a new array that holds part of the contents of the builder - `char[]`

  throws: java.lang.IndexOutOfBoundsException - if startIndex is invalid, or if endIndex is invalid (but endIndex greater than size is valid)"
  ([^StrBuilder this ^Integer start-index ^Integer end-index]
    (-> this (.toCharArray start-index end-index)))
  ([^StrBuilder this]
    (-> this (.toCharArray))))

(defn last-index-of
  "Deprecated.

  ch - the character to find - `char`
  start-index - the index to start at, invalid index rounded to edge - `int`

  returns: the last index of the character, or -1 if not found - `int`"
  (^Integer [^StrBuilder this ^Character ch ^Integer start-index]
    (-> this (.lastIndexOf ch start-index)))
  (^Integer [^StrBuilder this ^Character ch]
    (-> this (.lastIndexOf ch))))

(defn char-at
  "Deprecated.

  index - the index to retrieve, must be valid - `int`

  returns: the character at the index - `char`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  (^Character [^StrBuilder this ^Integer index]
    (-> this (.charAt index))))

(defn to-string-buffer
  "Deprecated.

  returns: the builder as a StringBuffer - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^StrBuilder this]
    (-> this (.toStringBuffer))))

(defn build
  "Deprecated.

  returns: the builder as a String - `java.lang.String`"
  (^java.lang.String [^StrBuilder this]
    (-> this (.build))))

(defn length
  "Deprecated.

  returns: the length - `int`"
  (^Integer [^StrBuilder this]
    (-> this (.length))))

(defn append-null
  "Deprecated.

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this]
    (-> this (.appendNull))))

(defn append-all
  "Deprecated.

  array - the array to append - `T`

  returns: this, to enable chaining - `<T> org.apache.commons.lang3.text.StrBuilder`"
  ([^StrBuilder this array]
    (-> this (.appendAll array))))

(defn ensure-capacity
  "Deprecated.

  capacity - the capacity to ensure - `int`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Integer capacity]
    (-> this (.ensureCapacity capacity))))

(defn starts-with
  "Deprecated.

  str - the string to search for, null returns false - `java.lang.String`

  returns: true if the builder starts with the string - `boolean`"
  (^Boolean [^StrBuilder this ^java.lang.String str]
    (-> this (.startsWith str))))

(defn append-with-separators
  "Deprecated.

  array - the array to append - `java.lang.Object[]`
  separator - the separator to use, null means no separator - `java.lang.String`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this array ^java.lang.String separator]
    (-> this (.appendWithSeparators array separator))))

(defn append
  "Deprecated.

  seq - the CharSequence to append - `java.lang.CharSequence`
  start-index - the start index, inclusive, must be valid - `int`
  length - the length to append, must be valid - `int`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.CharSequence seq ^Integer start-index ^Integer length]
    (-> this (.append seq start-index length)))
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.String format ^java.lang.Object objs]
    (-> this (.append format objs)))
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^java.lang.Object obj]
    (-> this (.append obj))))

(defn append-new-line
  "Deprecated.

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this]
    (-> this (.appendNewLine))))

(defn as-reader
  "Deprecated.

  returns: a reader that reads from this builder - `java.io.Reader`"
  (^java.io.Reader [^StrBuilder this]
    (-> this (.asReader))))

(defn set-char-at
  "Deprecated.

  index - the index to set - `int`
  ch - the new character - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`

  throws: java.lang.IndexOutOfBoundsException - if the index is invalid"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Integer index ^Character ch]
    (-> this (.setCharAt index ch))))

(defn insert
  "Deprecated.

  index - the index to add at, must be valid - `int`
  chars - the char array to insert - `char[]`
  offset - the offset into the character array to start at, must be valid - `int`
  length - the length of the character array part to copy, must be positive - `int`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`

  throws: java.lang.IndexOutOfBoundsException - if any index is invalid"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Integer index chars ^Integer offset ^Integer length]
    (-> this (.insert index chars offset length)))
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Integer index ^java.lang.Object obj]
    (-> this (.insert index obj))))

(defn as-writer
  "Deprecated.

  returns: a writer that populates this builder - `java.io.Writer`"
  (^java.io.Writer [^StrBuilder this]
    (-> this (.asWriter))))

(defn hash-code
  "Deprecated.

  returns: a hash code - `int`"
  (^Integer [^StrBuilder this]
    (-> this (.hashCode))))

(defn empty?
  "Deprecated.

  returns: true if the size is 0. - `boolean`"
  (^Boolean [^StrBuilder this]
    (-> this (.isEmpty))))

(defn size
  "Deprecated.

  returns: the length - `int`"
  (^Integer [^StrBuilder this]
    (-> this (.size))))

(defn clear
  "Deprecated.

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this]
    (-> this (.clear))))

(defn index-of
  "Deprecated.

  ch - the character to find - `char`
  start-index - the index to start at, invalid index rounded to edge - `int`

  returns: the first index of the character, or -1 if not found - `int`"
  (^Integer [^StrBuilder this ^Character ch ^Integer start-index]
    (-> this (.indexOf ch start-index)))
  (^Integer [^StrBuilder this ^Character ch]
    (-> this (.indexOf ch))))

(defn delete-first
  "Deprecated.

  ch - the character to delete - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrBuilder`"
  (^org.apache.commons.lang3.text.StrBuilder [^StrBuilder this ^Character ch]
    (-> this (.deleteFirst ch))))

(defn capacity
  "Deprecated.

  returns: the capacity - `int`"
  (^Integer [^StrBuilder this]
    (-> this (.capacity))))

(defn equals
  "Deprecated.

  other - the object to check, null returns false - `org.apache.commons.lang3.text.StrBuilder`

  returns: true if the builders contain the same characters in the same order - `boolean`"
  (^Boolean [^StrBuilder this ^org.apache.commons.lang3.text.StrBuilder other]
    (-> this (.equals other))))

