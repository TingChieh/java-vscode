package domyself.domyself20221128;

import java.util.Scanner;

public class 数组中插入元素 {
    public static void main(String[] args) {
        // 通过数组存储原来的5个成绩
        int[] list = new int[6];
        list[0] = 99;
        list[1] = 85;
        list[2] = 82;
        list[3] = 63;
        list[4] = 60;

        try (// 获取用户要插入的数值
        Scanner input = new Scanner(System.in)) {
            System.out.println("请输入你要插入的数值");
            int num = input.nextInt();
            // 找到 num 要插入的位置 index ：找到 num 比数组中元素（第一个）大的位置
            // 当用户插入一个比原数组所有数都小的数值时，如下代码就有问题
            // int index = 0;
            int index= list.length - 1;
            for (int i = 0; i < list.length; i++) {
                if (num > list[i]) {
                    index = i;
                    break;
                }
            }
            // 原 index 位置及以后的所有数据要整体往后挪
            for (int i = list.length - 1; i > index; i--) {
                list[i] = list[i - 1];  //当list.length - 1:5  list[5] = list[4] 以此类推
            }
            // 在 index 位置将 num 插入进来
            list[index] = num;
            System.out.println("插入成绩的小标是："+index);
        }
        System.out.println("插入数值后的最后成绩是：");
        for (int listNum : list) {
            System.out.print(listNum+"\t");
        }
    }
}
