package learning.date20221209;

public class Product1 {
    String name, id;
    static double price;

    public static void computeDiscount(double percent) {
        System.out.println(price * percent);
    }

    public static void main(String[] args) {
        Product1 p1 = new Product1();
        p1.name = "投影仪";
        p1.id = "00102";
        Product1.price = 8600.0;
        Product1.computeDiscount(0.8);
        Product1 p2 = new Product1();
        p2.name = "打印机";
        p2.id = "00101";
        Product1.price = 1200.0;
        Product1.computeDiscount(0.8);
    }
}
