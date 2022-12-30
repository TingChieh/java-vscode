package learning.date20221223;

public class Student {
    private String name;

    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString() {
        return name + "," + score;
    }

    public static void main(String[] args) {
        Student s1 = new Student("张三", 78);
        Student s2 = new Student("李四", 91);
        Student s3 = new Student("王五", 66);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
        double avg;
        avg = (s1.score + s2.score + s3.score) / 3;
        System.out.println(avg);
    }
}