package learning.date20230314;

import java.util.LinkedList;

public class test {
    // 创建LinkedList对象
    private LinkedList<String> list = new LinkedList<String>();

    // 添加入队方法put()
    public void put(String str) {
        list.add(str);
    }

    // 添加出队方法remove()
    public String remove() {
        return list.remove();
    }

    // 判断队列是否为空方法isEmpty()，为空则返回true，不为空返回false
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        // 创建Test2对象，入队元素依次为“小明”、“小红”、“小黄”，尝试出队，并判断队列是否为空
        test test = new test();
        test.put("小明");
        test.put("小黄");
        test.put("小红");
        while (!test.isEmpty()) {
            System.out.println(test.remove());
        }
        System.out.println(test.isEmpty());
    }
}
