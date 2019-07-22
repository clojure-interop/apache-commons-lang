(ns org.apache.commons.lang3.ThreadUtils$NamePredicate
  "A predicate implementation which matches a thread or threadgroup name."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ThreadUtils$NamePredicate]))

(defn ->name-predicate
  "Constructor.

  Predicate constructor

  name - thread or threadgroup name - `java.lang.String`

  throws: java.lang.IllegalArgumentException - if the name is null"
  (^ThreadUtils$NamePredicate [^java.lang.String name]
    (new ThreadUtils$NamePredicate name)))

(defn test
  "Description copied from interface: ThreadUtils.ThreadGroupPredicate

  thread-group - the threadgroup - `java.lang.ThreadGroup`

  returns: true if the threadGroup matches the predicate, otherwise false - `boolean`"
  (^Boolean [^ThreadUtils$NamePredicate this ^java.lang.ThreadGroup thread-group]
    (-> this (.test thread-group))))

