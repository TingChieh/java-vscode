package learning.date20230224p2;

public class PolyTest {
    public static void main(String[] args) {
        Person person = new Person("Tom", 20);
        System.out.println(person.toString());

        Employee employee = new Employee("Jerry", 30, 123, 5000);
        System.out.println(employee.toString());

        Manager manager = new Manager("Mary", 40, 456, 10000, "CEO");
        System.out.println(manager.toString());
    }
}
