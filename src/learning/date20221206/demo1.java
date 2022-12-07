package learning.date20221206;

import java.util.Arrays;

public class demo1 {
    public static void main(String[] args) {
        int[][] s = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(s[1][2]);
        // for 循环
        for (int i = 0; i < s.length; ++i) {
            for (int j = 0; j < s[i].length; ++j)
                System.out.print(s[i][j]);
        }
        System.out.println();
        // foreach
        for (int[] is : s) {
            for (int js : is) {
                System.out.print(js);
            }
        }
        System.out.println();
        // Arrays 工具类的 toString 方法
        System.out.println(Arrays.deepToString(s));

        int b = 10;
        System.out.println(b);
        System.out.println("二级制: " + Integer.toBinaryString(b));
        System.out.printf("八级制:" + "%o", b);
        System.out.printf("八级制:" + "%#o", b);
        System.out.println("十级制:" + b);
        System.out.printf("十六级制:" + "%X", b);
        System.out.printf("十六级制:" + "%#X", b);
        System.out.println();
    }
}
