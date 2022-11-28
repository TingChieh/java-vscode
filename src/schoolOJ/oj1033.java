package schoolOJ;

import java.util.Scanner;

public class oj1033 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt(), sum = 0, j = 1;
            for (int i = 1; i <= n; i++) {
                j = j * i;
                sum += j;
            }
            System.out.println(sum);
        }
    }
}
