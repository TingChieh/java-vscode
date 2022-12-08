package learning.date20221208;

public class 两个求和方法的重载3 {
    public static double add(int num1, double num2) {
        return num1 + num2;
    }

    public static double add(Double num1, int num2) {
        return (num1 + num2) * 2;
    }
    // 定义方法

    public static void main(String[] args) {
        // 调用方法
        System.out.println("整数和实数的和为:"+add(2, 3.5));
        System.out.println("实数和整数的和为:"+ add(3.5, 2));
    }
}
