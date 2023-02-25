package learning.date20230224p2;

public class Employee extends Person{
    private int id;
    private double salary;

    public Employee(String name, int age, int id, double salary) {
        super(name, age);
        this.id = id;
        this.salary = salary;
    }
    public String toString() {
        return super.toString() + ", Employee [id=" + id + ", salary=" + salary + "]";
    }
}