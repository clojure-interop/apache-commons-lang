(ns org.apache.commons.lang3.Validate
  "This class assists in validating arguments. The validation methods are
  based along the following principles:

    An invalid null argument causes a NullPointerException.
    A non-null argument causes an IllegalArgumentException.
    An invalid index into an array/collection/map/string causes an IndexOutOfBoundsException.


  All exceptions messages are
  format strings
  as defined by the Java platform. For example:



  Validate.isTrue(i > 0, \"The value must be greater than zero: %d\", i);
  Validate.notNull(surname, \"The surname must not be %s\", null);

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Validate]))

(defn ->validate
  "Constructor.

  Constructor. This class should not normally be instantiated."
  (^Validate []
    (new Validate )))

(defn *no-null-elements
  "Validate that the specified argument array is neither
   null nor contains any elements that are null;
   otherwise throwing an exception with the specified message.



  Validate.noNullElements(myArray, \"The array contain null at position %d\");

   If the array is null, then the message in the exception
   is \"The validated object is null\".

   If the array has a null element, then the iteration
   index of the invalid element is appended to the values
   argument.

  array - the array to check, validated not null by this method - `T[]`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  returns: the validated array (never null method for chaining) - `<T> T[]`

  throws: java.lang.NullPointerException - if the array is null"
  ([array ^java.lang.String message ^java.lang.Object values]
    (Validate/noNullElements array message values))
  ([array]
    (Validate/noNullElements array)))

(defn *matches-pattern
  "Validate that the specified argument character sequence matches the specified regular
   expression pattern; otherwise throwing an exception with the specified message.



  Validate.matchesPattern(\"hi\", \"[a-z]*\", \"%s does not match %s\", \"hi\" \"[a-z]*\");

   The syntax of the pattern is the one used in the Pattern class.

  input - the character sequence to validate, not null - `java.lang.CharSequence`
  pattern - the regular expression pattern, not null - `java.lang.String`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  throws: java.lang.IllegalArgumentException - if the character sequence does not match the pattern"
  ([^java.lang.CharSequence input ^java.lang.String pattern ^java.lang.String message ^java.lang.Object values]
    (Validate/matchesPattern input pattern message values))
  ([^java.lang.CharSequence input ^java.lang.String pattern]
    (Validate/matchesPattern input pattern)))

(defn *valid-index
  "Validates that the index is within the bounds of the argument
   array; otherwise throwing an exception with the specified message.



  Validate.validIndex(myArray, 2, \"The array index is invalid: \");

   If the array is null, then the message of the exception
   is \"The validated object is null\".

  array - the array to check, validated not null by this method - `T[]`
  index - the index to check - `int`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  returns: the validated array (never null for method chaining) - `<T> T[]`

  throws: java.lang.NullPointerException - if the array is null"
  ([array ^Integer index ^java.lang.String message ^java.lang.Object values]
    (Validate/validIndex array index message values))
  ([array ^Integer index]
    (Validate/validIndex array index)))

(defn *not-null
  "Validate that the specified argument is not null;
   otherwise throwing an exception with the specified message.



  Validate.notNull(myObject, \"The object must not be null\");

  object - the object to check - `T`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message - `java.lang.Object`

  returns: the validated object (never null for method chaining) - `<T> T`

  throws: java.lang.NullPointerException - if the object is null"
  ([object ^java.lang.String message ^java.lang.Object values]
    (Validate/notNull object message values))
  ([object]
    (Validate/notNull object)))

(defn *valid-state
  "Validate that the stateful condition is true; otherwise
   throwing an exception with the specified message. This method is useful when
   validating according to an arbitrary boolean expression, such as validating a
   primitive number or using your own custom validation expression.



  Validate.validState(this.isOk(), \"The state is not OK: %s\", myObject);

  expression - the boolean expression to check - `boolean`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  throws: java.lang.IllegalStateException - if expression is false"
  ([^Boolean expression ^java.lang.String message ^java.lang.Object values]
    (Validate/validState expression message values))
  ([^Boolean expression]
    (Validate/validState expression)))

(defn *is-assignable-from
  "Validates that the argument can be converted to the specified class, if not throws an exception.

   This method is useful when validating if there will be no casting errors.



  Validate.isAssignableFrom(SuperClass.class, object.getClass());

   The message of the exception is \"The validated object can not be converted to the\"
   followed by the name of the class and \"class\"

  super-type - the class the class must be validated against, not null - `java.lang.Class`
  type - the class to check, not null - `java.lang.Class`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  throws: java.lang.IllegalArgumentException - if argument can not be converted to the specified class"
  ([^java.lang.Class super-type ^java.lang.Class type ^java.lang.String message ^java.lang.Object values]
    (Validate/isAssignableFrom super-type type message values))
  ([^java.lang.Class super-type ^java.lang.Class type]
    (Validate/isAssignableFrom super-type type)))

(defn *not-empty
  "Validate that the specified argument array is neither null
   nor a length of zero (no elements); otherwise throwing an exception
   with the specified message.



  Validate.notEmpty(myArray, \"The array must not be empty\");

  array - the array to check, validated not null by this method - `T[]`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  returns: the validated array (never null method for chaining) - `<T> T[]`

  throws: java.lang.NullPointerException - if the array is null"
  ([array ^java.lang.String message ^java.lang.Object values]
    (Validate/notEmpty array message values))
  ([array]
    (Validate/notEmpty array)))

(defn *is-true
  "Validate that the argument condition is true; otherwise
   throwing an exception with the specified message. This method is useful when
   validating according to an arbitrary boolean expression, such as validating a
   primitive number or using your own custom validation expression.



  Validate.isTrue(i > 0.0, \"The value must be greater than zero: %d\", i);

   For performance reasons, the long value is passed as a separate parameter and
   appended to the exception message only in the case of an error.

  expression - the boolean expression to check - `boolean`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  value - the value to append to the message when invalid - `long`

  throws: java.lang.IllegalArgumentException - if expression is false"
  ([^Boolean expression ^java.lang.String message ^Long value]
    (Validate/isTrue expression message value))
  ([^Boolean expression]
    (Validate/isTrue expression)))

(defn *not-na-n
  "Validates that the specified argument is not NaN; otherwise
   throwing an exception with the specified message.



  Validate.notNaN(myDouble, \"The value must be a number\");

  value - the value to validate - `double`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message - `java.lang.Object`

  throws: java.lang.IllegalArgumentException - if the value is not a number"
  ([^Double value ^java.lang.String message ^java.lang.Object values]
    (Validate/notNaN value message values))
  ([^Double value]
    (Validate/notNaN value)))

(defn *finite
  "Validates that the specified argument is not infinite or NaN;
   otherwise throwing an exception with the specified message.



  Validate.finite(myDouble, \"The argument must contain a numeric value\");

  value - the value to validate - `double`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message - `java.lang.Object`

  throws: java.lang.IllegalArgumentException - if the value is infinite or NaN"
  ([^Double value ^java.lang.String message ^java.lang.Object values]
    (Validate/finite value message values))
  ([^Double value]
    (Validate/finite value)))

(defn *inclusive-between
  "Validate that the specified argument object fall between the two
   inclusive values specified; otherwise, throws an exception with the
   specified message.



  Validate.inclusiveBetween(0, 2, 1, \"Not in boundaries\");

  start - the inclusive start value, not null - `T`
  end - the inclusive end value, not null - `T`
  value - the object to validate, not null - `java.lang.Comparable`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  returns: `<T> void`

  throws: java.lang.IllegalArgumentException - if the value falls outside the boundaries"
  ([start end ^java.lang.Comparable value ^java.lang.String message ^java.lang.Object values]
    (Validate/inclusiveBetween start end value message values))
  ([^Long start ^Long end ^Long value ^java.lang.String message]
    (Validate/inclusiveBetween start end value message))
  ([start end ^java.lang.Comparable value]
    (Validate/inclusiveBetween start end value)))

(defn *exclusive-between
  "Validate that the specified argument object fall between the two
   exclusive values specified; otherwise, throws an exception with the
   specified message.



  Validate.exclusiveBetween(0, 2, 1, \"Not in boundaries\");

  start - the exclusive start value, not null - `T`
  end - the exclusive end value, not null - `T`
  value - the object to validate, not null - `java.lang.Comparable`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  returns: `<T> void`

  throws: java.lang.IllegalArgumentException - if the value falls outside the boundaries"
  ([start end ^java.lang.Comparable value ^java.lang.String message ^java.lang.Object values]
    (Validate/exclusiveBetween start end value message values))
  ([^Long start ^Long end ^Long value ^java.lang.String message]
    (Validate/exclusiveBetween start end value message))
  ([start end ^java.lang.Comparable value]
    (Validate/exclusiveBetween start end value)))

(defn *not-blank
  "Validate that the specified argument character sequence is
   neither null, a length of zero (no characters), empty
   nor whitespace; otherwise throwing an exception with the specified
   message.



  Validate.notBlank(myString, \"The string must not be blank\");

  chars - the character sequence to check, validated not null by this method - `T`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  returns: the validated character sequence (never null method for chaining) - `<T extends java.lang.CharSequence> T`

  throws: java.lang.NullPointerException - if the character sequence is null"
  ([chars ^java.lang.String message ^java.lang.Object values]
    (Validate/notBlank chars message values))
  ([chars]
    (Validate/notBlank chars)))

(defn *is-instance-of
  "Validate that the argument is an instance of the specified class; otherwise
   throwing an exception with the specified message. This method is useful when
   validating according to an arbitrary class



  Validate.isInstanceOf(OkClass.class, object, \"Wrong class, object is of class %s\",
     object.getClass().getName());

  type - the class the object must be validated against, not null - `java.lang.Class`
  obj - the object to check, null throws an exception - `java.lang.Object`
  message - the String.format(String, Object...) exception message if invalid, not null - `java.lang.String`
  values - the optional values for the formatted exception message, null array not recommended - `java.lang.Object`

  throws: java.lang.IllegalArgumentException - if argument is not of specified class"
  ([^java.lang.Class type ^java.lang.Object obj ^java.lang.String message ^java.lang.Object values]
    (Validate/isInstanceOf type obj message values))
  ([^java.lang.Class type ^java.lang.Object obj]
    (Validate/isInstanceOf type obj)))

