package learning.date20230228p1;

public class Rectangle {
    double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        double Area = length * width;
        return Area;
    }

    public double getPeremeter() {
        double Peremeter = 2 * (length + width);
        return Peremeter;
    }

    public void PrintMessage() {
        double Diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(length, 2));
        System.out.println(String.format("%.2f", length));
        System.out.println(String.format("%.2f", width));
        System.out.println(String.format("%.2f", getArea()));
        System.out.println(String.format("%.2f", getPeremeter()));
        System.out.println(String.format("%.2f", Diagonal));
    }

    public static void main(String[] args) {
        Rectangle R = new Rectangle(3, 4);
        R.PrintMessage();
    }
}
