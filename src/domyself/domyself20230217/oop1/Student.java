package domyself.domyself20230217.oop1;

public class Student {
    // private 修饰的累成员，只能本类访问
    private int age;
    // 默认修饰符修饰的类成员，本类可以访问
    String name;
    // 修饰符修饰的类成员，本类可以访问
    protected String address;
    // public 修饰符修饰的类成员，在哪里都可以被访问
    public char sex;

    public void m1() {
        System.out.println(this.age);
        System.out.println(this.name);
        System.out.println(this.address);
    }
}
