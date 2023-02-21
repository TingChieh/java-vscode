package domyself.domyself20230217.oop2;

import domyself.domyself20230217.oop1.*;

public class Test1 {
    public static void main(String[] args) {
        // 不同包的类只可以访问 public 修饰的类，不可以访问默认修饰符修饰的类
        Student s = new Student();
        // 默认修饰符修饰的类成员，不能被其他包的其他类访问
        // System.out.println(s.name);
        // protected 修饰符修饰的类成员，不能被其他包的其他类访问
        // System.out.println(s.address);
        // Person p =new Person();
        System.out.println(s.sex);
    }
}
