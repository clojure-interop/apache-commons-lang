(ns org.apache.commons.lang3.text.FormattableUtils
  "Deprecated.
 as of 3.6, use commons-text

  FormattableUtils instead"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.text FormattableUtils]))

(defn ->formattable-utils
  "Constructor.

  Deprecated."
  (^FormattableUtils []
    (new FormattableUtils )))

(defn *to-string
  "Deprecated.

  formattable - the instance to convert to a string, not null - `java.util.Formattable`

  returns: the resulting string, not null - `java.lang.String`"
  (^java.lang.String [^java.util.Formattable formattable]
    (FormattableUtils/toString formattable)))

(defn *append
  "Deprecated.

  seq - the string to handle, not null - `java.lang.CharSequence`
  formatter - the destination formatter, not null - `java.util.Formatter`
  flags - the flags for formatting, see Formattable - `int`
  width - the width of the output, see Formattable - `int`
  precision - the precision of the output, see Formattable - `int`
  pad-char - the pad character to use - `char`
  ellipsis - the ellipsis to use when precision dictates truncation, null or empty causes a hard truncation - `java.lang.CharSequence`

  returns: the formatter instance, not null - `java.util.Formatter`"
  (^java.util.Formatter [^java.lang.CharSequence seq ^java.util.Formatter formatter ^Integer flags ^Integer width ^Integer precision ^Character pad-char ^java.lang.CharSequence ellipsis]
    (FormattableUtils/append seq formatter flags width precision pad-char ellipsis))
  (^java.util.Formatter [^java.lang.CharSequence seq ^java.util.Formatter formatter ^Integer flags ^Integer width ^Integer precision ^Character pad-char]
    (FormattableUtils/append seq formatter flags width precision pad-char))
  (^java.util.Formatter [^java.lang.CharSequence seq ^java.util.Formatter formatter ^Integer flags ^Integer width ^Integer precision]
    (FormattableUtils/append seq formatter flags width precision)))

