package domyself.domyself20230216;

import java.util.Scanner;

public class TestStudentMgr {
    public static void main(String[] args) {
        StudentMgr mgr = new StudentMgr();
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第" + (i + 1) + "个同学的姓名");
            String name = input.next();
            mgr.addName(name);
        }
        mgr.showNames();
        // 查找某个学生的信息
        System.out.println("请输入要开始查找的位置");
        int start = input.nextInt();
        System.out.println("请输入要结束查找的位置");
        int end = input.nextInt();
        System.out.println("请输入要查找的学生姓名");
        String findName = input.next();
        // 查找代码方式一；
        boolean flag00 = mgr.searchName(start, end, findName);
        if (flag00) {
            System.out.println("恭喜您，查到了该生姓名");
        } else {
            System.out.println("对不起，该生不在我们班级");
        }
        // 查找代码方式二：
        if (mgr.searchName(start, end, findName)) {
            System.out.println("恭喜您，查到了该生姓名");
        } else {
            System.out.println("对不起，该生不在我们班级");
        }
        input.close();
    }
}
