package learning.date20230314;

import java.util.Scanner;

public class LastChildStanding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入孩子的个数：");
        int n = input.nextInt();
        // 创建循环链表
        // 创建节点head，并将其数据域设为1
        Node head = new Node(1);
        // 创建节点current，并将其指向head
        Node current = head;
        // 创建for循环，从2到n依次创建节点，并添加到循环链表中
        for (int i = 2; i <= n; i++) {
            current.next = new Node(i);
            current = current.next;
        }
        // 将链表闭合，即将最后一个节点的next指向head
        current.next = head;

        // 依次报数，直到只剩下一个孩子
        // 创建节点prev，并将其指向链表最后一个节点
        Node prev = current;
        // 将节点current指向链表的头节点
        current = head;
        // 创建计数器count，初始值为0
        int count = 0;
        // 创建while循环，只要链表中还有超过一个孩子，就继续循环
        while (current.next != current) { // 只剩一个孩子时退出循环
            // 计数器加1
            count++;
            // 如果计数器等于3，表示报到3的孩子要出列
            if (count == 3) { // 报到3的孩子出列
                // 将prev的next指向current的下一个节点，即将current从链表中删除
                prev.next = current.next;
                // 计数器清零
                count = 0;
            } else {
                // 如果计数器不等于3，则将prev指向current，继续循环
                prev = current;
            }
            // 将current指向下一个孩子
            current = current.next;
        }
        // 关闭Scanner对象input
        input.close();
        // 输出最后剩下的孩子编号
        System.out.println("最后剩下的孩子是第" + current.data + "个孩子。");
    }
}

// 循环链表的节点类
class Node {
    // 数据域，用于存储节点的值
    int data;
    // 指针域，用于指向下一个节点
    Node next;

    // 构造函数，用于创建一个新的节点
    public Node(int data) {
        // 将数据域设为传入的参数
        this.data = data;
    }
}
