(ns org.apache.commons.lang3.ClassUtils$Interfaces
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ClassUtils$Interfaces]))

(def INCLUDE
  "Enum Constant.

  type: org.apache.commons.lang3.ClassUtils$Interfaces"
  ClassUtils$Interfaces/INCLUDE)

(def EXCLUDE
  "Enum Constant.

  type: org.apache.commons.lang3.ClassUtils$Interfaces"
  ClassUtils$Interfaces/EXCLUDE)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (ClassUtils.Interfaces c : ClassUtils.Interfaces.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.lang3.ClassUtils$Interfaces[]`"
  ([]
    (ClassUtils$Interfaces/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.lang3.ClassUtils$Interfaces`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.lang3.ClassUtils$Interfaces [^java.lang.String name]
    (ClassUtils$Interfaces/valueOf name)))

