package learning.date20221209;

public class Product {
    String name;
    double price;
    String id;
    double weight;

    public double Discount(double i) {
        return price * i;
    }

    public Product(String n, double p, String i, double w) {
        // this 当前类
        this.name = n;
        this.price = p;
        this.id = i;
        this.weight = w;
    }
}
