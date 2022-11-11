import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("是否合格？（Y/N）");
        String answer = input.next();
        while ("N".equals(answer)) {
            System.out.println("上午学习");
            System.out.println("下午学习");
            System.out.println("合格了吗？");
            answer = input.next();
        }
        System.out.println("恭喜完成！");

    }
}