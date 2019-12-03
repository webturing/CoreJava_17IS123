package week12a.gui;

import javax.swing.*;
import java.awt.*;

public class GUI4FlowLayout extends JFrame {
    JButton jButton;
    GUI4FlowLayout(){
        setLayout(new FlowLayout());//线性布局
        add(new JButton("1"));
        add(new JButton("2"));
        add(new JButton("3"));
        add(new JButton("4"));
        setSize(400,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUI4FlowLayout();
    }


}
