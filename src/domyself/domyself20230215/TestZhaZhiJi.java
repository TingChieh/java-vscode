package domyself.domyself20230215;

import java.util.Scanner;

public class TestZhaZhiJi {
    public static void main(String[] args) {
        ZhaZhiJi machine = new ZhaZhiJi();
        machine.color = "白色";
        machine.price = 340;
        machine.showInfo();

        Scanner input = new Scanner(System.in);
        System.out.println("你想要什么水果");
        String fruit = input.next();
        System.out.println("你想要几杯果汁");
        int num = input.nextInt();
        machine.ZhaZhi(fruit, num);
        input.close();
    }
}
