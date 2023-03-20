package schoolOJ;

import java.util.Scanner;

public class oj1048 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        if (t == 12) {
            String apm = input.next();
            int h = input.nextInt();
            int m = input.nextInt();
            int s = input.nextInt();
            if (apm.equals("PM")) {
                h += 12;
            }
            System.out.printf("%02d:%02d:%02d\n", h % 24, m, s);
        } else {
            int h = input.nextInt();
            int m = input.nextInt();
            int s = input.nextInt();
            if (h > 12 && h <24) {
                h -= 12;
                System.out.printf("PM %02d:%02d:%02d\n", h, m, s);
            } else if (h == 24) {
                System.out.printf("AM %02d:%02d:%02d\n", h - 24, m, s);
            } else {
                System.out.printf("AM %02d:%02d:%02d\n", h, m, s);
            }
        }
        input.close();
    }
}
