package schoolOJ;

import java.util.Arrays;
import java.util.Scanner;

public class oj1035 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int N = input.nextInt();
            int []scores = new int[N];
            for (int i = 0; i < N; i++) {
                scores[i] = input.nextInt();
            }
            Arrays.sort(scores);                                   //让输入从小到大排序**
            int max = scores[scores.length-1];						//取最大值**
            int min = scores[0];									//取最小值**
            int sum = 0;
            int length = scores.length-2;							//去掉最大值和最小值还有几个数**
            for (int i = 0;i<scores.length;i++) {
            	sum+=scores[i];									
            }
            double avg = (sum-max-min)/(length);					
            System.out.println(String.format("%.2f",avg));
        }
	}
}