package learning.date20221209;

public class Rectangle {
    int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getPerimeter() {
        return (this.length + this.width) * 2;
    }

    public int getArea() {
        return (this.length * this.width);
    }

    public static void main(String[] args) {
        Rectangle result = new Rectangle(15, 10);
        System.out.println(result.getPerimeter());
        System.out.println(result.getArea());
    }
}
