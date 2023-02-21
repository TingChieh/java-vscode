package learning.date20230217;

public class Son extends Father{
    public Son() {
        System.out.println("Son的无参构造方法");
    }

    public Son(String grandpaName, String fatherName, String sonName) {
        super(grandpaName, fatherName);
        System.out.println("Son的无参构造方法");
    }

    public static void main(String[] args) {
        Son s1 = new Son();
        Son s2 = new Son("myGrandpa", "myFather", "mySon");
    }

}
