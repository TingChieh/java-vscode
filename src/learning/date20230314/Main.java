package learning.date20230314;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Amy", 12);
        Student stu2 = new Student("Tom", 18);
        Student stu3 = new Student("Amy", 12);

        Set<Student> set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);

        System.out.println("集合size为：" + set.size());

        Iterator<Student> it = set.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println("姓名：" + s.getName() + "，年龄：" + s.getAge());
        }
    }
}
