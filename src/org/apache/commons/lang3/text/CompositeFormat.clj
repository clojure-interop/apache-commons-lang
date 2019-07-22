(ns org.apache.commons.lang3.text.CompositeFormat
  "Deprecated.
 as of 3.6, use commons-text

  CompositeFormat instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text CompositeFormat]))

(defn ->composite-format
  "Constructor.

  Deprecated.

  parser - implementation - `java.text.Format`
  formatter - implementation - `java.text.Format`"
  (^CompositeFormat [^java.text.Format parser ^java.text.Format formatter]
    (new CompositeFormat parser formatter)))

(defn format
  "Deprecated.

  obj - the object to format - `java.lang.Object`
  to-append-to - the StringBuffer to append to - `java.lang.StringBuffer`
  pos - the FieldPosition to use (or ignore). - `java.text.FieldPosition`

  returns: toAppendTo - `java.lang.StringBuffer`"
  (^java.lang.StringBuffer [^CompositeFormat this ^java.lang.Object obj ^java.lang.StringBuffer to-append-to ^java.text.FieldPosition pos]
    (-> this (.format obj to-append-to pos))))

(defn parse-object
  "Deprecated.

  source - the String source - `java.lang.String`
  pos - the ParsePosition containing the position to parse from, will be updated according to parsing success (index) or failure (error index) - `java.text.ParsePosition`

  returns: the parsed Object - `java.lang.Object`"
  (^java.lang.Object [^CompositeFormat this ^java.lang.String source ^java.text.ParsePosition pos]
    (-> this (.parseObject source pos))))

(defn get-parser
  "Deprecated.

  returns: parser Format implementation - `java.text.Format`"
  (^java.text.Format [^CompositeFormat this]
    (-> this (.getParser))))

(defn get-formatter
  "Deprecated.

  returns: formatter Format implementation - `java.text.Format`"
  (^java.text.Format [^CompositeFormat this]
    (-> this (.getFormatter))))

(defn reformat
  "Deprecated.

  input - String to reformat - `java.lang.String`

  returns: A reformatted String - `java.lang.String`

  throws: java.text.ParseException - thrown by parseObject(String) call"
  (^java.lang.String [^CompositeFormat this ^java.lang.String input]
    (-> this (.reformat input))))

