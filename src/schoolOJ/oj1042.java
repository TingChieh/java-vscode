package schoolOJ;

import java.util.Scanner;

public class oj1042 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        int sum = 0;

        for (int i = 1980; i <= year - 1; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                sum += 366;
            } else {
                sum += 365;
            }
        }
        for (int i = 1; i <= month - 1; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    sum += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    sum += 30;
                    break;
                case 2:
                    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                        sum += 29;
                    } else {
                        sum += 28;
                    }
                    break;
            }
        }
        sum += day;
        int week = sum % 7;
        switch (week) {
            case 0:
                System.out.println("1");
                break;
            case 1:
                System.out.println("2");
                break;
            case 2:
                System.out.println("3");
                break;
            case 3:
                System.out.println("4");
                break;
            case 4:
                System.out.println("5");
                break;
            case 5:
                System.out.println("6");
                break;
            case 6:
                System.out.println("7");
                break;
        }
        input.close();
    }
}
