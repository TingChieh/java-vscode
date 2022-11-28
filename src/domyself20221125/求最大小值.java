package domyself20221125;

import java.util.Scanner;

public class 求最大小值 {
    public static void main(String[] args) {
        int[] scores = new int[5];
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < scores.length; i++) {
                System.out.println("请输入第" + (i+1) + "个同学的考试成绩");
                scores[i] = input.nextInt();
            }
        }
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]>max) {
                max = scores[i];
            }
        }
        System.out.println("此次考试成绩最高分为" + max);
    }
}
