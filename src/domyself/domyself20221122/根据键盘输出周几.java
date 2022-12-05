package domyself.domyself20221122;

import java.util.Scanner;

public class 根据键盘输出周几 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int num = 0;
            do {
                System.out.println("请输入1-7之间的数字，输入0则退出程序");
                num = input.nextInt();
                if (num<0 || num >7) {
                    System.out.println("请输入正确的数字");
                    continue;
                }
                switch (num) {
                    case 1:
                        System.out.println("星期一");
                        break;
                    case 2:
                        System.out.println("星期二");
                        break;
                    case 3:
                        System.out.println("星期三");
                        break;
                    case 4:
                        System.out.println("星期四");
                        break;
                    case 5:
                        System.out.println("星期五");
                        break;
                    case 6:
                        System.out.println("星期六");
                        break;
                    case 7:
                        System.out.println("星期日");
                }
            } while (num != 0);
        }
        System.out.println("Thanks for using!");
    }
}
