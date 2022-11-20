package before;

public class 课堂while {
    public static void main(String[] args) {
        double a = 1,b = 2,num = 0,sum = 0;
        while (num<10) {
            sum += a/b;
            double x = a;
            a = b;
            b = x + b;
            num++;
            System.out.println(sum);
        }
    }
}
