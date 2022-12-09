package learning.date20221208;

public class Student {
    // 1. 属性——成员变量
    // 访问权限 类型 名字 值
    // 姓名(String) 年龄(int) 学号(String)
    static String name;// 实例变量
    static int age;// 类变量
    String id;
    int s1 = 0;

    // 2、行为一-成员方法
    // 读书、吃饭.
    // 权限 返回值类型 名字(参数列表) {执行语句}
    // 局部变量：形参 + 方法体里的参数(这些参数的作用域只在某个方法里)
    // String s 方法的参数，形参，形式参数
    public void Read(String s, int s1) {
        System.out.println(s);
    }

    // public void Product() {
    // // 商品类 Product
    // // 属性：名字（String name）、价格（double price）、编号(String id)、重量(double weight)
    // // 行为：加价（Raise）有一个整型形参，计算并输出商品加价后的价格
    // // 打折(Discount)有一个double类型的形参表示折扣，计算并返回商品打折后的价格
    // // 权限 返回值类型 名字（参数列表）
    // String name, id;
    // double price, weight, raise;
    // int Discount;
    // }

    public boolean Eat() {
        // int a = 0;
        return false;
    }

    public static void main(String[] args) {
        int a = 0;
        System.out.println(age);
        System.out.println(a);
    }
}
