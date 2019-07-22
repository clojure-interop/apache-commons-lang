(ns org.apache.commons.lang3.Functions$FailableBiFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Functions$FailableBiFunction]))

(defn apply
  "Apply the function.

  p-input-1 - the first input for the function - `I1`
  p-input-2 - the second input for the function - `I2`

  returns: the result of the function - `O`

  throws: T - if the function fails"
  ([^Functions$FailableBiFunction this p-input-1 p-input-2]
    (-> this (.apply p-input-1 p-input-2))))

