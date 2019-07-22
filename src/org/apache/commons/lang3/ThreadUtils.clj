(ns org.apache.commons.lang3.ThreadUtils
  " Helpers for java.lang.Thread and java.lang.ThreadGroup.


  #ThreadSafe#"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3 ThreadUtils]))

(defn ->thread-utils
  "Constructor.

  ThreadUtils instances should NOT be constructed in standard programming. Instead, the class should be used as
   ThreadUtils.getAllThreads()


   This constructor is public to permit tools that require a JavaBean instance to operate."
  (^ThreadUtils []
    (new ThreadUtils )))

(def *-always-true-predicate
  "Static Constant.

  Predicate which always returns true.

  type: org.apache.commons.lang3.ThreadUtils.AlwaysTruePredicate"
  ThreadUtils/ALWAYS_TRUE_PREDICATE)

(defn *find-thread-by-id
  "Return the active thread with the specified id if it belongs to the specified thread group.

  thread-id - The thread id - `long`
  thread-group - The thread group - `java.lang.ThreadGroup`

  returns: The thread which belongs to a specified thread group and the thread's id match the specified id.
   null is returned if no such thread exists - `java.lang.Thread`

  throws: java.lang.IllegalArgumentException - if the specified id is zero or negative or the group is null"
  (^java.lang.Thread [^Long thread-id ^java.lang.ThreadGroup thread-group]
    (ThreadUtils/findThreadById thread-id thread-group))
  (^java.lang.Thread [^Long thread-id]
    (ThreadUtils/findThreadById thread-id)))

(defn *find-threads-by-name
  "Return active threads with the specified name if they belong to a specified thread group.

  thread-name - The thread name - `java.lang.String`
  thread-group - The thread group - `java.lang.ThreadGroup`

  returns: The threads which belongs to a thread group and the thread's name match the specified name,
   An empty collection is returned if no such thread exists. The collection returned is always unmodifiable. - `java.util.Collection<java.lang.Thread>`

  throws: java.lang.IllegalArgumentException - if the specified thread name or group is null"
  (^java.util.Collection [^java.lang.String thread-name ^java.lang.ThreadGroup thread-group]
    (ThreadUtils/findThreadsByName thread-name thread-group))
  (^java.util.Collection [^java.lang.String thread-name]
    (ThreadUtils/findThreadsByName thread-name)))

(defn *find-thread-groups-by-name
  "Return active thread groups with the specified group name.

  thread-group-name - The thread group name - `java.lang.String`

  returns: the thread groups with the specified group name or an empty collection if no such thread group exists. The collection returned is always unmodifiable. - `java.util.Collection<java.lang.ThreadGroup>`

  throws: java.lang.IllegalArgumentException - if group name is null"
  (^java.util.Collection [^java.lang.String thread-group-name]
    (ThreadUtils/findThreadGroupsByName thread-group-name)))

(defn *get-all-thread-groups
  "Return all active thread groups excluding the system thread group (A thread group is active if it has been not destroyed).

  returns: all thread groups excluding the system thread group. The collection returned is always unmodifiable. - `java.util.Collection<java.lang.ThreadGroup>`

  throws: java.lang.SecurityException - if the current thread cannot modify thread groups from this thread's thread group up to the system thread group"
  (^java.util.Collection []
    (ThreadUtils/getAllThreadGroups )))

(defn *get-system-thread-group
  "Return the system thread group (sometimes also referred as \"root thread group\").

  returns: the system thread group - `java.lang.ThreadGroup`

  throws: java.lang.SecurityException - if the current thread cannot modify thread groups from this thread's thread group up to the system thread group"
  (^java.lang.ThreadGroup []
    (ThreadUtils/getSystemThreadGroup )))

(defn *get-all-threads
  "Return all active threads (A thread is active if it has been started and has not yet died).

  returns: all active threads. The collection returned is always unmodifiable. - `java.util.Collection<java.lang.Thread>`

  throws: java.lang.SecurityException - if the current thread cannot modify thread groups from this thread's thread group up to the system thread group"
  (^java.util.Collection []
    (ThreadUtils/getAllThreads )))

(defn *find-threads
  "Select all active threads which match the given predicate and which belongs to the given thread group (or one of its subgroups).

  group - the thread group - `java.lang.ThreadGroup`
  recurse - if true then evaluate the predicate recursively on all threads in all subgroups of the given group - `boolean`
  predicate - the predicate - `org.apache.commons.lang3.ThreadUtils$ThreadPredicate`

  returns: An unmodifiable Collection of active threads which match the given predicate and which belongs to the given thread group - `java.util.Collection<java.lang.Thread>`

  throws: java.lang.IllegalArgumentException - if the given group or predicate is null"
  (^java.util.Collection [^java.lang.ThreadGroup group ^Boolean recurse ^org.apache.commons.lang3.ThreadUtils$ThreadPredicate predicate]
    (ThreadUtils/findThreads group recurse predicate))
  (^java.util.Collection [^org.apache.commons.lang3.ThreadUtils$ThreadPredicate predicate]
    (ThreadUtils/findThreads predicate)))

(defn *find-thread-groups
  "Select all active threadgroups which match the given predicate and which is a subgroup of the given thread group (or one of its subgroups).

  group - the thread group - `java.lang.ThreadGroup`
  recurse - if true then evaluate the predicate recursively on all threadgroups in all subgroups of the given group - `boolean`
  predicate - the predicate - `org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate`

  returns: An unmodifiable Collection of active threadgroups which match the given predicate and which is a subgroup of the given thread group - `java.util.Collection<java.lang.ThreadGroup>`

  throws: java.lang.IllegalArgumentException - if the given group or predicate is null"
  (^java.util.Collection [^java.lang.ThreadGroup group ^Boolean recurse ^org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate predicate]
    (ThreadUtils/findThreadGroups group recurse predicate))
  (^java.util.Collection [^org.apache.commons.lang3.ThreadUtils$ThreadGroupPredicate predicate]
    (ThreadUtils/findThreadGroups predicate)))

