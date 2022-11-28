package domyself20221125;

import java.util.Scanner;

public class 购物金额结算 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("请输入会员本月消费记录");
            double[] list = new double[5];
            for (int i = 0; i < list.length; i++) {
                System.out.println("请输入第" + (i + 1) + "笔消费金额");
                list[i] = input.nextDouble();
            }
            double sum = 0;
            System.out.println("序号\t\t金额");
            for (int i = 0; i < list.length; i++) {
                System.out.println((i + 1)+"\t\t"+list[i]);
                sum += list[i];
            }
            System.out.println("总金额\t\t"+sum);
        }
    }
}