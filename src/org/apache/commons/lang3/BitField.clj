(ns org.apache.commons.lang3.BitField
  "Supports operations on bit-mapped fields. Instances of this class can be
  used to store a flag or data within an int, short or
  byte.

  Each BitField is constructed with a mask value, which indicates
  the bits that will be used to store and retrieve the data for that field.
  For instance, the mask 0xFF indicates the least-significant byte
  should be used to store the data.

  As an example, consider a car painting machine that accepts
  paint instructions as integers. Bit fields can be used to encode this:



     // blue, green and red are 1 byte values (0-255) stored in the three least
     // significant bytes
     BitField blue = new BitField(0xFF);
     BitField green = new BitField(0xFF00);
     BitField red = new BitField(0xFF0000);

     // anyColor is a flag triggered if any color is used
     BitField anyColor = new BitField(0xFFFFFF);

     // isMetallic is a single bit flag
     BitField isMetallic = new BitField(0x1000000);

  Using these BitField instances, a paint instruction can be
  encoded into an integer:



     int paintInstruction = 0;
     paintInstruction = red.setValue(paintInstruction, 35);
     paintInstruction = green.setValue(paintInstruction, 100);
     paintInstruction = blue.setValue(paintInstruction, 255);

  Flags and data can be retrieved from the integer:



     // Prints true if red, green or blue is non-zero
     System.out.println(anyColor.isSet(paintInstruction));   // prints true

     // Prints value of red, green and blue
     System.out.println(red.getValue(paintInstruction));     // prints 35
     System.out.println(green.getValue(paintInstruction));   // prints 100
     System.out.println(blue.getValue(paintInstruction));    // prints 255

     // Prints true if isMetallic was set
     System.out.println(isMetallic.isSet(paintInstruction)); // prints false"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 BitField]))

(defn ->bit-field
  "Constructor.

  Creates a BitField instance.

  mask - the mask specifying which bits apply to this BitField. Bits that are set in this mask are the bits that this BitField operates on - `int`"
  (^BitField [^Integer mask]
    (new BitField mask)))

(defn get-raw-value
  "Obtains the value for the specified BitField, unshifted.

  holder - the int data containing the bits we're interested in - `int`

  returns: the selected bits - `int`"
  (^Integer [^BitField this ^Integer holder]
    (-> this (.getRawValue holder))))

(defn get-short-value
  "Obtains the value for the specified BitField, appropriately
   shifted right, as a short.

   Many users of a BitField will want to treat the specified
   bits as an int value, and will not want to be aware that the
   value is stored as a BitField (and so shifted left so many
   bits).

  holder - the short data containing the bits we're interested in - `short`

  returns: the selected bits, shifted right appropriately - `short`"
  (^Short [^BitField this ^Short holder]
    (-> this (.getShortValue holder))))

(defn set-boolean
  "Sets a boolean BitField.

  holder - the int data containing the bits we're interested in - `int`
  flag - indicating whether to set or clear the bits - `boolean`

  returns: the value of holder with the specified bits set or
           cleared - `int`"
  (^Integer [^BitField this ^Integer holder ^Boolean flag]
    (-> this (.setBoolean holder flag))))

(defn clear-short
  "Clears the bits.

  holder - the short data containing the bits we're interested in - `short`

  returns: the value of holder with the specified bits cleared
    (set to 0) - `short`"
  (^Short [^BitField this ^Short holder]
    (-> this (.clearShort holder))))

(defn get-value
  "Obtains the value for the specified BitField, appropriately
   shifted right.

   Many users of a BitField will want to treat the specified
   bits as an int value, and will not want to be aware that the
   value is stored as a BitField (and so shifted left so many
   bits).

  holder - the int data containing the bits we're interested in - `int`

  returns: the selected bits, shifted right appropriately - `int`"
  (^Integer [^BitField this ^Integer holder]
    (-> this (.getValue holder))))

(defn set-byte-boolean
  "Sets a boolean BitField.

  holder - the byte data containing the bits we're interested in - `byte`
  flag - indicating whether to set or clear the bits - `boolean`

  returns: the value of holder with the specified bits set or
    cleared - `byte`"
  (^Byte [^BitField this ^Byte holder ^Boolean flag]
    (-> this (.setByteBoolean holder flag))))

(defn set?
  "Returns whether the field is set or not.

   This is most commonly used for a single-bit field, which is
   often used to represent a boolean value; the results of using
   it for a multi-bit field is to determine whether *any* of its
   bits are set.

  holder - the int data containing the bits we're interested in - `int`

  returns: true if any of the bits are set,
    else false - `boolean`"
  (^Boolean [^BitField this ^Integer holder]
    (-> this (.isSet holder))))

(defn clear-byte
  "Clears the bits.

  holder - the byte data containing the bits we're interested in - `byte`

  returns: the value of holder with the specified bits cleared
    (set to 0) - `byte`"
  (^Byte [^BitField this ^Byte holder]
    (-> this (.clearByte holder))))

(defn get-short-raw-value
  "Obtains the value for the specified BitField, unshifted.

  holder - the short data containing the bits we're interested in - `short`

  returns: the selected bits - `short`"
  (^Short [^BitField this ^Short holder]
    (-> this (.getShortRawValue holder))))

(defn all-set?
  "Returns whether all of the bits are set or not.

   This is a stricter test than isSet(int),
   in that all of the bits in a multi-bit set must be set
   for this method to return true.

  holder - the int data containing the bits we're interested in - `int`

  returns: true if all of the bits are set,
    else false - `boolean`"
  (^Boolean [^BitField this ^Integer holder]
    (-> this (.isAllSet holder))))

(defn set-short-boolean
  "Sets a boolean BitField.

  holder - the short data containing the bits we're interested in - `short`
  flag - indicating whether to set or clear the bits - `boolean`

  returns: the value of holder with the specified bits set or
    cleared - `short`"
  (^Short [^BitField this ^Short holder ^Boolean flag]
    (-> this (.setShortBoolean holder flag))))

(defn set-short-value
  "Replaces the bits with new values.

  holder - the short data containing the bits we're interested in - `short`
  value - the new value for the specified bits - `short`

  returns: the value of holder with the bits from the value
    parameter replacing the old bits - `short`"
  (^Short [^BitField this ^Short holder ^Short value]
    (-> this (.setShortValue holder value))))

(defn set-byte
  "Sets the bits.

  holder - the byte data containing the bits we're interested in - `byte`

  returns: the value of holder with the specified bits set
    to 1 - `byte`"
  (^Byte [^BitField this ^Byte holder]
    (-> this (.setByte holder))))

(defn set-short
  "Sets the bits.

  holder - the short data containing the bits we're interested in - `short`

  returns: the value of holder with the specified bits set
    to 1 - `short`"
  (^Short [^BitField this ^Short holder]
    (-> this (.setShort holder))))

(defn set-value
  "Replaces the bits with new values.

  holder - the int data containing the bits we're interested in - `int`
  value - the new value for the specified bits - `int`

  returns: the value of holder with the bits from the value
    parameter replacing the old bits - `int`"
  (^Integer [^BitField this ^Integer holder ^Integer value]
    (-> this (.setValue holder value))))

(defn set
  "Sets the bits.

  holder - the int data containing the bits we're interested in - `int`

  returns: the value of holder with the specified bits set
    to 1 - `int`"
  (^Integer [^BitField this ^Integer holder]
    (-> this (.set holder))))

(defn clear
  "Clears the bits.

  holder - the int data containing the bits we're interested in - `int`

  returns: the value of holder with the specified bits cleared
    (set to 0) - `int`"
  (^Integer [^BitField this ^Integer holder]
    (-> this (.clear holder))))

