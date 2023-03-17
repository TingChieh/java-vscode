package learning.date20230317;

import java.util.HashMap;

public class T {
    public static void main(String[] args) {
        HashMap<String, NoStudent> map = new HashMap<>();
        NoStudent stu1 = new NoStudent("001", "小明", 17, "苏州");
        NoStudent stu2 = new NoStudent("002", "小红", 20, "常州");
        NoStudent stu3 = new NoStudent("003", "小兰", 14, "杭州");

        // 以 NoStudent 对象的 no 为 key，NoStudent 对象为 value 保存到 map 中
        map.put(stu1.getNo(), stu1);
        map.put(stu2.getNo(), stu2);
        map.put(stu3.getNo(), stu3);

        // 通过 key 获取对应的 value
        NoStudent result = map.get("002");
        System.out.println(result.getName()); // 输出：小红
    }
}
