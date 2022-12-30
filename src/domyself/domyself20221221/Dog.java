package domyself.domyself20221221;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("WangWang.... I am " + this.name);
    }
}
