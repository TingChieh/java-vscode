package schoolOJ;

import java.util.Scanner;

public class oj1047 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 读入输入的n进制数
        int n = scanner.nextInt();
        String num = scanner.next();

        // 将n进制数转换为十进制数
        long decimal = 0;
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            int digit = Character.isDigit(c) ? c - '0' : c - 'A' + 10;
            decimal = decimal * n + digit;
        }

        // 读入转换之后的m进制
        int m = scanner.nextInt();

        // 将十进制数转换为m进制数
        StringBuilder sb = new StringBuilder();
        while (decimal > 0) {
            int remainder = (int) (decimal % m);
            char c = (char) (remainder < 10 ? '0' + remainder : 'A' + remainder - 10);
            sb.append(c);
            decimal /= m;
        }
        sb.reverse();

        // 输出转换之后的m进制数
        System.out.println(sb.toString());
        scanner.close();
    }
}
