package domyself20221125;

import java.util.Scanner;

public class 数组练习猜数游戏 {
    public static void main(String[] args) {
        int[] list = new int[] { 8, 4, 2, 1, 23, 344, 12 };
        int sum = 0;
        for(int num : list){
            System.out.println(num);
            sum += num;
        }
        System.out.println("数组元素总和为"+sum);

        try (Scanner input = new Scanner(System.in)) {
			System.out.println("请输入您要猜测的数字");
			int guess = input.nextInt();
			boolean iscorrect = false;
			for (int num : list) {
			    if (num == guess) {
			        iscorrect = true;
			        break;
			    }
			}
			if (iscorrect) {
			    System.out.println("恭喜你猜的数字在数列中存在");
			}else{
			    System.out.println("对不起你猜的数字不在数列中");
			}
		}
    }
}


