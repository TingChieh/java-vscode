package learning.GUI_date20230324;

import java.awt.BorderLayout;

import javax.swing.*;

public class tttt {
    public static void main(String[] args) {
    JDialog myDialog=new JDialog();
myDialog.setVisible(true);//设置窗体可见
//设置窗体大小
myDialog.setSize(300,200);
myDialog.setTitle("对话框测试");
//在JDialog容器中添加一- 个JLable组件
myDialog.add(new JLabel("JLable" , JLabel.CENTER));
myDialog.add(new JLabel("上 面",JLabel.CENTER), BorderLayout.SOUTH) ;
myDialog.add(new JLabel("下 面" ,JLabel.CENTER), BorderLayout.NORTH);
myDialog.add(new JLabel("左 面" ,JLabel.CENTER), BorderLayout.WEST);
myDialog.add(new JLabel("右 面" ,JLabel.CENTER),BorderLayout.EAST);
    }
}
