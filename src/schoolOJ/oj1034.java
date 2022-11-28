package schoolOJ;

import java.util.*;

public class oj1034 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int[] b = new int[a];
            for (int i = 0; i < a; i++) {
                b[i] = input.nextInt();
            }
            int min = b[0];
            int max = b[0];
            for (int i = 0; i < a; i++) {
                if (min > b[i])
                    min = b[i];
                if (max < b[i])
                    max = b[i];
            }
            System.out.println(max);
            System.out.println(min);
        }
    }
}