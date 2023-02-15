package domyself.domyself20230215;

public class ZhaZhiJi {
    // 属性：颜色 价格
    String color;
    double price;

    // 方法：输出信息
    public void showInfo() {
        System.out.println("这是一台"+color+"的榨汁机，价格为："+price+"元");
    }

    // 方法：榨汁-前提；水果-参数；参数类型 参数名称
    public void ZhaZhi(String fruit, int num){
        System.out.println(num+"杯"+fruit+"汁");
    }

}
