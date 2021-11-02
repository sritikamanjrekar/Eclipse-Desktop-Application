package multitasking;

public class Demo extends Thread{
	
	public void run() {
		System.out.println("Thread Running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		Demo d1=new Demo();
		Demo d2=new Demo();
		
		d.start();
		d2.start();
		d1.start();
	}

}
