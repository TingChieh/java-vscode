package date20221118;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double[] List= new double[3];

            System.out.println("请输入第一个数");
            List[0] = input.nextDouble();//?人傻了
            System.out.println("请输入第二个数");
            List[1] = input.nextDouble();
            System.out.println("请输入第三个数");
            List[2] = input.nextDouble(); 

            for (int i=0;i<2;i++){//？
                for (int j=0;j<2-i;j++){
                    if (List[j]>List[j+1]){
                        double temp = List[j];
                        List[j] = List[j+1];
                        List[j+1] = temp;
                    }
                }
            }
            for (int i=0;i<3;i++){
                System.out.println(List[i]);
            }
        }
    }
}
