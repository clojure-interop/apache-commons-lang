(ns org.apache.commons.lang3.builder.ReflectionToStringBuilder
  " Assists in implementing Object.toString() methods using reflection.


  This class uses reflection to determine the fields to append. Because these fields are usually private, the class
  uses AccessibleObject.setAccessible(java.lang.reflect.AccessibleObject[], boolean) to
  change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions are
  set up correctly.


  Using reflection to access (private) fields circumvents any synchronization protection guarding access to these
  fields. If a toString method cannot safely read a field, you should exclude it from the toString method, or use
  synchronization consistent with the class' lock management around the invocation of the method. Take special care to
  exclude non-thread-safe collection classes, because these classes may throw ConcurrentModificationException if
  modified while the toString method is executing.


  A typical invocation for this method would look like:



  public String toString() {
      return ReflectionToStringBuilder.toString(this);
  }

  You can also use the builder to debug 3rd party objects:



  System.out.println(\"An object: \"  ReflectionToStringBuilder.toString(anObject));

  A subclass can control field output by overriding the methods:


  accept(java.lang.reflect.Field)
  getValue(java.lang.reflect.Field)


  For example, this method does not include the password field in the returned String:



  public String toString() {
      return (new ReflectionToStringBuilder(this) {
          protected boolean accept(Field f) {
              return super.accept(f) && !f.getName().equals(\"password\");
          }
      }).toString();
  }

  Alternatively the ToStringExclude annotation can be used to exclude fields from being incorporated in the
  result.


  It is also possible to use the ToStringSummary annotation to output the summary information instead of the
  detailed information of a field.


  The exact format of the toString is determined by the ToStringStyle passed into the constructor.



  Note: the default ToStringStyle will only do a \"shallow\" formatting, i.e. composed objects are not
  further traversed. To get \"deep\" formatting, use an instance of RecursiveToStringStyle."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder ReflectionToStringBuilder]))

(defn ->reflection-to-string-builder
  "Constructor.

  Constructor.

  object - the Object to build a toString for - `T`
  style - the style of the toString to create, may be null - `org.apache.commons.lang3.builder.ToStringStyle`
  buffer - the StringBuffer to populate, may be null - `java.lang.StringBuffer`
  reflect-up-to-class - the superclass to reflect up to (inclusive), may be null - `java.lang.Class`
  output-transients - whether to include transient fields - `boolean`
  output-statics - whether to include static fields - `boolean`
  exclude-null-values - whether to exclude fields who value is null - `boolean`"
  (^ReflectionToStringBuilder [object ^org.apache.commons.lang3.builder.ToStringStyle style ^java.lang.StringBuffer buffer ^java.lang.Class reflect-up-to-class ^Boolean output-transients ^Boolean output-statics ^Boolean exclude-null-values]
    (new ReflectionToStringBuilder object style buffer reflect-up-to-class output-transients output-statics exclude-null-values))
  (^ReflectionToStringBuilder [object ^org.apache.commons.lang3.builder.ToStringStyle style ^java.lang.StringBuffer buffer ^java.lang.Class reflect-up-to-class ^Boolean output-transients ^Boolean output-statics]
    (new ReflectionToStringBuilder object style buffer reflect-up-to-class output-transients output-statics))
  (^ReflectionToStringBuilder [^java.lang.Object object ^org.apache.commons.lang3.builder.ToStringStyle style ^java.lang.StringBuffer buffer]
    (new ReflectionToStringBuilder object style buffer))
  (^ReflectionToStringBuilder [^java.lang.Object object ^org.apache.commons.lang3.builder.ToStringStyle style]
    (new ReflectionToStringBuilder object style))
  (^ReflectionToStringBuilder [^java.lang.Object object]
    (new ReflectionToStringBuilder object)))

(defn *to-string
  "Builds a toString value through reflection.



   It uses AccessibleObject.setAccessible to gain access to private fields. This means that it will
   throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
   also not as efficient as testing explicitly.



   If the outputTransients is true, transient fields will be output, otherwise they
   are ignored, as they are likely derived fields, and not part of the value of the Object.



   If the outputStatics is true, static fields will be output, otherwise they are
   ignored.



   Superclass fields will be appended up to and including the specified superclass. A null superclass is treated as
   java.lang.Object.



   If the style is null, the default ToStringStyle is used.

  object - the Object to be output - `T`
  style - the style of the toString to create, may be null - `org.apache.commons.lang3.builder.ToStringStyle`
  output-transients - whether to include transient fields - `boolean`
  output-statics - whether to include static fields - `boolean`
  exclude-null-values - whether to exclude fields whose values are null - `boolean`
  reflect-up-to-class - the superclass to reflect up to (inclusive), may be null - `java.lang.Class`

  returns: the String result - `<T> java.lang.String`

  throws: java.lang.IllegalArgumentException - if the Object is null"
  ([object ^org.apache.commons.lang3.builder.ToStringStyle style ^Boolean output-transients ^Boolean output-statics ^Boolean exclude-null-values ^java.lang.Class reflect-up-to-class]
    (ReflectionToStringBuilder/toString object style output-transients output-statics exclude-null-values reflect-up-to-class))
  ([object ^org.apache.commons.lang3.builder.ToStringStyle style ^Boolean output-transients ^Boolean output-statics ^java.lang.Class reflect-up-to-class]
    (ReflectionToStringBuilder/toString object style output-transients output-statics reflect-up-to-class))
  (^java.lang.String [^java.lang.Object object ^org.apache.commons.lang3.builder.ToStringStyle style ^Boolean output-transients ^Boolean output-statics]
    (ReflectionToStringBuilder/toString object style output-transients output-statics))
  (^java.lang.String [^java.lang.Object object ^org.apache.commons.lang3.builder.ToStringStyle style ^Boolean output-transients]
    (ReflectionToStringBuilder/toString object style output-transients))
  (^java.lang.String [^java.lang.Object object ^org.apache.commons.lang3.builder.ToStringStyle style]
    (ReflectionToStringBuilder/toString object style))
  (^java.lang.String [^java.lang.Object object]
    (ReflectionToStringBuilder/toString object)))

(defn *to-string-exclude
  "Builds a String for a toString method excluding the given field names.

  object - The object to \"toString\". - `java.lang.Object`
  exclude-field-names - The field names to exclude. Null excludes nothing. - `java.util.Collection`

  returns: The toString value. - `java.lang.String`"
  (^java.lang.String [^java.lang.Object object ^java.util.Collection exclude-field-names]
    (ReflectionToStringBuilder/toStringExclude object exclude-field-names)))

(defn append-statics?
  "Gets whether or not to append static fields.

  returns: Whether or not to append static fields. - `boolean`"
  (^Boolean [^ReflectionToStringBuilder this]
    (-> this (.isAppendStatics))))

(defn get-up-to-class
  "Gets the last super class to stop appending fields for.

  returns: The last super class to stop appending fields for. - `java.lang.Class<?>`"
  (^java.lang.Class [^ReflectionToStringBuilder this]
    (-> this (.getUpToClass))))

(defn get-exclude-field-names
  "returns: Returns the excludeFieldNames. - `java.lang.String[]`"
  ([^ReflectionToStringBuilder this]
    (-> this (.getExcludeFieldNames))))

(defn set-append-transients
  "Sets whether or not to append transient fields.

  append-transients - Whether or not to append transient fields. - `boolean`"
  ([^ReflectionToStringBuilder this ^Boolean append-transients]
    (-> this (.setAppendTransients append-transients))))

(defn set-exclude-field-names
  "Sets the field names to exclude.

  exclude-field-names-param - The excludeFieldNames to excluding from toString or null. - `java.lang.String`

  returns: this - `org.apache.commons.lang3.builder.ReflectionToStringBuilder`"
  (^org.apache.commons.lang3.builder.ReflectionToStringBuilder [^ReflectionToStringBuilder this ^java.lang.String exclude-field-names-param]
    (-> this (.setExcludeFieldNames exclude-field-names-param))))

(defn reflection-append-array
  "Append to the toString an Object array.

  array - the array to add to the toString - `java.lang.Object`

  returns: this - `org.apache.commons.lang3.builder.ReflectionToStringBuilder`"
  (^org.apache.commons.lang3.builder.ReflectionToStringBuilder [^ReflectionToStringBuilder this ^java.lang.Object array]
    (-> this (.reflectionAppendArray array))))

(defn exclude-null-values?
  "Gets whether or not to append fields whose values are null.

  returns: Whether or not to append fields whose values are null. - `boolean`"
  (^Boolean [^ReflectionToStringBuilder this]
    (-> this (.isExcludeNullValues))))

(defn to-string
  "Gets the String built by this builder.

  returns: the built string - `java.lang.String`"
  (^java.lang.String [^ReflectionToStringBuilder this]
    (-> this (.toString))))

(defn set-exclude-null-values
  "Sets whether or not to append fields whose values are null.

  exclude-null-values - Whether or not to append fields whose values are null. - `boolean`"
  ([^ReflectionToStringBuilder this ^Boolean exclude-null-values]
    (-> this (.setExcludeNullValues exclude-null-values))))

(defn append-transients?
  "Gets whether or not to append transient fields.

  returns: Whether or not to append transient fields. - `boolean`"
  (^Boolean [^ReflectionToStringBuilder this]
    (-> this (.isAppendTransients))))

(defn set-up-to-class
  "Sets the last super class to stop appending fields for.

  clazz - The last super class to stop appending fields for. - `java.lang.Class`"
  ([^ReflectionToStringBuilder this ^java.lang.Class clazz]
    (-> this (.setUpToClass clazz))))

(defn set-append-statics
  "Sets whether or not to append static fields.

  append-statics - Whether or not to append static fields. - `boolean`"
  ([^ReflectionToStringBuilder this ^Boolean append-statics]
    (-> this (.setAppendStatics append-statics))))

