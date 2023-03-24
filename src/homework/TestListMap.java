package homework;

import java.util.ArrayList;

@SuppressWarnings({ "all" })
class Book

{

    public int id;

    public String name;

    public double price;

    public String press;

    public Book() {

        super();

    }

    public Book(int id, String name, double price, String press) {

        super();

        this.id = id;

        this.name = name;

        this.price = price;

        this.press = press;

    }

    public int getId() {

        return id;

    }

    public void setId(int id) {

        this.id = id;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public double getPrice() {

        return price;

    }

    public void setPrice(double price) {

        this.price = price;

    }

    public String getPress() {

        return press;

    }

    public void setPress(String press) {

        this.press = press;

    }

    @Override

    public String toString() {

        return "Book [id=" + id + ", name=" + name + ", press=" + press

                + ", price=" + price + "]";

    }

}

public class TestListMap {

    public static void main(String[] args) {

        Book b1 = new Book(1000, "b1", 30.5, "bjsxt");

        Book b2 = new Book(1000, "b2", 50, "bjsxt");

        Book b3 = new Book(1001, "b3", 30.5, "bjsxt");

        Book b4 = new Book(1002, "b4", 30.5, "bjsxt");

        Book b5 = new Book(1003, "b5", 50, "bjsxt1");

        // 请补充代码使用ArrayList存储图书
        ArrayList<Object> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("遍历输出:");
        // 请补充代码遍历ArrayList
        for (Object bookObject : books) {
            System.out.println(bookObject);
        }

    }

}
