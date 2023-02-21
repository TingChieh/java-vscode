package domyself.domyself20230220.oop3;

// 模拟实现选民投票过程:一群选民进行投票，每个选民只允许投一次票，并且当投票总数达到100时，就停止投票
public class Voter {
    // 目前投票数，被所有选民实例所共享
    static int count;
    // 投票总数最大值，到 100 时，就停止投票
    static final int MAX_COUNT = 100;

    private String name;

    public Voter() {
    }

    public Voter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 选民投票
    public void vote() {
        if (count == MAX_COUNT) {
            System.out.println("投票数达到100，无法继续投票");
        } else {
            System.out.println(this.name + "投票成功，当前票数为" + count);
            count++;
        }
    }

    // 显示当前投票总数
    public static void showCount() {
        System.out.println("当前的投票总数为" + count);
    }
}
