package learning.date20221122;

public class test6 {
    public static void main(String[] args) {
        int x =10, y;
        if (x<=0) {
            y=x*3+5;
        } else if(0<x && x<100) {
            y=x;
        } else {
            y=x*x-3*x-10;
        }
        System.out.println("y的值为:"+y);
    }
}
