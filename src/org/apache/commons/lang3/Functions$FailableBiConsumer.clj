(ns org.apache.commons.lang3.Functions$FailableBiConsumer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Functions$FailableBiConsumer]))

(defn accept
  "Accepts the consumer.

  p-object-1 - the first parameter for the consumable to accept - `O1`
  p-object-2 - the second parameter for the consumable to accept - `O2`

  throws: T - if the consumer fails"
  ([^Functions$FailableBiConsumer this p-object-1 p-object-2]
    (-> this (.accept p-object-1 p-object-2))))

