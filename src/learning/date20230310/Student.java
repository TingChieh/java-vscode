package learning.date20230310;

public class Student {
    private String name;
    private String stuNum;
    private int stuAge;
    private String stuAddress;

    public Student(String stuNum, String name, int stuAge, String stuAddress) {
        this.stuNum = stuNum;
        this.name = name;
        this.stuAge = stuAge;
        this.stuAddress = stuAddress;
    }

    public String getName() {
        return name;
    }

    public String getStuAddress() {
        return stuAddress;
    }

    public int getStuAge() {
        return stuAge;
    }

    public String getStuNum() {
        return stuNum;
    }

    public String toString() {
        return "Student{" +
                "stuNo='" + stuNum + '\'' +
                ", stuName='" + name + '\'' +
                ", stuAge=" + stuAge +
                ", stuAddress='" + stuAddress + '\'' +
                '}';
    }
}
