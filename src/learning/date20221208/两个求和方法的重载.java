package learning.date20221208;

public class 两个求和方法的重载 {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        System.out.println("两个整数的和为:" + add(2, 3));
        System.out.println("三个整数的和为:" + add(2, 3, 4));
    }
}
