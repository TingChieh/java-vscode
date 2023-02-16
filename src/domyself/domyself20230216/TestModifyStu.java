package domyself.domyself20230216;

public class TestModifyStu {
    public static void main(String[] args) {
        Modifyscore m = new Modifyscore();
        // Student s1 = new Student();
        // s1.name = "张三";
        // s1.score = 43;
        Student s1 = new Student("张三", 43);
        // Student s2 = new Student();
        // s2.name = "李四";
        // s2.score = 93;
        Student s2 = new Student("李四", 93);
        // Student s3 = new Student();
        // s3.name = "王五";
        // s3.score = 59;
        Student s3 = new Student("王五", 59);
        Student[] stus = new Student[3];
        stus[0] = s1;
        stus[1] = s2;
        stus[2] = s3;
        // 显示学生信息、修改学生成绩
        m.showStus(stus);
        m.modifyscore(stus);
        m.showStus(stus);
    }
}
