public class classpratice {
    public static void main(String[] args) {
        System.out.println("摄氏度为 华摄氏度");
        int i = 0;
        double tempor = 0,tem = 0;
        do {
                i++;
                tem += 20;
                System.out.println(tem + "\t" + tempor);
                tempor = tem * 9 / 5 + 32;
                System.out.println(i);
        } while ( i < 10 && tem < 250);
        System.out.println("程序结束！");
    }
}
