import java.util.Scanner;
public class classpratice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        do {
            System.out.println("输入你的名字");
            name = input.next();
        } while (!name .equals("q"));
    }
}
