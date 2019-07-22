(ns org.apache.commons.lang3.builder.HashCodeBuilder
  " Assists in implementing Object.hashCode() methods.



  This class enables a good hashCode method to be built for any class. It follows the rules laid out in
  the book Effective Java by Joshua Bloch. Writing a
  good hashCode method is actually quite difficult. This class aims to simplify the process.



  The following is the approach taken. When appending a data field, the current total is multiplied by the
  multiplier then a relevant value
  for that data type is added. For example, if the current hashCode is 17, and the multiplier is 37, then
  appending the integer 45 will create a hash code of 674, namely 17 * 37  45.



  All relevant fields from the object should be included in the hashCode method. Derived fields may be
  excluded. In general, any field used in the equals method must be used in the hashCode
  method.



  To use this class write code as follows:




  public class Person {
    String name;
    int age;
    boolean smoker;
    ...

    public int hashCode() {
      // you pick a hard-coded, randomly chosen, non-zero, odd number
      // ideally different for each class
      return new HashCodeBuilder(17, 37).
        append(name).
        append(age).
        append(smoker).
        toHashCode();
    }
  }


  If required, the superclass hashCode() can be added using appendSuper(int).



  Alternatively, there is a method that uses reflection to determine the fields to test. Because these fields are
  usually private, the method, reflectionHashCode, uses AccessibleObject.setAccessible
  to change the visibility of the fields. This will fail under a security manager, unless the appropriate permissions
  are set up correctly. It is also slower than testing explicitly.



  A typical invocation for this method would look like:




  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }

  The HashCodeExclude annotation can be used to exclude fields from being
  used by the reflectionHashCode methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder HashCodeBuilder]))

(defn ->hash-code-builder
  "Constructor.

  Two randomly chosen, odd numbers must be passed in. Ideally these should be different for each class,
   however this is not vital.



   Prime numbers are preferred, especially for the multiplier.

  initial-odd-number - an odd number used as the initial value - `int`
  multiplier-odd-number - an odd number used as the multiplier - `int`

  throws: java.lang.IllegalArgumentException - if the number is even"
  (^HashCodeBuilder [^Integer initial-odd-number ^Integer multiplier-odd-number]
    (new HashCodeBuilder initial-odd-number multiplier-odd-number))
  (^HashCodeBuilder []
    (new HashCodeBuilder )))

(defn *reflection-hash-code
  "Uses reflection to build a valid hash code from the fields of object.



   It uses AccessibleObject.setAccessible to gain access to private fields. This means that it will
   throw a security exception if run under a security manager, if the permissions are not set up correctly. It is
   also not as efficient as testing explicitly.



   If the TestTransients parameter is set to true, transient members will be tested, otherwise they
   are ignored, as they are likely derived fields, and not part of the value of the Object.



   Static fields will not be included. Superclass fields will be included up to and including the specified
   superclass. A null superclass is treated as java.lang.Object.



   Two randomly chosen, non-zero, odd numbers must be passed in. Ideally these should be different for each class,
   however this is not vital. Prime numbers are preferred, especially for the multiplier.

  initial-non-zero-odd-number - a non-zero, odd number used as the initial value. This will be the returned value if no fields are found to include in the hash code - `int`
  multiplier-non-zero-odd-number - a non-zero, odd number used as the multiplier - `int`
  object - the Object to create a hashCode for - `T`
  test-transients - whether to include transient fields - `boolean`
  reflect-up-to-class - the superclass to reflect up to (inclusive), may be null - `java.lang.Class`
  exclude-fields - array of field names to exclude from use in calculation of hash code - `java.lang.String`

  returns: int hash code - `<T> int`

  throws: java.lang.IllegalArgumentException - if the number is zero or even"
  ([^Integer initial-non-zero-odd-number ^Integer multiplier-non-zero-odd-number object ^Boolean test-transients ^java.lang.Class reflect-up-to-class ^java.lang.String exclude-fields]
    (HashCodeBuilder/reflectionHashCode initial-non-zero-odd-number multiplier-non-zero-odd-number object test-transients reflect-up-to-class exclude-fields))
  (^Integer [^Integer initial-non-zero-odd-number ^Integer multiplier-non-zero-odd-number ^java.lang.Object object ^Boolean test-transients]
    (HashCodeBuilder/reflectionHashCode initial-non-zero-odd-number multiplier-non-zero-odd-number object test-transients))
  (^Integer [^Integer initial-non-zero-odd-number ^Integer multiplier-non-zero-odd-number ^java.lang.Object object]
    (HashCodeBuilder/reflectionHashCode initial-non-zero-odd-number multiplier-non-zero-odd-number object))
  (^Integer [^java.lang.Object object ^Boolean test-transients]
    (HashCodeBuilder/reflectionHashCode object test-transients)))

(defn append
  "Append a hashCode for a boolean.


   This adds 1 when true, and 0 when false to the hashCode.


   This is in contrast to the standard java.lang.Boolean.hashCode handling, which computes
   a hashCode value of 1231 for java.lang.Boolean instances
   that represent true or 1237 for java.lang.Boolean instances
   that represent false.


   This is in accordance with the Effective Java design.

  value - the boolean to add to the hashCode - `boolean`

  returns: this - `org.apache.commons.lang3.builder.HashCodeBuilder`"
  (^org.apache.commons.lang3.builder.HashCodeBuilder [^HashCodeBuilder this ^Boolean value]
    (-> this (.append value))))

(defn append-super
  "Adds the result of super.hashCode() to this builder.

  super-hash-code - the result of calling super.hashCode() - `int`

  returns: this HashCodeBuilder, used to chain calls. - `org.apache.commons.lang3.builder.HashCodeBuilder`"
  (^org.apache.commons.lang3.builder.HashCodeBuilder [^HashCodeBuilder this ^Integer super-hash-code]
    (-> this (.appendSuper super-hash-code))))

(defn to-hash-code
  "Return the computed hashCode.

  returns: hashCode based on the fields appended - `int`"
  (^Integer [^HashCodeBuilder this]
    (-> this (.toHashCode))))

(defn build
  "Returns the computed hashCode.

  returns: hashCode based on the fields appended - `java.lang.Integer`"
  (^java.lang.Integer [^HashCodeBuilder this]
    (-> this (.build))))

(defn hash-code
  "The computed hashCode from toHashCode() is returned due to the likelihood
   of bugs in mis-calling toHashCode() and the unlikeliness of it mattering what the hashCode for
   HashCodeBuilder itself is.

  returns: hashCode based on the fields appended - `int`"
  (^Integer [^HashCodeBuilder this]
    (-> this (.hashCode))))

