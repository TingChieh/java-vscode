package domyself.domyself20230220.oop3;

public class TestPerson {
    public static void main(String[] args) {
        // 调用类的成员变量（属性），创建对象，通过对象去访问
        Person p = new Person();
        p.age = 18;
        p.name = "张三";
        // 静态变量 ---> 类名去调用
        Person.email = "zhangsan@example.com";
        // 通过实例调用方法
        p.m1();
        // 通过类名调用静态方法
        Person.m3();
        // 回想以前使用过的静态方法
        // Math.random();
        // Arrays.sort(a);
        // Arrays.binarySearch(a, Key)

    }
}
