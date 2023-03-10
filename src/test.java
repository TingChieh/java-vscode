import java.util.Scanner;

public class test {
    static class Node {
        int data; // 存储整数
        Node next; // 存储下一个结点的地址

        Node(int data) { // Node的构造函数，用于创建一个结点并存储整数data
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 创建一个Scanner对象用于读入输入
        Node head = null; // 链表头指针
        int x = sc.nextInt(); // 读入一个整数
        while (x != -1) { // 当读入整数不为-1时，创建一个新结点并将其加入链表头
            Node node = new Node(x);
            node.next = head;
            head = node;
            x = sc.nextInt();
        }

        Node p = head;
        while (p != null) { // 遍历链表并输出每个结点的整数值
            System.out.print(p.data + " ");
            p = p.next;
        }
        System.out.println();

        while (head != null) { // 逐个删除链表中的结点
            Node node = head;
            head = head.next;
            node.next = null;
        }
        sc.close();
    }
}
