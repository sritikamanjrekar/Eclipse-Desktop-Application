package frame;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyApplication extends JFrame implements ActionListener {
	
	JButton b,b1,b2;
	JTextField t,t1;
	
	MyApplication(){
		
		super("My Application");
		
		setBounds(200,100,500,550); 
		
		JLabel l1 = new JLabel("Num1");
		l1.setBounds(200,70,100,30);
		
		t = new JTextField();
		t.setBounds(200,100,200,30);
		
		JLabel l2 = new JLabel("Num2");
		l2.setBounds(200,140,100,30);
		
		t1 = new JTextField();
		t1.setBounds(200,170,200,30);
		
	b = new JButton("Show");
	b.setBounds(200,400,100,30);
	b.addActionListener(this);
	
	b1 = new JButton("Div");					
	b1.setBounds(200,220,100,25);
	b1.addActionListener(this);
	
	b2 = new JButton("Sub");
	b2.setBounds(300,220,100,25);
	b2.addActionListener(this);
	
	
	add(b); add(b1); add(b2);add(t);add(t1);add(l1);add(l2);
	setLayout(null);
	setVisible(true);
	
	}
	public static void main(String[] args) {
		
		new MyApplication();

	}
	@Override
	public void actionPerformed(ActionEvent ree) {
		int n1 = Integer.parseInt(b1.getText());
		int n2 = Integer.parseInt(b2.getText());
		
		
		if (ree.getSource() == b) {
			
			JOptionPane.showMessageDialog(null , "lets do Pawri");
		}
		else if(ree.getSource() == b1) {
			
			try{
				JOptionPane.showMessageDialog(null,"Division is :" +(n1/n2));
				
			}catch(ArithmeticException e) {
				JOptionPane.showMessageDialog(null,"chal huut Gavar! cannot divide by zero");
			}
			
		}
		else if(ree.getSource() == b2) {
			
			
			JOptionPane.showMessageDialog(null,"Subtraction is :" +(n1-n2));
		}
	}

}
