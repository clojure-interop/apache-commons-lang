(ns org.apache.commons.lang3.LocaleUtils
  "Operations to assist when working with a Locale.

  This class tries to handle null input gracefully.
  An exception will not be thrown for a null input.
  Each method documents its behaviour in more detail."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 LocaleUtils]))

(defn ->locale-utils
  "Constructor.

  LocaleUtils instances should NOT be constructed in standard programming.
   Instead, the class should be used as LocaleUtils.toLocale(\"en_GB\");.

   This constructor is public to permit tools that require a JavaBean instance
   to operate."
  (^LocaleUtils []
    (new LocaleUtils )))

(defn *to-locale
  "Converts a String to a Locale.

   This method takes the string format of a locale and creates the
   locale object from it.



     LocaleUtils.toLocale(\"\")           = new Locale(\"\", \"\")
     LocaleUtils.toLocale(\"en\")         = new Locale(\"en\", \"\")
     LocaleUtils.toLocale(\"en_GB\")      = new Locale(\"en\", \"GB\")
     LocaleUtils.toLocale(\"en_001\")     = new Locale(\"en\", \"001\")
     LocaleUtils.toLocale(\"en_GB_xxx\")  = new Locale(\"en\", \"GB\", \"xxx\")   (#)

   (#) The behaviour of the JDK variant constructor changed between JDK1.3 and JDK1.4.
   In JDK1.3, the constructor upper cases the variant, in JDK1.4, it doesn't.
   Thus, the result from getVariant() may vary depending on your JDK.

   This method validates the input strictly.
   The language code must be lowercase.
   The country code must be uppercase.
   The separator must be an underscore.
   The length must be correct.

  str - the locale String to convert, null returns null - `java.lang.String`

  returns: a Locale, null if null input - `java.util.Locale`

  throws: java.lang.IllegalArgumentException - if the string is an invalid format"
  (^java.util.Locale [^java.lang.String str]
    (LocaleUtils/toLocale str)))

(defn *locale-lookup-list
  "Obtains the list of locales to search through when performing
   a locale search.



   localeLookupList(Locale(\"fr\", \"CA\", \"xxx\"), Locale(\"en\"))
     = [Locale(\"fr\", \"CA\", \"xxx\"), Locale(\"fr\", \"CA\"), Locale(\"fr\"), Locale(\"en\"]

   The result list begins with the most specific locale, then the
   next more general and so on, finishing with the default locale.
   The list will never contain the same locale twice.

  locale - the locale to start from, null returns empty list - `java.util.Locale`
  default-locale - the default locale to use if no other is found - `java.util.Locale`

  returns: the unmodifiable list of Locale objects, 0 being locale, not null - `java.util.List<java.util.Locale>`"
  (^java.util.List [^java.util.Locale locale ^java.util.Locale default-locale]
    (LocaleUtils/localeLookupList locale default-locale))
  (^java.util.List [^java.util.Locale locale]
    (LocaleUtils/localeLookupList locale)))

(defn *available-locale-list
  "Obtains an unmodifiable list of installed locales.

   This method is a wrapper around Locale.getAvailableLocales().
   It is more efficient, as the JDK method must create a new array each
   time it is called.

  returns: the unmodifiable list of available locales - `java.util.List<java.util.Locale>`"
  (^java.util.List []
    (LocaleUtils/availableLocaleList )))

(defn *available-locale-set
  "Obtains an unmodifiable set of installed locales.

   This method is a wrapper around Locale.getAvailableLocales().
   It is more efficient, as the JDK method must create a new array each
   time it is called.

  returns: the unmodifiable set of available locales - `java.util.Set<java.util.Locale>`"
  (^java.util.Set []
    (LocaleUtils/availableLocaleSet )))

(defn *available-locale?
  "Checks if the locale specified is in the list of available locales.

  locale - the Locale object to check if it is available - `java.util.Locale`

  returns: true if the locale is a known locale - `boolean`"
  (^Boolean [^java.util.Locale locale]
    (LocaleUtils/isAvailableLocale locale)))

(defn *languages-by-country
  "Obtains the list of languages supported for a given country.

   This method takes a country code and searches to find the
   languages available for that country. Variant locales are removed.

  country-code - the 2 letter country code, null returns empty - `java.lang.String`

  returns: an unmodifiable List of Locale objects, not null - `java.util.List<java.util.Locale>`"
  (^java.util.List [^java.lang.String country-code]
    (LocaleUtils/languagesByCountry country-code)))

(defn *countries-by-language
  "Obtains the list of countries supported for a given language.

   This method takes a language code and searches to find the
   countries available for that language. Variant locales are removed.

  language-code - the 2 letter language code, null returns empty - `java.lang.String`

  returns: an unmodifiable List of Locale objects, not null - `java.util.List<java.util.Locale>`"
  (^java.util.List [^java.lang.String language-code]
    (LocaleUtils/countriesByLanguage language-code)))

