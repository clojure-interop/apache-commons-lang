(ns org.apache.commons.lang3.builder.DiffBuilder
  " Assists in implementing Diffable.diff(Object) methods.



  To use this class, write code as follows:




  public class Person implements Diffable<Person> {
    String name;
    int age;
    boolean smoker;

    ...

    public DiffResult diff(Person obj) {
      // No need for null check, as NullPointerException correct if obj is null
      return new DiffBuilder(this, obj, ToStringStyle.SHORT_PREFIX_STYLE)
        .append(\"name\", this.name, obj.name)
        .append(\"age\", this.age, obj.age)
        .append(\"smoker\", this.smoker, obj.smoker)
        .build();
    }
  }


  The ToStringStyle passed to the constructor is embedded in the
  returned DiffResult and influences the style of the
  DiffResult.toString() method. This style choice can be overridden by
  calling DiffResult.toString(ToStringStyle)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder DiffBuilder]))

(defn ->diff-builder
  "Constructor.

  Constructs a builder for the specified objects with the specified style.



   If lhs == rhs or lhs.equals(rhs) then the builder will
   not evaluate any calls to append(...) and will return an empty
   DiffResult when build() is executed.

  lhs - this object - `java.lang.Object`
  rhs - the object to diff against - `java.lang.Object`
  style - the style will use when outputting the objects, null uses the default - `org.apache.commons.lang3.builder.ToStringStyle`
  test-trivially-equal - If true, this will test if lhs and rhs are the same or equal. All of the append(fieldName, lhs, rhs) methods will abort without creating a field Diff if the trivially equal test is enabled and returns true. The result of this test is never changed throughout the life of this DiffBuilder. - `boolean`

  throws: java.lang.IllegalArgumentException - if lhs or rhs is null"
  (^DiffBuilder [^java.lang.Object lhs ^java.lang.Object rhs ^org.apache.commons.lang3.builder.ToStringStyle style ^Boolean test-trivially-equal]
    (new DiffBuilder lhs rhs style test-trivially-equal))
  (^DiffBuilder [^java.lang.Object lhs ^java.lang.Object rhs ^org.apache.commons.lang3.builder.ToStringStyle style]
    (new DiffBuilder lhs rhs style)))

(defn append
  "Test if two booleans are equal.

  field-name - the field name - `java.lang.String`
  lhs - the left hand boolean - `boolean`
  rhs - the right hand boolean - `boolean`

  returns: this - `org.apache.commons.lang3.builder.DiffBuilder`

  throws: java.lang.IllegalArgumentException - if field name is null"
  (^org.apache.commons.lang3.builder.DiffBuilder [^DiffBuilder this ^java.lang.String field-name ^Boolean lhs ^Boolean rhs]
    (-> this (.append field-name lhs rhs)))
  (^org.apache.commons.lang3.builder.DiffBuilder [^DiffBuilder this ^java.lang.String field-name ^org.apache.commons.lang3.builder.DiffResult diff-result]
    (-> this (.append field-name diff-result))))

(defn build
  "Builds a DiffResult based on the differences appended to this
   builder.

  returns: a DiffResult containing the differences between the two
           objects. - `org.apache.commons.lang3.builder.DiffResult`"
  (^org.apache.commons.lang3.builder.DiffResult [^DiffBuilder this]
    (-> this (.build))))

