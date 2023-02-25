package learning.date20230224;

public class Test {
    public static void main(String[] args) {
        // Person p = new Person();
        // Student s = new Student();
        // p = s;// 向上转型，父亲对象 p 引用子类对象 s 之后，只能访问父类成员
        // // s = p ;报错
        // p = new Student();
        // // Person p1 = new Person();
        // p.talk();// 向上转型对象 p 调用重写方法时，调用的是子类的方法
        // Student s1 = (Student) p;
        // // 当把向.上转型对象p强制转换到该子类的对象，就可以访问子类所有的成员
        // s1.no = "ss";
        // 向下转型
        // Person p = new Student();// 1.该父类变量 p 目前引用的必须是子类对象
        // Student s = (Student) p;// 2.必须使用强制类型转换
        // s.no = "ssss";// 3.向下转型对象 s 可以调用父类和子类的成员
        // s.talk();// 4.向下转型对象 s 调用重写方法时，调用的是子类的方法
        Person p = new Student();// 1.该父类变量 p 目前引用的必须是子类对象
        if (p instanceof Student) {
            Student s = (Student) p;// 2.必须使用强制类型转换
            System.out.println("匹配");
        } else {
            System.out.println("不匹配");
        }
    }
}
