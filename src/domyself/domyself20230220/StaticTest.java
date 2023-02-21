package domyself.domyself20230220;

public class StaticTest {
    static int num = 100;
    static {
        num += 100;
        System.out.println(num);
    }
    static {
        num += 100;
        System.out.println(num);
    }

    // public static void main(String[] args) {
    //     StaticTest st1 = new StaticTest();
    //     StaticTest st2 = new StaticTest();
    //     System.out.println(StaticTest.num);
    // }
}
