package domyself.domyself20221121;

import java.util.Scanner;

public class 输出数字三角形 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("你想输入几行数字？");
            int line = input.nextInt();
            for (int i = 1; i <= line; i++) {
                for (int j = 1; j <= line-i; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2*i-1; j++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
