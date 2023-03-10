package learning.date20230310;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 1. 用三种构造方法创建ArrayList对象al
        // ArrayList<String> al1 = new ArrayList<String>();
        // ArrayList<String> al2 = new ArrayList<String>(10);
        // ArrayList<String> al3 = new ArrayList<String>(al2);
        
        // 2. 添加或删除元素
        ArrayList<String> al = new ArrayList<String>();
        al.add("stu3"); // 在末尾添加元素"stu3"
        al.add(0, "stu1"); // 在索引0位置添加元素"stu1"
        Collection<String> col = new ArrayList<String>();
        col.add("stu1");
        col.add("stu2");
        al.addAll(col); // 在集合末尾插入指定集合col的所有元素
        al.remove(1); // 删除索引1位置元素
        al.remove("stu1"); // 删除第一次出现的指定元素"stu1"
        
        // 3. 查询或修改元素
        System.out.println(al.get(0)); // 返回索引0位置元素
        System.out.println(al.indexOf("stu1")); // 第一次出现的指定元素"stu1"的索引
        al.set(0, "小明"); // 用指定元素“小明”替换列表中索引0位置的元素
        System.out.println(al.contains("小明")); // 判断此列表中是否包含指定的元素"小明"
        // String[] arr = al.toArray(new String[0]); // 返回包含此列表中所有元素的数组

        // Object[] array = (Object [])al.toArray();

        // 4. 遍历ArrayList
        for (String s : al) {
            System.out.println(s);
        }
    }
}
