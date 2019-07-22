(ns org.apache.commons.lang3.text.StrSubstitutor
  "Deprecated.
 as of 3.6, use commons-text

  StringSubstitutor instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text StrSubstitutor]))

(defn ->str-substitutor
  "Constructor.

  Deprecated.

  value-map - the map with the variables' values, may be null - `java.util.Map`
  prefix - the prefix for variables, not null - `java.lang.String`
  suffix - the suffix for variables, not null - `java.lang.String`
  escape - the escape character - `char`
  value-delimiter - the variable default value delimiter, may be null - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if the prefix or suffix is null"
  (^StrSubstitutor [^java.util.Map value-map ^java.lang.String prefix ^java.lang.String suffix ^Character escape ^java.lang.String value-delimiter]
    (new StrSubstitutor value-map prefix suffix escape value-delimiter))
  (^StrSubstitutor [^java.util.Map value-map ^java.lang.String prefix ^java.lang.String suffix ^Character escape]
    (new StrSubstitutor value-map prefix suffix escape))
  (^StrSubstitutor [^java.util.Map value-map ^java.lang.String prefix ^java.lang.String suffix]
    (new StrSubstitutor value-map prefix suffix))
  (^StrSubstitutor [^java.util.Map value-map]
    (new StrSubstitutor value-map))
  (^StrSubstitutor []
    (new StrSubstitutor )))

(def *-default-escape
  "Static Constant.

  Deprecated.

  type: char"
  StrSubstitutor/DEFAULT_ESCAPE)

(def *-default-prefix
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.StrMatcher"
  StrSubstitutor/DEFAULT_PREFIX)

(def *-default-suffix
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.StrMatcher"
  StrSubstitutor/DEFAULT_SUFFIX)

(def *-default-value-delimiter
  "Static Constant.

  Deprecated.

  type: org.apache.commons.lang3.text.StrMatcher"
  StrSubstitutor/DEFAULT_VALUE_DELIMITER)

(defn *replace
  "Deprecated.

  source - the source text containing the variables to substitute, null returns null - `java.lang.Object`
  value-map - the map with the values, may be null - `java.util.Map`
  prefix - the prefix of variables, not null - `java.lang.String`
  suffix - the suffix of variables, not null - `java.lang.String`

  returns: the result of the replace operation - `<V> java.lang.String`

  throws: java.lang.IllegalArgumentException - if the prefix or suffix is null"
  ([^java.lang.Object source ^java.util.Map value-map ^java.lang.String prefix ^java.lang.String suffix]
    (StrSubstitutor/replace source value-map prefix suffix))
  ([^java.lang.Object source ^java.util.Map value-map]
    (StrSubstitutor/replace source value-map)))

(defn *replace-system-properties
  "Deprecated.

  source - the source text containing the variables to substitute, null returns null - `java.lang.Object`

  returns: the result of the replace operation - `java.lang.String`"
  (^java.lang.String [^java.lang.Object source]
    (StrSubstitutor/replaceSystemProperties source)))

(defn get-variable-suffix-matcher
  "Deprecated.

  returns: the suffix matcher in use - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^StrSubstitutor this]
    (-> this (.getVariableSuffixMatcher))))

(defn set-variable-resolver
  "Deprecated.

  variable-resolver - the VariableResolver - `org.apache.commons.lang3.text.StrLookup`"
  ([^StrSubstitutor this ^org.apache.commons.lang3.text.StrLookup variable-resolver]
    (-> this (.setVariableResolver variable-resolver))))

(defn enable-substitution-in-variables?
  "Deprecated.

  returns: the substitution in variable names flag - `boolean`"
  (^Boolean [^StrSubstitutor this]
    (-> this (.isEnableSubstitutionInVariables))))

(defn set-enable-substitution-in-variables
  "Deprecated.

  enable-substitution-in-variables - the new value of the flag - `boolean`"
  ([^StrSubstitutor this ^Boolean enable-substitution-in-variables]
    (-> this (.setEnableSubstitutionInVariables enable-substitution-in-variables))))

(defn set-variable-suffix
  "Deprecated.

  suffix - the suffix character to use - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrSubstitutor`"
  (^org.apache.commons.lang3.text.StrSubstitutor [^StrSubstitutor this ^Character suffix]
    (-> this (.setVariableSuffix suffix))))

(defn set-escape-char
  "Deprecated.

  escape-character - the escape character (0 for disabling escaping) - `char`"
  ([^StrSubstitutor this ^Character escape-character]
    (-> this (.setEscapeChar escape-character))))

(defn get-variable-prefix-matcher
  "Deprecated.

  returns: the prefix matcher in use - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^StrSubstitutor this]
    (-> this (.getVariablePrefixMatcher))))

(defn get-variable-resolver
  "Deprecated.

  returns: the VariableResolver - `org.apache.commons.lang3.text.StrLookup<?>`"
  (^org.apache.commons.lang3.text.StrLookup [^StrSubstitutor this]
    (-> this (.getVariableResolver))))

(defn replace
  "Deprecated.

  source - the string to replace in, null returns null - `java.lang.String`
  offset - the start offset within the array, must be valid - `int`
  length - the length within the array to be processed, must be valid - `int`

  returns: the result of the replace operation - `java.lang.String`"
  (^java.lang.String [^StrSubstitutor this ^java.lang.String source ^Integer offset ^Integer length]
    (-> this (.replace source offset length)))
  (^java.lang.String [^StrSubstitutor this ^java.lang.String source]
    (-> this (.replace source))))

(defn replace-in
  "Deprecated.

  source - the buffer to replace in, updated, null returns zero - `java.lang.StringBuffer`
  offset - the start offset within the array, must be valid - `int`
  length - the length within the buffer to be processed, must be valid - `int`

  returns: true if altered - `boolean`"
  (^Boolean [^StrSubstitutor this ^java.lang.StringBuffer source ^Integer offset ^Integer length]
    (-> this (.replaceIn source offset length)))
  (^Boolean [^StrSubstitutor this ^java.lang.StringBuffer source]
    (-> this (.replaceIn source))))

(defn get-value-delimiter-matcher
  "Deprecated.

  returns: the variable default value delimiter matcher in use, may be null - `org.apache.commons.lang3.text.StrMatcher`"
  (^org.apache.commons.lang3.text.StrMatcher [^StrSubstitutor this]
    (-> this (.getValueDelimiterMatcher))))

(defn preserve-escapes?
  "Deprecated.

  returns: the preserve escape flag - `boolean`"
  (^Boolean [^StrSubstitutor this]
    (-> this (.isPreserveEscapes))))

(defn set-preserve-escapes
  "Deprecated.

  preserve-escapes - true if escapes are to be preserved - `boolean`"
  ([^StrSubstitutor this ^Boolean preserve-escapes]
    (-> this (.setPreserveEscapes preserve-escapes))))

(defn set-variable-suffix-matcher
  "Deprecated.

  suffix-matcher - the suffix matcher to use, null ignored - `org.apache.commons.lang3.text.StrMatcher`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrSubstitutor`

  throws: java.lang.IllegalArgumentException - if the suffix matcher is null"
  (^org.apache.commons.lang3.text.StrSubstitutor [^StrSubstitutor this ^org.apache.commons.lang3.text.StrMatcher suffix-matcher]
    (-> this (.setVariableSuffixMatcher suffix-matcher))))

(defn set-variable-prefix-matcher
  "Deprecated.

  prefix-matcher - the prefix matcher to use, null ignored - `org.apache.commons.lang3.text.StrMatcher`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrSubstitutor`

  throws: java.lang.IllegalArgumentException - if the prefix matcher is null"
  (^org.apache.commons.lang3.text.StrSubstitutor [^StrSubstitutor this ^org.apache.commons.lang3.text.StrMatcher prefix-matcher]
    (-> this (.setVariablePrefixMatcher prefix-matcher))))

(defn set-variable-prefix
  "Deprecated.

  prefix - the prefix character to use - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrSubstitutor`"
  (^org.apache.commons.lang3.text.StrSubstitutor [^StrSubstitutor this ^Character prefix]
    (-> this (.setVariablePrefix prefix))))

(defn set-value-delimiter
  "Deprecated.

  value-delimiter - the variable default value delimiter character to use - `char`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrSubstitutor`"
  (^org.apache.commons.lang3.text.StrSubstitutor [^StrSubstitutor this ^Character value-delimiter]
    (-> this (.setValueDelimiter value-delimiter))))

(defn get-escape-char
  "Deprecated.

  returns: the character used for escaping variable references - `char`"
  (^Character [^StrSubstitutor this]
    (-> this (.getEscapeChar))))

(defn set-value-delimiter-matcher
  "Deprecated.

  value-delimiter-matcher - variable default value delimiter matcher to use, may be null - `org.apache.commons.lang3.text.StrMatcher`

  returns: this, to enable chaining - `org.apache.commons.lang3.text.StrSubstitutor`"
  (^org.apache.commons.lang3.text.StrSubstitutor [^StrSubstitutor this ^org.apache.commons.lang3.text.StrMatcher value-delimiter-matcher]
    (-> this (.setValueDelimiterMatcher value-delimiter-matcher))))

