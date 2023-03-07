package learning.date20230307;

import java.util.Scanner;

public class SymmetricString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个字符串：");
        String inputString = input.next();

        StringBuffer stringBuffer = new StringBuffer(inputString);
        stringBuffer.reverse();

        if (inputString.equals(stringBuffer.toString())) {
            System.out.println("该字符串是对称字符串。");
        } else {
            System.out.println("该字符串不是对称字符串。");
        }

        input.close();
    }
}
