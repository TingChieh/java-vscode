import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("输入营销额");
            double a = input.nextDouble();
            System.out.println("营销额为:" + a + "美元");
            if (a > 1) {
                if (a <= 5000) {
                    System.out.println("提成8%");
                }
                if ((a > 5000) && (a <= 10000)) {
                    System.out.println("提成10%");
                }
                if (a > 10000)
                    System.out.println("提成12%");
            }
        }
    }
}
