package learning.date20230228;

public class Cat extends Animal {

    Cat(String s) {
        super(s);
    }

    // 如果抽象类中有抽象方法，那么这个抽象方法一定要在子类中实现
    @Override
    void eat() {
        throw new UnsupportedOperationException("Unimplemented method 'eat'");
    }
}
