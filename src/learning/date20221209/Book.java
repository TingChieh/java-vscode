package learning.date20221209;

public class Book {
    String name, author;
    double price;

    Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book() {
    }

    void show() {
        System.out.println(name);
        System.out.println(author);
        System.out.println(price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.name = "数据结构";
        b1.author = "Jane";
        b1.price = 45.0;
        b1.show();
        Book b2 = new Book("Java语言程序设计", "Michael", 49.8);
        b2.show();
    }
}
