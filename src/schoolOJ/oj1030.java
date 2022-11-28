package schoolOJ;

import java.util.Scanner;

public class oj1030 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            double sum = 0 ;
            for (double i = 1; i <= n; i++) {
                sum += 1/i;
            }
            System.out.println(String.format("%.3f", sum));
        }
    }
}
