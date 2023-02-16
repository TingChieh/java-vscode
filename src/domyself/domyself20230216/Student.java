package domyself.domyself20230216;

public class Student {
    String name;
    int age;
    int score;

    // 系统默认提供这个无参构造方法
    public Student() {
    }

    // 带参构造方法 this 指代当前对象
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score, int age) {
        // this.name = name;
        // this.score = score;
        // this.age = age;
        this(name, score); // (1)调用构造方法 Student(String name, int score) (2)
        this.age = age;
    }

    // 可以理解为这种写法
    // public Student(String n, int s) {
    // name = n;
    // score = s;
    // }

    // 方法：输出个人信息
    public void showInfo() {
        System.out.println(name + "的成绩是" + score);
    }

    // 不同返回值或不同访问修饰符，但是方法名和参数相同，系统认为是相同的方法，会报错
    // public void showInfo() {
    // System.out.println(name + "的成绩是" + score);
    // return "sss";
    // }

    // showInfo() 方法重载：同一类中；方法同名；不同参数（参数个数不同，参数类型不同）
    public String showInfo(int num) {
        System.out.println(num);
        return "test";
    }

    public void method1() {
        showInfo();
        // 等同于：this.showInfo();
    }
}
