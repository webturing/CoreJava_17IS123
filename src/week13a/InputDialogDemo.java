import javax.swing.*;

public class InputDialogDemo {
    public static void main(String[] args) {
        String userInput= JOptionPane.showInputDialog(null,"请输入游戏难度");
        int n=Integer.valueOf(userInput);
        for(int i=0;i<n;i++){
            System.out.println(i);
        }
    }
}
