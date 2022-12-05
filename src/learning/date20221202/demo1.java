package learning.date20221202;

import java.util.Arrays;

public class demo1 {

    public static class Main {
        public static int Add(int a, int b) {
            return (a + b);
        }

        public static double B(Double a, Double b) {
            return (a / b);
        }

        public static void main(String[] args) {
            int[] nums = { 2, 4, 3, 436, 26 };
            int[] nums2 = { 666, 999, 888, 689 };

            System.out.println(Arrays.toString(nums));

            System.out.println(Add(6, 7));

            int scores[] = Arrays.copyOf(nums, 8);
            System.out.println(Arrays.toString(scores));

            System.arraycopy(nums, 2, nums2, 1, 1);
            System.out.println(Arrays.toString(nums2));

            int[] copy = nums.clone();
            System.out.println(Arrays.toString(copy));
        }
    }
}