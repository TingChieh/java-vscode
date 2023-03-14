package learning.date20230314;

import java.util.Scanner;
import java.util.Stack;

public class T {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入孩子的个数：");
        int n = input.nextInt();
        Stack<Integer> st = new Stack<>(); // 创建一个Stack对象
        input.close(); // 关闭Scanner对象
        for (int i = 1; i < n; i++) {
            st.add(i); // 将1至n-1的数字入栈
        }
        for (;;) { // 无限循环
            if (st.size() == 1) // 当栈中只有一个元素时，退出循环
                break;
            for (int k = 0; k < 2; k++) // 将栈顶元素往后移两个位置
                st.add(st.remove(0));
            st.remove(0); // 将第三个元素出栈
        }
        System.out.println(st); // 输出栈中剩下的元素，即最后剩下的孩子
    }
}
