package learning.date20230317;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Student implements Comparable<Object> {
    private String name;
    private int age;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student stu1 = new Student(12, "Amy");
        Student stu2 = new Student(18, "Tom");
        Student stu3 = new Student(12, "Amy");
        // 定义Collection集合对象，并添加以上对象，遍历输出集合元素
        Collection<Object> col = new ArrayList<>();
        col.add(stu1);
        col.add(stu2);
        col.add(stu3);
        System.out.println(col);
        for (Object o : col) {
            System.out.println(o);
        }
        System.out.println(stu1.compareTo(stu2));
        System.out.println(stu1.compareTo(stu3));

        Set<Student> set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        System.out.println(set.size());
    }

    public String toString() {
        return "Student{name=" + name + ", age=" + age + "}";
    }

    @Override
    public int compareTo(Object o) {
        Student stu = (Student) o;
        if (this.age > stu.age) {
            return 1;
        } else if (this.age < stu.age) {
            return -1;
        } else {
            return this.name.compareTo(stu.name);
        }
    }

}
