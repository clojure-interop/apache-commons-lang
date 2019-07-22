(ns org.apache.commons.lang3.SystemUtils
  " Helpers for java.lang.System.


  If a system property cannot be read due to security restrictions, the corresponding field in this class will be set
  to null and a message will be written to System.err.


  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 SystemUtils]))

(defn ->system-utils
  "Constructor.

  SystemUtils instances should NOT be constructed in standard programming. Instead, the class should be used as
   SystemUtils.FILE_SEPARATOR.


   This constructor is public to permit tools that require a JavaBean instance to operate."
  (^SystemUtils []
    (new SystemUtils )))

(def *-awt-toolkit
  "Static Constant.

  The awt.toolkit System Property.


   Holds a class name, on Windows XP this is sun.awt.windows.WToolkit.


   On platforms without a GUI, this value is null.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/AWT_TOOLKIT)

(def *-file-encoding
  "Static Constant.

  The file.encoding System Property.


   File encoding, such as Cp1252.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/FILE_ENCODING)

(def *-file-separator
  "Static Constant.

  Deprecated. Use File.separator, since it is guaranteed to be a
               string containing a single character and it does not require a privilege check.

  type: java.lang.String"
  SystemUtils/FILE_SEPARATOR)

(def *-java-awt-fonts
  "Static Constant.

  The java.awt.fonts System Property.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_AWT_FONTS)

(def *-java-awt-graphicsenv
  "Static Constant.

  The java.awt.graphicsenv System Property.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_AWT_GRAPHICSENV)

(def *-java-awt-headless
  "Static Constant.

  The java.awt.headless System Property. The value of this property is the String \"true\" or
   \"false\".


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_AWT_HEADLESS)

(def *-java-awt-printerjob
  "Static Constant.

  The java.awt.printerjob System Property.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_AWT_PRINTERJOB)

(def *-java-class-path
  "Static Constant.

  The java.class.path System Property. Java class path.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_CLASS_PATH)

(def *-java-class-version
  "Static Constant.

  The java.class.version System Property. Java class format version number.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_CLASS_VERSION)

(def *-java-compiler
  "Static Constant.

  The java.compiler System Property. Name of JIT compiler to use. First in JDK version 1.2. Not used in Sun
   JDKs after 1.2.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_COMPILER)

(def *-java-endorsed-dirs
  "Static Constant.

  The java.endorsed.dirs System Property. Path of endorsed directory or directories.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_ENDORSED_DIRS)

(def *-java-ext-dirs
  "Static Constant.

  The java.ext.dirs System Property. Path of extension directory or directories.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_EXT_DIRS)

(def *-java-home
  "Static Constant.

  The java.home System Property. Java installation directory.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_HOME)

(def *-java-io-tmpdir
  "Static Constant.

  The java.io.tmpdir System Property. Default temp file path.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_IO_TMPDIR)

(def *-java-library-path
  "Static Constant.

  The java.library.path System Property. List of paths to search when loading libraries.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_LIBRARY_PATH)

(def *-java-runtime-name
  "Static Constant.

  The java.runtime.name System Property. Java Runtime Environment name.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_RUNTIME_NAME)

(def *-java-runtime-version
  "Static Constant.

  The java.runtime.version System Property. Java Runtime Environment version.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_RUNTIME_VERSION)

(def *-java-specification-name
  "Static Constant.

  The java.specification.name System Property. Java Runtime Environment specification name.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_SPECIFICATION_NAME)

(def *-java-specification-vendor
  "Static Constant.

  The java.specification.vendor System Property. Java Runtime Environment specification vendor.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_SPECIFICATION_VENDOR)

(def *-java-specification-version
  "Static Constant.

  The java.specification.version System Property. Java Runtime Environment specification version.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_SPECIFICATION_VERSION)

(def *-java-util-prefs-preferences-factory
  "Static Constant.

  The java.util.prefs.PreferencesFactory System Property. A class name.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_UTIL_PREFS_PREFERENCES_FACTORY)

(def *-java-vendor
  "Static Constant.

  The java.vendor System Property. Java vendor-specific string.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VENDOR)

(def *-java-vendor-url
  "Static Constant.

  The java.vendor.url System Property. Java vendor URL.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VENDOR_URL)

(def *-java-version
  "Static Constant.

  The java.version System Property. Java version number.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VERSION)

(def *-java-vm-info
  "Static Constant.

  The java.vm.info System Property. Java Virtual Machine implementation info.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VM_INFO)

(def *-java-vm-name
  "Static Constant.

  The java.vm.name System Property. Java Virtual Machine implementation name.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VM_NAME)

(def *-java-vm-specification-name
  "Static Constant.

  The java.vm.specification.name System Property. Java Virtual Machine specification name.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VM_SPECIFICATION_NAME)

(def *-java-vm-specification-vendor
  "Static Constant.

  The java.vm.specification.vendor System Property. Java Virtual Machine specification vendor.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VM_SPECIFICATION_VENDOR)

(def *-java-vm-specification-version
  "Static Constant.

  The java.vm.specification.version System Property. Java Virtual Machine specification version.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VM_SPECIFICATION_VERSION)

(def *-java-vm-vendor
  "Static Constant.

  The java.vm.vendor System Property. Java Virtual Machine implementation vendor.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VM_VENDOR)

(def *-java-vm-version
  "Static Constant.

  The java.vm.version System Property. Java Virtual Machine implementation version.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/JAVA_VM_VERSION)

(def *-line-separator
  "Static Constant.

  Deprecated. Use System.lineSeparator instead, since it does not require a privilege check.

  type: java.lang.String"
  SystemUtils/LINE_SEPARATOR)

(def *-os-arch
  "Static Constant.

  The os.arch System Property. Operating system architecture.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/OS_ARCH)

(def *-os-name
  "Static Constant.

  The os.name System Property. Operating system name.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/OS_NAME)

(def *-os-version
  "Static Constant.

  The os.version System Property. Operating system version.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/OS_VERSION)

(def *-path-separator
  "Static Constant.

  Deprecated. Use File.pathSeparator, since it is guaranteed to be a
               string containing a single character and it does not require a privilege check.

  type: java.lang.String"
  SystemUtils/PATH_SEPARATOR)

(def *-user-country
  "Static Constant.

  The user.country or user.region System Property. User's country code, such as GB. First
   in Java version 1.2 as user.region. Renamed to user.country in 1.4


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/USER_COUNTRY)

(def *-user-dir
  "Static Constant.

  The user.dir System Property. User's current working directory.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/USER_DIR)

(def *-user-home
  "Static Constant.

  The user.home System Property. User's home directory.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/USER_HOME)

(def *-user-language
  "Static Constant.

  The user.language System Property. User's language code, such as \"en\".


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/USER_LANGUAGE)

(def *-user-name
  "Static Constant.

  The user.name System Property. User's account name.


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/USER_NAME)

(def *-user-timezone
  "Static Constant.

  The user.timezone System Property. For example: \"America/Los_Angeles\".


   Defaults to null if the runtime does not have security access to read this property or the property does
   not exist.


   This value is initialized when the class is loaded. If System.setProperty(String,String) or
   System.setProperties(java.util.Properties) is called after this class is loaded, the value will be out of
   sync with that System property.

  type: java.lang.String"
  SystemUtils/USER_TIMEZONE)

(def *-is-java-1-1
  "Static Constant.

  Is true if this is Java version 1.1 (also 1.1.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_1_1)

(def *-is-java-1-2
  "Static Constant.

  Is true if this is Java version 1.2 (also 1.2.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_1_2)

(def *-is-java-1-3
  "Static Constant.

  Is true if this is Java version 1.3 (also 1.3.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_1_3)

(def *-is-java-1-4
  "Static Constant.

  Is true if this is Java version 1.4 (also 1.4.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_1_4)

(def *-is-java-1-5
  "Static Constant.

  Is true if this is Java version 1.5 (also 1.5.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_1_5)

(def *-is-java-1-6
  "Static Constant.

  Is true if this is Java version 1.6 (also 1.6.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_1_6)

(def *-is-java-1-7
  "Static Constant.

  Is true if this is Java version 1.7 (also 1.7.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_1_7)

(def *-is-java-1-8
  "Static Constant.

  Is true if this is Java version 1.8 (also 1.8.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_1_8)

(def *-is-java-1-9
  "Static Constant.

  Deprecated. As of release 3.5, replaced by IS_JAVA_9

  type: boolean"
  SystemUtils/IS_JAVA_1_9)

(def *-is-java-9
  "Static Constant.

  Is true if this is Java version 9 (also 9.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_9)

(def *-is-java-10
  "Static Constant.

  Is true if this is Java version 10 (also 10.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_10)

(def *-is-java-11
  "Static Constant.

  Is true if this is Java version 11 (also 11.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_11)

(def *-is-java-12
  "Static Constant.

  Is true if this is Java version 12 (also 12.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_12)

(def *-is-java-13
  "Static Constant.

  Is true if this is Java version 13 (also 13.x versions).


   The field will return false if JAVA_VERSION is null.

  type: boolean"
  SystemUtils/IS_JAVA_13)

(def *-is-os-aix
  "Static Constant.

  Is true if this is AIX.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_AIX)

(def *-is-os-hp-ux
  "Static Constant.

  Is true if this is HP-UX.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_HP_UX)

(def *-is-os-400
  "Static Constant.

  Is true if this is IBM OS/400.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_400)

(def *-is-os-irix
  "Static Constant.

  Is true if this is Irix.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_IRIX)

(def *-is-os-linux
  "Static Constant.

  Is true if this is Linux.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_LINUX)

(def *-is-os-mac
  "Static Constant.

  Is true if this is Mac.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC)

(def *-is-os-mac-osx
  "Static Constant.

  Is true if this is Mac.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX)

(def *-is-os-mac-osx-cheetah
  "Static Constant.

  Is true if this is Mac OS X Cheetah.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_CHEETAH)

(def *-is-os-mac-osx-puma
  "Static Constant.

  Is true if this is Mac OS X Puma.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_PUMA)

(def *-is-os-mac-osx-jaguar
  "Static Constant.

  Is true if this is Mac OS X Jaguar.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_JAGUAR)

(def *-is-os-mac-osx-panther
  "Static Constant.

  Is true if this is Mac OS X Panther.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_PANTHER)

(def *-is-os-mac-osx-tiger
  "Static Constant.

  Is true if this is Mac OS X Tiger.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_TIGER)

(def *-is-os-mac-osx-leopard
  "Static Constant.

  Is true if this is Mac OS X Leopard.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_LEOPARD)

(def *-is-os-mac-osx-snow-leopard
  "Static Constant.

  Is true if this is Mac OS X Snow Leopard.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_SNOW_LEOPARD)

(def *-is-os-mac-osx-lion
  "Static Constant.

  Is true if this is Mac OS X Lion.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_LION)

(def *-is-os-mac-osx-mountain-lion
  "Static Constant.

  Is true if this is Mac OS X Mountain Lion.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_MOUNTAIN_LION)

(def *-is-os-mac-osx-mavericks
  "Static Constant.

  Is true if this is Mac OS X Mavericks.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_MAVERICKS)

(def *-is-os-mac-osx-yosemite
  "Static Constant.

  Is true if this is Mac OS X Yosemite.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_YOSEMITE)

(def *-is-os-mac-osx-el-capitan
  "Static Constant.

  Is true if this is Mac OS X El Capitan.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_MAC_OSX_EL_CAPITAN)

(def *-is-os-free-bsd
  "Static Constant.

  Is true if this is FreeBSD.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_FREE_BSD)

(def *-is-os-open-bsd
  "Static Constant.

  Is true if this is OpenBSD.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_OPEN_BSD)

(def *-is-os-net-bsd
  "Static Constant.

  Is true if this is NetBSD.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_NET_BSD)

(def *-is-os-os-2
  "Static Constant.

  Is true if this is OS/2.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_OS2)

(def *-is-os-solaris
  "Static Constant.

  Is true if this is Solaris.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_SOLARIS)

(def *-is-os-sun-os
  "Static Constant.

  Is true if this is SunOS.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_SUN_OS)

(def *-is-os-unix
  "Static Constant.

  Is true if this is a UNIX like system, as in any of AIX, HP-UX, Irix, Linux, MacOSX, Solaris or SUN OS.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_UNIX)

(def *-is-os-windows
  "Static Constant.

  Is true if this is Windows.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS)

(def *-is-os-windows-2000
  "Static Constant.

  Is true if this is Windows 2000.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_2000)

(def *-is-os-windows-2003
  "Static Constant.

  Is true if this is Windows 2003.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_2003)

(def *-is-os-windows-2008
  "Static Constant.

  Is true if this is Windows Server 2008.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_2008)

(def *-is-os-windows-2012
  "Static Constant.

  Is true if this is Windows Server 2012.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_2012)

(def *-is-os-windows-95
  "Static Constant.

  Is true if this is Windows 95.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_95)

(def *-is-os-windows-98
  "Static Constant.

  Is true if this is Windows 98.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_98)

(def *-is-os-windows-me
  "Static Constant.

  Is true if this is Windows ME.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_ME)

(def *-is-os-windows-nt
  "Static Constant.

  Is true if this is Windows NT.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_NT)

(def *-is-os-windows-xp
  "Static Constant.

  Is true if this is Windows XP.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_XP)

(def *-is-os-windows-vista
  "Static Constant.

  Is true if this is Windows Vista.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_VISTA)

(def *-is-os-windows-7
  "Static Constant.

  Is true if this is Windows 7.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_7)

(def *-is-os-windows-8
  "Static Constant.

  Is true if this is Windows 8.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_8)

(def *-is-os-windows-10
  "Static Constant.

  Is true if this is Windows 10.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_WINDOWS_10)

(def *-is-os-zos
  "Static Constant.

  Is true if this is z/OS.


   The field will return false if OS_NAME is null.

  type: boolean"
  SystemUtils/IS_OS_ZOS)

(defn *java-version-at-least?
  "Is the Java version at least the requested version.

  required-version - the required version, for example 1.31f - `org.apache.commons.lang3.JavaVersion`

  returns: true if the actual version is equal or greater than the required version - `boolean`"
  (^Boolean [^org.apache.commons.lang3.JavaVersion required-version]
    (SystemUtils/isJavaVersionAtLeast required-version)))

(defn *java-awt-headless?
  "Returns whether the JAVA_AWT_HEADLESS value is true.

  returns: true if JAVA_AWT_HEADLESS is \"true\", false otherwise. - `boolean`"
  (^Boolean []
    (SystemUtils/isJavaAwtHeadless )))

(defn *get-java-home
  "Gets the Java home directory as a File.

  returns: a directory - `java.io.File`

  throws: java.lang.SecurityException - if a security manager exists and its checkPropertyAccess method doesn't allow access to the specified system property."
  (^java.io.File []
    (SystemUtils/getJavaHome )))

(defn *java-version-at-most?
  "Is the Java version at most the requested version.


   Example input:

  required-version - the required version, for example 1.31f - `org.apache.commons.lang3.JavaVersion`

  returns: true if the actual version is equal or greater than the required version - `boolean`"
  (^Boolean [^org.apache.commons.lang3.JavaVersion required-version]
    (SystemUtils/isJavaVersionAtMost required-version)))

(defn *get-environment-variable
  "Gets an environment variable, defaulting to defaultValue if the variable cannot be read.


   If a SecurityException is caught, the return value is defaultValue and a message is written to
   System.err.

  name - the environment variable name - `java.lang.String`
  default-value - the default value - `java.lang.String`

  returns: the environment variable value or defaultValue if a security problem occurs - `java.lang.String`"
  (^java.lang.String [^java.lang.String name ^java.lang.String default-value]
    (SystemUtils/getEnvironmentVariable name default-value)))

(defn *get-user-home
  "Gets the user home directory as a File.

  returns: a directory - `java.io.File`

  throws: java.lang.SecurityException - if a security manager exists and its checkPropertyAccess method doesn't allow access to the specified system property."
  (^java.io.File []
    (SystemUtils/getUserHome )))

(defn *get-host-name
  "Gets the host name from an environment variable.


   If you want to know what the network stack says is the host name, you should use InetAddress.getLocalHost().getHostName().

  returns: the host name. - `java.lang.String`"
  (^java.lang.String []
    (SystemUtils/getHostName )))

(defn *get-java-io-tmp-dir
  "Gets the Java IO temporary directory as a File.

  returns: a directory - `java.io.File`

  throws: java.lang.SecurityException - if a security manager exists and its checkPropertyAccess method doesn't allow access to the specified system property."
  (^java.io.File []
    (SystemUtils/getJavaIoTmpDir )))

(defn *get-user-dir
  "Gets the user directory as a File.

  returns: a directory - `java.io.File`

  throws: java.lang.SecurityException - if a security manager exists and its checkPropertyAccess method doesn't allow access to the specified system property."
  (^java.io.File []
    (SystemUtils/getUserDir )))

