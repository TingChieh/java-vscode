package learning.date20230217;

public class Circle extends Shape {
    double radius;
    public String type;

    public void setPerimeter(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }
}
