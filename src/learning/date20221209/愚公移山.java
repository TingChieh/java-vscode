package learning.date20221209;

public class 愚公移山 {
    public static int Mountain() {
        int day = 0;
        int height = 100;
        int m = 5;
        while (height > 0) {
            height -= m;
            day++;
        }
        // 编写方法
        return day;
    }

    public static void main(String[] args) {

        System.out.println(Mountain() + "天");
    }
}
