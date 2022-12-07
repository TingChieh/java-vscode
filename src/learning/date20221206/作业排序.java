package learning.date20221206;

public class 作业排序 {
    public static class demo2 {
        private static final int INSERTION_SORT_THRESHOLD = 0;

        public static void sort(int[] a, int left, int right, boolean leftmost) {
            int length = right - left + 1;

            // Use insertion sort on tiny arrays
            if (length < INSERTION_SORT_THRESHOLD) {
                if (leftmost) {
                    /*
                     * Traditional (without sentinel) insertion sort,
                     * optimized for server VM, is used in case of
                     * the leftmost part.
                     */
                    for (int i = left, j = i; i < right; j = ++i) {
                        int ai = a[i + 1];
                        while (ai < a[j]) {
                            a[j + 1] = a[j];
                            if (j-- == left) {
                                break;
                            }
                        }
                        a[j + 1] = ai;
                    }
                }
            }
        }

        public static void main(String[] args) {

        }
    }
}