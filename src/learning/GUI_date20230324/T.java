package learning.GUI_date20230324;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class T extends JFrame {
    JFrame jf;

    public t(String title) {
        super(title);
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public void testwindows() {
        FlowLayout fl = new FlowLayout();
        fl.setHgap(5);
        fl.setHgap(10);
        this.setLayout(fl);
        JButton btn00 = new JButton("Chinese");
        JButton btn01 = new JButton("Math");
        JButton btn02 = new JButton("English");
        this.add(btn00, BorderLayout.WEST);
        this.add(btn01, BorderLayout.SOUTH);
        this.add(btn02, BorderLayout.EAST);

        JToolBar jb = new JToolBar("ToolBar");
        JButton btn1 = new JButton("Tools");
        JButton btn2 = new JButton(new ImageIcon("src/learning/GUI_date20230324/img/test1.jpg"));
        jb.add(btn1);
        jb.add(btn2);
        jb.setFloatable(true);
        this.add(jb);
    }

    public static void main(String[] args) {

        t t = new t("hhhh");
        t.testwindows();

    }
}
