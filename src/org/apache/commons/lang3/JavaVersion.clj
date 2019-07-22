(ns org.apache.commons.lang3.JavaVersion
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 JavaVersion]))

(def JAVA_0_9
  "Enum Constant.

  The Java version reported by Android. This is not an official Java version number.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_0_9)

(def JAVA_1_1
  "Enum Constant.

  Java 1.1.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_1_1)

(def JAVA_1_2
  "Enum Constant.

  Java 1.2.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_1_2)

(def JAVA_1_3
  "Enum Constant.

  Java 1.3.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_1_3)

(def JAVA_1_4
  "Enum Constant.

  Java 1.4.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_1_4)

(def JAVA_1_5
  "Enum Constant.

  Java 1.5.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_1_5)

(def JAVA_1_6
  "Enum Constant.

  Java 1.6.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_1_6)

(def JAVA_1_7
  "Enum Constant.

  Java 1.7.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_1_7)

(def JAVA_1_8
  "Enum Constant.

  Java 1.8.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_1_8)

(def JAVA_1_9
  "Enum Constant.

  Deprecated. As of release 3.5, replaced by JAVA_9

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_1_9)

(def JAVA_9
  "Enum Constant.

  Java 9

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_9)

(def JAVA_10
  "Enum Constant.

  Java 10

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_10)

(def JAVA_11
  "Enum Constant.

  Java 11

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_11)

(def JAVA_12
  "Enum Constant.

  Java 12

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_12)

(def JAVA_13
  "Enum Constant.

  Java 13

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_13)

(def JAVA_RECENT
  "Enum Constant.

  The most recent java version. Mainly introduced to avoid to break when a new version of Java is used.

  type: org.apache.commons.lang3.JavaVersion"
  JavaVersion/JAVA_RECENT)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (JavaVersion c : JavaVersion.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.lang3.JavaVersion[]`"
  ([]
    (JavaVersion/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.lang3.JavaVersion`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.lang3.JavaVersion [^java.lang.String name]
    (JavaVersion/valueOf name)))

(defn at-least
  "Whether this version of Java is at least the version of Java passed in.

   For example:
    myVersion.atLeast(JavaVersion.JAVA_1_4)

  required-version - the version to check against, not null - `org.apache.commons.lang3.JavaVersion`

  returns: true if this version is equal to or greater than the specified version - `boolean`"
  (^Boolean [^JavaVersion this ^org.apache.commons.lang3.JavaVersion required-version]
    (-> this (.atLeast required-version))))

(defn at-most
  "Whether this version of Java is at most the version of Java passed in.

   For example:
    myVersion.atMost(JavaVersion.JAVA_1_4)

  required-version - the version to check against, not null - `org.apache.commons.lang3.JavaVersion`

  returns: true if this version is equal to or greater than the specified version - `boolean`"
  (^Boolean [^JavaVersion this ^org.apache.commons.lang3.JavaVersion required-version]
    (-> this (.atMost required-version))))

(defn to-string
  "The string value is overridden to return the standard name.

   For example, \"1.5\".

  returns: the name, not null - `java.lang.String`"
  (^java.lang.String [^JavaVersion this]
    (-> this (.toString))))

