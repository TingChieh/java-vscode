package learning.date20221209;

public class new1 {
    // Add 方法，有两个 int 类型的参数 a 和 b，要求该方法计算并输出 a 加 b 的值
    public static int Add(int a, int b) {
        return a + b;
    }

    public static void Add1(int... a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }

    public static void Add2(int[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i]);
        }
    }

    public static void main(String[] args) {
        // 实参——实际传入的参数
        System.out.println(Add(2, 3));
        Add1(1, 2, 3, 4);
        System.out.println();

        int[] arg = { 1, 2, 3, 4 };
        Add2(arg);
        System.out.println();

        // Product candy = new Product();
        // candy.name = "水果糖";
        // candy.price = 2;
        // candy.id = "S001";
        // candy.weight = 100;
        // System.out.println(candy.name);
        // System.out.println(candy.Discount(0.5));

    }
}
