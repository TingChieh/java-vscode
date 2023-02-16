package domyself.domyself20230216;

public class Var {
    // 属性：成员变量（全局变量）
    // 系统默认会认为成员变量赋初始值
    int num;
    String s;
    // 在同一个类中，局部变量和全局变量可以同名。同名时，局部变量优先级更高
    int var = 9;

    public void m4() {
        int var = 10;
        System.out.println(var);
    }

    // 参数也是一种变量，它是局部变量
    public void m5(int num) {
        System.out.println(num);
    }

    // 方法
    // 在不同的方法中，可以有同名的局部变量，互相独立。但是在同一个方法中，不可以有同名的局部变量
    public void m1() {
        // 局部变量：作用域是一个方法或一个语句块
        // 局部变量必须初始化赋值后使用
        int a = 9;
        System.out.println(a);
    }

    public void m2() {
        // 局部变量：作用域是一个方法或一个语句块
        // a 的作用域是 for 循环
        for (int a = 0; a < 4; a++) {
            System.out.println("hello");
        }
    }

    public void m3() {
        System.out.println(num);
        System.out.println(s);
    }

    public static void main(String[] args) {
        // int a = 0; // a 的作用域就是整个 main 方法
        // for (; a < 4; a++) {
        // System.out.println("hello");
        // }
        // System.out.println(a);
        Var v = new Var();
        v.m3();
        v.m1();
        v.m4();
    }
}
