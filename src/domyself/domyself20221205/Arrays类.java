package domyself.domyself20221205;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays类 {

    public static void main(String[] args) {
        //用Arrays 排序5名学员的成绩
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("请输入5名同学的成绩:");
            int[] scores = new int[5];
            for (int i = 0; i < scores.length; i++) {
                System.out.println("请输入第" + (i + 1) + "名同学的成绩");
                scores[i] = input.nextInt();
            }
            System.out.println("Arrays排序前");
            for (int num : scores) {
                System.out.println(num);
            }

            // Arrays排序（降序）
            Arrays.sort(scores);
            
            System.out.println("Arrays排序后(升序)");
            for (int num : scores) {
                System.out.println(num);
            }
            System.out.println("Arrays排序后(降序)");
            for (int i = scores.length-1; i >= 0; i--) {
                System.out.println(scores[i]);
            }
        }
    }
}
