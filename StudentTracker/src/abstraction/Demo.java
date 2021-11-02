package abstraction;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo extends JFrame implements ActionListener{
	Demo(){
		setBounds(200,100,500,500);
		JButton b =new JButton("notepad");
		b.setBounds(200,200,100,30);
		b.addActionListener(this);
		add(b);
		
		setLayout(null);
		setVisible(true);
	}
	
	public static void main(String args[]) {
		new Demo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			Runtime.getRuntime().exec("notepad");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
