package learning.date20221122;

public class test4 {
    public static void main(String[] args) {
        int i, j, k;
        for (i = 0; i <= 100; i += 5) {
            for (j = 0; j <= 100 - i; j += 10) {
                for (k = 0; k <= 100 - i - j; k += 20) {
                    if (i + j + k == 100) {
                        System.out.println(i / 5 + "," + j / 10 + "," + k / 20);
                    }
                }
            }
        }
    }
}