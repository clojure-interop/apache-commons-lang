(ns org.apache.commons.lang3.Functions$FailableCallable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Functions$FailableCallable]))

(defn call
  "Calls the callable.

  returns: The value returned from the callable - `O`

  throws: T - if the callable fails"
  ([^Functions$FailableCallable this]
    (-> this (.call))))

