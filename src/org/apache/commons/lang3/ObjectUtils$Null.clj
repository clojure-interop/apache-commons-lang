(ns org.apache.commons.lang3.ObjectUtils$Null
  "Class used as a null placeholder where null
  has another meaning.

  For example, in a HashMap the
  HashMap.get(java.lang.Object) method returns
  null if the Map contains null or if there is
  no matching key. The Null placeholder can be used to distinguish
  between these two cases.

  Another example is Hashtable, where null
  cannot be stored."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ObjectUtils$Null]))

