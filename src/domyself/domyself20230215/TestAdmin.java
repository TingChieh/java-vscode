package domyself.domyself20230215;

import java.util.Scanner;

public class TestAdmin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 管理员信息
        Admin admin = new Admin();
        admin.userName = "admin";
        admin.password = "123456";
        // admin.showInfo();

        // 修改管理员密码
        System.out.print("请输入用户名：");
        String name = input.next();
        System.out.println("请输入密码：");
        String pwd = input.next();
        if (admin.userName.equals(name) && admin.password.equals(pwd)) {
            // 输入用户名和密码正确，有权限修改密码
            System.out.println("\n请输入新密码:");
            admin.password = input.next();
            System.out.println("修改密码成功，您的新密码为：" + admin.password);
        } else {
            // 输入用户名和密码错误，无权限修改密码
            System.out.println("用户名和密码不匹配，您没有权限修改管理员信息");
        }
        input.close();
    }
}
