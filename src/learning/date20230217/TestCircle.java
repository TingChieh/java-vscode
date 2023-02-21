package learning.date20230217;

public class TestCircle {
    public static void main(String[] args) {
        Circle MyShape = new Circle();
        MyShape.type = "圆";
        MyShape.radius = 5.2;
        System.out.println(MyShape.type);
        System.out.println(MyShape.getArea());
        System.out.println(MyShape.getPerimeter());
    }
}
