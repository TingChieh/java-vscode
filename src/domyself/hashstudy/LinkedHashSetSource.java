package domyself.hashstudy;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"all"})
public class LinkedHashSetSource {
    public static void main(String[] args) {
        // 分析一下 LinkeHashSet 的底层机制
        Set<Object> set = new HashSet<>();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        // set.add(new Customer("刘", 1001));
        set.add(123);
        set.add("HSP");

        System.out.println("set=" + set);

        // 1. LinkedHashSet 加入顺序和取出元素/数据的顺序一致
        // 2. LinkedHashSet 底层维护的是一个 LinkedHashMap(是HashMap的子类)
        // 3. LinkedHashSet 底层结构 (数组 + 双向链表)
        // 4. 添加第一次时，直接将 数组 table 扩容到 16 , 存放的结点类型是 LinkedHashMap$Entry
        // 5. 数组是HashMap$Node[] 存放的元素/数据是 LinkedHashMap$Entry 类型
        /*
         * static cLass
         * Entry<K, V>extends HashMap 。Node<K,V> {
         * Entry<K,V> before, after;
         * Entry(int hash, K key, V value, Node<K,V> next) {
         * super(hash, key, yalue, next) ;
         * }
         * }
         */
    }
}

// class Customer {
//     private String name;
//     private int no;

//     public Customer(String name, int no) {
//         this.name = name;
//         this.no = no;
//     }
// }
