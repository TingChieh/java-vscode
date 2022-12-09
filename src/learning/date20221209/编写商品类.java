package learning.date20221209;

public class 编写商品类 {
    String name;
    String id;
    double price;
    public double computeDiscount(double percent) {
        return price*percent;
    }
    public static void main(String[] args) {
		System.out.println("创建类成功");
	}
}
