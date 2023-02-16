package domyself.domyself20230216;

// 简易计算器：方法重载的应用
public class Calc {
    //  加法：两个整数
    public void add(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(num1+"+"+num2+"="+sum);
    }

    // 加法：两个浮点数
    public void add(double num1, double num2) {
        double sum = num1 + num2;
        System.out.println(num1+"+"+num2+"="+sum);
    }

    //加法：三个浮点数
    public void add(double num1, double num2, double num3) {
        double sum = num1 + num2 + num3;
        System.out.println(num1+"+"+num2+num3+"="+sum);
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.add(4, 5);
        calc.add(7.0, 8.0);
        calc.add(8.0, 9, 52);
    }
}
