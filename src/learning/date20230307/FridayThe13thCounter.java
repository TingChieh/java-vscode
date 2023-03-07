package learning.date20230307;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FridayThe13thCounter {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate tenYearsLater = today.plusYears(10);
        int count = 0;
        LocalDate date = LocalDate.of(today.getYear(), today.getMonth(), 13);
        while (date.isBefore(tenYearsLater)) {
            DayOfWeek dow = date.getDayOfWeek();
            if (dow == DayOfWeek.FRIDAY) {
                System.out.println(date);
                count++;
            }
            date = date.plusMonths(1);
        }
        System.out.println("There are " + count + " Friday the 13ths in the next 10 years.");
    }
}
