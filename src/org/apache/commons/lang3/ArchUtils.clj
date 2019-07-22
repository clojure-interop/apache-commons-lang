(ns org.apache.commons.lang3.ArchUtils
  "An utility class for the os.arch System Property. The class defines methods for
  identifying the architecture of the current JVM.

  Important: The os.arch System Property returns the architecture used by the JVM
  not of the operating system."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ArchUtils]))

(defn ->arch-utils
  "Constructor."
  (^ArchUtils []
    (new ArchUtils )))

(defn *get-processor
  "Returns a Processor object the given value String. The String must be
   like a value returned by the os.arch System Property.

  value - A String like a value returned by the os.arch System Property. - `java.lang.String`

  returns: A Processor when it exists, else null. - `org.apache.commons.lang3.arch.Processor`"
  (^org.apache.commons.lang3.arch.Processor [^java.lang.String value]
    (ArchUtils/getProcessor value))
  (^org.apache.commons.lang3.arch.Processor []
    (ArchUtils/getProcessor )))

