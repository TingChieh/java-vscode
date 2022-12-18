package schoolOJ;

import java.util.Scanner;

public class oj1043 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        // 使用Java内置方法
        System.out.println(Integer.toBinaryString(N));
        // 整数取余
        String s = "";
        for (int n = N; n > 0; n = n / 2) {
            s = (n % 2) + s;
        }
        System.out.println(s);
    }
}
