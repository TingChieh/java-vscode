package domyself.domyself20230217.oop1;

public class Test {
    public static void main(String[] args) {
        // 同包的测试类既可以访问 public 修饰的类，也可以访问默认修饰符修饰的类
        Student s = new Student();
        // 其他类不能调用 Student 类 private 修饰的类成员(属性、方法)
        // s.age
        // 默认修饰符修饰的类成员，同包的其他类也可以访问
        System.out.println(s.name);
        // protected修饰符修饰的类成员,同包的其他类也可以访问
        System.out.println(s.address);
        System.out.println(s.sex);
        s.m1();
        // Person p = new Person();
    }
}
