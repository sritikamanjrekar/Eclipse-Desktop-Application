import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	//Calendar calendar;
	SimpleDateFormat timeFormat;
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;// display time label
	JLabel dayLabel;//display day
	JLabel dateLabel;//display date
	String time;
	String day;
	String date;

	MyFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("My Clock Application");
		this.setLayout(new FlowLayout());
		this.setSize(350, 200);
		this.setResizable(false);

		// set format of the time
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		
		//set format of the day
		dayFormat = new SimpleDateFormat("EEEE");
		
		//set format of the date
		dateFormat=new SimpleDateFormat("dd MMMMM, YYYY");
		
		// set the label with current time
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
		timeLabel.setForeground(new Color(0x00FF00));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		this.add(timeLabel);// add label to frame
		
		dayLabel=new JLabel();
		dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
		this.add(dayLabel);
		
		dateLabel=new JLabel();
		dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
		this.add(dateLabel);
		
		this.setVisible(true);

		setTime();
	}

	public void setTime() {
		while(true) {
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
