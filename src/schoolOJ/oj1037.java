package schoolOJ;

public class oj1037 {
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++) {
            if ((i / 100 + i % 100) * (i / 100 + i % 100) == i) {
                System.out.println(i);
            }
        }
    }
}
