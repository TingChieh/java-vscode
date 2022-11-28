package domyself20221125;

import java.util.Scanner;

public class 求出4家店最低的手机价格 {
    public static void main(String[] args) {
        double[] prices = new double[4];
        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < prices.length; i++) {
                System.out.println("请输入第" + (i+1) + "家店的手机价格");
                prices[i] = input.nextInt();
            }
        }
        double min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i]<min) {
                min = prices[i];
            }
        }
        System.out.println("4个手机店铺最低价格为" + min);
    }
}

