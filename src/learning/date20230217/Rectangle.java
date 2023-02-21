package learning.date20230217;

public class Rectangle extends Shape{
    private int left, top, width, height;

    public Rectangle(int l, int t, int w, int h) {
        this.left=l;
        this.top=t;
        this.width=w;
        this.height=h;
    }

    public void draw() {
        System.out.println("Draw a Rectangle");
    }
}
