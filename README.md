# Apache Common Lang Bindings for Clojure.

These bindings are created to simplify interaction with java classes from clojure.
For each java class was created a separate namespace.
Each method/field has its own function/field binding.
Their names are changed for a more native look in the clojure code. Each function has docstring - information about the parameters, return value and possible exceptions.

## Clojars

```
[clojure-interop/apache-commons-lang "1.0.0"]
```

## Class Members Naming Conventions

| Class Member | Java | Clojure |
|:--|:--|:--|
| constructor | new File() | (->file) |
| instance method | getAnyValue() | (get-any-value) |
| instance field | instanceField | (-instance-field) |
| static method | staticMethod() | (*static-method) |
| static field | ANY_STATIC_FIELD | (*-any-static-field) |
| boolean field/method | isExists(), canUse() | (exists?), (can-use?) |

## Classes

- class **org.apache.commons.lang3.AnnotationUtils**
- class **org.apache.commons.lang3.ArchUtils**
- class **org.apache.commons.lang3.ArrayUtils**
- class **org.apache.commons.lang3.BitField**
- class **org.apache.commons.lang3.BooleanUtils**
- class **org.apache.commons.lang3.CharEncoding**
- class **org.apache.commons.lang3.CharSequenceUtils**
- class **org.apache.commons.lang3.CharSet**
- class **org.apache.commons.lang3.CharSetUtils**
- class **org.apache.commons.lang3.CharUtils**
- class **org.apache.commons.lang3.ClassPathUtils**
- enum **org.apache.commons.lang3.ClassUtils$Interfaces**
- class **org.apache.commons.lang3.ClassUtils**
- class **org.apache.commons.lang3.Conversion**
- class **org.apache.commons.lang3.EnumUtils**
- interface **org.apache.commons.lang3.Functions$FailableBiConsumer**
- interface **org.apache.commons.lang3.Functions$FailableBiFunction**
- interface **org.apache.commons.lang3.Functions$FailableBiPredicate**
- interface **org.apache.commons.lang3.Functions$FailableCallable**
- interface **org.apache.commons.lang3.Functions$FailableConsumer**
- interface **org.apache.commons.lang3.Functions$FailableFunction**
- interface **org.apache.commons.lang3.Functions$FailablePredicate**
- interface **org.apache.commons.lang3.Functions$FailableRunnable**
- class **org.apache.commons.lang3.Functions**
- enum **org.apache.commons.lang3.JavaVersion**
- class **org.apache.commons.lang3.LocaleUtils**
- class **org.apache.commons.lang3.NotImplementedException**
- class **org.apache.commons.lang3.ObjectUtils$Null**
- class **org.apache.commons.lang3.ObjectUtils**
- class **org.apache.commons.lang3.RandomStringUtils**
- class **org.apache.commons.lang3.RandomUtils**
- class **org.apache.commons.lang3.Range**
- class **org.apache.commons.lang3.RegExUtils**
- class **org.apache.commons.lang3.SerializationException**
- class **org.apache.commons.lang3.SerializationUtils**
- class **org.apache.commons.lang3.StringEscapeUtils**
- class **org.apache.commons.lang3.StringUtils**
- class **org.apache.commons.lang3.SystemUtils**
- class **org.apache.commons.lang3.ThreadUtils$NamePredicate**
- interface **org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate**
- class **org.apache.commons.lang3.ThreadUtils$ThreadIdPredicate**
- interface **org.apache.commons.lang3.ThreadUtils$ThreadPredicate**
- class **org.apache.commons.lang3.ThreadUtils**
- class **org.apache.commons.lang3.Validate**
- enum **org.apache.commons.lang3.arch.Processor$Arch**
- enum **org.apache.commons.lang3.arch.Processor$Type**
- class **org.apache.commons.lang3.arch.Processor**
- interface **org.apache.commons.lang3.builder.Builder**
- class **org.apache.commons.lang3.builder.CompareToBuilder**
- class **org.apache.commons.lang3.builder.Diff**
- class **org.apache.commons.lang3.builder.DiffBuilder**
- class **org.apache.commons.lang3.builder.DiffResult**
- interface **org.apache.commons.lang3.builder.Diffable**
- class **org.apache.commons.lang3.builder.EqualsBuilder**
- annotation **org.apache.commons.lang3.builder.EqualsExclude**
- class **org.apache.commons.lang3.builder.HashCodeBuilder**
- annotation **org.apache.commons.lang3.builder.HashCodeExclude**
- class **org.apache.commons.lang3.builder.MultilineRecursiveToStringStyle**
- class **org.apache.commons.lang3.builder.RecursiveToStringStyle**
- class **org.apache.commons.lang3.builder.ReflectionDiffBuilder**
- class **org.apache.commons.lang3.builder.ReflectionToStringBuilder**
- class **org.apache.commons.lang3.builder.StandardToStringStyle**
- class **org.apache.commons.lang3.builder.ToStringBuilder**
- annotation **org.apache.commons.lang3.builder.ToStringExclude**
- class **org.apache.commons.lang3.builder.ToStringStyle**
- annotation **org.apache.commons.lang3.builder.ToStringSummary**
- enum **org.apache.commons.lang3.concurrent.AbstractCircuitBreaker$State**
- class **org.apache.commons.lang3.concurrent.AbstractCircuitBreaker**
- class **org.apache.commons.lang3.concurrent.AtomicInitializer**
- class **org.apache.commons.lang3.concurrent.AtomicSafeInitializer**
- class **org.apache.commons.lang3.concurrent.BackgroundInitializer**
- class **org.apache.commons.lang3.concurrent.BasicThreadFactory$Builder**
- class **org.apache.commons.lang3.concurrent.BasicThreadFactory**
- class **org.apache.commons.lang3.concurrent.CallableBackgroundInitializer**
- interface **org.apache.commons.lang3.concurrent.CircuitBreaker**
- class **org.apache.commons.lang3.concurrent.CircuitBreakingException**
- interface **org.apache.commons.lang3.concurrent.Computable**
- class **org.apache.commons.lang3.concurrent.ConcurrentException**
- interface **org.apache.commons.lang3.concurrent.ConcurrentInitializer**
- class **org.apache.commons.lang3.concurrent.ConcurrentRuntimeException**
- class **org.apache.commons.lang3.concurrent.ConcurrentUtils**
- class **org.apache.commons.lang3.concurrent.ConstantInitializer**
- class **org.apache.commons.lang3.concurrent.EventCountCircuitBreaker**
- class **org.apache.commons.lang3.concurrent.LazyInitializer**
- class **org.apache.commons.lang3.concurrent.Memoizer**
- class **org.apache.commons.lang3.concurrent.MultiBackgroundInitializer$MultiBackgroundInitializerResults**
- class **org.apache.commons.lang3.concurrent.MultiBackgroundInitializer**
- class **org.apache.commons.lang3.concurrent.ThresholdCircuitBreaker**
- class **org.apache.commons.lang3.concurrent.TimedSemaphore**
- class **org.apache.commons.lang3.event.EventListenerSupport**
- class **org.apache.commons.lang3.event.EventUtils**
- class **org.apache.commons.lang3.exception.CloneFailedException**
- class **org.apache.commons.lang3.exception.ContextedException**
- class **org.apache.commons.lang3.exception.ContextedRuntimeException**
- class **org.apache.commons.lang3.exception.DefaultExceptionContext**
- interface **org.apache.commons.lang3.exception.ExceptionContext**
- class **org.apache.commons.lang3.exception.ExceptionUtils**
- class **org.apache.commons.lang3.math.Fraction**
- class **org.apache.commons.lang3.math.IEEE754rUtils**
- class **org.apache.commons.lang3.math.NumberUtils**
- interface **org.apache.commons.lang3.mutable.Mutable**
- class **org.apache.commons.lang3.mutable.MutableBoolean**
- class **org.apache.commons.lang3.mutable.MutableByte**
- class **org.apache.commons.lang3.mutable.MutableDouble**
- class **org.apache.commons.lang3.mutable.MutableFloat**
- class **org.apache.commons.lang3.mutable.MutableInt**
- class **org.apache.commons.lang3.mutable.MutableLong**
- class **org.apache.commons.lang3.mutable.MutableObject**
- class **org.apache.commons.lang3.mutable.MutableShort**
- class **org.apache.commons.lang3.reflect.ConstructorUtils**
- class **org.apache.commons.lang3.reflect.FieldUtils**
- class **org.apache.commons.lang3.reflect.InheritanceUtils**
- class **org.apache.commons.lang3.reflect.MethodUtils**
- class **org.apache.commons.lang3.reflect.TypeLiteral**
- class **org.apache.commons.lang3.reflect.TypeUtils$WildcardTypeBuilder**
- class **org.apache.commons.lang3.reflect.TypeUtils**
- interface **org.apache.commons.lang3.reflect.Typed**
- class **org.apache.commons.lang3.text.CompositeFormat**
- class **org.apache.commons.lang3.text.ExtendedMessageFormat**
- interface **org.apache.commons.lang3.text.FormatFactory**
- class **org.apache.commons.lang3.text.FormattableUtils**
- class **org.apache.commons.lang3.text.StrBuilder**
- class **org.apache.commons.lang3.text.StrLookup**
- class **org.apache.commons.lang3.text.StrMatcher**
- class **org.apache.commons.lang3.text.StrSubstitutor**
- class **org.apache.commons.lang3.text.StrTokenizer**
- class **org.apache.commons.lang3.text.WordUtils**
- class **org.apache.commons.lang3.text.translate.AggregateTranslator**
- class **org.apache.commons.lang3.text.translate.CharSequenceTranslator**
- class **org.apache.commons.lang3.text.translate.CodePointTranslator**
- class **org.apache.commons.lang3.text.translate.EntityArrays**
- class **org.apache.commons.lang3.text.translate.JavaUnicodeEscaper**
- class **org.apache.commons.lang3.text.translate.LookupTranslator**
- class **org.apache.commons.lang3.text.translate.NumericEntityEscaper**
- enum **org.apache.commons.lang3.text.translate.NumericEntityUnescaper$OPTION**
- class **org.apache.commons.lang3.text.translate.NumericEntityUnescaper**
- class **org.apache.commons.lang3.text.translate.OctalUnescaper**
- class **org.apache.commons.lang3.text.translate.UnicodeEscaper**
- class **org.apache.commons.lang3.text.translate.UnicodeUnescaper**
- class **org.apache.commons.lang3.text.translate.UnicodeUnpairedSurrogateRemover**
- class **org.apache.commons.lang3.time.DateFormatUtils**
- interface **org.apache.commons.lang3.time.DateParser**
- interface **org.apache.commons.lang3.time.DatePrinter**
- class **org.apache.commons.lang3.time.DateUtils**
- class **org.apache.commons.lang3.time.DurationFormatUtils**
- class **org.apache.commons.lang3.time.FastDateFormat**
- class **org.apache.commons.lang3.time.FastDateParser**
- class **org.apache.commons.lang3.time.FastDatePrinter**
- class **org.apache.commons.lang3.time.FastTimeZone**
- class **org.apache.commons.lang3.time.StopWatch**
- class **org.apache.commons.lang3.time.TimeZones**
- class **org.apache.commons.lang3.tuple.ImmutablePair**
- class **org.apache.commons.lang3.tuple.ImmutableTriple**
- class **org.apache.commons.lang3.tuple.MutablePair**
- class **org.apache.commons.lang3.tuple.MutableTriple**
- class **org.apache.commons.lang3.tuple.Pair**
- class **org.apache.commons.lang3.tuple.Triple**

## Contributors

[Eugene Potapenko](https://github.com/potapenko/)

## License

Distributed under the Eclipse Public License, the same as Clojure.
