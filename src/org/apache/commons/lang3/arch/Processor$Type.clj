(ns org.apache.commons.lang3.arch.Processor$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.arch Processor$Type]))

(def X86
  "Enum Constant.

  Intel x86 series of instruction set architectures.

  type: org.apache.commons.lang3.arch.Processor$Type"
  Processor$Type/X86)

(def IA_64
  "Enum Constant.

  Intel Itanium  64-bit architecture.

  type: org.apache.commons.lang3.arch.Processor$Type"
  Processor$Type/IA_64)

(def PPC
  "Enum Constant.

  Apple–IBM–Motorola PowerPC architecture.

  type: org.apache.commons.lang3.arch.Processor$Type"
  Processor$Type/PPC)

(def UNKNOWN
  "Enum Constant.

  Unknown architecture.

  type: org.apache.commons.lang3.arch.Processor$Type"
  Processor$Type/UNKNOWN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Processor.Type c : Processor.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.lang3.arch.Processor$Type[]`"
  ([]
    (Processor$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.lang3.arch.Processor$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.lang3.arch.Processor$Type [^java.lang.String name]
    (Processor$Type/valueOf name)))

