package domyself.domyself20230108;

public class Person {
    // 属性 (成员变量) , 姓名 性别 年龄
    String name;
    char sex;
    int age;

    // 方法 (成员方法)
    public void eat() {
        System.out.println("我吃饭！");
    }

    public void drink() {
        System.out.println("我喝水！");
    }

    public void showInfo() {
        System.out.println("我叫：" + name + "；我是" + sex + "生；我今年" + age + "岁");
    }
}
