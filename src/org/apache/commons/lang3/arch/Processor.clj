(ns org.apache.commons.lang3.arch.Processor
  "The Processor represents a microprocessor and defines
  some properties like architecture and type of the microprocessor."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.arch Processor]))

(defn ->processor
  "Constructor.

  Constructs a Processor object with the given
   parameters.

  arch - The processor architecture. - `org.apache.commons.lang3.arch.Processor$Arch`
  type - The processor type. - `org.apache.commons.lang3.arch.Processor$Type`"
  (^Processor [^org.apache.commons.lang3.arch.Processor$Arch arch ^org.apache.commons.lang3.arch.Processor$Type type]
    (new Processor arch type)))

(defn get-arch
  "Returns the processor architecture as an Processor.Arch enum.
   The processor architecture defines, if the processor has
   a 32 or 64 bit architecture.

  returns: A Processor.Arch enum. - `org.apache.commons.lang3.arch.Processor$Arch`"
  (^org.apache.commons.lang3.arch.Processor$Arch [^Processor this]
    (-> this (.getArch))))

(defn get-type
  "Returns the processor type as Processor.Type enum.
   The processor type defines, if the processor is for example
   a x86 or PPA.

  returns: A Processor.Type enum. - `org.apache.commons.lang3.arch.Processor$Type`"
  (^org.apache.commons.lang3.arch.Processor$Type [^Processor this]
    (-> this (.getType))))

(defn 32-bit?
  "Checks if Processor is 32 bit.

  returns: true, if Processor is Processor.Arch.BIT_32, else false. - `boolean`"
  (^Boolean [^Processor this]
    (-> this (.is32Bit))))

(defn 64-bit?
  "Checks if Processor is 64 bit.

  returns: true, if Processor is Processor.Arch.BIT_64, else false. - `boolean`"
  (^Boolean [^Processor this]
    (-> this (.is64Bit))))

(defn x-86?
  "Checks if Processor is type of x86.

  returns: true, if Processor is Processor.Type.X86, else false. - `boolean`"
  (^Boolean [^Processor this]
    (-> this (.isX86))))

(defn ia-64?
  "Checks if Processor is type of Intel Itanium.

  returns: true. if Processor is Processor.Type.IA_64, else false. - `boolean`"
  (^Boolean [^Processor this]
    (-> this (.isIA64))))

(defn ppc?
  "Checks if Processor is type of Power PC.

  returns: true. if Processor is Processor.Type.PPC, else false. - `boolean`"
  (^Boolean [^Processor this]
    (-> this (.isPPC))))

