public class 课堂dowhile {
    public static void main(String[] args) {
        double a = 1,b = 2,num = 0,sum = 0;
        do {
            sum += a/b;
            double x = a;
            a = b;
            b = x + b;
            num++;
        } while (num<10);
        System.out.println(sum);
    }
}
