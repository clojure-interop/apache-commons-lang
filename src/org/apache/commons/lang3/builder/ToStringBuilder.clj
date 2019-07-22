(ns org.apache.commons.lang3.builder.ToStringBuilder
  "Assists in implementing Object.toString() methods.

  This class enables a good and consistent toString() to be built for any
  class or object. This class aims to simplify the process by:

   allowing field names
   handling all types consistently
   handling nulls consistently
   outputting arrays and multi-dimensional arrays
   enabling the detail level to be controlled for Objects and Collections
   handling class hierarchies


  To use this class write code as follows:



  public class Person {
    String name;
    int age;
    boolean smoker;

    ...

    public String toString() {
      return new ToStringBuilder(this).
        append(\"name\", name).
        append(\"age\", age).
        append(\"smoker\", smoker).
        toString();
    }
  }

  This will produce a toString of the format:
  Person@7f54[name=Stephen,age=29,smoker=false]

  To add the superclass toString, use appendSuper(java.lang.String).
  To append the toString from an object that is delegated
  to (or any other object), use appendToString(java.lang.String).

  Alternatively, there is a method that uses reflection to determine
  the fields to test. Because these fields are usually private, the method,
  reflectionToString, uses AccessibleObject.setAccessible to
  change the visibility of the fields. This will fail under a security manager,
  unless the appropriate permissions are set up correctly. It is also
  slower than testing explicitly.

  A typical invocation for this method would look like:



  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  You can also use the builder to debug 3rd party objects:



  System.out.println(\"An object: \"  ToStringBuilder.reflectionToString(anObject));

  The exact format of the toString is determined by
  the ToStringStyle passed into the constructor."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder ToStringBuilder]))

(defn ->to-string-builder
  "Constructor.

  Constructs a builder for the specified object.

   If the style is null, the default style is used.

   If the buffer is null, a new one is created.

  object - the Object to build a toString for, not recommended to be null - `java.lang.Object`
  style - the style of the toString to create, null uses the default style - `org.apache.commons.lang3.builder.ToStringStyle`
  buffer - the StringBuffer to populate, may be null - `java.lang.StringBuffer`"
  (^ToStringBuilder [^java.lang.Object object ^org.apache.commons.lang3.builder.ToStringStyle style ^java.lang.StringBuffer buffer]
    (new ToStringBuilder object style buffer))
  (^ToStringBuilder [^java.lang.Object object ^org.apache.commons.lang3.builder.ToStringStyle style]
    (new ToStringBuilder object style))
  (^ToStringBuilder [^java.lang.Object object]
    (new ToStringBuilder object)))

(defn *get-default-style
  "Gets the default ToStringStyle to use.

   This method gets a singleton default value, typically for the whole JVM.
   Changing this default should generally only be done during application startup.
   It is recommended to pass a ToStringStyle to the constructor instead
   of using this global default.

   This method can be used from multiple threads.
   Internally, a volatile variable is used to provide the guarantee
   that the latest value set using setDefaultStyle(org.apache.commons.lang3.builder.ToStringStyle) is the value returned.
   It is strongly recommended that the default style is only changed during application startup.

   One reason for changing the default could be to have a verbose style during
   development and a compact style in production.

  returns: the default ToStringStyle, never null - `org.apache.commons.lang3.builder.ToStringStyle`"
  (^org.apache.commons.lang3.builder.ToStringStyle []
    (ToStringBuilder/getDefaultStyle )))

(defn *set-default-style
  "Sets the default ToStringStyle to use.

   This method sets a singleton default value, typically for the whole JVM.
   Changing this default should generally only be done during application startup.
   It is recommended to pass a ToStringStyle to the constructor instead
   of changing this global default.

   This method is not intended for use from multiple threads.
   Internally, a volatile variable is used to provide the guarantee
   that the latest value set is the value returned from getDefaultStyle().

  style - the default ToStringStyle - `org.apache.commons.lang3.builder.ToStringStyle`

  throws: java.lang.IllegalArgumentException - if the style is null"
  ([^org.apache.commons.lang3.builder.ToStringStyle style]
    (ToStringBuilder/setDefaultStyle style)))

(defn *reflection-to-string
  "Uses ReflectionToStringBuilder to generate a
   toString for the specified object.

  object - the Object to be output - `T`
  style - the style of the toString to create, may be null - `org.apache.commons.lang3.builder.ToStringStyle`
  output-transients - whether to include transient fields - `boolean`
  reflect-up-to-class - the superclass to reflect up to (inclusive), may be null - `java.lang.Class`

  returns: the String result - `<T> java.lang.String`"
  ([object ^org.apache.commons.lang3.builder.ToStringStyle style ^Boolean output-transients ^java.lang.Class reflect-up-to-class]
    (ToStringBuilder/reflectionToString object style output-transients reflect-up-to-class))
  (^java.lang.String [^java.lang.Object object ^org.apache.commons.lang3.builder.ToStringStyle style ^Boolean output-transients]
    (ToStringBuilder/reflectionToString object style output-transients))
  (^java.lang.String [^java.lang.Object object ^org.apache.commons.lang3.builder.ToStringStyle style]
    (ToStringBuilder/reflectionToString object style))
  (^java.lang.String [^java.lang.Object object]
    (ToStringBuilder/reflectionToString object)))

(defn append-super
  "Append the toString from the superclass.

   This method assumes that the superclass uses the same ToStringStyle
   as this one.

   If superToString is null, no change is made.

  super-to-string - the result of super.toString() - `java.lang.String`

  returns: this - `org.apache.commons.lang3.builder.ToStringBuilder`"
  (^org.apache.commons.lang3.builder.ToStringBuilder [^ToStringBuilder this ^java.lang.String super-to-string]
    (-> this (.appendSuper super-to-string))))

(defn append-as-object-to-string
  "Appends with the same format as the default Object toString()
    method. Appends the class name followed by
   System.identityHashCode(java.lang.Object).

  src-object - the Object whose class name and id to output - `java.lang.Object`

  returns: this - `org.apache.commons.lang3.builder.ToStringBuilder`"
  (^org.apache.commons.lang3.builder.ToStringBuilder [^ToStringBuilder this ^java.lang.Object src-object]
    (-> this (.appendAsObjectToString src-object))))

(defn to-string
  "Returns the built toString.

   This method appends the end of data indicator, and can only be called once.
   Use getStringBuffer() to get the current string state.

   If the object is null, return the style's nullText

  returns: the String toString - `java.lang.String`"
  (^java.lang.String [^ToStringBuilder this]
    (-> this (.toString))))

(defn get-object
  "Returns the Object being output.

  returns: The object being output. - `java.lang.Object`"
  (^java.lang.Object [^ToStringBuilder this]
    (-> this (.getObject))))

(defn append-to-string
  "Append the toString from another object.

   This method is useful where a class delegates most of the implementation of
   its properties to another class. You can then call toString() on
   the other class and pass the result into this method.



     private AnotherObject delegate;
     private String fieldInThisClass;

     public String toString() {
       return new ToStringBuilder(this).
         appendToString(delegate.toString()).
         append(fieldInThisClass).
         toString();
     }

   This method assumes that the other object uses the same ToStringStyle
   as this one.

   If the toString is null, no change is made.

  to-string - the result of toString() on another object - `java.lang.String`

  returns: this - `org.apache.commons.lang3.builder.ToStringBuilder`"
  (^org.apache.commons.lang3.builder.ToStringBuilder [^ToStringBuilder this ^java.lang.String to-string]
    (-> this (.appendToString to-string))))

(defn build
  "Returns the String that was build as an object representation. The
   default implementation utilizes the toString() implementation.

  returns: the String toString - `java.lang.String`"
  (^java.lang.String [^ToStringBuilder this]
    (-> this (.build))))

(defn get-string-buffer
  "Gets the StringBuffer being populated.

  returns: the StringBuffer being populated - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^ToStringBuilder this]
    (-> this (.getStringBuffer))))

(defn append
  "Append to the toString a boolean
   array.

   A boolean parameter controls the level of detail to show.
   Setting true will output the array in full. Setting
   false will output a summary, typically the size of
   the array.

  field-name - the field name - `java.lang.String`
  array - the array to add to the toString - `boolean[]`
  full-detail - true for detail, false for summary info - `boolean`

  returns: this - `org.apache.commons.lang3.builder.ToStringBuilder`"
  (^org.apache.commons.lang3.builder.ToStringBuilder [^ToStringBuilder this ^java.lang.String field-name array ^Boolean full-detail]
    (-> this (.append field-name array full-detail)))
  (^org.apache.commons.lang3.builder.ToStringBuilder [^ToStringBuilder this ^java.lang.String field-name ^Boolean value]
    (-> this (.append field-name value)))
  (^org.apache.commons.lang3.builder.ToStringBuilder [^ToStringBuilder this ^Boolean value]
    (-> this (.append value))))

(defn get-style
  "Gets the ToStringStyle being used.

  returns: the ToStringStyle being used - `org.apache.commons.lang3.builder.ToStringStyle`"
  (^org.apache.commons.lang3.builder.ToStringStyle [^ToStringBuilder this]
    (-> this (.getStyle))))

