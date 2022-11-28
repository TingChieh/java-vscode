package schoolOJ;

import java.util.Scanner;

public class oj1031 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt(), sum = 1;
            for (int i = 1; i <= n; i++) {
                sum = sum * i;
            }
            System.out.println(sum);
        }
    }
}
