package domyself.domyself20230215;

import java.util.Scanner;

public class TestVisitor {
    // 测试类，构建游客类对象 构建流程
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Visitor v = new Visitor();
        boolean flag = true; // true: 用户输入的姓名不是n，循环。反之退出程序

        do {
            System.out.println("请输入姓名");
            String name = input.next();
            if (!name.equals("n")) {
                v.name = name; // 将用户键盘录入的姓名赋值给 v 对象 name
                System.out.println("请输入年龄");
                int age = input.nextInt();
                v.age = age;
                v.showPrice();
            } else {
                flag = false;
            }
        } while (flag);
        System.out.println("退出程序");
        input.close();
    }
}
