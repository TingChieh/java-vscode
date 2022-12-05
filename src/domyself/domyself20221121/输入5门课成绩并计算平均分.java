package domyself.domyself20221121;

import java.util.Scanner;

public class 输入5门课成绩并计算平均分 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("请输入姓名");
            String name = input.next();
            int sum = 0;
            boolean flag = true;
            for (int i = 1; i <= 5; i++) {
                System.out.println("请输入第"+i+"门课的成绩");
                int score = input.nextInt();
                if (score<0) {
                    flag = false;
                    break;
                }
                sum+=score;
            }
            if (flag) {
            double avg = sum / 5;
            System.out.println(name+"这个人的平均分为"+avg);
            }else{
                System.out.println("抱歉，请重新录入分数");
            }
        }
    }
}
