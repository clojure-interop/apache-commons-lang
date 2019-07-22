(ns org.apache.commons.lang3.Functions$FailableFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Functions$FailableFunction]))

(defn apply
  "Apply the function.

  p-input - the input for the function - `I`

  returns: the result of the function - `O`

  throws: T - if the function fails"
  ([^Functions$FailableFunction this p-input]
    (-> this (.apply p-input))))

