package schoolOJ;

import java.util.*;

public class oj1025 {
    public static void main(String args[]) {
        try (Scanner input = new Scanner(System.in)) {
            long time = input.nextLong(), hour, min, s;
            hour = time / 3600;
            min = (time % 3600) / 60;
            s = (time % 3600) % 60;
            if (time >= 0 && time < 86400) {
                if (hour < 10 && min < 10 && s < 10) {
                    System.out.println("0" + hour + ":0" + min + ":0" + s);
                } else if (hour < 10 && min < 10) {
                    System.out.println("0" + hour + ":0" + min + ":" + s);
                } else if (hour < 10 && s < 10) {
                    System.out.println("0" + hour + ":" + min + ":0" + s);
                } else if (hour < 10) {
                    System.out.println("0" + hour + ":" + min + ":" + s);
                } else if (min < 10 && s < 10) {
                    System.out.println(hour + ":0" + min + ":0" + s);
                } else if (min < 10) {
                    System.out.println(hour + ":0" + min + ":" + s);
                } else if (s < 10) {
                    System.out.println(hour + ":" + min + ":0" + s);
                }else {
                    System.out.println(hour+":"+min+":"+s);
                }
            }
        }
    }
}