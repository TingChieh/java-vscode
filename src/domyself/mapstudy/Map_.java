package domyself.mapstudy;

import java.util.HashMap;

@SuppressWarnings({ "all" })
public class Map_ {
    public static void main(String[] args) {
        // 使用实现类 HashMap
        // 1. Map 与 ColLection 并列存在。用于保存具有映射关系的数据: Key Value(双列元素)
        // 2. Map 中的 key 和 vaLue 可以是任何引用类型的数据，会封装到 HashMap$Node 对象中
        // 3. Map 中的 key 不允许重复，原因和 HashSet 一样，前面分析过源码
        // 4. Map 中的 value 可以重复
        // 5. Map 的 key 可以为 null, value 也可以为 null，注意 key 为 null,只能有一个 value 为 null ,可以多个
        //   只能有一个，vaLue 为nuLl，可以多个
        // 6. 常用 String 类作为 Map 的 key
        // 7. key 和 value 之间存在单向一对一关系，即通过指定的 key 总能找到对应的 value

        HashMap map = new HashMap();
        map.put("no1", "Amy");// k-v
        map.put("no2", "Jack");// k-v
        map.put("no1", "Mike");// 当有相同的 k ，就等价于替换。
        map.put("no3", "Mike");//  k-v
        map.put(null, null);// k-v
        map.put(null, "abc");// 等价替换
        map.put("no4", null);// k-v
        map.put("no5", null);// k-v
        map.put(1, "Andy");// 等价替换
        map.put(new Object(), "牛逼");// k-v

        // 通过 get 方法，传入一个 key ，会返回对应的 value
        System.out.println(map.get("no2"));// Jack
        System.out.println("map=" + map);
    }
}
