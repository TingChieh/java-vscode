import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int sum = 0;
        for(int a = 0; a <= 100;a = a+2) {
            if (a%2 == 0)
            sum+=a;
            System.out.println("for循环相加"+sum);
        }
    }
}