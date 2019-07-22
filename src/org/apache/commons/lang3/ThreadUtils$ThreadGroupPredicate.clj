(ns org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate
  "A predicate for selecting threadgroups."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ThreadUtils$ThreadGroupPredicate]))

(defn test
  "Evaluates this predicate on the given threadgroup.

  thread-group - the threadgroup - `java.lang.ThreadGroup`

  returns: true if the threadGroup matches the predicate, otherwise false - `boolean`"
  (^Boolean [^ThreadUtils$ThreadGroupPredicate this ^java.lang.ThreadGroup thread-group]
    (-> this (.test thread-group))))

