package domyself.domyself20230108;

public class School {
    // 属性：学校名 教室数目 学生数量
    String schoolName;
    int classNum;
    int stuNum;

    // 方法：输出学校信息
    public void showSchoolInfo() {
        System.out.println("学校名："+schoolName+"；有"+classNum+"个教室；有"+stuNum+"个学生");
    }
}
