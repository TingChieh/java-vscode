package schoolOJ;

import java.util.Scanner;

public class oj1039 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int N = input.nextInt(), sum = 0;
            for (int i = 1; i <= N; i++) {
                if (i % 5 == 0 && (i % 10 == 5 || (i / 10) % 10 == 5 || (i / 100) % 10 == 5 || (i / 1000) % 10 == 5
                        || i / 10000 == 5)) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
