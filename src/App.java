import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.next();
        do {
            System.out.println("测试");
            System.out.print("是否合格？(Y/N)");
            num = input.next();
        } while (!"Y" .equals(num));
        System.out.println("完成！");
    }
}