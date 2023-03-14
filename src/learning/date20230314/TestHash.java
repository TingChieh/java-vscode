package learning.date20230314;

import java.util.HashSet;
import java.util.Iterator;

public class TestHash {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("pear");
        set.add("apple");
        System.out.println(set.size());
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
