import java.util.Scanner;

import org.junit.platform.reporting.shadow.org.opentest4j.reporting.events.java.FileEncoding;

import javafx.scene.input.ScrollEvent;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
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