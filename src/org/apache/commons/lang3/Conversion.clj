(ns org.apache.commons.lang3.Conversion
  " Static methods to convert a type into another, with endianness and bit ordering awareness.


  The methods names follow a naming rule:
  <source type>[source endianness][source bit ordering]To<destination type>[destination endianness][destination bit ordering]


  Source/destination type fields is one of the following:


  binary: an array of booleans
  byte or byteArray
  int or intArray
  long or longArray
  hex: a String containing hexadecimal digits (lowercase in destination)
  hexDigit: a Char containing a hexadecimal digit (lowercase in destination)
  uuid


  Endianness field: little endian is the default, in this case the field is absent. In case of
  big endian, the field is \"Be\". Bit ordering: Lsb0 is the default, in this case the field
  is absent. In case of Msb0, the field is \"Msb0\".


  Example: intBeMsb0ToHex convert an int with big endian byte order and Msb0 bit order into its
  hexadecimal string representation


  Most of the methods provide only default encoding for destination, this limits the number of
  ways to do one thing. Unless you are dealing with data from/to outside of the JVM platform,
  you should not need to use \"Be\" and \"Msb0\" methods.


  Development status: work on going, only a part of the little endian, Lsb0 methods implemented
  so far."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Conversion]))

(defn ->conversion
  "Constructor."
  (^Conversion []
    (new Conversion )))

(defn *binary-to-long
  "Converts binary (represented as boolean array) into a long using the default (little
   endian, Lsb0) byte and bit ordering.

  src - the binary to convert - `boolean[]`
  src-pos - the position in src, in boolean unit, from where to start the conversion - `int`
  dst-init - initial value of the destination long - `long`
  dst-pos - the position of the lsb, in bits, in the result long - `int`
  n-bools - the number of booleans to convert - `int`

  returns: a long containing the selected bits - `long`

  throws: java.lang.NullPointerException - if src is null"
  (^Long [src ^Integer src-pos ^Long dst-init ^Integer dst-pos ^Integer n-bools]
    (Conversion/binaryToLong src src-pos dst-init dst-pos n-bools)))

(defn *short-array-to-int
  "Converts an array of short into an int using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the short array to convert - `short[]`
  src-pos - the position in src, in short unit, from where to start the conversion - `int`
  dst-init - initial value of the destination int - `int`
  dst-pos - the position of the lsb, in bits, in the result int - `int`
  n-shorts - the number of shorts to convert - `int`

  returns: an int containing the selected bits - `int`

  throws: java.lang.NullPointerException - if src is null"
  (^Integer [src ^Integer src-pos ^Integer dst-init ^Integer dst-pos ^Integer n-shorts]
    (Conversion/shortArrayToInt src src-pos dst-init dst-pos n-shorts)))

(defn *binary-to-int
  "Converts binary (represented as boolean array) into an int using the default (little
   endian, Lsb0) byte and bit ordering.

  src - the binary to convert - `boolean[]`
  src-pos - the position in src, in boolean unit, from where to start the conversion - `int`
  dst-init - initial value of the destination int - `int`
  dst-pos - the position of the lsb, in bits, in the result int - `int`
  n-bools - the number of booleans to convert - `int`

  returns: an int containing the selected bits - `int`

  throws: java.lang.NullPointerException - if src is null"
  (^Integer [src ^Integer src-pos ^Integer dst-init ^Integer dst-pos ^Integer n-bools]
    (Conversion/binaryToInt src src-pos dst-init dst-pos n-bools)))

(defn *byte-to-hex
  "Converts a byte into an array of Char using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the byte to convert - `byte`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst-init - the initial value for the result String - `java.lang.String`
  dst-pos - the position in dst where to copy the result - `int`
  n-hexs - the number of Chars to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if (nHexs-1)*4+srcPos >= 8"
  (^java.lang.String [^Byte src ^Integer src-pos ^java.lang.String dst-init ^Integer dst-pos ^Integer n-hexs]
    (Conversion/byteToHex src src-pos dst-init dst-pos n-hexs)))

(defn *byte-array-to-long
  "Converts an array of byte into a long using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the byte array to convert - `byte[]`
  src-pos - the position in src, in byte unit, from where to start the conversion - `int`
  dst-init - initial value of the destination long - `long`
  dst-pos - the position of the lsb, in bits, in the result long - `int`
  n-bytes - the number of bytes to convert - `int`

  returns: a long containing the selected bits - `long`

  throws: java.lang.NullPointerException - if src is null"
  (^Long [src ^Integer src-pos ^Long dst-init ^Integer dst-pos ^Integer n-bytes]
    (Conversion/byteArrayToLong src src-pos dst-init dst-pos n-bytes)))

(defn *hex-digit-to-int
  "Converts a hexadecimal digit into an int using the default (Lsb0) bit ordering.


   '1' is converted to 1

  hex-digit - the hexadecimal digit to convert - `char`

  returns: an int equals to hexDigit - `int`

  throws: java.lang.IllegalArgumentException - if hexDigit is not a hexadecimal digit"
  (^Integer [^Character hex-digit]
    (Conversion/hexDigitToInt hex-digit)))

(defn *hex-to-byte
  "Converts an array of Char into a byte using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the hex string to convert - `java.lang.String`
  src-pos - the position in src, in Char unit, from where to start the conversion - `int`
  dst-init - initial value of the destination byte - `byte`
  dst-pos - the position of the lsb, in bits, in the result byte - `int`
  n-hex - the number of Chars to convert - `int`

  returns: a byte containing the selected bits - `byte`

  throws: java.lang.IllegalArgumentException - if (nHexs-1)*4+dstPos >= 8"
  (^Byte [^java.lang.String src ^Integer src-pos ^Byte dst-init ^Integer dst-pos ^Integer n-hex]
    (Conversion/hexToByte src src-pos dst-init dst-pos n-hex)))

(defn *hex-to-long
  "Converts an array of Char into a long using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the hex string to convert - `java.lang.String`
  src-pos - the position in src, in Char unit, from where to start the conversion - `int`
  dst-init - initial value of the destination long - `long`
  dst-pos - the position of the lsb, in bits, in the result long - `int`
  n-hex - the number of Chars to convert - `int`

  returns: a long containing the selected bits - `long`

  throws: java.lang.IllegalArgumentException - if (nHexs-1)*4+dstPos >= 64"
  (^Long [^java.lang.String src ^Integer src-pos ^Long dst-init ^Integer dst-pos ^Integer n-hex]
    (Conversion/hexToLong src src-pos dst-init dst-pos n-hex)))

(defn *byte-to-binary
  "Converts a byte into an array of boolean using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the byte to convert - `byte`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `boolean[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-bools - the number of booleans to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `boolean[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^Byte src ^Integer src-pos dst ^Integer dst-pos ^Integer n-bools]
    (Conversion/byteToBinary src src-pos dst dst-pos n-bools)))

(defn *hex-digit-msb-0-to-binary
  "Converts a hexadecimal digit into binary (represented as boolean array) using the Msb0
   bit ordering.


   '1' is converted as follow: (0, 0, 0, 1)

  hex-digit - the hexadecimal digit to convert - `char`

  returns: a boolean array with the binary representation of hexDigit - `boolean[]`

  throws: java.lang.IllegalArgumentException - if hexDigit is not a hexadecimal digit"
  ([^Character hex-digit]
    (Conversion/hexDigitMsb0ToBinary hex-digit)))

(defn *short-array-to-long
  "Converts an array of short into a long using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the short array to convert - `short[]`
  src-pos - the position in src, in short unit, from where to start the conversion - `int`
  dst-init - initial value of the destination long - `long`
  dst-pos - the position of the lsb, in bits, in the result long - `int`
  n-shorts - the number of shorts to convert - `int`

  returns: a long containing the selected bits - `long`

  throws: java.lang.NullPointerException - if src is null"
  (^Long [src ^Integer src-pos ^Long dst-init ^Integer dst-pos ^Integer n-shorts]
    (Conversion/shortArrayToLong src src-pos dst-init dst-pos n-shorts)))

(defn *byte-array-to-uuid
  "Converts bytes from an array into a UUID using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the byte array to convert - `byte[]`
  src-pos - the position in src where to copy the result from - `int`

  returns: a UUID - `java.util.UUID`

  throws: java.lang.NullPointerException - if src is null"
  (^java.util.UUID [src ^Integer src-pos]
    (Conversion/byteArrayToUuid src src-pos)))

(defn *int-to-short-array
  "Converts an int into an array of short using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the int to convert - `int`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `short[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-shorts - the number of shorts to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `short[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^Integer src ^Integer src-pos dst ^Integer dst-pos ^Integer n-shorts]
    (Conversion/intToShortArray src src-pos dst dst-pos n-shorts)))

(defn *int-to-hex-digit-msb-0
  "Converts the 4 lsb of an int to a hexadecimal digit encoded using the Msb0 bit ordering.


   0 returns '0'


   1 returns '8'


   10 returns '5' and so on...

  nibble - the 4 bits to convert - `int`

  returns: a hexadecimal digit representing the 4 lsb of nibble - `char`

  throws: java.lang.IllegalArgumentException - if nibble < 0 or nibble > 15"
  (^Character [^Integer nibble]
    (Conversion/intToHexDigitMsb0 nibble)))

(defn *int-to-hex-digit
  "Converts the 4 lsb of an int to a hexadecimal digit.


   0 returns '0'


   1 returns '1'


   10 returns 'A' and so on...

  nibble - the 4 bits to convert - `int`

  returns: a hexadecimal digit representing the 4 lsb of nibble - `char`

  throws: java.lang.IllegalArgumentException - if nibble < 0 or nibble > 15"
  (^Character [^Integer nibble]
    (Conversion/intToHexDigit nibble)))

(defn *binary-to-hex-digit
  "Converts binary (represented as boolean array) to a hexadecimal digit using the default
   (Lsb0) bit ordering.


   (1, 0, 0, 0) is converted as follow: '1'

  src - the binary to convert - `boolean[]`
  src-pos - the position of the lsb to start the conversion - `int`

  returns: a hexadecimal digit representing the selected bits - `char`

  throws: java.lang.IllegalArgumentException - if src is empty"
  (^Character [src ^Integer src-pos]
    (Conversion/binaryToHexDigit src src-pos))
  (^Character [src]
    (Conversion/binaryToHexDigit src)))

(defn *binary-to-byte
  "Converts binary (represented as boolean array) into a byte using the default (little
   endian, Lsb0) byte and bit ordering.

  src - the binary to convert - `boolean[]`
  src-pos - the position in src, in boolean unit, from where to start the conversion - `int`
  dst-init - initial value of the destination byte - `byte`
  dst-pos - the position of the lsb, in bits, in the result byte - `int`
  n-bools - the number of booleans to convert - `int`

  returns: a byte containing the selected bits - `byte`

  throws: java.lang.NullPointerException - if src is null"
  (^Byte [src ^Integer src-pos ^Byte dst-init ^Integer dst-pos ^Integer n-bools]
    (Conversion/binaryToByte src src-pos dst-init dst-pos n-bools)))

(defn *byte-array-to-int
  "Converts an array of byte into an int using the default (little endian, Lsb0) byte and bit
   ordering.

  src - the byte array to convert - `byte[]`
  src-pos - the position in src, in byte unit, from where to start the conversion - `int`
  dst-init - initial value of the destination int - `int`
  dst-pos - the position of the lsb, in bits, in the result int - `int`
  n-bytes - the number of bytes to convert - `int`

  returns: an int containing the selected bits - `int`

  throws: java.lang.NullPointerException - if src is null"
  (^Integer [src ^Integer src-pos ^Integer dst-init ^Integer dst-pos ^Integer n-bytes]
    (Conversion/byteArrayToInt src src-pos dst-init dst-pos n-bytes)))

(defn *short-to-hex
  "Converts a short into an array of Char using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the short to convert - `short`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst-init - the initial value for the result String - `java.lang.String`
  dst-pos - the position in dst where to copy the result - `int`
  n-hexs - the number of Chars to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if (nHexs-1)*4+srcPos >= 16"
  (^java.lang.String [^Short src ^Integer src-pos ^java.lang.String dst-init ^Integer dst-pos ^Integer n-hexs]
    (Conversion/shortToHex src src-pos dst-init dst-pos n-hexs)))

(defn *long-to-hex
  "Converts a long into an array of Char using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the long to convert - `long`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst-init - the initial value for the result String - `java.lang.String`
  dst-pos - the position in dst where to copy the result - `int`
  n-hexs - the number of Chars to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if (nHexs-1)*4+srcPos >= 64"
  (^java.lang.String [^Long src ^Integer src-pos ^java.lang.String dst-init ^Integer dst-pos ^Integer n-hexs]
    (Conversion/longToHex src src-pos dst-init dst-pos n-hexs)))

(defn *int-to-byte-array
  "Converts an int into an array of byte using the default (little endian, Lsb0) byte and bit
   ordering.

  src - the int to convert - `int`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `byte[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-bytes - the number of bytes to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `byte[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^Integer src ^Integer src-pos dst ^Integer dst-pos ^Integer n-bytes]
    (Conversion/intToByteArray src src-pos dst dst-pos n-bytes)))

(defn *byte-array-to-short
  "Converts an array of byte into a short using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the byte array to convert - `byte[]`
  src-pos - the position in src, in byte unit, from where to start the conversion - `int`
  dst-init - initial value of the destination short - `short`
  dst-pos - the position of the lsb, in bits, in the result short - `int`
  n-bytes - the number of bytes to convert - `int`

  returns: a short containing the selected bits - `short`

  throws: java.lang.NullPointerException - if src is null"
  (^Short [src ^Integer src-pos ^Short dst-init ^Integer dst-pos ^Integer n-bytes]
    (Conversion/byteArrayToShort src src-pos dst-init dst-pos n-bytes)))

(defn *hex-to-int
  "Converts an array of Char into an int using the default (little endian, Lsb0) byte and bit
   ordering.

  src - the hex string to convert - `java.lang.String`
  src-pos - the position in src, in Char unit, from where to start the conversion - `int`
  dst-init - initial value of the destination int - `int`
  dst-pos - the position of the lsb, in bits, in the result int - `int`
  n-hex - the number of Chars to convert - `int`

  returns: an int containing the selected bits - `int`

  throws: java.lang.IllegalArgumentException - if (nHexs-1)*4+dstPos >= 32"
  (^Integer [^java.lang.String src ^Integer src-pos ^Integer dst-init ^Integer dst-pos ^Integer n-hex]
    (Conversion/hexToInt src src-pos dst-init dst-pos n-hex)))

(defn *hex-digit-to-binary
  "Converts a hexadecimal digit into binary (represented as boolean array) using the default
   (Lsb0) bit ordering.


   '1' is converted as follow: (1, 0, 0, 0)

  hex-digit - the hexadecimal digit to convert - `char`

  returns: a boolean array with the binary representation of hexDigit - `boolean[]`

  throws: java.lang.IllegalArgumentException - if hexDigit is not a hexadecimal digit"
  ([^Character hex-digit]
    (Conversion/hexDigitToBinary hex-digit)))

(defn *long-to-byte-array
  "Converts a long into an array of byte using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the long to convert - `long`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `byte[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-bytes - the number of bytes to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `byte[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^Long src ^Integer src-pos dst ^Integer dst-pos ^Integer n-bytes]
    (Conversion/longToByteArray src src-pos dst dst-pos n-bytes)))

(defn *binary-to-hex-digit-msb-0-4bits
  "Converts binary (represented as boolean array) to a hexadecimal digit using the Msb0 bit
   ordering.


   (1, 0, 0, 0) is converted as follow: '8' (1, 0, 0, 1, 1, 0, 1, 0) with srcPos = 3 is converted
   to 'D'

  src - the binary to convert - `boolean[]`
  src-pos - the position of the lsb to start the conversion - `int`

  returns: a hexadecimal digit representing the selected bits - `char`

  throws: java.lang.IllegalArgumentException - if src is empty, src.length > 8 or src.length - srcPos < 4"
  (^Character [src ^Integer src-pos]
    (Conversion/binaryToHexDigitMsb0_4bits src src-pos))
  (^Character [src]
    (Conversion/binaryToHexDigitMsb0_4bits src)))

(defn *long-to-binary
  "Converts a long into an array of boolean using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the long to convert - `long`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `boolean[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-bools - the number of booleans to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `boolean[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^Long src ^Integer src-pos dst ^Integer dst-pos ^Integer n-bools]
    (Conversion/longToBinary src src-pos dst dst-pos n-bools)))

(defn *hex-to-short
  "Converts an array of Char into a short using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the hex string to convert - `java.lang.String`
  src-pos - the position in src, in Char unit, from where to start the conversion - `int`
  dst-init - initial value of the destination short - `short`
  dst-pos - the position of the lsb, in bits, in the result short - `int`
  n-hex - the number of Chars to convert - `int`

  returns: a short containing the selected bits - `short`

  throws: java.lang.IllegalArgumentException - if (nHexs-1)*4+dstPos >= 16"
  (^Short [^java.lang.String src ^Integer src-pos ^Short dst-init ^Integer dst-pos ^Integer n-hex]
    (Conversion/hexToShort src src-pos dst-init dst-pos n-hex)))

(defn *int-to-binary
  "Converts an int into an array of boolean using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the int to convert - `int`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `boolean[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-bools - the number of booleans to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `boolean[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^Integer src ^Integer src-pos dst ^Integer dst-pos ^Integer n-bools]
    (Conversion/intToBinary src src-pos dst dst-pos n-bools)))

(defn *int-array-to-long
  "Converts an array of int into a long using the default (little endian, Lsb0) byte and bit
   ordering.

  src - the int array to convert - `int[]`
  src-pos - the position in src, in int unit, from where to start the conversion - `int`
  dst-init - initial value of the destination long - `long`
  dst-pos - the position of the lsb, in bits, in the result long - `int`
  n-ints - the number of ints to convert - `int`

  returns: a long containing the selected bits - `long`

  throws: java.lang.IllegalArgumentException - if (nInts-1)*32+dstPos >= 64"
  (^Long [src ^Integer src-pos ^Long dst-init ^Integer dst-pos ^Integer n-ints]
    (Conversion/intArrayToLong src src-pos dst-init dst-pos n-ints)))

(defn *long-to-short-array
  "Converts a long into an array of short using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the long to convert - `long`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `short[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-shorts - the number of shorts to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `short[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^Long src ^Integer src-pos dst ^Integer dst-pos ^Integer n-shorts]
    (Conversion/longToShortArray src src-pos dst dst-pos n-shorts)))

(defn *short-to-binary
  "Converts a short into an array of boolean using the default (little endian, Lsb0) byte
   and bit ordering.

  src - the short to convert - `short`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `boolean[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-bools - the number of booleans to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `boolean[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^Short src ^Integer src-pos dst ^Integer dst-pos ^Integer n-bools]
    (Conversion/shortToBinary src src-pos dst dst-pos n-bools)))

(defn *hex-digit-msb-0-to-int
  "Converts a hexadecimal digit into an int using the Msb0 bit ordering.


   '1' is converted to 8

  hex-digit - the hexadecimal digit to convert - `char`

  returns: an int equals to hexDigit - `int`

  throws: java.lang.IllegalArgumentException - if hexDigit is not a hexadecimal digit"
  (^Integer [^Character hex-digit]
    (Conversion/hexDigitMsb0ToInt hex-digit)))

(defn *binary-to-short
  "Converts binary (represented as boolean array) into a short using the default (little
   endian, Lsb0) byte and bit ordering.

  src - the binary to convert - `boolean[]`
  src-pos - the position in src, in boolean unit, from where to start the conversion - `int`
  dst-init - initial value of the destination short - `short`
  dst-pos - the position of the lsb, in bits, in the result short - `int`
  n-bools - the number of booleans to convert - `int`

  returns: a short containing the selected bits - `short`

  throws: java.lang.NullPointerException - if src is null"
  (^Short [src ^Integer src-pos ^Short dst-init ^Integer dst-pos ^Integer n-bools]
    (Conversion/binaryToShort src src-pos dst-init dst-pos n-bools)))

(defn *uuid-to-byte-array
  "Converts UUID into an array of byte using the default (little endian, Lsb0) byte and bit
   ordering.

  src - the UUID to convert - `java.util.UUID`
  dst - the destination array - `byte[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-bytes - the number of bytes to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `byte[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^java.util.UUID src dst ^Integer dst-pos ^Integer n-bytes]
    (Conversion/uuidToByteArray src dst dst-pos n-bytes)))

(defn *long-to-int-array
  "Converts a long into an array of int using the default (little endian, Lsb0) byte and bit
   ordering.

  src - the long to convert - `long`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `int[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-ints - the number of ints to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `int[]`

  throws: java.lang.NullPointerException - if dst is null and nInts > 0"
  ([^Long src ^Integer src-pos dst ^Integer dst-pos ^Integer n-ints]
    (Conversion/longToIntArray src src-pos dst dst-pos n-ints)))

(defn *short-to-byte-array
  "Converts a short into an array of byte using the default (little endian, Lsb0) byte and
   bit ordering.

  src - the short to convert - `short`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst - the destination array - `byte[]`
  dst-pos - the position in dst where to copy the result - `int`
  n-bytes - the number of bytes to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `byte[]`

  throws: java.lang.NullPointerException - if dst is null"
  ([^Short src ^Integer src-pos dst ^Integer dst-pos ^Integer n-bytes]
    (Conversion/shortToByteArray src src-pos dst dst-pos n-bytes)))

(defn *binary-be-msb-0-to-hex-digit
  "Converts a binary (represented as boolean array) in big endian Msb0 bit ordering to a
   hexadecimal digit.


   (1, 0, 0, 0) with srcPos = 0 is converted as follow: '8' (1, 0, 0, 0, 0, 0, 0, 0,
   0, 0, 0, 1, 0, 1, 0, 0) with srcPos = 2 is converted to '5'

  src - the binary to convert - `boolean[]`
  src-pos - the position of the lsb to start the conversion - `int`

  returns: a hexadecimal digit representing the selected bits - `char`

  throws: java.lang.IllegalArgumentException - if src is empty"
  (^Character [src ^Integer src-pos]
    (Conversion/binaryBeMsb0ToHexDigit src src-pos))
  (^Character [src]
    (Conversion/binaryBeMsb0ToHexDigit src)))

(defn *int-to-hex
  "Converts an int into an array of Char using the default (little endian, Lsb0) byte and bit
   ordering.

  src - the int to convert - `int`
  src-pos - the position in src, in bits, from where to start the conversion - `int`
  dst-init - the initial value for the result String - `java.lang.String`
  dst-pos - the position in dst where to copy the result - `int`
  n-hexs - the number of Chars to copy to dst, must be smaller or equal to the width of the input (from srcPos to msb) - `int`

  returns: dst - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if (nHexs-1)*4+srcPos >= 32"
  (^java.lang.String [^Integer src ^Integer src-pos ^java.lang.String dst-init ^Integer dst-pos ^Integer n-hexs]
    (Conversion/intToHex src src-pos dst-init dst-pos n-hexs)))

