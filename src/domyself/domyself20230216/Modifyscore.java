package domyself.domyself20230216;

// 操作学员成绩
public class Modifyscore {
    // 修改小于60分学生的成绩
    public void modifyscore(Student[] stus) {
        for (int i = 0; i < stus.length; i++) {
            if (stus[i].score < 60) {
                stus[i].score += 2;
            }
        }
    }

    // 显示本组学生成绩信息
    public void showStus(Student[] stus) {
        for (Student stu : stus) {
            stu.showInfo();
        }
    }
}
