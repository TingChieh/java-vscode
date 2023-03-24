package learning.GUI_date20230324;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JFrameTest {
    public static void main(String[] args) {
        JFrame jf = new JFrame("JFrame");
        jf.setBounds(400, 300, 300, 300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JDialog jd = new JDialog(jf, "dialog");
        jd.setBounds(400,300,200,200);
        jd.setVisible(true);
        jd.setVisible(true);
        jd.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
