package learning.date20230217.oop1;

public class Shape {
    protected int lineSize;

    public Shape() {
        lineSize = 1;
    }

    public Shape(int ls) {
        this.lineSize=ls;
    }

    public void setLineSize(int lineSize) {
        this.lineSize = lineSize;
    }

    public int getLineSize() {
        return lineSize;
    }

    public void Draw() {
        System.out.println("Draw a Shape");
    }
        
}
