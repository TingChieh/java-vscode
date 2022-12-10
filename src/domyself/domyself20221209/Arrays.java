package domyself.domyself20221209;

import java.util.Scanner;

public class Arrays {
  // 判断给定的年份是否是闰年
  public static boolean isLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    }
    if (year % 100 == 0) {
      return false;
    }
    if (year % 4 == 0) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    // 存储每个月份的天数
    int[] daysOfMonth = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    // 读入年、月、日
    Scanner scan = new Scanner(System.in);
    int year = scan.nextInt();
    int month = scan.nextInt();
    int day = scan.nextInt();

    // 计算总天数
    int days = 0;

    // 遍历每一个月份，累加对应月份的天数
    for (int i = 1; i < month; i++) {
      // 如果当前月份是2月，判断是否是闰年，若是则加上29天，否则加上28天
      if (i == 2) {
        days += isLeapYear(year) ? 29 : 28;
      } else {
        days += daysOfMonth[i];
      }
    }

    // 根据输入的日期计算出对应的总天数
    days += day;

    // 将总天数对7取模
    int weekday = days % 7;

    // 根据模值输出对应的星期几
    switch (weekday) {
      case 1:
        System.out.println(1);
        break;
      case 2:
        System.out.println(2);
        break;
      case 3:
        System.out.println(3);
        break;
      case 4:
        System.out.println(4);
        break;
      case 5:
        System.out.println(5);
        break;
      case 6:
        System.out.println(6);
        break;
      case 0:
        System.out.println(7);
        break;
    }
  }
}
