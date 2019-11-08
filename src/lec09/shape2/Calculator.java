package lec09.shape2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener {
	JTextField jTextFieldA,jTextFieldB,jTextFieldC;
	JButton jButtonEqual;
	Calculator(){
		setLayout(new FlowLayout());
		setTitle("My Calulator");
		setSize(788,88);
		add(jTextFieldA=new JTextField(20));
		add(new JLabel("+"));
		add(jTextFieldB=new JTextField(20));
		add(jButtonEqual=new JButton("="));		
		add(jTextFieldC=new JTextField(20));
		jButtonEqual.addActionListener(this);		
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jButtonEqual){
			String a=jTextFieldA.getText().toString();
			String b=jTextFieldB.getText().toString();
			int ia=Integer.valueOf(a);
			int ib=Integer.valueOf(b);
			jTextFieldC.setText(Integer.toString(ia+ib));
			
		}
	}
}
