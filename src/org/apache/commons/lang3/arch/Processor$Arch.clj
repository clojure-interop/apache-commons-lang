(ns org.apache.commons.lang3.arch.Processor$Arch
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.arch Processor$Arch]))

(def BIT_32
  "Enum Constant.

  A 32-bit processor architecture.

  type: org.apache.commons.lang3.arch.Processor$Arch"
  Processor$Arch/BIT_32)

(def BIT_64
  "Enum Constant.

  A 64-bit processor architecture.

  type: org.apache.commons.lang3.arch.Processor$Arch"
  Processor$Arch/BIT_64)

(def UNKNOWN
  "Enum Constant.

  An unknown-bit processor architecture.

  type: org.apache.commons.lang3.arch.Processor$Arch"
  Processor$Arch/UNKNOWN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Processor.Arch c : Processor.Arch.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.lang3.arch.Processor$Arch[]`"
  ([]
    (Processor$Arch/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.lang3.arch.Processor$Arch`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.lang3.arch.Processor$Arch [^java.lang.String name]
    (Processor$Arch/valueOf name)))

