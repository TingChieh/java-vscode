package schoolOJ;

public class oj1038 {
    public static void main(String[] args) {
        for (int i = 100007; i < 999997; i = i + 10) {
            int num1 = i / 10;
            int num2 = num1+700000;
            if (i * 4 == num2) {
                System.out.println(i);
            }
        }
    }
}
