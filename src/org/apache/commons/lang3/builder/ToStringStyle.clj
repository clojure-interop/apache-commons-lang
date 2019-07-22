(ns org.apache.commons.lang3.builder.ToStringStyle
  "Controls String formatting for ToStringBuilder.
  The main public interface is always via ToStringBuilder.

  These classes are intended to be used as Singletons.
  There is no need to instantiate a new style each time. A program
  will generally use one of the predefined constants on this class.
  Alternatively, the StandardToStringStyle class can be used
  to set the individual settings. Thus most styles can be achieved
  without subclassing.

  If required, a subclass can override as many or as few of the
  methods as it requires. Each object type (from boolean
  to long to Object to int[]) has
  its own methods to output it. Most have two versions, detail and summary.

  For example, the detail version of the array based methods will
  output the whole array, whereas the summary method will just output
  the array length.

  If you want to format the output of certain objects, such as dates, you
  must create a subclass and override a method.



  public class MyStyle extends ToStringStyle {
    protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {
      if (value instanceof Date) {
        value = new SimpleDateFormat(\"yyyy-MM-dd\").format(value);
      }
      buffer.append(value);
    }
  }"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder ToStringStyle]))

(def *-default-style
  "Static Constant.

  The default toString style. Using the Person
   example from ToStringBuilder, the output would look like this:



   Person@182f0db[name=John Doe,age=33,smoker=false]

  type: org.apache.commons.lang3.builder.ToStringStyle"
  ToStringStyle/DEFAULT_STYLE)

(def *-multi-line-style
  "Static Constant.

  The multi line toString style. Using the Person
   example from ToStringBuilder, the output would look like this:



   Person@182f0db[
     name=John Doe
     age=33
     smoker=false
   ]

  type: org.apache.commons.lang3.builder.ToStringStyle"
  ToStringStyle/MULTI_LINE_STYLE)

(def *-no-field-names-style
  "Static Constant.

  The no field names toString style. Using the
   Person example from ToStringBuilder, the output
   would look like this:



   Person@182f0db[John Doe,33,false]

  type: org.apache.commons.lang3.builder.ToStringStyle"
  ToStringStyle/NO_FIELD_NAMES_STYLE)

(def *-short-prefix-style
  "Static Constant.

  The short prefix toString style. Using the Person example
   from ToStringBuilder, the output would look like this:



   Person[name=John Doe,age=33,smoker=false]

  type: org.apache.commons.lang3.builder.ToStringStyle"
  ToStringStyle/SHORT_PREFIX_STYLE)

(def *-simple-style
  "Static Constant.

  The simple toString style. Using the Person
   example from ToStringBuilder, the output would look like this:



   John Doe,33,false

  type: org.apache.commons.lang3.builder.ToStringStyle"
  ToStringStyle/SIMPLE_STYLE)

(def *-no-class-name-style
  "Static Constant.

  The no class name toString style. Using the Person
   example from ToStringBuilder, the output would look like this:



   [name=John Doe,age=33,smoker=false]

  type: org.apache.commons.lang3.builder.ToStringStyle"
  ToStringStyle/NO_CLASS_NAME_STYLE)

(def *-json-style
  "Static Constant.

  The JSON toString style. Using the Person example from
   ToStringBuilder, the output would look like this:



   {\"name\": \"John Doe\", \"age\": 33, \"smoker\": true}

   Note: Since field names are mandatory in JSON, this
   ToStringStyle will throw an UnsupportedOperationException if no
   field name is passed in while appending. Furthermore This ToStringStyle
   will only generate valid JSON if referenced objects also produce JSON
   when calling toString() on them.

  type: org.apache.commons.lang3.builder.ToStringStyle"
  ToStringStyle/JSON_STYLE)

(defn append-super
  "Append to the toString the superclass toString.
   NOTE: It assumes that the toString has been created from the same ToStringStyle.

   A null superToString is ignored.

  buffer - the StringBuffer to populate - `java.lang.StringBuffer`
  super-to-string - the super.toString() - `java.lang.String`"
  ([^ToStringStyle this ^java.lang.StringBuffer buffer ^java.lang.String super-to-string]
    (-> this (.appendSuper buffer super-to-string))))

(defn append-to-string
  "Append to the toString another toString.
   NOTE: It assumes that the toString has been created from the same ToStringStyle.

   A null toString is ignored.

  buffer - the StringBuffer to populate - `java.lang.StringBuffer`
  to-string - the additional toString - `java.lang.String`"
  ([^ToStringStyle this ^java.lang.StringBuffer buffer ^java.lang.String to-string]
    (-> this (.appendToString buffer to-string))))

(defn append-start
  "Append to the toString the start of data indicator.

  buffer - the StringBuffer to populate - `java.lang.StringBuffer`
  object - the Object to build a toString for - `java.lang.Object`"
  ([^ToStringStyle this ^java.lang.StringBuffer buffer ^java.lang.Object object]
    (-> this (.appendStart buffer object))))

(defn append-end
  "Append to the toString the end of data indicator.

  buffer - the StringBuffer to populate - `java.lang.StringBuffer`
  object - the Object to build a toString for. - `java.lang.Object`"
  ([^ToStringStyle this ^java.lang.StringBuffer buffer ^java.lang.Object object]
    (-> this (.appendEnd buffer object))))

(defn append
  "Append to the toString an Object
   value, printing the full toString of the
   Object passed in.

  buffer - the StringBuffer to populate - `java.lang.StringBuffer`
  field-name - the field name - `java.lang.String`
  value - the value to add to the toString - `java.lang.Object`
  full-detail - true for detail, false for summary info, null for style decides - `java.lang.Boolean`"
  ([^ToStringStyle this ^java.lang.StringBuffer buffer ^java.lang.String field-name ^java.lang.Object value ^java.lang.Boolean full-detail]
    (-> this (.append buffer field-name value full-detail)))
  ([^ToStringStyle this ^java.lang.StringBuffer buffer ^java.lang.String field-name ^Long value]
    (-> this (.append buffer field-name value))))

