(ns org.apache.commons.lang3.reflect.FieldUtils
  "Utilities for working with Fields by reflection. Adapted and refactored from the dormant [reflect] Commons
  sandbox component.

  The ability is provided to break the scoping restrictions coded by the programmer. This can allow fields to be
  changed that shouldn't be. This facility should be used with care."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.reflect FieldUtils]))

(defn ->field-utils
  "Constructor.

  FieldUtils instances should NOT be constructed in standard programming.

   This constructor is public to permit tools that require a JavaBean instance to operate."
  (^FieldUtils []
    (new FieldUtils )))

(defn *get-declared-field
  "Gets an accessible Field by name, breaking scope if requested. Only the specified class will be
   considered.

  cls - the Class to reflect, must not be null - `java.lang.Class`
  field-name - the field name to obtain - `java.lang.String`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. false will only match public fields. - `boolean`

  returns: the Field object - `java.lang.reflect.Field`

  throws: java.lang.IllegalArgumentException - if the class is null, or the field name is blank or empty"
  (^java.lang.reflect.Field [^java.lang.Class cls ^java.lang.String field-name ^Boolean force-access]
    (FieldUtils/getDeclaredField cls field-name force-access))
  (^java.lang.reflect.Field [^java.lang.Class cls ^java.lang.String field-name]
    (FieldUtils/getDeclaredField cls field-name)))

(defn *get-fields-with-annotation
  "Gets all fields of the given class and its parents (if any) that are annotated with the given annotation.

  cls - the Class to query - `java.lang.Class`
  annotation-cls - the Annotation that must be present on a field to be matched - `java.lang.Class`

  returns: an array of Fields (possibly empty). - `java.lang.reflect.Field[]`

  throws: java.lang.IllegalArgumentException - if the class or annotation are null"
  ([^java.lang.Class cls ^java.lang.Class annotation-cls]
    (FieldUtils/getFieldsWithAnnotation cls annotation-cls)))

(defn *write-declared-field
  "Writes a public Field. Only the specified class will be considered.

  target - the object to reflect, must not be null - `java.lang.Object`
  field-name - the field name to obtain - `java.lang.String`
  value - to set - `java.lang.Object`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. false will only match public fields. - `boolean`

  throws: java.lang.IllegalArgumentException - if target is null, fieldName is blank or empty or could not be found, or value is not assignable"
  ([^java.lang.Object target ^java.lang.String field-name ^java.lang.Object value ^Boolean force-access]
    (FieldUtils/writeDeclaredField target field-name value force-access))
  ([^java.lang.Object target ^java.lang.String field-name ^java.lang.Object value]
    (FieldUtils/writeDeclaredField target field-name value)))

(defn *get-fields-list-with-annotation
  "Gets all fields of the given class and its parents (if any) that are annotated with the given annotation.

  cls - the Class to query - `java.lang.Class`
  annotation-cls - the Annotation that must be present on a field to be matched - `java.lang.Class`

  returns: a list of Fields (possibly empty). - `java.util.List<java.lang.reflect.Field>`

  throws: java.lang.IllegalArgumentException - if the class or annotation are null"
  (^java.util.List [^java.lang.Class cls ^java.lang.Class annotation-cls]
    (FieldUtils/getFieldsListWithAnnotation cls annotation-cls)))

(defn *read-declared-field
  "Gets a Field value by name. Only the class of the specified object will be considered.

  target - the object to reflect, must not be null - `java.lang.Object`
  field-name - the field name to obtain - `java.lang.String`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. false will only match public fields. - `boolean`

  returns: the Field object - `java.lang.Object`

  throws: java.lang.IllegalArgumentException - if target is null, or the field name is blank or empty or could not be found"
  (^java.lang.Object [^java.lang.Object target ^java.lang.String field-name ^Boolean force-access]
    (FieldUtils/readDeclaredField target field-name force-access))
  (^java.lang.Object [^java.lang.Object target ^java.lang.String field-name]
    (FieldUtils/readDeclaredField target field-name)))

(defn *write-declared-static-field
  "Writes a named static Field. Only the specified class will be considered.

  cls - Class on which the field is to be found - `java.lang.Class`
  field-name - to write - `java.lang.String`
  value - to set - `java.lang.Object`
  force-access - whether to break scope restrictions using the AccessibleObject#setAccessible(boolean) method. false will only match public fields. - `boolean`

  throws: java.lang.IllegalArgumentException - if cls is null, the field name is blank or empty, the field cannot be located or is not static, or value is not assignable"
  ([^java.lang.Class cls ^java.lang.String field-name ^java.lang.Object value ^Boolean force-access]
    (FieldUtils/writeDeclaredStaticField cls field-name value force-access))
  ([^java.lang.Class cls ^java.lang.String field-name ^java.lang.Object value]
    (FieldUtils/writeDeclaredStaticField cls field-name value)))

(defn *write-field
  "Writes a Field.

  field - to write - `java.lang.reflect.Field`
  target - the object to call on, may be null for static fields - `java.lang.Object`
  value - to set - `java.lang.Object`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. false will only match public fields. - `boolean`

  throws: java.lang.IllegalArgumentException - if the field is null or value is not assignable"
  ([^java.lang.reflect.Field field ^java.lang.Object target ^java.lang.Object value ^Boolean force-access]
    (FieldUtils/writeField field target value force-access))
  ([^java.lang.reflect.Field field ^java.lang.Object target ^java.lang.Object value]
    (FieldUtils/writeField field target value)))

(defn *remove-final-modifier
  "Deprecated. As of java 12.0, we can no longer drop the final modifier, thus
               rendering this method obsolete. The JDK discussion about this change can be found
               here: http://mail.openjdk.java.net/pipermail/core-libs-dev/2018-November/056486.html

  field - to remove the final modifier - `java.lang.reflect.Field`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. false will only match public fields. - `boolean`

  throws: java.lang.IllegalArgumentException - if the field is null"
  ([^java.lang.reflect.Field field ^Boolean force-access]
    (FieldUtils/removeFinalModifier field force-access))
  ([^java.lang.reflect.Field field]
    (FieldUtils/removeFinalModifier field)))

(defn *read-declared-static-field
  "Gets the value of a static Field by name. Only the specified class will be considered.

  cls - the Class to reflect, must not be null - `java.lang.Class`
  field-name - the field name to obtain - `java.lang.String`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. false will only match public fields. - `boolean`

  returns: the Field object - `java.lang.Object`

  throws: java.lang.IllegalArgumentException - if the class is null, or the field name is blank or empty, is not static, or could not be found"
  (^java.lang.Object [^java.lang.Class cls ^java.lang.String field-name ^Boolean force-access]
    (FieldUtils/readDeclaredStaticField cls field-name force-access))
  (^java.lang.Object [^java.lang.Class cls ^java.lang.String field-name]
    (FieldUtils/readDeclaredStaticField cls field-name)))

(defn *get-all-fields
  "Gets all fields of the given class and its parents (if any).

  cls - the Class to query - `java.lang.Class`

  returns: an array of Fields (possibly empty). - `java.lang.reflect.Field[]`

  throws: java.lang.IllegalArgumentException - if the class is null"
  ([^java.lang.Class cls]
    (FieldUtils/getAllFields cls)))

(defn *get-field
  "Gets an accessible Field by name, breaking scope if requested. Superclasses/interfaces will be
   considered.

  cls - the Class to reflect, must not be null - `java.lang.Class`
  field-name - the field name to obtain - `java.lang.String`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. false will only match public fields. - `boolean`

  returns: the Field object - `java.lang.reflect.Field`

  throws: java.lang.IllegalArgumentException - if the class is null, or the field name is blank or empty or is matched at multiple places in the inheritance hierarchy"
  (^java.lang.reflect.Field [^java.lang.Class cls ^java.lang.String field-name ^Boolean force-access]
    (FieldUtils/getField cls field-name force-access))
  (^java.lang.reflect.Field [^java.lang.Class cls ^java.lang.String field-name]
    (FieldUtils/getField cls field-name)))

(defn *write-static-field
  "Writes a named static Field. Superclasses will be considered.

  cls - Class on which the field is to be found - `java.lang.Class`
  field-name - to write - `java.lang.String`
  value - to set - `java.lang.Object`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. false will only match public fields. - `boolean`

  throws: java.lang.IllegalArgumentException - if cls is null, the field name is blank or empty, the field cannot be located or is not static, or value is not assignable"
  ([^java.lang.Class cls ^java.lang.String field-name ^java.lang.Object value ^Boolean force-access]
    (FieldUtils/writeStaticField cls field-name value force-access))
  ([^java.lang.reflect.Field field ^java.lang.Object value ^Boolean force-access]
    (FieldUtils/writeStaticField field value force-access))
  ([^java.lang.reflect.Field field ^java.lang.Object value]
    (FieldUtils/writeStaticField field value)))

(defn *read-static-field
  "Reads the named static Field. Superclasses will be considered.

  cls - the Class to reflect, must not be null - `java.lang.Class`
  field-name - the field name to obtain - `java.lang.String`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. false will only match public fields. - `boolean`

  returns: the Field object - `java.lang.Object`

  throws: java.lang.IllegalArgumentException - if the class is null, or the field name is blank or empty, is not static, or could not be found"
  (^java.lang.Object [^java.lang.Class cls ^java.lang.String field-name ^Boolean force-access]
    (FieldUtils/readStaticField cls field-name force-access))
  (^java.lang.Object [^java.lang.reflect.Field field ^Boolean force-access]
    (FieldUtils/readStaticField field force-access))
  (^java.lang.Object [^java.lang.reflect.Field field]
    (FieldUtils/readStaticField field)))

(defn *read-field
  "Reads a Field.

  field - the field to use - `java.lang.reflect.Field`
  target - the object to call on, may be null for static fields - `java.lang.Object`
  force-access - whether to break scope restrictions using the AccessibleObject.setAccessible(boolean) method. - `boolean`

  returns: the field value - `java.lang.Object`

  throws: java.lang.IllegalArgumentException - if the field is null"
  (^java.lang.Object [^java.lang.reflect.Field field ^java.lang.Object target ^Boolean force-access]
    (FieldUtils/readField field target force-access))
  (^java.lang.Object [^java.lang.reflect.Field field ^java.lang.Object target]
    (FieldUtils/readField field target)))

(defn *get-all-fields-list
  "Gets all fields of the given class and its parents (if any).

  cls - the Class to query - `java.lang.Class`

  returns: an array of Fields (possibly empty). - `java.util.List<java.lang.reflect.Field>`

  throws: java.lang.IllegalArgumentException - if the class is null"
  (^java.util.List [^java.lang.Class cls]
    (FieldUtils/getAllFieldsList cls)))

