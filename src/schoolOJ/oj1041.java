package schoolOJ;

public class oj1041 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 1992; i++) {
            num = (num*1992)%100;
        }
        System.out.println(num);
    }
}
