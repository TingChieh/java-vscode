package schoolOJ;

import java.util.Arrays;
import java.util.Scanner;

public class oj1044 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        Arrays.sort(nums);
        System.out.print(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        input.close();
    }
}
