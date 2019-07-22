(ns org.apache.commons.lang3.ThreadUtils$ThreadIdPredicate
  "A predicate implementation which matches a thread id."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ThreadUtils$ThreadIdPredicate]))

(defn ->thread-id-predicate
  "Constructor.

  Predicate constructor

  thread-id - the threadId to match - `long`

  throws: java.lang.IllegalArgumentException - if the threadId is zero or negative"
  (^ThreadUtils$ThreadIdPredicate [^Long thread-id]
    (new ThreadUtils$ThreadIdPredicate thread-id)))

(defn test
  "Description copied from interface: ThreadUtils.ThreadPredicate

  thread - the thread - `java.lang.Thread`

  returns: true if the thread matches the predicate, otherwise false - `boolean`"
  (^Boolean [^ThreadUtils$ThreadIdPredicate this ^java.lang.Thread thread]
    (-> this (.test thread))))

