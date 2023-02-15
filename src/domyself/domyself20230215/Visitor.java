package domyself.domyself20230215;

public class Visitor {
    // 属性：姓名 年龄
    String name;
    int age;

    // 方法：根据年龄判断门票价格
    // 18-60 20元；<10 >60 免费；10-18 10元
    public void showPrice() {
        if (age > 0 && age <= 10) {
            System.out.println(name + "的年龄为：" + age + "岁，门票免费！");
        } else if (age < 18) {
            System.out.println(name + "的年龄为：" + age + "岁，门票 10 元！");
        } else if (age < 60) {
            System.out.println(name + "的年龄为：" + age + "岁，门票 20 元！");
        } else {
            System.out.println(name + "的年龄为：" + age + "岁，门票免费！");
        }
    }
}
