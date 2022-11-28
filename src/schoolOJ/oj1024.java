package schoolOJ;
import java.util.*;

public class oj1024 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            Long mon = input.nextLong(), day = input.nextLong(), year = input.nextLong();
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10) {
                    if (day < 31) {
                        System.out.println(mon + "/" + (day + 1) + "/" + year);
                    } else {
                        System.out.println((mon + 1) + "/1/" + year);
                    }
                } else if (mon == 2) {
                    if (day < 29) {
                        System.out.println(mon + "/" + (day + 1) + "/" + year);
                    } else {
                        System.out.println((mon + 1) + "/1/" + year);
                    }
                } else if (mon == 12) {
                    if (day < 31) {
                        System.out.println(mon + "/" + (day + 1) + "/" + year);
                    } else {
                        System.out.println("1/1/" + (year + 1));
                    }
                } else {
                    if (day < 30) {
                        System.out.println(mon + "/" + (day + 1) + "/" + year);
                    } else {
                        System.out.println((mon + 1) + "/1/" + year);
                    }
                }
            } else {
                if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10) {
                    if (day < 31) {
                        System.out.println(mon + "/" + (day + 1) + "/" + year);
                    } else {
                        System.out.println((mon + 1) + "/1/" + year);
                    }
                } else if (mon == 2) {
                    if (day < 28) {
                        System.out.println(mon + "/" + (day + 1) + "/" + year);
                    } else {
                        System.out.println((mon + 1) + "/1/" + year);
                    }
                } else if (mon == 12) {
                    if (day < 31) {
                        System.out.println(mon + "/" + (day + 1) + "/" + year);
                    } else {
                        System.out.println("1/1/" + (year + 1));
                    }
                } else {
                    if (day < 30) {
                        System.out.println(mon + "/" + (day + 1) + "/" + year);
                    } else {
                        System.out.println((mon + 1) + "/1/" + year);
                    }
                }
            }
        }
    }
}