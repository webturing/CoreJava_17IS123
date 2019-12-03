package week12a.gui;

import javax.swing.*;
import java.awt.*;

public class GUI5BordLayout extends JFrame {
    JButton jButton;
    GUI5BordLayout(){
        setLayout(new BorderLayout());//边界布局
        //add(new JButton("EAST"),BorderLayout.EAST);
        add(new JButton("SOUTH"),BorderLayout.SOUTH);
        add(new JButton("WEST"),BorderLayout.WEST);
        add(new JButton("NORTH"),BorderLayout.NORTH);
        add(new JButton("CENTER"),BorderLayout.CENTER);
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new GUI5BordLayout();
    }


}
