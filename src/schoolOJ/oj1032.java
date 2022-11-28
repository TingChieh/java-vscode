package schoolOJ;

import java.util.Scanner;

public class oj1032 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            double i = 1;
            double j = 1.0;
            double sum = 0;
            for (int num = 1; num <= n; num++) {
                sum += i / j;
                double t = i;
                i = j;
                j = t + j;
            }
            System.out.printf("%.3f", sum);
        }
    }
}