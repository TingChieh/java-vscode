package learning.date20230307;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        // 1创建Date对象
        // 今天
        Date d = new Date();
        System.out.println(d);
        // 昨天
        Date d2 = new Date(d.getTime() - (60 * 60 * 24 * 1000));
        System.out.println(d2);
        // 2方法after before
        boolean b1 = d.after(d2);
        System.out.println(b1);
        boolean b2 = d.before(d2);
        System.out.println(b2);
        // 比较compareTo();|
        int d3 = d2.compareTo(d);
        System.out.println(d3);
        System.out.println(d);
        // 比较是否相等equals()
        boolean b3 = d.equals(d2);
        System.out.println(b3);

        Date  dNow = new Date ( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy年MM月dd hh:mm:ss");
   
        System.out.println("当前时间为: " + ft. format (dNow));
    }
}
