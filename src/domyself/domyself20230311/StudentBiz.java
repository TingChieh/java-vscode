package domyself.domyself20230311;

public class StudentBiz {
    // {张三,李四,null,null...,null}
    Student[] students = new Student[30];

    // 增加：将学生对象，放入
    public boolean addstudent(Student student) {
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("数组已满，增加失败");
            return false;
        } else {
            students[index] = student;
            return true;
            // 执行增加
        }
    }

    // 查看对象数组中，已有对象的信息
    public void showStudents() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i].getName() + "\t" +
                        students[i].getAge());
            }
        }
    }
}
