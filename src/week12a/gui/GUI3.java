package week12a.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI3 extends JFrame implements ActionListener {
    JButton jButton;
    GUI3(){
        jButton=new JButton("Exit");
        this.add(jButton);
        jButton.addActionListener(this);//监听器
        setSize(400,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GUI3();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jButton){
            JOptionPane.showMessageDialog(null,"Hello");
            System.exit(0);
        }

    }
}
