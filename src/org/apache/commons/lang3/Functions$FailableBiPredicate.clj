(ns org.apache.commons.lang3.Functions$FailableBiPredicate
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Functions$FailableBiPredicate]))

(defn test
  "Test the predicate.

  p-object-1 - the first object to test the predicate on - `O1`
  p-object-2 - the second object to test the predicate on - `O2`

  returns: the predicate's evaluation - `boolean`

  throws: T - if the predicate fails"
  (^Boolean [^Functions$FailableBiPredicate this p-object-1 p-object-2]
    (-> this (.test p-object-1 p-object-2))))

