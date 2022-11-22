package domyself20221122;

public class break运用 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        for (; i <= 10; i++) {
            sum += 1;
            if (sum>20) {
                break;
            }
        }
        System.out.println("1-10之间的整数相加，累加值大于20的当前数是"+i);
    }
}
