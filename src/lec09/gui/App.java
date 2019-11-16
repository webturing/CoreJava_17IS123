package lec09.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        App a = new App();

    }

    App() {
        super();
        setTitle("My App");
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(button = new JButton("click me"));
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(null, "Ok");
        }

    }

}
