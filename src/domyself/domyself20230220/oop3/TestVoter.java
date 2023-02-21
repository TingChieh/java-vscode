package domyself.domyself20230220.oop3;

public class TestVoter {
    public static void main(String[] args) {
        Voter v1 = new Voter("张三");
        v1.vote();
        Voter v2 = new Voter("李四");
        v2.vote();
        Voter v3 = new Voter("王五");
        v3.vote();
        System.out.println("**********");
        Voter.showCount();

        for (int i = 0; i <= 97; i++) {
            Voter v = new Voter("v"+i);
            v.vote();
        }
        System.out.println("**********");
        Voter.showCount();
        Voter v4 = new Voter("荔枝");
        v4.vote();
        System.out.println("**********");
        Voter.showCount();
    }
}
