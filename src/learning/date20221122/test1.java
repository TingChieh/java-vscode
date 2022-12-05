package learning.date20221122;

public class test1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0) {
                sum += i;
                if (sum > 5000) {
                    break;
                }
                if (sum <= 5000 && i % 3 != 0) {
                    break;
                }
                if (sum <= 5000 && i % 3 == 0) {
                    continue;
                }
            }
        }
        System.out.println(sum);
    }
}
