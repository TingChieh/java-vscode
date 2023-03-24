package learning.date20230321;

@SuppressWarnings({ "all" })
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student(20);
        Student stu2 = new Student(18);
        System.out.println(stu1.compareTo(stu2));// 结果为1
    }
}

class Student implements Comparable<Student> {
    private int age;

    public Student(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.age < o.age ? -1 : this.age == o.age ? 0 : 1;
    }
}
