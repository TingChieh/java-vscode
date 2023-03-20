package domyself.mapstudy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({ "all" })

public class MapFor {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put("邓超", "孙俪");// 替换
        map.put("王宝强", "马蓉");// ok
        map.put("宋喆", "马蓉");// ok
        map.put("刘令博", null);// ok
        map.put(null, "刘亦菲");// ok
        map.put("鹿晗", "关晓彤");// ok

        // 第一组：先取出 所有的 Key ， 通过 Key 取出对应的 Value
        Set keySet = map.keySet();
        // (1) 增强 for
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        System.out.println("----------");
        // (2) 迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        // 第二组：把所有的 values 取出
        Collection values = map.values();
        // (1) 增强 for
        System.out.println("----------");
        for (Object value : values) {
            System.out.println(value);
        }
        // (2) 迭代器
        System.out.println("----------");
        Iterator iterator2 = keySet.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }

        // 第三组：通过 EntrySet 来获取 k-v
        Set entrySet = map.entrySet();// EntrySet<Map.Entry<K,V>>
        // (1) 增强 for
        System.out.println("----------");
        for (Object entry : entrySet) {
            // 将 entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        // (2) 迭代器
        System.out.println("----------");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry = iterator3.next();
            // System.out.println(next.getClass());// HashMap$Node -实现-> Map.Entry
            // (getKey,getValue)
            // 向下转型 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
    }
}
