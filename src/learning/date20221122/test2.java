package learning.date20221122;

public class test2 {
    public static void main(String[] args) {
        int length = 1000;
        int day = 0;
        while (length >= 5) {
            length /= 2;
            day++;
        }
        System.out.println("第" + day + "天的长度为" + length);
    }
}
