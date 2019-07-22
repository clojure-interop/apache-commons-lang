(ns org.apache.commons.lang3.concurrent.LazyInitializer
  " This class provides a generic implementation of the lazy initialization
  pattern.


  Sometimes an application has to deal with an object only under certain
  circumstances, e.g. when the user selects a specific menu item or if a
  special event is received. If the creation of the object is costly or the
  consumption of memory or other system resources is significant, it may make
  sense to defer the creation of this object until it is really needed. This is
  a use case for the lazy initialization pattern.


  This abstract base class provides an implementation of the double-check idiom
  for an instance field as discussed in Joshua Bloch's \"Effective Java\", 2nd
  edition, item 71. The class already implements all necessary synchronization.
  A concrete subclass has to implement the initialize() method, which
  actually creates the wrapped data object.


  As an usage example consider that we have a class ComplexObject whose
  instantiation is a complex operation. In order to apply lazy initialization
  to this class, a subclass of LazyInitializer has to be created:




  public class ComplexObjectInitializer extends LazyInitializer<ComplexObject> {
      @Override
      protected ComplexObject initialize() {
          return new ComplexObject();
      }
  }


  Access to the data object is provided through the get() method. So,
  code that wants to obtain the ComplexObject instance would simply
  look like this:




  // Create an instance of the lazy initializer
  ComplexObjectInitializer initializer = new ComplexObjectInitializer();
  ...
  // When the object is actually needed:
  ComplexObject cobj = initializer.get();


  If multiple threads call the get() method when the object has not yet
  been created, they are blocked until initialization completes. The algorithm
  guarantees that only a single instance of the wrapped object class is
  created, which is passed to all callers. Once initialized, calls to the
  get() method are pretty fast because no synchronization is needed
  (only an access to a volatile member field)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.concurrent LazyInitializer]))

(defn ->lazy-initializer
  "Constructor."
  (^LazyInitializer []
    (new LazyInitializer )))

(defn get
  "Returns the object wrapped by this instance. On first access the object
   is created. After that it is cached and can be accessed pretty fast.

  returns: the object initialized by this LazyInitializer - `T`

  throws: org.apache.commons.lang3.concurrent.ConcurrentException - if an error occurred during initialization of the object"
  ([^LazyInitializer this]
    (-> this (.get))))

