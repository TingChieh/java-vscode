package domyself.domyself20221123;

import java.util.Scanner;

public class 数组 {
    public static void main(String[] args) {
        try (// int[] score = {100,90,80,78,90};
                // int[] score2 = new int[]{100,20};
                // System.out.println(score[0]);
                // System.out.println(score2[1]);
        Scanner input = new Scanner(System.in)) {
            double[] scores = new double[3];
            double avg = 0;
            double sum = 0;
            for (int i = 0; i < scores.length; i++) {
                System.out.println("第" + (i + 1) + "java分数");
                scores[i] = input.nextDouble();
                sum += scores[i];
            }
            // for (double score:scores) {
            //     sum+=score;
            // }
            avg = sum / scores.length;
            System.out.println("平均分" + avg);
        }
    }
}
