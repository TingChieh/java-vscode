package learning.date20230321;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

@SuppressWarnings({ "all" })
public class StudentComparator implements Comparator<Student> {
    public static void main(String[] args) {

        TreeMap map = new TreeMap();
        map.put(14, 14);
        map.put(4, 4);
        map.put(11, 11);
        map.put(32, 32);
        // 如果要保存多种类型，就要重写compareTo方法，参考书上练习
        // map.put('a', 'a');
        // map.put('g', 'g');
        // map.put('d', 'd');
        Set set = map.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        Student stu1 = new Student("001", "Mike", 18, "Beijing");
        Student stu2 = new Student("002", "Smith", 20, "Shanghai");
        Student stu3 = new Student("003", "Jack", 19, "Jiangsu");
        HashMap hashMap = new HashMap();
        Student student[] = {stu1,stu2,stu3};
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i].toString());
        }
        System.out.println("-----------");
        Arrays.sort(student, new StudentComparator());
        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }

    }

    @Override
    public int compare(Student o1, Student o2) {
        return (o1.getAge() < o2.getAge()) ? -1 : ((o1.getAge() > o2.getAge()) ? 1 : 0);
    }
}