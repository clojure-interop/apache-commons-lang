(ns org.apache.commons.lang3.Functions
  "This class provides utility functions, and classes for working with the
  java.util.function package, or more generally, with Java 8
  lambdas.
  More specifically, it attempts to address the fact that lambdas are supposed
  not to throw Exceptions, at least not checked Exceptions, aka instances of
  Exception. This enforces the use of constructs like


    Consumer<java.lang.reflect.Method> consumer = (m) -> {
        try {
            m.invoke(o, args);
        } catch (Throwable t) {
            throw Functions.rethrow(t);
        }
    };
  By replacing a Consumer<O> with a
  FailableConsumer<O,? extends Throwable>, this can be
  written like follows:


    Functions.accept((m) -> m.invoke(o,args));
  Obviously, the second version is much more concise and the spirit of
  Lambda expressions is met better than the second version."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 Functions]))

(defn ->functions
  "Constructor."
  (^Functions []
    (new Functions )))

(defn *run
  "Runs a runnable and rethrows any exception as a RuntimeException.

  p-runnable - The runnable to run - `org.apache.commons.lang3.Functions$FailableRunnable`

  returns: `<T extends java.lang.Throwable> void`"
  ([^org.apache.commons.lang3.Functions$FailableRunnable p-runnable]
    (Functions/run p-runnable)))

(defn *call
  "Calls a callable and rethrows any exception as a RuntimeException.

  p-callable - the callable to call - `org.apache.commons.lang3.Functions$FailableCallable`

  returns: the value returned from the callable - `<O,T extends java.lang.Throwable> O`"
  ([^org.apache.commons.lang3.Functions$FailableCallable p-callable]
    (Functions/call p-callable)))

(defn *accept
  "Consumes a consumer and rethrows any exception as a RuntimeException.

  p-consumer - the consumer to consume - `org.apache.commons.lang3.Functions$FailableBiConsumer`
  p-object-1 - the first object to consume by pConsumer - `O1`
  p-object-2 - the second object to consume by pConsumer - `O2`

  returns: `<O1,O2,T extends java.lang.Throwable> void`"
  ([^org.apache.commons.lang3.Functions$FailableBiConsumer p-consumer p-object-1 p-object-2]
    (Functions/accept p-consumer p-object-1 p-object-2))
  ([^org.apache.commons.lang3.Functions$FailableConsumer p-consumer p-object]
    (Functions/accept p-consumer p-object)))

(defn *apply
  "Applies a function and rethrows any exception as a RuntimeException.

  p-function - the function to apply - `org.apache.commons.lang3.Functions$FailableBiFunction`
  p-input-1 - the first input to apply pFunction on - `I1`
  p-input-2 - the second input to apply pFunction on - `I2`

  returns: the value returned from the function - `<I1,I2,O,T extends java.lang.Throwable> O`"
  ([^org.apache.commons.lang3.Functions$FailableBiFunction p-function p-input-1 p-input-2]
    (Functions/apply p-function p-input-1 p-input-2))
  ([^org.apache.commons.lang3.Functions$FailableFunction p-function p-input]
    (Functions/apply p-function p-input)))

(defn *test
  "Tests a predicate and rethrows any exception as a RuntimeException.

  p-predicate - the predicate to test - `org.apache.commons.lang3.Functions$FailableBiPredicate`
  p-object-1 - the first input to test by pPredicate - `O1`
  p-object-2 - the second input to test by pPredicate - `O2`

  returns: the boolean value returned by the predicate - `<O1,O2,T extends java.lang.Throwable> boolean`"
  ([^org.apache.commons.lang3.Functions$FailableBiPredicate p-predicate p-object-1 p-object-2]
    (Functions/test p-predicate p-object-1 p-object-2))
  ([^org.apache.commons.lang3.Functions$FailablePredicate p-predicate p-object]
    (Functions/test p-predicate p-object)))

(defn *try-with-resources
  "A simple try-with-resources implementation, that can be used, if your
   objects do not implement the AutoCloseable interface. The method
   executes the pAction. The method guarantees, that all
   the pResources are being executed, in the given order, afterwards,
   and regardless of success, or failure. If either the original action, or
   any of the resource action fails, then the first failure (aka
   Throwable is rethrown. Example use:


     final FileInputStream fis = new FileInputStream(\"my.file\");
     Functions.tryWithResources(useInputStream(fis), null, () -> fis.close());

  p-action - The action to execute. This object will always be invoked. - `org.apache.commons.lang3.Functions$FailableRunnable`
  p-error-handler - An optional error handler, which will be invoked finally, if any error occurred. The error handler will receive the first error, aka Throwable. - `org.apache.commons.lang3.Functions$FailableConsumer`
  p-resources - The resource actions to execute. All resource actions will be invoked, in the given order. A resource action is an instance of Functions.FailableRunnable, which will be executed. - `org.apache.commons.lang3.Functions$FailableRunnable`"
  ([^org.apache.commons.lang3.Functions$FailableRunnable p-action ^org.apache.commons.lang3.Functions$FailableConsumer p-error-handler ^org.apache.commons.lang3.Functions$FailableRunnable p-resources]
    (Functions/tryWithResources p-action p-error-handler p-resources))
  ([^org.apache.commons.lang3.Functions$FailableRunnable p-action ^org.apache.commons.lang3.Functions$FailableRunnable p-resources]
    (Functions/tryWithResources p-action p-resources)))

(defn *rethrow
  "Rethrow a Throwable as an unchecked exception.

  p-throwable - The throwable to rethrow - `java.lang.Throwable`

  returns: Never returns anything, this method never terminates normally - `java.lang.RuntimeException`"
  (^java.lang.RuntimeException [^java.lang.Throwable p-throwable]
    (Functions/rethrow p-throwable)))

