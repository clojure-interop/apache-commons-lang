(ns org.apache.commons.lang3.reflect.Typed
  "Generalization of \"has a type.\""
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.reflect Typed]))

(defn get-type
  "Get the Type represented by this entity.

  returns: Type - `java.lang.reflect.Type`"
  (^java.lang.reflect.Type [^Typed this]
    (-> this (.getType))))

