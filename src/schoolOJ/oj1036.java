package schoolOJ;

import java.util.Scanner;

public class oj1036 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt(), sum = 0;
            for (int i = 0; i <= n; i++) {
                if ((i % 3 == 2) && (i % 5 == 3) && (i % 7 == 2)) {
                    sum++;
                }
            }
            System.out.println(sum);
        }
    }
}
