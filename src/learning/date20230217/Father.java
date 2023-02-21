package learning.date20230217;

public class Father extends Grandpa{

    protected Father() {
        System.out.println("Father无参构造方法");
    }

    public Father(String grandpaName, String fatherName) {
        super(grandpaName);// 调用父类的含参构造方法
        System.out.println("Father含参构造方法:" + fatherName);
    }
}
