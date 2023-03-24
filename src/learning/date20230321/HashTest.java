package learning.date20230321;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

@SuppressWarnings({ "all" })
public class HashTest {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        Student stu1 = new Student("001", "Mike", 18, "Beijing");
        Student stu2 = new Student("002", "Smith", 20, "Shanghai");
        Student stu3 = new Student("003", "Jack", 19, "Jiangsu");
        // 以no为key，student对象为value保存到map中
        map.put(stu1.getNo(), stu1);
        map.put(stu2.getNo(), stu2);
        map.put(stu3.getNo(), stu3);

        // 如果该映射包含指定键的映射关系，返回true
        // 根据学号no判断映射中是否包含对象stu1
        System.out.println(map.containsKey(stu1.getNo()));

        // 根据学生对象判断是否包含对象stu2
        System.out.println(map.containsValue(stu2));

        // 返回指定键stu3.getNo所映射的值
        Student stu = (Student) map.get(stu3.getNo());
        System.out.println(stu.getName());

        // 返回此映射所包含的映射关系的Set视图
        // Map的entrySet()方法返回一个实现Map.Entry接口的对象集合
        Set entry = map.entrySet();
        Iterator it1 = entry.iterator();
        // 怎么输出对应的学生信息？在Student类中重写toString方法
        while (it1.hasNext()) {
            System.out.println(it1.next());
        }

        // 返回此映射所包含的键的Set视图
        Set keys = map.keySet();
        Iterator it2 = keys.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        // 遍历HashMap中的values
        Collection stuValues = map.values();
        Iterator it3 = stuValues.iterator();
        while (it3.hasNext()) {
            System.out.println(it3.next());
        }

        // 删除此映射中指定键的映射关系（如果存在）
        System.out.println("删除前的map.size():" + map.size());
        map.remove(stu2.getNo());
        System.out.println("删除后的map.size():" + map.size());

        // 删除所有映射关系
        System.out.println("清除前的map.size():" + map.size());
        map.clear();
        System.out.println("清除后的map.size():" + map.size());
    }
}
