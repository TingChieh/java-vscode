package domyself.domyself20230215;

public class Admin {
    // 属性：用户名 密码
    String userName;
    String password;

    // 方法：输出管理员信息
    public void showInfo() {
        System.out.println("管理员用户名为：" + userName);
        System.out.println("密码为:" + password);
    }
}
