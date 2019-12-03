package week13a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame implements ActionListener {
    JButton[][] btns = new JButton[3][3];
    int cnt=0;
    TicTacToe() {
        super("TicTacToe ver 0.1");
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                btns[i][j] = new JButton("");
                btns[i][j].addActionListener(this);
                add(btns[i][j], i, j);
            }
        }
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TicTacToe();
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(actionEvent.getSource()==btns[i][j]){
                    btns[i][j].setText("XO".charAt(cnt%2)+"");
                    ++cnt;
                    btns[i][j].setEnabled(false);
                }
            }
        }
    }
}
