(ns org.apache.commons.lang3.Functions$FailableRunnable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Functions$FailableRunnable]))

(defn run
  "Runs the function.

  throws: T - if the function fails"
  ([^Functions$FailableRunnable this]
    (-> this (.run))))

