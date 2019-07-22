(ns org.apache.commons.lang3.event.EventListenerSupport
  "An EventListenerSupport object can be used to manage a list of event
  listeners of a particular type. The class provides
  addListener(Object) and removeListener(Object) methods
  for registering listeners, as well as a fire() method for firing
  events to the listeners.



  To use this class, suppose you want to support ActionEvents.  You would do:



  public class MyActionEventSource
  {
    private EventListenerSupport<ActionListener> actionListeners =
        EventListenerSupport.create(ActionListener.class);

    public void someMethodThatFiresAction()
    {
      ActionEvent e = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, \"somethingCool\");
      actionListeners.fire().actionPerformed(e);
    }
  }


  Serializing an EventListenerSupport instance will result in any
  non-Serializable listeners being silently dropped."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.event EventListenerSupport]))

(defn ->event-listener-support
  "Constructor.

  Creates an EventListenerSupport object which supports the provided
   listener interface using the specified class loader to create the JDK
   dynamic proxy.

  listener-interface - the listener interface. - `java.lang.Class`
  class-loader - the class loader. - `java.lang.ClassLoader`

  throws: java.lang.NullPointerException - if listenerInterface or classLoader is null."
  (^EventListenerSupport [^java.lang.Class listener-interface ^java.lang.ClassLoader class-loader]
    (new EventListenerSupport listener-interface class-loader))
  (^EventListenerSupport [^java.lang.Class listener-interface]
    (new EventListenerSupport listener-interface)))

(defn *create
  "Creates an EventListenerSupport object which supports the specified
   listener type.

  listener-interface - the type of listener interface that will receive events posted using this class. - `java.lang.Class`

  returns: an EventListenerSupport object which supports the specified
           listener type. - `<T> org.apache.commons.lang3.event.EventListenerSupport<T>`

  throws: java.lang.NullPointerException - if listenerInterface is null."
  ([^java.lang.Class listener-interface]
    (EventListenerSupport/create listener-interface)))

(defn fire
  "Returns a proxy object which can be used to call listener methods on all
   of the registered event listeners. All calls made to this proxy will be
   forwarded to all registered listeners.

  returns: a proxy object which can be used to call listener methods on all
   of the registered event listeners - `L`"
  ([^EventListenerSupport this]
    (-> this (.fire))))

(defn add-listener
  "Registers an event listener.  Will not add a pre-existing listener
   object to the list if allowDuplicate is false.

  listener - the event listener (may not be null). - `L`
  allow-duplicate - the flag for determining if duplicate listener objects are allowed to be registered. - `boolean`

  throws: java.lang.NullPointerException - if listener is null."
  ([^EventListenerSupport this listener ^Boolean allow-duplicate]
    (-> this (.addListener listener allow-duplicate)))
  ([^EventListenerSupport this listener]
    (-> this (.addListener listener))))

(defn remove-listener
  "Unregisters an event listener.

  listener - the event listener (may not be null). - `L`

  throws: java.lang.NullPointerException - if listener is null."
  ([^EventListenerSupport this listener]
    (-> this (.removeListener listener))))

(defn get-listeners
  "Get an array containing the currently registered listeners.
   Modification to this array's elements will have no effect on the
   EventListenerSupport instance.

  returns: L[] - `L[]`"
  ([^EventListenerSupport this]
    (-> this (.getListeners))))

