package week13a;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AwtDemo extends Frame implements WindowListener {
    AwtDemo(){

        this.addWindowListener(this);
        setSize(400,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        new AwtDemo();
    }

    @Override
    public void windowOpened(WindowEvent windowEvent) {

    }

    @Override
    public void windowClosing(WindowEvent windowEvent) {
        int userSelect= JOptionPane.showConfirmDialog(this,"确定要退出","系统退出",JOptionPane.YES_NO_OPTION);
        if(userSelect==JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }

    @Override
    public void windowClosed(WindowEvent windowEvent) {

    }

    @Override
    public void windowIconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeiconified(WindowEvent windowEvent) {

    }

    @Override
    public void windowActivated(WindowEvent windowEvent) {

    }

    @Override
    public void windowDeactivated(WindowEvent windowEvent) {

    }



}
