package learning.date20230314;

import java.util.LinkedList;

public class testLinkedlist {
    // 创建LinkedList对象
    LinkedList<String> list = new LinkedList<>();

    // 定义入栈方法push()
    public void push(String element) {
        list.addFirst(element);
    }

    // 定义出栈方法remove()
    public String remove() {
        return list.removeFirst();
    }

    // 判断栈是否为空方法isEmpty()，为空则返回true，不为空返回false
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        // 创建Test对象，入栈元素依次为“小明”、“小红”、“小黄”，尝试出栈，并判断栈是否为空
        testLinkedlist t1 = new testLinkedlist();
        t1.push("Dog");
        t1.push("Mike"); 
        t1.push("Jack");

        while (!t1.isEmpty()) {
            System.out.println(t1.remove());
        }
        System.out.println(t1.isEmpty() );
    }
}
