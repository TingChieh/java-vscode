package learning.date20221209;

public class TV {
    String brand, color;
    int size;

     public TV(String brand, String color, int size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    public void channel() {
        System.out.println("电视能调频道");
    }

    public void print() {
        System.out.println(brand);
        System.out.println(size);
        System.out.println(color);
    }

     public TV() {

    }

    public static void main(String[] args) {
        TV t1 = new TV();
        t1.brand = "三星";
        t1.color = "银色";
        t1.size = 60;
        t1.channel();
        t1.print();
        TV t2 = new TV("索尼", "黑色", 55);
        t2.channel();
        t2.print();
    }
}
