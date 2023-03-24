package learning.date20230321;

public class Student{
    private String no;
    private String name;
    private int age;
    private String address;

    public Student() {
        super();
    }

    public Student(String no, String name, int age, String address) {
        this.no = no;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "{" +
                " no='" + getNo() + "'" +
                ", name='" + getName() + "'" +
                ", age='" + getAge() + "'" +
                ", address='" + getAddress() + "'" +
                "}";
    }
}
