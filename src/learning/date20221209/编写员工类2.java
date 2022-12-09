package learning.date20221209;

public class 编写员工类2 {
    String name;
    int age;
    static double salary;

    public static void raise(double p) {
        System.out.println(salary + p);
    }

    public static void main(String[] args) {
        编写员工类2 e = new 编写员工类2();
        e.name = "LiLei";
        e.age = 30;
        编写员工类2.salary = 4500.0;
        raise(200);
    }
}
