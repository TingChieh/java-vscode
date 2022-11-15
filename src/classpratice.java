public class classpratice {
    public static void main(String[] args) {
        System.out.println("摄氏度为 华摄氏度");
        for (double tem = 0; tem <= 250; tem = tem+20) {
            double tempor = 0;
            tempor = tem*9/5 + 32;
            System.out.println(tem + "\t" + tempor);
        }
        System.out.println("程序结束！");
    }
}
