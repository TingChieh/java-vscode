package domyself20221122;

public class continue练习1至10的偶数和 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i%2!=0) {
                continue;
            }
            sum += i;
        }
        System.out.println("1-10之间的偶数和为"+sum);
    }
}