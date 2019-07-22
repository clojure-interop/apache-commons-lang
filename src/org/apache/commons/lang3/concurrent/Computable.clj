(ns org.apache.commons.lang3.concurrent.Computable
  "Definition of an interface for a wrapper around a calculation that takes a single parameter and returns a result.

  This interface allows for wrapping a calculation into a class so that it maybe passed around an application."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent Computable]))

(defn compute
  "This method carries out the given operation with the provided argument.

  arg - the argument for the calculation - `I`

  returns: the result of the calculation - `O`

  throws: java.lang.InterruptedException - thrown if the calculation is interrupted"
  ([^Computable this arg]
    (-> this (.compute arg))))

