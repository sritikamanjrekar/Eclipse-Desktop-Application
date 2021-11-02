package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Myapp extends JFrame implements ActionListener{
	JButton b,b2,b3;
	JTextField txt1,txt2;
	
	Myapp(){
		super("My Application...");
		
		setBounds(200,100,500,550);//set boundary of frame
		
		//button create
		b=new JButton("show");
		b.setBounds(200,400,100,30);
		b.addActionListener(this);
		
		//text field
		txt1=new JTextField();
		txt1.setBounds(200,100,200,30);
		
		txt2=new JTextField();
		txt2.setBounds(200,170,200,30);
		
		JLabel l1=new JLabel("num1");
		l1.setBounds(200,70,100,30);
		
		JLabel l2=new JLabel("num2");
		l2.setBounds(200,140,100,30);
		
		b2=new JButton("div");
		b2.setBounds(200,220,100,25);
		b2.addActionListener(this);
		
		b3=new JButton("subs");
		b3.setBounds(300,220,100,25);
		b3.addActionListener(this);
		
		add(b);add(txt1);
		add(txt2);add(l1);add(l2);add(b2);add(b3);
		
		setLayout(null);
		setVisible(true);
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Myapp();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int n1=Integer.parseInt(txt1.getText());
		int n2=Integer.parseInt(txt2.getText());
		// TODO Auto-generated method stub
		if(e.getSource()==b) {
			JOptionPane.showMessageDialog(null, "THIS IS POP UP MESSAGE...");
		}else if(e.getSource()==b2) {
			
			
			try {
				JOptionPane.showMessageDialog(null, "Division is "+(n1/n2));
			}catch(ArithmeticException e1) {
				JOptionPane.showMessageDialog(null, "Cannot Divide");
			}
		}else if(e.getSource()==b3) {
			
			JOptionPane.showMessageDialog(null, "Substraction is "+(n1-n2));

		}
			
		
	}

}
