package learning.date20230214;

import java.util.Scanner;

public class 判断a到1要几步 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt(), sum = 0;
        input.close();
        while (a != 1) {
            if (a % 2 == 0) {
                a = a / 2;
            } else {
                a = a * 3 + 1;
            }
            sum++;
        }
        System.out.println(sum);
    }
}
