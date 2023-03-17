package domyself.hashstudy;

import java.util.HashSet;

public class LearnHashMap {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();

        // 说明
        // 1.在执行 add 方法后，会返回一个 booLean 值
        // 2.如果添加成功，返回 true ,否则返回 false
        // 3.可以通过 remove 指定删除哪个对象

        System.out.println(set.add("john"));// true
        System.out.println(set.add("lucy"));// true
        System.out.println(set.add("john"));// false
        System.out.println(set.add("jack"));// true
        System.out.println(set.add("Rose"));// true

        set.remove("john");
        System.out.println("set=" + set);

        //
        set = new HashSet<>();
        System.out.println("set=" + set); // 0
        // 4 Hashset 不能添加相同元素 / 数据
        set.add("lucy");// 添加成功
        set.add("lucy");// 添加失败
        set.add(new Dog("tom"));// OK
        set.add(new Dog("tom"));// OK
        System.out.println("set=" + set);

        // 在加深一下，非常经典的面试题。
        set.add(new String("hsp")); // OK
        set.add(new String("hsp")); // 加入不了
        System.out.println("set=" + set);
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
