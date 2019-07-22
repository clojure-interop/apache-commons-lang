(ns org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent AbstractCircuitBreaker$State]))

(def CLOSED
  "Enum Constant.

  type: org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State"
  AbstractCircuitBreaker$State/CLOSED)

(def OPEN
  "Enum Constant.

  type: org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State"
  AbstractCircuitBreaker$State/OPEN)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (AbstractCircuitBreaker.State c : AbstractCircuitBreaker.State.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State[]`"
  ([]
    (AbstractCircuitBreaker$State/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State [^java.lang.String name]
    (AbstractCircuitBreaker$State/valueOf name)))

(defn opposite-state
  "Returns the opposite state to the represented state. This is useful
   for flipping the current state.

  returns: the opposite state - `org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State`"
  (^org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State [^AbstractCircuitBreaker$State this]
    (-> this (.oppositeState))))

