package learning.date20230307;

import java.util.Scanner;

public class ConvertMoneyToUpperCase {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入小写金额：");
        double amount = input.nextDouble();

        // 数字转为大写金额
        String[] digit = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" }; // 数字
        String[] unit = { "", "拾", "佰", "仟", "万", "亿" }; // 单位
        String integerPart = getIntegerPart(amount); // 整数部分
        String decimalPart = getDecimalPart(amount); // 小数部分
        String integerPartUpperCase = getUpperCase(integerPart, digit, unit); // 整数部分大写
        String decimalPartUpperCase = getUpperCase(decimalPart, digit, unit); // 小数部分大写

        // 输出大写金额
        System.out.print("大写金额为：" + integerPartUpperCase);
        if (!decimalPart.equals("00")) {
            System.out.print("点" + decimalPartUpperCase);
        }
        System.out.println("元整");
        input.close();
    }

    // 获取整数部分
    public static String getIntegerPart(double amount) {
        long integerPart = (long) amount;
        return String.valueOf(integerPart);
    }

    // 获取小数部分
    public static String getDecimalPart(double amount) {
        long integerPart = (long) amount;
        double decimalPart = amount - integerPart;
        int decimal = (int) (decimalPart * 100 + 0.5);
        return String.valueOf(decimal);
    }

    // 获取大写金额
    public static String getUpperCase(String part, String[] digit, String[] unit) {
        StringBuilder sb = new StringBuilder();
        int length = part.length();
        for (int i = 0; i < length; i++) {
            int num = part.charAt(i) - '0';
            sb.append(digit[num]);
            if (num != 0) {
                sb.append(unit[length - i - 1]);
            } else {
                if (length - i - 1 == 4 || length - i - 1 == 8) {
                    sb.append(unit[length - i - 1]);
                }
            }
        }
        return sb.toString();
    }

}
