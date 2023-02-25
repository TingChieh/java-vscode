package learning.date20230224p1;

public class Student {
    String id, name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
         } // else
        //     return false;
        // return (anObject instanceof String aString)
        // && (!COMPACT_STRINGS || this.coder == aString.coder)
        // && StringLatin1.equals(value, aString.value);
        if (anObject instanceof Student) {
            Student s = (Student)anObject;
            return this.id == s.id;
        }else return false;
    }

}
