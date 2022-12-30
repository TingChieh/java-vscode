package domyself.domyself20221221;

public class Dog1 extends Animal{
    public Dog1(String name) {
        super(name);
    }
    public void greet() {
        System.out.println("WangWang..., I am " + this.name);
    }
    public void run() {
        System.out.println("I am runing");
    }
}
