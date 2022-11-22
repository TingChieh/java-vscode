package date20221122;

public class test3 {
    public static void main(String[] args) {
        int i=1;
        int sum = 0;
        for (; ; i++) {
            sum += i;
            if (sum > 1000) {
                break;
            }
        }
		System.out.println(i);
	}
}