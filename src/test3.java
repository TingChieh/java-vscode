public class test3 {
    public static void main(String[] args) {
        int a, b, i = 0, sum = 0;
        for (a = 1000; a > 3 & i <= 10; a--) {
            boolean flag = true;
            for (b = 3; b < 1000; b++) {
                if (a % b == 0)
                    flag = false;
                break;
            }
            if (flag == true) {
                System.out.println(a);
            }
        }
    }
}
