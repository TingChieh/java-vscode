package learning.date20230224p2;

public class Manager extends Employee {
    private String position;

    public Manager(String name, int age, int id, double salary, String position) {
        super(name, age, id, salary);
        this.position = position;
    }

    @Override
    public String toString() {
        return super.toString() + ", Manager [position=" + position + "]";
    }
}
