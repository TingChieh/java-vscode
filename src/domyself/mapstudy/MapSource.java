package domyself.mapstudy;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({ "all" })
public class MapSource {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("no1", "Amy");// k-v
        map.put("no2", "Jack");// k-v
        map.put(new Car(), new Person());// k-v

        // 1. k-v 最后是 HashMap$Node node = newNode (hash, key, value, nuLl)
        // 2. k-v 为了方便程序员的遍历，还会 创建 EntrySet 集合 ，该集合存放的元素的类型 Entry，而一个 Entry
        // 对象就有 K,V Entry<Entry<K,V>> 即：transient Set<Map.Entry<K,V>> entrySet;
        // 3. entrySet 中，定义的类型是 Map.Entry，但是实际上存放的还是 HashMap$Node
        // 这时因为 HashMap$Node implements Map.Entry static class Node<K,V> implements
        // Map.Entry<K,V>
        // 4. 当把这个 HashMap$Node 对象 存放到 entrySet 就方便我们的遍历，因为 Map.Entry 提供了重要的方法
        // K getKey(); V getValue();

        Set set = map.entrySet();
        System.out.println(set.getClass()); // HashMap$EntrySet
        for (Object obj : set) {
            // System.out.println(obj.getClass()); // HashMap$Node
            // 为了从 HashMap$Node 取出 k-v
            // 1. 先做一个向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());

    }
}

class Car {

}

class Person {

}