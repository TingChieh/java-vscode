package learning.date20230303;

public class T {
    public static void main(String[] args) {
        String str = "sss";
        try {
            byte b[] = str.getBytes();
            System.out.println(b.toString());
            System.out.println(new String(b));
        } catch (Exception e) {
        }
    }
}
