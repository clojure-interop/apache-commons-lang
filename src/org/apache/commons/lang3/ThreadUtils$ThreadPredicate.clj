(ns org.apache.commons.lang3.ThreadUtils$ThreadPredicate
  "A predicate for selecting threads."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ThreadUtils$ThreadPredicate]))

(defn test
  "Evaluates this predicate on the given thread.

  thread - the thread - `java.lang.Thread`

  returns: true if the thread matches the predicate, otherwise false - `boolean`"
  (^Boolean [^ThreadUtils$ThreadPredicate this ^java.lang.Thread thread]
    (-> this (.test thread))))

