package domyself.domyself20230220.oop3;

public class Person {
    // 属性，成员变量，全局变量 ---> (1)实例变量
    int age;
    String name;
    // (2)静态变量
    static String email;

    public void m2() {
        System.out.println("实例方法 m2");
    }

    // 成员方法：实例方法 ---> 可以调用实例变量、实例方法、静态变量
    public void m1() {
        // 在实例方法中可以访问静态变量，但是不可以定义静态变量
        // static String email2;
        System.out.println(this.age);
        // System.out.println(this.email);
        m2();
        m3();
    }

    // 静态方法
    public static void m3() {
        // 在静态方法中不能使用 this 
        // System.out.println(this.age);
        // 在静态方法中不能调用实例方法
        // m1();
        // 在静态方法中不能调用实例变量
        // System.out.println(age);
        System.out.println("静态方法 m3");
        // 在静态方法中可以直接访问静态变量
        System.out.println(email);
        // 可以直接调用静态方法
        m4();
    }

    public static void m4() {
        System.out.println("静态方法 m4");
    }
}

