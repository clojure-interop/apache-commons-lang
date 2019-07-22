(ns org.apache.commons.lang3.text.StrTokenizer
  "Deprecated.
 as of 3.6, use commons-text

  StringTokenizer instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text StrTokenizer]))

(defn ->str-tokenizer
  "Constructor.

  Deprecated.

  input - the string which is to be parsed - `java.lang.String`
  delim - the field delimiter character - `char`
  quote - the field quoted string character - `char`"
  (^StrTokenizer [^java.lang.String input ^Character delim ^Character quote]
    (new StrTokenizer input delim quote))
  (^StrTokenizer [^java.lang.String input ^Character delim]
    (new StrTokenizer input delim))
  (^StrTokenizer [^java.lang.String input]
    (new StrTokenizer input))
  (^StrTokenizer []
    (new StrTokenizer )))

(defn *get-csv-instance
  "Deprecated.

  input - the text to parse - `java.lang.String`

  returns: a new tokenizer instance which parses Comma Separated Value strings - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^java.lang.String input]
    (StrTokenizer/getCSVInstance input))
  (^org.apache.commons.lang3.text.StrTokenizer []
    (StrTokenizer/getCSVInstance )))

(defn *get-tsv-instance
  "Deprecated.

  input - the string to parse - `java.lang.String`

  returns: a new tokenizer instance which parses Tab Separated Value strings. - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^java.lang.String input]
    (StrTokenizer/getTSVInstance input))
  (^org.apache.commons.lang3.text.StrTokenizer []
    (StrTokenizer/getTSVInstance )))

(defn previous-token
  "Deprecated.

  returns: the previous sequential token, or null when no more tokens are found - `java.lang.String`"
  (^java.lang.String [^StrTokenizer this]
    (-> this (.previousToken))))

(defn next
  "Deprecated.

  returns: the next String token - `java.lang.String`

  throws: java.util.NoSuchElementException - if there are no more elements"
  (^java.lang.String [^StrTokenizer this]
    (-> this (.next))))

(defn set-delimiter-matcher
  "Deprecated.

  delim - the delimiter matcher to use - `org.apache.commons.lang3.text.StrMatcher`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^org.apache.commons.lang3.text.StrMatcher delim]
    (-> this (.setDelimiterMatcher delim))))

(defn ignore-empty-tokens?
  "Deprecated.

  returns: true if empty tokens are not returned - `boolean`"
  (^Boolean [^StrTokenizer this]
    (-> this (.isIgnoreEmptyTokens))))

(defn set-ignored-matcher
  "Deprecated.

  ignored - the ignored matcher to use, null ignored - `org.apache.commons.lang3.text.StrMatcher`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^org.apache.commons.lang3.text.StrMatcher ignored]
    (-> this (.setIgnoredMatcher ignored))))

(defn set-quote-char
  "Deprecated.

  quote - the quote character to use - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^Character quote]
    (-> this (.setQuoteChar quote))))

(defn to-string
  "Deprecated.

  returns: the string content being parsed - `java.lang.String`"
  (^java.lang.String [^StrTokenizer this]
    (-> this (.toString))))

(defn reset
  "Deprecated.

  input - the new string to tokenize, null sets no text to parse - `java.lang.String`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^java.lang.String input]
    (-> this (.reset input)))
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this]
    (-> this (.reset))))

(defn has-previous?
  "Deprecated.

  returns: true if there are previous tokens - `boolean`"
  (^Boolean [^StrTokenizer this]
    (-> this (.hasPrevious))))

(defn set-empty-token-as-null
  "Deprecated.

  empty-as-null - whether empty tokens are returned as null - `boolean`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^Boolean empty-as-null]
    (-> this (.setEmptyTokenAsNull empty-as-null))))

(defn get-quote-matcher
  "Deprecated.

  returns: the quote matcher in use - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^StrTokenizer this]
    (-> this (.getQuoteMatcher))))

(defn next-token
  "Deprecated.

  returns: the next sequential token, or null when no more tokens are found - `java.lang.String`"
  (^java.lang.String [^StrTokenizer this]
    (-> this (.nextToken))))

(defn previous-index
  "Deprecated.

  returns: the previous token index - `int`"
  (^Integer [^StrTokenizer this]
    (-> this (.previousIndex))))

(defn empty-token-as-null?
  "Deprecated.

  returns: true if empty tokens are returned as null - `boolean`"
  (^Boolean [^StrTokenizer this]
    (-> this (.isEmptyTokenAsNull))))

(defn previous
  "Deprecated.

  returns: the previous token - `java.lang.String`"
  (^java.lang.String [^StrTokenizer this]
    (-> this (.previous))))

(defn get-ignored-matcher
  "Deprecated.

  returns: the ignored matcher in use - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^StrTokenizer this]
    (-> this (.getIgnoredMatcher))))

(defn remove
  "Deprecated.

  throws: java.lang.UnsupportedOperationException - always"
  ([^StrTokenizer this]
    (-> this (.remove))))

(defn get-token-list
  "Deprecated.

  returns: the tokens as a String array - `java.util.List<java.lang.String>`"
  (^java.util.List [^StrTokenizer this]
    (-> this (.getTokenList))))

(defn set-delimiter-char
  "Deprecated.

  delim - the delimiter character to use - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^Character delim]
    (-> this (.setDelimiterChar delim))))

(defn has-next?
  "Deprecated.

  returns: true if there are more tokens - `boolean`"
  (^Boolean [^StrTokenizer this]
    (-> this (.hasNext))))

(defn set-ignored-char
  "Deprecated.

  ignored - the ignored character to use - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^Character ignored]
    (-> this (.setIgnoredChar ignored))))

(defn get-trimmer-matcher
  "Deprecated.

  returns: the trimmer matcher in use - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^StrTokenizer this]
    (-> this (.getTrimmerMatcher))))

(defn set-delimiter-string
  "Deprecated.

  delim - the delimiter string to use - `java.lang.String`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^java.lang.String delim]
    (-> this (.setDelimiterString delim))))

(defn get-delimiter-matcher
  "Deprecated.

  returns: the delimiter matcher in use - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^StrTokenizer this]
    (-> this (.getDelimiterMatcher))))

(defn clone
  "Deprecated.

  returns: a new instance of this Tokenizer which has been reset. - `java.lang.Object`"
  (^java.lang.Object [^StrTokenizer this]
    (-> this (.clone))))

(defn add
  "Deprecated.

  obj - this parameter ignored. - `java.lang.String`

  throws: java.lang.UnsupportedOperationException - always"
  ([^StrTokenizer this ^java.lang.String obj]
    (-> this (.add obj))))

(defn set
  "Deprecated.

  obj - this parameter ignored. - `java.lang.String`

  throws: java.lang.UnsupportedOperationException - always"
  ([^StrTokenizer this ^java.lang.String obj]
    (-> this (.set obj))))

(defn set-quote-matcher
  "Deprecated.

  quote - the quote matcher to use, null ignored - `org.apache.commons.lang3.text.StrMatcher`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^org.apache.commons.lang3.text.StrMatcher quote]
    (-> this (.setQuoteMatcher quote))))

(defn size
  "Deprecated.

  returns: the number of matched tokens - `int`"
  (^Integer [^StrTokenizer this]
    (-> this (.size))))

(defn set-trimmer-matcher
  "Deprecated.

  trimmer - the trimmer matcher to use, null ignored - `org.apache.commons.lang3.text.StrMatcher`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^org.apache.commons.lang3.text.StrMatcher trimmer]
    (-> this (.setTrimmerMatcher trimmer))))

(defn next-index
  "Deprecated.

  returns: the next token index - `int`"
  (^Integer [^StrTokenizer this]
    (-> this (.nextIndex))))

(defn set-ignore-empty-tokens
  "Deprecated.

  ignore-empty-tokens - whether empty tokens are not returned - `boolean`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrTokenizer`"
  (^org.apache.commons.lang3.text.StrTokenizer [^StrTokenizer this ^Boolean ignore-empty-tokens]
    (-> this (.setIgnoreEmptyTokens ignore-empty-tokens))))

(defn get-token-array
  "Deprecated.

  returns: the tokens as a String array - `java.lang.String[]`"
  ([^StrTokenizer this]
    (-> this (.getTokenArray))))

(defn get-content
  "Deprecated.

  returns: the string content being parsed - `java.lang.String`"
  (^java.lang.String [^StrTokenizer this]
    (-> this (.getContent))))

