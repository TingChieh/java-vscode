package learning.date20230310;

import java.util.ArrayList;
import java.util.Collection;

public class TestStudent {
    public static void main(String[] args) {
        Student stu1 = new Student("stu1", "stu1", 20, "cz");
        Student stu2 = new Student("stu2", "stu2", 20, "cq");

        Collection<Student> col = new ArrayList<Student>();
        col.add(stu1);
        col.add(stu2);

        col.remove(stu2);

        if (col.isEmpty()) {
            System.out.println("集合为空");
        } else {
            System.out.println("集合不为空");
        }

        if (col.contains(stu1)) {
            System.out.println("集合包含 stu1 对象");
        } else {
            System.out.println("集合不包含 stu1 对象");
        }

        col.clear();
    }
}
