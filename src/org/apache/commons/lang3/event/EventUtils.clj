(ns org.apache.commons.lang3.event.EventUtils
  "Provides some useful event-based utility methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.event EventUtils]))

(defn ->event-utils
  "Constructor."
  (^EventUtils []
    (new EventUtils )))

(defn *add-event-listener
  "Adds an event listener to the specified source.  This looks for an \"add\" method corresponding to the event
   type (addActionListener, for example).

  event-source - the event source - `java.lang.Object`
  listener-type - the event listener type - `java.lang.Class`
  listener - the listener - `L`

  returns: `<L> void`

  throws: java.lang.IllegalArgumentException - if the object doesn't support the listener type"
  ([^java.lang.Object event-source ^java.lang.Class listener-type listener]
    (EventUtils/addEventListener event-source listener-type listener)))

(defn *bind-events-to-method
  "Binds an event listener to a specific method on a specific object.

  target - the target object - `java.lang.Object`
  method-name - the name of the method to be called - `java.lang.String`
  event-source - the object which is generating events (JButton, JList, etc.) - `java.lang.Object`
  listener-type - the listener interface (ActionListener.class, SelectionListener.class, etc.) - `java.lang.Class`
  event-types - the event types (method names) from the listener interface (if none specified, all will be supported) - `java.lang.String`

  returns: `<L> void`"
  ([^java.lang.Object target ^java.lang.String method-name ^java.lang.Object event-source ^java.lang.Class listener-type ^java.lang.String event-types]
    (EventUtils/bindEventsToMethod target method-name event-source listener-type event-types)))

