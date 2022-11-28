package schoolOJ;
import java.util.*;

public class oj1026 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            int year1 = input.nextInt(), mon1 = input.nextInt(), day1 = input.nextInt();
            int year2 = input.nextInt(), mon2 = input.nextInt(), day2 = input.nextInt();
            if (year1 < year2) {
                System.out.println("Yes");
            } else if (year1 == year2 && mon1 < mon2) {
                System.out.println("Yes");
            } else if (year1 == year2 && mon1 == mon2 && day1 < day2) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}