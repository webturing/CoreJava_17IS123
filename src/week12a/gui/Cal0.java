package week12a.gui;

import javax.swing.*;
import java.awt.*;

public class Cal0 extends JFrame {
    JButton jButton;
    Cal0(){
        setLayout(new FlowLayout());//线性布局
        add(new JTextField("1"));
        add(new JLabel("+"));
        add(new JTextField("2"));
        add(new JButton("="));
        add(new JTextField("4"));
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Cal0();
    }


}
