package before;

import java.util.Scanner;

public class classpratice {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("请输出一个四位数");
            int num = input.nextInt();
            int fan;
            System.out.println("反转后的四位数是");
            while (num != 0) {
                fan = num % 10;
                System.out.print(fan);
                num = num / 10;
            }
        }
    }
}