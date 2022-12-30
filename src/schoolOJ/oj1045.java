package schoolOJ;

import java.util.Scanner;

public class oj1045 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int A = input.nextInt();
        int B = input.nextInt();
        int sum = A + B;
        String SUM = String.valueOf(sum);
        System.out.println(SUM);
        input.close();
    }
}
