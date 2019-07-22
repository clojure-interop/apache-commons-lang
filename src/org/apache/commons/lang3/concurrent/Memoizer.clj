(ns org.apache.commons.lang3.concurrent.Memoizer
  " Definition of an interface for a wrapper around a calculation that takes a
  single parameter and returns a result. The results for the calculation will
  be cached for future requests.


  This is not a fully functional cache, there is no way of limiting or removing
  results once they have been generated. However, it is possible to get the
  implementation to regenerate the result for a given parameter, if an error
  was thrown during the previous calculation, by setting the option during the
  construction of the class. If this is not set the class will return the
  cached exception.


  Thanks should go to Brian Goetz, Tim Peierls and the members of JCP JSR-166
  Expert Group for coming up with the original implementation of the class. It
  was also published within Java Concurrency in Practice as a sample."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent Memoizer]))

(defn ->memoizer
  "Constructor.

  Constructs a Memoizer for the provided Computable calculation, with the
   option of whether a Computation that experiences an error should
   recalculate on subsequent calls or return the same cached exception.

  computable - the computation whose results should be memorized - `org.apache.commons.lang3.concurrent.Computable`
  recalculate - determines whether the computation should be recalculated on subsequent calls if the previous call failed - `boolean`"
  (^Memoizer [^org.apache.commons.lang3.concurrent.Computable computable ^Boolean recalculate]
    (new Memoizer computable recalculate))
  (^Memoizer [^org.apache.commons.lang3.concurrent.Computable computable]
    (new Memoizer computable)))

(defn compute
  "This method will return the result of the calculation and cache it, if it
   has not previously been calculated.


   This cache will also cache exceptions that occur during the computation
   if the recalculate parameter is the constructor was set to
   false, or not set. Otherwise, if an exception happened on the
   previous calculation, the method will attempt again to generate a value.

  arg - the argument for the calculation - `I`

  returns: the result of the calculation - `O`

  throws: java.lang.InterruptedException - thrown if the calculation is interrupted"
  ([^Memoizer this arg]
    (-> this (.compute arg))))

