import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double sum = 0;
            System.out.println("输入班级人数");
            int num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                System.out.println("请输入第" + i + "的成绩：");
                double score = input.nextDouble();
                sum = sum + score;
                double avg = sum/num;
                System.out.println("平均分为"+avg);
            }
        }
    }
}