package learning.date20230307;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class DateDiff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入日期（格式为yyyy-M-d）：");
        String dateStr = scanner.nextLine();
        scanner.close();

        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-M-d");
            Calendar date = Calendar.getInstance();
            date.setTime(format.parse(dateStr));

            Calendar start = Calendar.getInstance();
            start.set(1949, 10, 1);

            long diff = (date.getTimeInMillis() - start.getTimeInMillis()) / (1000 * 60 * 60 * 24);
            System.out.println("该日期与1949年10月1日之间相差 " + diff + " 天。");
        } catch (Exception e) {
            System.out.println("日期格式不正确！");
        }
    }
}
