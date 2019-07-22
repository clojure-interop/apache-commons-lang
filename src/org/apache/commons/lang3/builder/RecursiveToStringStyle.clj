(ns org.apache.commons.lang3.builder.RecursiveToStringStyle
  "Works with ToStringBuilder to create a \"deep\" toString.

  To use this class write code as follows:



  public class Job {
    String title;
    ...
  }

  public class Person {
    String name;
    int age;
    boolean smoker;
    Job job;

    ...

    public String toString() {
      return new ReflectionToStringBuilder(this, new RecursiveToStringStyle()).toString();
    }
  }

  This will produce a toString of the format:
  Person@7f54[name=Stephen,age=29,smoker=false,job=Job@43cd2[title=Manager]]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.apache.commons.lang3.builder RecursiveToStringStyle]))

(defn ->recursive-to-string-style
  "Constructor.

  Constructor."
  (^RecursiveToStringStyle []
    (new RecursiveToStringStyle )))

(defn append-detail
  "Description copied from class: ToStringStyle

  buffer - the StringBuffer to populate - `java.lang.StringBuffer`
  field-name - the field name, typically not used as already appended - `java.lang.String`
  value - the value to add to the toString, not null - `java.lang.Object`"
  ([^RecursiveToStringStyle this ^java.lang.StringBuffer buffer ^java.lang.String field-name ^java.lang.Object value]
    (-> this (.appendDetail buffer field-name value))))

