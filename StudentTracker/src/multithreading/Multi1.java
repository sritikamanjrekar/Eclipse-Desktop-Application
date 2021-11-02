package multithreading;

public class Multi1 implements Runnable{
	//creating thread with runnable interface
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multi1 m=new Multi1();
		Thread t1=new Thread(m);
		t1.start();

	}

}
