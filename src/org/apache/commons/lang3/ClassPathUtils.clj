(ns org.apache.commons.lang3.ClassPathUtils
  "Operations regarding the classpath.

  The methods of this class do not allow null inputs."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ClassPathUtils]))

(defn ->class-path-utils
  "Constructor.

  ClassPathUtils instances should NOT be constructed in
   standard programming. Instead, the class should be used as
   ClassPathUtils.toFullyQualifiedName(MyClass.class, \"MyClass.properties\");.

   This constructor is public to permit tools that require a JavaBean
   instance to operate."
  (^ClassPathUtils []
    (new ClassPathUtils )))

(defn *to-fully-qualified-name
  "Returns the fully qualified name for the resource with name resourceName relative to the given context.

   Note that this method does not check whether the resource actually exists.
   It only constructs the name.
   Null inputs are not allowed.



   ClassPathUtils.toFullyQualifiedName(StringUtils.class, \"StringUtils.properties\") = \"org.apache.commons.lang3.StringUtils.properties\"

  context - The context for constructing the name. - `java.lang.Class`
  resource-name - the resource name to construct the fully qualified name for. - `java.lang.String`

  returns: the fully qualified name of the resource with name resourceName. - `java.lang.String`

  throws: java.lang.NullPointerException - if either context or resourceName is null."
  (^java.lang.String [^java.lang.Class context ^java.lang.String resource-name]
    (ClassPathUtils/toFullyQualifiedName context resource-name)))

(defn *to-fully-qualified-path
  "Returns the fully qualified path for the resource with name resourceName relative to the given context.

   Note that this method does not check whether the resource actually exists.
   It only constructs the path.
   Null inputs are not allowed.



   ClassPathUtils.toFullyQualifiedPath(StringUtils.class, \"StringUtils.properties\") = \"org/apache/commons/lang3/StringUtils.properties\"

  context - The context for constructing the path. - `java.lang.Class`
  resource-name - the resource name to construct the fully qualified path for. - `java.lang.String`

  returns: the fully qualified path of the resource with name resourceName. - `java.lang.String`

  throws: java.lang.NullPointerException - if either context or resourceName is null."
  (^java.lang.String [^java.lang.Class context ^java.lang.String resource-name]
    (ClassPathUtils/toFullyQualifiedPath context resource-name)))

