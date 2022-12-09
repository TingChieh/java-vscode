package learning.date20221209;

public class 两个求和方法的重载2 {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        System.out.println("两个整数的和为:" + add(2, 3));
        System.out.println("两个实数的和为:" + add(2.5, 3.9));
    }
}
