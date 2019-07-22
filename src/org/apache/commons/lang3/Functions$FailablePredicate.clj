(ns org.apache.commons.lang3.Functions$FailablePredicate
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Functions$FailablePredicate]))

(defn test
  "Test the predicate.

  p-object - the object to test the predicate on - `O`

  returns: the predicate's evaluation - `boolean`

  throws: T - if the predicate fails"
  (^Boolean [^Functions$FailablePredicate this p-object]
    (-> this (.test p-object))))

