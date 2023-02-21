package learning.date20230217;

public class Grandpa {
    protected Grandpa() {
        System.out.println("Grandpa无参构造方法");
    }

    public Grandpa(String name) {
        System.out.println("Grandpa含参构造方法:" + name);
    }
}
