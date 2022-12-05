package learning.date20221129;

public class demo1 {
        public static class Main {
                // 定义一个方法，方法名为MyToString，
                // 实现传入一个整型数组，输出与Arrays.toString同样的效果
                // 访问修饰符 返回值 方法名（参数列表）{执行语句}
                // 参数列表:类型1 名字1，类型2 名字2……

                public static void MyToString(int b[]) {
                        System.out.print("[");
                        for (int a = 0; a <= b.length - 1; a++) {
                                System.out.print(b[a]);
                                // if(a<b.length-1)System.out.print(", ");
                                if (a != b.length - 1)
                                        System.out.print(", ");
                        }
                        System.out.println("]");
                }

                // 定义一个名叫S1的方法,没有返回值，没有传入参数，实现输出“HelloWorld”
                public static void S1() {
                        System.out.println("HelloWorld");
                }

                public static void Add(int a,int b) {
                        System.out.println(a+b);
                        return;
                }
                public static void main(String[] args) {
                        int A[] = { 2, 6, 67, 46, 3 };// [0,4]
                        // 在一行内输出数组A中的元素，for，数组名[下标值]
                        MyToString(A);
                        S1();
                        Add(3, 4);
                        // S1();
                        // System.out.println(Arrays.toString(A));

                        // 1、数组的定义
                        // (1) 数组类型[ ] 数组名 = new 数组类型[数组长度];
                        // 整型数组，数组名是A，数组长度是6
                        // int []A=new int[6];

                        // (2) 数组类型[ ] 数组名 = {数组元素0,数组元素1,...};
                        // 字符串数组，数组名是B，数组元素是a,bf,s
                        // String []B={"a","bf","s"};

                        // (3) 数组类型[ ] 数组名 = new 数组类型[]{数组元素0,数组元素1,...};
                        // String []c=new String[]{"a","bf","s"};

                        // Object类型数组里的元素，不再是我们看到的基本数据类型
                        // Object m[]= {1,3.4,"sss",'d',true};
                        // double d=m[1];

                        // 2、获取数组长度——几个元素
                        // System.out.println(A.length);

                        // 3、访问数组元素——通过数组的下标访问——下标范围[0,length-1]
                        // System.out.println(B[1]);

                        // 4、数组的遍历
                        // int A[]= {2,6,67,46,3};
                        // （1）循环——通过下标访问
                        // for(int i=0;i<A.length;i++) {
                        // System.out.println(A[i]);
                        // }
                        // （2）循环——foreach
                        // 从第0个位置开始，逐次往后取值，每次取A中的一个元素值赋值给a
                        // 注意：循环变量b的类型要大于等于数组A的类型
                        // for(int a:A) {
                        // System.out.println(a);}
                        // String []B={"a","bf","s"};
                        // for(String a:B) {
                        // System.out.println(a);}
                        // （3）用Arrays工具类toString方法
                        // 类名.方法名（传入参数）
                        // System.out.println(Arrays.toString(A));

                        // 关于数组保存的注意要点
                        // 注意：一个对象可以被多个引用指向
                        // 注意：一个引用只能指向一个对象

                        // 知识点：如何保留几位小数？？？
                        // double a=4.0001;
                        // double d=3.6666666;
                        // 1、使用DecimalFormat类
                        // 方式一：不管传入的任何值，均保留两位小数
                        // 输出a为4.00，b为3.67
                        // DecimalFormat df = new DecimalFormat("0.00");
                        // System.out.println(df.format(a));
                        // System.out.println(df.format(d));

                        // 方式二：保留小数点后面不为0的两位小数，
                        // 也就是说这种写法不能保证最后会有两位小数，但能保证最后一位数不为0
                        // 输出a为4，b为3.67
                        // DecimalFormat df = new DecimalFormat("#.##");
                        // System.out.println(df.format(a));
                        // System.out.println(df.format(d));

                        // 2、用字符串
                        // 表示小数点后任意两位小数，其中2为表示两位小数
                        // 这种方法不管传入的值是多少，均保留两位小数，并且符合四舍五入的规则。
                        // 输出a为4.00，b为3.67
                        // String s=String.format("%.2f",d);
                        // System.out.println(s);
                        // String s1=String.format("%.2f",a);
                        // System.out.println(s1);

                        // 3、使用BigDecimal类()
                        // 使用这种写法若小数点后均为零，则保留一位小数，并且有四舍五入的规则。
                        // BigDecimal bd=new BigDecimal(d);
                        // double d1=bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
                        // System.out.println(d1);

                }
        }
}