package before;

import java.util.Scanner;

public class netclass {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("請輸入一個值");
            int num = input.nextInt();
            for (int i = 0 , j = num; i <= num; i++ , j--) {
                System.out.println(i+"+"+j+"="+(i+j));
            }
        }
    }
}
