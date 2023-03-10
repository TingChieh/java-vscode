package learning.date20230310;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class TestCollection {
    public static void main(String[] args) {
        Student stu1 = new Student("111", "hhh", 22, "cq");
        Student stu2 = new Student("222", "zzz", 21, "cz");
        Student stu3 = new Student("333", "qqq", 20, "sz");
        
        Collection<Student> col = new ArrayList<Student>();
        col.add(stu1);
        col.add(stu2);
        col.add(stu3);
        
        Iterator<Student> it = col.iterator();

        while (it.hasNext()) {
            Student element = it.next();
            System.out.println(element);
        }
    }
}
