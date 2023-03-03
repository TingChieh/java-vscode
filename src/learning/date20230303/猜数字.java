package learning.date20230303;

import java.util.Scanner;

public class 猜数字 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = (int) (Math.random() * 50) + 1;
        int count = 0;
        System.out.println("请输入一个 1-50 的任意数字");
        while (true) {
            int guess = input.nextInt();
            count++;
            if (guess < target) {
                System.out.println("猜错了，猜小了，请再猜一次。");
            } else if (guess > target) {
                System.out.println("猜错了，猜大了，请再猜一次。");
            } else {
                System.out.println("恭喜你，猜对了！");
                System.out.println("你猜了" + count + "次。");
                break;
            }
        }
        input.close();
    }
}
