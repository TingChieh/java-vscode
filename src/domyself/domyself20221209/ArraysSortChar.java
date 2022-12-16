package domyself.domyself20221209;

import java.util.Arrays;

public class ArraysSortChar {
    // 使用 Arrays 类升序排列一组字符，并查找某个特殊字符在升序后数组中的位置
    public static void main(String[] args) {
        // 字符排序
        char[] chars = new char[] {'a','c','u','b','e','p','f','z'};

        System.out.print("原字符序列:");
        for(char oldChar:chars) {
            System.out.print(oldChar + " ");
        }

        // 查找特定字符的位置
        Arrays.sort(chars);

        System.out.print("\n排序后的字符序列:");
        for(char oldChar:chars) {
            System.out.print(oldChar + " ");
        }

        int index = Arrays.binarySearch(chars, 'b');
        System.out.println("\n字符b在数组中的位置是:" +index);
    }
}
