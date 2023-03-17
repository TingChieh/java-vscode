package learning.date20230317;

import java.util.*;

public class XueSheng implements Comparable<Object> {
    private String name;
    private int age;

    public XueSheng(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 重写toString方法
    @Override
    public String toString() {
        // 12 Amy
        return this.getAge() + "-" + this.getName();
    }

    // 定义自己的排序规则
    @Override
    public int compareTo(Object o) {
        // 先保持类型相同，再进行比较
        XueSheng other = (XueSheng) o;
        // 该对象小于指定对象o返回-1
        if (this.getAge() < other.getAge())
            return -1;
        if (this.getAge() > other.getAge())
            return 1;
        if (this.getName().compareTo(other.getName()) < 0)
            return -1;
        if (this.getName().compareTo(other.getName()) > 0)
            return 1;
        return 0;
    }

    @Override
    // 重写equals和hashCode方法
    public boolean equals(Object o) {
        // 第一种情况：当前对象this和指定对象o是同一个对象
        if (this == o)
            return true;
        // 第二种情况：不是同一个对象
        // 2.1判断一下o是不是Student类型或其子类，如果不是，肯定不是同一个对象，返回false
        if (!(o instanceof XueSheng))
            return false;
        // 2.2把o强制转换成Student类型再进行对比
        XueSheng other = (XueSheng) o;
        if ((this.getAge() == other.getAge()) && (this.getName().equals(other.getName())))
            return true;
        else
            return false;
    }

    @Override
    // 重写equals方法必须重写hashCode方法
    public int hashCode() {
        // 计算对象的哈希值
        int result;
        // 如果名字为空返回0，否则返回name的哈希值
        result = (name == null ? 0 : name.hashCode());
        result = 29 * result + age;
        return 0;
    }

    public static void main(String[] args) {
        XueSheng stu1 = new XueSheng(12, "Amy");
        XueSheng stu2 = new XueSheng(18, "Tom");
        XueSheng stu3 = new XueSheng(12, "Amy");
        // 自定义集合对象
        Set<XueSheng> set = new HashSet<XueSheng>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        // 未重写equals和hashCode方法时，输出元素个数为3，重写后个数为2
        System.out.println(set.size());
        System.out.println(set);

        // //定义Collection集合对象col，并添加以上对象，遍历输出集合元素
        // List col=new ArrayList();
        // col.add(stu1);
        // col.add(stu2);
        // col.add(stu3);
        // Collections.sort(col);
        // //通过集合对象调用iterator()获取迭代器
        // Iterator it=col.iterator();
        // while(it.hasNext()) {
        // //获取并输出元素
        // System.out.print(it.next()+" ");
        // }
    }
}
