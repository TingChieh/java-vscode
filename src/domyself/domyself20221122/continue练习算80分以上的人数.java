package domyself.domyself20221122;

import java.util.Scanner;

public class continue练习算80分以上的人数 {
    public static void main(String[] args) {
        try (// contitue 只能用在循环里
                // continue 作用：跳过循环体中的剩余的语句而执行下一次循环
        Scanner input = new Scanner(System.in)) {
            System.out.println("请输入班级总人数");
            int total = input.nextInt();
            int score = 0;
            int num = 0;
            for (int i = 1; i <= total; i++) {
                System.out.println("请录入第" + i + "的成绩");
                score = input.nextInt();
                //不适用continue的方法
                // if (score >= 80) {
                //     num++;
                // }
                if (score<80) {
                    continue;
                }
                num++;
            }
            System.out.println("80分以上的人数为"+num);
            double percent = (double)num / total * 100;
            System.out.println("80分以上的比例为"+percent+"%");
        }
    }
}
