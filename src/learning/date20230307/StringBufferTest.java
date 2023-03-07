package learning.date20230307;

public class StringBufferTest {
    public static void main(String[] args) {
        String s = "Hello Java";
        StringBuffer str = new StringBuffer(s);
        System.out.println(str);
        str.append("你好").append("Java");
        System.out.println(str);
        str.deleteCharAt(0);
        System.out.println(str);
        String subString = str.substring(0, 10);
        System.out.println(subString);
        str.reverse();
        System.out.println(str);
        str.insert(4, "这是插入的字符");
        System.out.println(str);
    }
}
