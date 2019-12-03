package week12a.gui;

import javax.swing.*;

public class GUI2 extends JFrame {
    JButton jButton;
    GUI2(){
        jButton=new JButton("Exit");
        this.add(jButton);
        setSize(400,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUI2();
    }
}
