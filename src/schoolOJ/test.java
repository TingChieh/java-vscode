package schoolOJ;

import java.util.*;

public class test {
    public static void main(String[] args) {
        System.out.println("请输入需要查询人的姓名: ");
        move();
    }

    public static void move() {
        Map<String, String> map = new HashMap<>();// 创建Map实例
        map.put("张三", "111111");
        map.put("李四", "222222");
        map.put("王五", "333333");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        if (map.containsKey(name) == true) {
            System.out.println(name + "的电话号码为: \n" + map.get(name));
        } else {
            System.out.println("电话薄中无此人，请重新输入: ");
            move();
        }
        scan.close();
    }
}
