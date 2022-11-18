import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("请输入第一个数");
            double a = input.nextDouble();
            System.out.println("请输入第二个数");
            double b = input.nextDouble();
            System.out.println("请输入第三个数");
            double c = input.nextDouble(); 
            if((a > b) && (a > c)) {
                if (b > c) {
                System.out.println(a+" "+b+" "+c);
                }else{
                    System.out.println(a+" "+c+" "+b);
                }
            }
            if((b > a) && (b > c)) {
                if (a > c) {
                    System.out.println(b+" "+a+" "+c);
                }else{
                    System.out.println(b+" "+c+" "+a);
                }
            }
            if ((c > a) && (c > b)) {
                if (a > b) {
                    System.out.println(c+" "+a+" "+b);
                }else{
                    System.out.println(c+" "+b+" "+a);
                }
            }
        }
    }
}
