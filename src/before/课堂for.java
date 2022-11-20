package before;

public class 课堂for {
    public static void main(String[] args) {
        double a = 1,b = 2,sum = 0;
        int num = 0;
        for (;num<10;) {
            sum += a/b;
            double x = a;
            a=b;
            b = x + b;
            num++;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
