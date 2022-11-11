import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // 素数指大于1的整数中，只能被1和自身整除的正整数
        // 输入数字a，输出1-a中的所有素数
        int a = input.nextInt();
        for(int b = 1;b<=a;b++) {
            boolean f = true;
            //定义变量f为真，假设默认b是一个素数
        // 判断b是否是一个素数，让b分别对2到b-1取余
        // 定义变量c来表示2到b-1这些数
            for (int c = 2; c < b; c++) {
                // 如果存在c能够使得b%c==0成立
                // 说明b有另外一个因子c，那么b就不是一个素数，则修改f的值为假
                if(b % c == 0)f = false;
            }
            // 最后如果f为真，那么b就是一个素数
            if(f)System.out.println(b);
        }
    }
}