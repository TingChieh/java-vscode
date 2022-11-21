package date20221118;

public class test3 {
    public static void main(String[] args) {
        int a, b, out = 0, sum = 0;
        for (a = 1000; a >= 3 & out <= 10; a--) {
            boolean flag = true;
            for (b = 2; b < a; b++) {
                if (a % b == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("3-1000最大的素数为"+a);
                out++;
                sum += a;
            }
        }
        System.out.println("3-1000最大素数和为"+sum);
    }
}
