(ns org.apache.commons.lang3.builder.StandardToStringStyle
  "Works with ToStringBuilder to create a toString.

  This class is intended to be used as a singleton.
  There is no need to instantiate a new style each time.
  Simply instantiate the class once, customize the values as required, and
  store the result in a public static final variable for the rest of the
  program to access."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder StandardToStringStyle]))

(defn ->standard-to-string-style
  "Constructor.

  Constructor."
  (^StandardToStringStyle []
    (new StandardToStringStyle )))

(defn use-identity-hash-code?
  "Gets whether to use the identity hash code.

  returns: the current useIdentityHashCode flag - `boolean`"
  (^Boolean [^StandardToStringStyle this]
    (-> this (.isUseIdentityHashCode))))

(defn get-content-end
  "Gets the content end text.

  returns: the current content end text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getContentEnd))))

(defn set-use-field-names
  "Sets whether to use the field names passed in.

  use-field-names - the new useFieldNames flag - `boolean`"
  ([^StandardToStringStyle this ^Boolean use-field-names]
    (-> this (.setUseFieldNames use-field-names))))

(defn get-summary-object-start-text
  "Gets the start text to output when an Object is
   output in summary mode.

   This is output before the size value.

  returns: the current start of summary text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getSummaryObjectStartText))))

(defn get-field-separator
  "Gets the field separator text.

  returns: the current field separator text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getFieldSeparator))))

(defn set-use-class-name
  "Sets whether to use the class name.

  use-class-name - the new useClassName flag - `boolean`"
  ([^StandardToStringStyle this ^Boolean use-class-name]
    (-> this (.setUseClassName use-class-name))))

(defn use-field-names?
  "Gets whether to use the field names passed in.

  returns: the current useFieldNames flag - `boolean`"
  (^Boolean [^StandardToStringStyle this]
    (-> this (.isUseFieldNames))))

(defn set-field-name-value-separator
  "Sets the field name value separator text.

   null is accepted, but will be converted
   to an empty String.

  field-name-value-separator - the new field name value separator text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String field-name-value-separator]
    (-> this (.setFieldNameValueSeparator field-name-value-separator))))

(defn field-separator-at-end?
  "Gets whether the field separator should be added at the end
   of each buffer.

  returns: fieldSeparatorAtEnd flag - `boolean`"
  (^Boolean [^StandardToStringStyle this]
    (-> this (.isFieldSeparatorAtEnd))))

(defn set-content-end
  "Sets the content end text.

   null is accepted, but will be converted
   to an empty String.

  content-end - the new content end text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String content-end]
    (-> this (.setContentEnd content-end))))

(defn get-null-text
  "Gets the text to output when null found.

  returns: the current text to output when null found - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getNullText))))

(defn set-field-separator-at-start
  "Sets whether the field separator should be added at the start
   of each buffer.

  field-separator-at-start - the fieldSeparatorAtStart flag - `boolean`"
  ([^StandardToStringStyle this ^Boolean field-separator-at-start]
    (-> this (.setFieldSeparatorAtStart field-separator-at-start))))

(defn get-size-end-text
  "Gets the end text to output when a Collection,
   Map or Array size is output.

   This is output after the size value.

  returns: the current end of size text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getSizeEndText))))

(defn set-null-text
  "Sets the text to output when null found.

   null is accepted, but will be converted
   to an empty String.

  null-text - the new text to output when null found - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String null-text]
    (-> this (.setNullText null-text))))

(defn get-field-name-value-separator
  "Gets the field name value separator text.

  returns: the current field name value separator text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getFieldNameValueSeparator))))

(defn array-content-detail?
  "Gets whether to output array content detail.

  returns: the current array content detail setting - `boolean`"
  (^Boolean [^StandardToStringStyle this]
    (-> this (.isArrayContentDetail))))

(defn get-array-separator
  "Gets the array separator text.

  returns: the current array separator text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getArraySeparator))))

(defn get-content-start
  "Gets the content start text.

  returns: the current content start text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getContentStart))))

(defn get-array-start
  "Gets the array start text.

  returns: the current array start text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getArrayStart))))

(defn set-size-start-text
  "Sets the start text to output when a Collection,
   Map or Array size is output.

   This is output before the size value.

   null is accepted, but will be converted to
   an empty String.

  size-start-text - the new start of size text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String size-start-text]
    (-> this (.setSizeStartText size-start-text))))

(defn get-summary-object-end-text
  "Gets the end text to output when an Object is
   output in summary mode.

   This is output after the size value.

  returns: the current end of summary text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getSummaryObjectEndText))))

(defn use-class-name?
  "Gets whether to use the class name.

  returns: the current useClassName flag - `boolean`"
  (^Boolean [^StandardToStringStyle this]
    (-> this (.isUseClassName))))

(defn set-summary-object-start-text
  "Sets the start text to output when an Object is
   output in summary mode.

   This is output before the size value.

   null is accepted, but will be converted to
   an empty String.

  summary-object-start-text - the new start of summary text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String summary-object-start-text]
    (-> this (.setSummaryObjectStartText summary-object-start-text))))

(defn get-size-start-text
  "Gets the text to output when a Collection,
   Map or Array size is output.

   This is output before the size value.

  returns: the current start of size text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getSizeStartText))))

(defn use-short-class-name?
  "Gets whether to output short or long class names.

  returns: the current useShortClassName flag - `boolean`"
  (^Boolean [^StandardToStringStyle this]
    (-> this (.isUseShortClassName))))

(defn set-default-full-detail
  "Sets whether to use full detail when the caller doesn't
   specify.

  default-full-detail - the new defaultFullDetail flag - `boolean`"
  ([^StandardToStringStyle this ^Boolean default-full-detail]
    (-> this (.setDefaultFullDetail default-full-detail))))

(defn set-array-content-detail
  "Sets whether to output array content detail.

  array-content-detail - the new arrayContentDetail flag - `boolean`"
  ([^StandardToStringStyle this ^Boolean array-content-detail]
    (-> this (.setArrayContentDetail array-content-detail))))

(defn set-use-identity-hash-code
  "Sets whether to use the identity hash code.

  use-identity-hash-code - the new useIdentityHashCode flag - `boolean`"
  ([^StandardToStringStyle this ^Boolean use-identity-hash-code]
    (-> this (.setUseIdentityHashCode use-identity-hash-code))))

(defn set-array-separator
  "Sets the array separator text.

   null is accepted, but will be converted
   to an empty String.

  array-separator - the new array separator text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String array-separator]
    (-> this (.setArraySeparator array-separator))))

(defn set-array-start
  "Sets the array start text.

   null is accepted, but will be converted
   to an empty String.

  array-start - the new array start text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String array-start]
    (-> this (.setArrayStart array-start))))

(defn default-full-detail?
  "Gets whether to use full detail when the caller doesn't
   specify.

  returns: the current defaultFullDetail flag - `boolean`"
  (^Boolean [^StandardToStringStyle this]
    (-> this (.isDefaultFullDetail))))

(defn set-array-end
  "Sets the array end text.

   null is accepted, but will be converted
   to an empty String.

  array-end - the new array end text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String array-end]
    (-> this (.setArrayEnd array-end))))

(defn set-size-end-text
  "Sets the end text to output when a Collection,
   Map or Array size is output.

   This is output after the size value.

   null is accepted, but will be converted
   to an empty String.

  size-end-text - the new end of size text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String size-end-text]
    (-> this (.setSizeEndText size-end-text))))

(defn set-summary-object-end-text
  "Sets the end text to output when an Object is
   output in summary mode.

   This is output after the size value.

   null is accepted, but will be converted to
   an empty String.

  summary-object-end-text - the new end of summary text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String summary-object-end-text]
    (-> this (.setSummaryObjectEndText summary-object-end-text))))

(defn get-array-end
  "Gets the array end text.

  returns: the current array end text - `java.lang.String`"
  (^java.lang.String [^StandardToStringStyle this]
    (-> this (.getArrayEnd))))

(defn field-separator-at-start?
  "Gets whether the field separator should be added at the start
   of each buffer.

  returns: the fieldSeparatorAtStart flag - `boolean`"
  (^Boolean [^StandardToStringStyle this]
    (-> this (.isFieldSeparatorAtStart))))

(defn set-field-separator
  "Sets the field separator text.

   null is accepted, but will be converted
   to an empty String.

  field-separator - the new field separator text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String field-separator]
    (-> this (.setFieldSeparator field-separator))))

(defn set-use-short-class-name
  "Sets whether to output short or long class names.

  use-short-class-name - the new useShortClassName flag - `boolean`"
  ([^StandardToStringStyle this ^Boolean use-short-class-name]
    (-> this (.setUseShortClassName use-short-class-name))))

(defn set-field-separator-at-end
  "Sets whether the field separator should be added at the end
   of each buffer.

  field-separator-at-end - the fieldSeparatorAtEnd flag - `boolean`"
  ([^StandardToStringStyle this ^Boolean field-separator-at-end]
    (-> this (.setFieldSeparatorAtEnd field-separator-at-end))))

(defn set-content-start
  "Sets the content start text.

   null is accepted, but will be converted
   to an empty String.

  content-start - the new content start text - `java.lang.String`"
  ([^StandardToStringStyle this ^java.lang.String content-start]
    (-> this (.setContentStart content-start))))

