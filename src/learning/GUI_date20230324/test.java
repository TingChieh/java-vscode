package learning.GUI_date20230324;

import javax.swing.*;

public class test {
    JFrame f;

    test(){  
    f=new JFrame();//creating  instance (实例)  of JFrame  
              
    JButton b=new JButton("click");//creating  instance (实例)  of JButton  
    b.setBounds(130,100,100, 40);  
              
    f.add(b);//adding button in JFrame  
              
    f.setSize(400,500);//400 width and 500 height  
    f.setLayout(null);//using no  layout (布局)  managers  
    f.setVisible(true);//making the frame  visible (可见)   
}

    public static void main(String[] args) {
        new test();
    }
}