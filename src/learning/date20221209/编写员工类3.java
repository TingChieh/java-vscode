package learning.date20221209;

public class 编写员工类3 {
    String name;
    int age;
    double salary;
    double p;

    public 编写员工类3(String name, int age, double salary, double p) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.p = p;
    }

    public double raise() {
        return this.salary + this.p;
    }

    public static void main(String[] args) {
        编写员工类3 e1 = new 编写员工类3("Lucy", 25, 3500.0, 200);
        System.out.println(e1.raise());
        编写员工类3 e2 = new 编写员工类3("Lilei", 35, 4500.0, 200);
        System.out.println(e2.raise());
    }
}
