(ns org.apache.commons.lang3.builder.ReflectionDiffBuilder
  " Assists in implementing Diffable.diff(Object) methods.


  All non-static, non-transient fields (including inherited fields)
  of the objects to diff are discovered using reflection and compared
  for differences.



  To use this class, write code as follows:




  public class Person implements Diffable<Person> {
    String name;
    int age;
    boolean smoker;
    ...

    public DiffResult diff(Person obj) {
      // No need for null check, as NullPointerException correct if obj is null
      return new ReflectionDiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE)
        .build();
    }
  }


  The ToStringStyle passed to the constructor is embedded in the
  returned DiffResult and influences the style of the
  DiffResult.toString() method. This style choice can be overridden by
  calling DiffResult.toString(ToStringStyle)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder ReflectionDiffBuilder]))

(defn ->reflection-diff-builder
  "Constructor.

  Constructs a builder for the specified objects with the specified style.



   If lhs == rhs or lhs.equals(rhs) then the builder will
   not evaluate any calls to append(...) and will return an empty
   DiffResult when build() is executed.

  lhs - this object - `T`
  rhs - the object to diff against - `T`
  style - the style will use when outputting the objects, null uses the default - `org.apache.commons.lang3.builder.ToStringStyle`

  throws: java.lang.IllegalArgumentException - if lhs or rhs is null"
  (^ReflectionDiffBuilder [lhs rhs ^org.apache.commons.lang3.builder.ToStringStyle style]
    (new ReflectionDiffBuilder lhs rhs style)))

(defn build
  "Description copied from interface: Builder

  returns: the object constructed or result calculated by the builder. - `org.apache.commons.lang3.builder.DiffResult`"
  (^org.apache.commons.lang3.builder.DiffResult [^ReflectionDiffBuilder this]
    (-> this (.build))))

