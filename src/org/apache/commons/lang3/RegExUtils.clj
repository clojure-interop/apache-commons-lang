(ns org.apache.commons.lang3.RegExUtils
  "Helpers to process Strings using regular expressions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 RegExUtils]))

(defn ->reg-ex-utils
  "Constructor."
  (^RegExUtils []
    (new RegExUtils )))

(defn *remove-all
  "Removes each substring of the text String that matches the given regular expression pattern.

   This method is a null safe equivalent to:

    pattern.matcher(text).replaceAll(StringUtils.EMPTY)


   A null reference passed to this method is a no-op.



   StringUtils.removeAll(null, *)      = null
   StringUtils.removeAll(\"any\", (Pattern) null)  = \"any\"
   StringUtils.removeAll(\"any\", Pattern.compile(\"\"))    = \"any\"
   StringUtils.removeAll(\"any\", Pattern.compile(\".*\"))  = \"\"
   StringUtils.removeAll(\"any\", Pattern.compile(\".+\"))  = \"\"
   StringUtils.removeAll(\"abc\", Pattern.compile(\".?\"))  = \"\"
   StringUtils.removeAll(\"A<__>\\n<__>B\", Pattern.compile(\"<.*>\"))      = \"A\\nB\"
   StringUtils.removeAll(\"A<__>\\n<__>B\", Pattern.compile(\"(?s)<.*>\"))  = \"AB\"
   StringUtils.removeAll(\"A<__>\\n<__>B\", Pattern.compile(\"<.*>\", Pattern.DOTALL))  = \"AB\"
   StringUtils.removeAll(\"ABCabc123abc\", Pattern.compile(\"[a-z]\"))     = \"ABC123\"

  text - text to remove from, may be null - `java.lang.String`
  regex - the regular expression to which this string is to be matched - `java.util.regex.Pattern`

  returns: the text with any removes processed,
                null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.util.regex.Pattern regex]
    (RegExUtils/removeAll text regex)))

(defn *remove-first
  "Removes the first substring of the text string that matches the given regular expression pattern.

   This method is a null safe equivalent to:

    pattern.matcher(text).replaceFirst(StringUtils.EMPTY)


   A null reference passed to this method is a no-op.



   StringUtils.removeFirst(null, *)      = null
   StringUtils.removeFirst(\"any\", (Pattern) null)  = \"any\"
   StringUtils.removeFirst(\"any\", Pattern.compile(\"\"))    = \"any\"
   StringUtils.removeFirst(\"any\", Pattern.compile(\".*\"))  = \"\"
   StringUtils.removeFirst(\"any\", Pattern.compile(\".+\"))  = \"\"
   StringUtils.removeFirst(\"abc\", Pattern.compile(\".?\"))  = \"bc\"
   StringUtils.removeFirst(\"A<__>\\n<__>B\", Pattern.compile(\"<.*>\"))      = \"A\\n<__>B\"
   StringUtils.removeFirst(\"A<__>\\n<__>B\", Pattern.compile(\"(?s)<.*>\"))  = \"AB\"
   StringUtils.removeFirst(\"ABCabc123\", Pattern.compile(\"[a-z]\"))          = \"ABCbc123\"
   StringUtils.removeFirst(\"ABCabc123abc\", Pattern.compile(\"[a-z]+\"))      = \"ABC123abc\"

  text - text to remove from, may be null - `java.lang.String`
  regex - the regular expression pattern to which this string is to be matched - `java.util.regex.Pattern`

  returns: the text with the first replacement processed,
                null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.util.regex.Pattern regex]
    (RegExUtils/removeFirst text regex)))

(defn *remove-pattern
  "Removes each substring of the source String that matches the given regular expression using the DOTALL option.

   This call is a null safe equivalent to:

   text.replaceAll(&quot;(?s)&quot;  regex, StringUtils.EMPTY)
   Pattern.compile(regex, Pattern.DOTALL).matcher(text).replaceAll(StringUtils.EMPTY)


   A null reference passed to this method is a no-op.



   StringUtils.removePattern(null, *)       = null
   StringUtils.removePattern(\"any\", (String) null)   = \"any\"
   StringUtils.removePattern(\"A<__>\\n<__>B\", \"<.*>\")  = \"AB\"
   StringUtils.removePattern(\"ABCabc123\", \"[a-z]\")    = \"ABC123\"

  text - the source string - `java.lang.String`
  regex - the regular expression to which this string is to be matched - `java.lang.String`

  returns: The resulting String - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.lang.String regex]
    (RegExUtils/removePattern text regex)))

(defn *replace-all
  "Replaces each substring of the text String that matches the given regular expression pattern with the given replacement.

   This method is a null safe equivalent to:

    pattern.matcher(text).replaceAll(replacement)


   A null reference passed to this method is a no-op.



   StringUtils.replaceAll(null, *, *)       = null
   StringUtils.replaceAll(\"any\", (Pattern) null, *)   = \"any\"
   StringUtils.replaceAll(\"any\", *, null)   = \"any\"
   StringUtils.replaceAll(\"\", Pattern.compile(\"\"), \"zzz\")    = \"zzz\"
   StringUtils.replaceAll(\"\", Pattern.compile(\".*\"), \"zzz\")  = \"zzz\"
   StringUtils.replaceAll(\"\", Pattern.compile(\".+\"), \"zzz\")  = \"\"
   StringUtils.replaceAll(\"abc\", Pattern.compile(\"\"), \"ZZ\")  = \"ZZaZZbZZcZZ\"
   StringUtils.replaceAll(\"<__>\\n<__>\", Pattern.compile(\"<.*>\"), \"z\")                 = \"z\\nz\"
   StringUtils.replaceAll(\"<__>\\n<__>\", Pattern.compile(\"<.*>\", Pattern.DOTALL), \"z\") = \"z\"
   StringUtils.replaceAll(\"<__>\\n<__>\", Pattern.compile(\"(?s)<.*>\"), \"z\")             = \"z\"
   StringUtils.replaceAll(\"ABCabc123\", Pattern.compile(\"[a-z]\"), \"_\")       = \"ABC___123\"
   StringUtils.replaceAll(\"ABCabc123\", Pattern.compile(\"[^A-Z0-9]+\"), \"_\")  = \"ABC_123\"
   StringUtils.replaceAll(\"ABCabc123\", Pattern.compile(\"[^A-Z0-9]+\"), \"\")   = \"ABC123\"
   StringUtils.replaceAll(\"Lorem ipsum  dolor   sit\", Pattern.compile(\"( )([a-z]+)\"), \"_$2\")  = \"Lorem_ipsum_dolor_sit\"

  text - text to search and replace in, may be null - `java.lang.String`
  regex - the regular expression pattern to which this string is to be matched - `java.util.regex.Pattern`
  replacement - the string to be substituted for each match - `java.lang.String`

  returns: the text with any replacements processed,
                null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.util.regex.Pattern regex ^java.lang.String replacement]
    (RegExUtils/replaceAll text regex replacement)))

(defn *replace-first
  "Replaces the first substring of the text string that matches the given regular expression pattern
   with the given replacement.

   This method is a null safe equivalent to:

    pattern.matcher(text).replaceFirst(replacement)


   A null reference passed to this method is a no-op.



   StringUtils.replaceFirst(null, *, *)       = null
   StringUtils.replaceFirst(\"any\", (Pattern) null, *)   = \"any\"
   StringUtils.replaceFirst(\"any\", *, null)   = \"any\"
   StringUtils.replaceFirst(\"\", Pattern.compile(\"\"), \"zzz\")    = \"zzz\"
   StringUtils.replaceFirst(\"\", Pattern.compile(\".*\"), \"zzz\")  = \"zzz\"
   StringUtils.replaceFirst(\"\", Pattern.compile(\".+\"), \"zzz\")  = \"\"
   StringUtils.replaceFirst(\"abc\", Pattern.compile(\"\"), \"ZZ\")  = \"ZZabc\"
   StringUtils.replaceFirst(\"<__>\\n<__>\", Pattern.compile(\"<.*>\"), \"z\")      = \"z\\n<__>\"
   StringUtils.replaceFirst(\"<__>\\n<__>\", Pattern.compile(\"(?s)<.*>\"), \"z\")  = \"z\"
   StringUtils.replaceFirst(\"ABCabc123\", Pattern.compile(\"[a-z]\"), \"_\")          = \"ABC_bc123\"
   StringUtils.replaceFirst(\"ABCabc123abc\", Pattern.compile(\"[^A-Z0-9]+\"), \"_\")  = \"ABC_123abc\"
   StringUtils.replaceFirst(\"ABCabc123abc\", Pattern.compile(\"[^A-Z0-9]+\"), \"\")   = \"ABC123abc\"
   StringUtils.replaceFirst(\"Lorem ipsum  dolor   sit\", Pattern.compile(\"( )([a-z]+)\"), \"_$2\")  = \"Lorem_ipsum  dolor   sit\"

  text - text to search and replace in, may be null - `java.lang.String`
  regex - the regular expression pattern to which this string is to be matched - `java.util.regex.Pattern`
  replacement - the string to be substituted for the first match - `java.lang.String`

  returns: the text with the first replacement processed,
                null if null String input - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.util.regex.Pattern regex ^java.lang.String replacement]
    (RegExUtils/replaceFirst text regex replacement)))

(defn *replace-pattern
  "Replaces each substring of the source String that matches the given regular expression with the given
   replacement using the Pattern.DOTALL option. DOTALL is also known as single-line mode in Perl.

   This call is a null safe equivalent to:

   text.replaceAll(&quot;(?s)&quot;  regex, replacement)
   Pattern.compile(regex, Pattern.DOTALL).matcher(text).replaceAll(replacement)


   A null reference passed to this method is a no-op.



   StringUtils.replacePattern(null, *, *)       = null
   StringUtils.replacePattern(\"any\", (String) null, *)   = \"any\"
   StringUtils.replacePattern(\"any\", *, null)   = \"any\"
   StringUtils.replacePattern(\"\", \"\", \"zzz\")    = \"zzz\"
   StringUtils.replacePattern(\"\", \".*\", \"zzz\")  = \"zzz\"
   StringUtils.replacePattern(\"\", \".+\", \"zzz\")  = \"\"
   StringUtils.replacePattern(\"<__>\\n<__>\", \"<.*>\", \"z\")       = \"z\"
   StringUtils.replacePattern(\"ABCabc123\", \"[a-z]\", \"_\")       = \"ABC___123\"
   StringUtils.replacePattern(\"ABCabc123\", \"[^A-Z0-9]+\", \"_\")  = \"ABC_123\"
   StringUtils.replacePattern(\"ABCabc123\", \"[^A-Z0-9]+\", \"\")   = \"ABC123\"
   StringUtils.replacePattern(\"Lorem ipsum  dolor   sit\", \"( )([a-z]+)\", \"_$2\")  = \"Lorem_ipsum_dolor_sit\"

  text - the source string - `java.lang.String`
  regex - the regular expression to which this string is to be matched - `java.lang.String`
  replacement - the string to be substituted for each match - `java.lang.String`

  returns: The resulting String - `java.lang.String`"
  (^java.lang.String [^java.lang.String text ^java.lang.String regex ^java.lang.String replacement]
    (RegExUtils/replacePattern text regex replacement)))

