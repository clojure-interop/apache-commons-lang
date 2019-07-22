(ns org.apache.commons.lang3.Functions$FailableConsumer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Functions$FailableConsumer]))

(defn accept
  "Accepts the consumer.

  p-object - the parameter for the consumable to accept - `O`

  throws: T - if the consumer fails"
  ([^Functions$FailableConsumer this p-object]
    (-> this (.accept p-object))))

