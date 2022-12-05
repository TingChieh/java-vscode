package schoolOJ;

public class oj1040 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 10 == 3 || (i / 10) % 10 == 3 || (i / 100) % 10 == 3) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
