package domyself.domyself20221216;

import java.util.Scanner;

// 有5个班各5名学生某门课程的成绩，如何计算5个班各自的总成绩
public class ClassScoreTotal {
    public static void main(String[] args) {
        int[][] scores = new int[2][5]; // 第一个5代表5个班，第二个5代表是每个班5个同学的成绩
        // 为班级的同学赋值
        // 外层循环 - 班 内层循环-班里的同学
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < scores.length; i++) {
            System.out.println("---第" + (i + 1) + "个班---");
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print("请输入第" + (i + 1) + "个班第" + (j + 1) + "个同学的成绩: ");
                scores[i][j] = input.nextInt();
            }
        }
        // 计算5个班级的成绩统计
        System.out.println("---统计成绩---");

        for (int i = 0; i < scores.length; i++) {
            int sum = 0; // 每个班同学成绩的总分
            for (int j = 0; j < scores[i].length; j++) {
                sum += scores[i][j];
            }
            System.out.println("第" + (i + 1) + "个班的同学总成绩为: " + sum);
        }
        input.close();
    }
}
