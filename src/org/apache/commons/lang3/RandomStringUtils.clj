(ns org.apache.commons.lang3.RandomStringUtils
  "Operations for random Strings.
  Currently private high surrogate characters are ignored.
  These are Unicode characters that fall between the values 56192 (db80)
  and 56319 (dbff) as we don't know how to handle them.
  High and low surrogates are correctly dealt with - that is if a
  high surrogate is randomly chosen, 55296 (d800) to 56191 (db7f)
  then it is followed by a low surrogate. If a low surrogate is chosen,
  56320 (dc00) to 57343 (dfff) then it is placed after a randomly
  chosen high surrogate.
  RandomStringUtils is intended for simple use cases. For more advanced
  use cases consider using commons-text

  RandomStringGenerator instead.

  Caveat: Instances of Random, upon which the implementation of this
  class relies, are not cryptographically secure.

  Please note that the Apache Commons project provides a component
  dedicated to pseudo-random number generation, namely
  Commons RNG, that may be
  a better choice for applications with more stringent requirements
  (performance and/or correctness).

  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 RandomStringUtils]))

(defn ->random-string-utils
  "Constructor.

  RandomStringUtils instances should NOT be constructed in
   standard programming. Instead, the class should be used as
   RandomStringUtils.random(5);.

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^RandomStringUtils []
    (new RandomStringUtils )))

(defn *random
  "Creates a random string based on a variety of options, using
   supplied source of randomness.

   If start and end are both 0, start and end are set
   to ' ' and 'z', the ASCII printable
   characters, will be used, unless letters and numbers are both
   false, in which case, start and end are set to
   0 and Character.MAX_CODE_POINT.

   If set is not null, characters between start and
   end are chosen.

   This method accepts a user-supplied Random
   instance to use as a source of randomness. By seeding a single
   Random instance with a fixed seed and using it for each call,
   the same random sequence of strings can be generated repeatedly
   and predictably.

  count - the length of random string to create - `int`
  start - the position in set of chars to start at (inclusive) - `int`
  end - the position in set of chars to end before (exclusive) - `int`
  letters - only allow letters? - `boolean`
  numbers - only allow numbers? - `boolean`
  chars - the set of chars to choose randoms from, must not be empty. If null, then it will use the set of all chars. - `char[]`
  random - a source of randomness. - `java.util.Random`

  returns: the random string - `java.lang.String`

  throws: java.lang.ArrayIndexOutOfBoundsException - if there are not (end - start) 1 characters in the set array."
  (^java.lang.String [^Integer count ^Integer start ^Integer end ^Boolean letters ^Boolean numbers chars ^java.util.Random random]
    (RandomStringUtils/random count start end letters numbers chars random))
  (^java.lang.String [^Integer count ^Integer start ^Integer end ^Boolean letters ^Boolean numbers ^Character chars]
    (RandomStringUtils/random count start end letters numbers chars))
  (^java.lang.String [^Integer count ^Integer start ^Integer end ^Boolean letters ^Boolean numbers]
    (RandomStringUtils/random count start end letters numbers))
  (^java.lang.String [^Integer count ^Boolean letters ^Boolean numbers]
    (RandomStringUtils/random count letters numbers))
  (^java.lang.String [^Integer count ^java.lang.String chars]
    (RandomStringUtils/random count chars))
  (^java.lang.String [^Integer count]
    (RandomStringUtils/random count)))

(defn *random-ascii
  "Creates a random string whose length is between the inclusive minimum and
   the exclusive maximum.

   Characters will be chosen from the set of characters whose
   ASCII value is between 32 and 126 (inclusive).

  min-length-inclusive - the inclusive minimum length of the string to generate - `int`
  max-length-exclusive - the exclusive maximum length of the string to generate - `int`

  returns: the random string - `java.lang.String`"
  (^java.lang.String [^Integer min-length-inclusive ^Integer max-length-exclusive]
    (RandomStringUtils/randomAscii min-length-inclusive max-length-exclusive))
  (^java.lang.String [^Integer count]
    (RandomStringUtils/randomAscii count)))

(defn *random-alphabetic
  "Creates a random string whose length is between the inclusive minimum and
   the exclusive maximum.

   Characters will be chosen from the set of Latin alphabetic characters (a-z, A-Z).

  min-length-inclusive - the inclusive minimum length of the string to generate - `int`
  max-length-exclusive - the exclusive maximum length of the string to generate - `int`

  returns: the random string - `java.lang.String`"
  (^java.lang.String [^Integer min-length-inclusive ^Integer max-length-exclusive]
    (RandomStringUtils/randomAlphabetic min-length-inclusive max-length-exclusive))
  (^java.lang.String [^Integer count]
    (RandomStringUtils/randomAlphabetic count)))

(defn *random-alphanumeric
  "Creates a random string whose length is between the inclusive minimum and
   the exclusive maximum.

   Characters will be chosen from the set of Latin alphabetic
   characters (a-z, A-Z) and the digits 0-9.

  min-length-inclusive - the inclusive minimum length of the string to generate - `int`
  max-length-exclusive - the exclusive maximum length of the string to generate - `int`

  returns: the random string - `java.lang.String`"
  (^java.lang.String [^Integer min-length-inclusive ^Integer max-length-exclusive]
    (RandomStringUtils/randomAlphanumeric min-length-inclusive max-length-exclusive))
  (^java.lang.String [^Integer count]
    (RandomStringUtils/randomAlphanumeric count)))

(defn *random-graph
  "Creates a random string whose length is between the inclusive minimum and
   the exclusive maximum.

   Characters will be chosen from the set of \\p{Graph} characters.

  min-length-inclusive - the inclusive minimum length of the string to generate - `int`
  max-length-exclusive - the exclusive maximum length of the string to generate - `int`

  returns: the random string - `java.lang.String`"
  (^java.lang.String [^Integer min-length-inclusive ^Integer max-length-exclusive]
    (RandomStringUtils/randomGraph min-length-inclusive max-length-exclusive))
  (^java.lang.String [^Integer count]
    (RandomStringUtils/randomGraph count)))

(defn *random-numeric
  "Creates a random string whose length is between the inclusive minimum and
   the exclusive maximum.

   Characters will be chosen from the set of \\p{Digit} characters.

  min-length-inclusive - the inclusive minimum length of the string to generate - `int`
  max-length-exclusive - the exclusive maximum length of the string to generate - `int`

  returns: the random string - `java.lang.String`"
  (^java.lang.String [^Integer min-length-inclusive ^Integer max-length-exclusive]
    (RandomStringUtils/randomNumeric min-length-inclusive max-length-exclusive))
  (^java.lang.String [^Integer count]
    (RandomStringUtils/randomNumeric count)))

(defn *random-print
  "Creates a random string whose length is between the inclusive minimum and
   the exclusive maximum.

   Characters will be chosen from the set of \\p{Print} characters.

  min-length-inclusive - the inclusive minimum length of the string to generate - `int`
  max-length-exclusive - the exclusive maximum length of the string to generate - `int`

  returns: the random string - `java.lang.String`"
  (^java.lang.String [^Integer min-length-inclusive ^Integer max-length-exclusive]
    (RandomStringUtils/randomPrint min-length-inclusive max-length-exclusive))
  (^java.lang.String [^Integer count]
    (RandomStringUtils/randomPrint count)))

