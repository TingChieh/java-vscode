package learning.date20230307;

import java.time.DayOfWeek; // 导入 DayOfWeek 枚举类型，用于获取星期几
import java.time.LocalDate; // 导入 LocalDate 类，用于日期计算

public class FridayThe13thCounter { // 定义 FridayThe13thCounter 类

    public static void main(String[] args) { // 主方法
        LocalDate today = LocalDate.now(); // 获取今天的日期
        LocalDate tenYearsLater = today.plusYears(10); // 获取10年后的日期
        int count = 0; // 定义计数器，统计未来10年内的13号星期五的个数
        LocalDate date = LocalDate.of(today.getYear(), today.getMonth(), 13); // 获取今天月份的13号日期
        while (date.isBefore(tenYearsLater)) { // 循环直到10年后
            DayOfWeek dow = date.getDayOfWeek(); // 获取日期对应的星期几
            if (dow == DayOfWeek.FRIDAY) { // 判断是否是星期五
                System.out.println(date); // 输出日期
                count++; // 计数器加1
            }
            date = date.plusMonths(1); // 日期加1个月
        }
        System.out.println("There are " + count + " Friday the 13ths in the next 10 years."); // 输出统计结果
    }
}
