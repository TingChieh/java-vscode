import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class netclass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name:");
        String name = input.next();
        double sum = 0;
        for(int i = 1;i <= 5;i++) {
            System.out.println("每一门成绩中的第"+i+"门成绩为：");
            double score = input.nextDouble();
            sum = sum+score;
        }
        double avg = sum/5;
        System.out.println("平均分为"+avg);
    }
}
