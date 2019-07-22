(ns org.apache.commons.lang3.builder.Diffable
  "Diffable classes can be compared with other objects
  for differences. The DiffResult object retrieved can be queried
  for a list of differences or printed using the DiffResult.toString().

  The calculation of the differences is consistent with equals if
  and only if d1.equals(d2) implies d1.diff(d2) == \"\".
  It is strongly recommended that implementations are consistent with equals
  to avoid confusion. Note that null is not an instance of any class
  and d1.diff(null) should throw a NullPointerException.


  Diffable classes lend themselves well to unit testing, in which a
  easily readable description of the differences between an anticipated result and
  an actual result can be retrieved. For example:



  Assert.assertEquals(expected.diff(result), expected, result);"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder Diffable]))

(defn diff
  "Retrieves a list of the differences between
   this object and the supplied object.

  obj - the object to diff against, can be null - `T`

  returns: a list of differences - `org.apache.commons.lang3.builder.DiffResult`

  throws: java.lang.NullPointerException - if the specified object is null"
  (^org.apache.commons.lang3.builder.DiffResult [^Diffable this obj]
    (-> this (.diff obj))))

