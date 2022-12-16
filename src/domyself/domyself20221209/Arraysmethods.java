package domyself.domyself20221209;

import java.util.Arrays;

public class Arraysmethods {
  public static void main(String[] args) {
    // equals(array1,array2) 的作用是：比较两个数组是否相等
    System.out.println("---equals(array1,array2)方法：---");
    int[] arr1 = { 10, 50, 40, 30 };
    int[] arr2 = { 10, 50, 40, 30 };
    int[] arr3 = { 60, 50, 85 };
    System.out.println(Arrays.equals(arr1, arr2));
    System.out.println(Arrays.equals(arr1, arr3));

    // toString(array) 的作用是：将一个数组 array 转换成一个字符串
    System.out.println("---toString(array)方法：---");
    int[] arr = { 10, 50, 40, 30 };
    System.out.println(Arrays.toString(arr));

    // fill(array,val) 的作用是：把数组 array 的所有元素都赋值为val
    System.out.println("---fill(array,val)方法：---");
    int[] arr4 = { 10, 50, 40, 30 };
    Arrays.fill(arr4, 100);
    System.out.println(Arrays.toString(arr4));

    // copyOf(array,length) 作用是：把数组 array 复制成一个长度为 length 的新数组
    System.out.println("---copyOf(array,length)方法：---");
    int[] array1 = { 10, 50, 40, 30 };
    int[] array2 = Arrays.copyOf(array1, 6);
    System.out.println(Arrays.toString(array2));
    int[] array3 = Arrays.copyOf(array1, 3);
    System.out.println(Arrays.toString(array3));

    // binarySearch(array, val) 的作用是:查询元素值 Val 在数组 array 中的下标
    System.out.println("---binarySearch(array, va1)方法: ---");
    int[] array4 = { 10, 50, 40, 30 };
    Arrays.sort(array4); // 10 30 40 50
    int index = Arrays.binarySearch(array4, 40);
    System.out.println(index);
    int index1 = Arrays.binarySearch(array4, 100);
    System.out.println(index1);
  }
}
