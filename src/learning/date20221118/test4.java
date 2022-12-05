package learning.date20221118;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int lines = input.nextInt();
            for (int line = 1; line <= lines; line++) {
                int len_Line = (-1) + line * 2;
                int number = 1;
                for (int step = 1; step <= (len_Line / 2); step++) {
                    System.out.print(number + " ");
                    number *= 2;
                }
                while (number != 1) {
                    System.out.print(number + " ");
                    number /= 2;
                }
                System.out.println("1");
            }
        }
    }
}
