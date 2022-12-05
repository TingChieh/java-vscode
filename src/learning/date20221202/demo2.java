package learning.date20221202;

import java.util.Arrays;

public class demo2 {
    public static class Main {
        public static int Add(int a, int b) {
            return (a + b);
        }
    }

    public static void main(String[] args) {
        int []nums = {22,33,99,55,66,77,88};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); 
        System.out.println(Arrays.binarySearch(nums, 22));
    }
}
