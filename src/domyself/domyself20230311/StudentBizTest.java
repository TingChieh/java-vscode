package domyself.domyself20230311;

public class StudentBizTest {
    public static void main(String[] args) {
        StudentBiz stuBiz = new StudentBiz();
        Student stu1 = new Student();
        stu1.setName("张三", 23);

        stuBiz.addstudent(stu1);

        Student stu2 = new Student();
        stu2.setName("李四", 24);

        stuBiz.addstudent(stu2);

        Student stu3 = new Student();
        stu3.setName("王五", 25);

        stuBiz.addstudent(stu3);

        stuBiz.showStudents();
    }
}
