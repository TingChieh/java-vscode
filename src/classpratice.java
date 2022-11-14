public class classpratice {
    public static void main(String[] args) {
        double sum = 0;
        //1-20的累加
        for(double a = 0;a <= 20;a++) {
            if (a%5!=0 & a%3!=0) sum += a;
            if (sum > 100)break;
            System.out.print(sum);
        }
        System.out.println("\n"+sum);
    }
}
