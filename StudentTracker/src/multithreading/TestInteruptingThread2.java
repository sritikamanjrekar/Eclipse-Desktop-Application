package multithreading;

public class TestInteruptingThread2 extends Thread {
	
	public void run() {
		try {
			Thread.sleep(1000);
			System.out.println("task");
		}catch(InterruptedException e) {
			System.out.println("Exception handled :"+e);
		}
		System.out.println("thread is running...");
		System.out.println("thread is running...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestInteruptingThread2 t1=new TestInteruptingThread2();
		t1.start();
		try {
			t1.interrupt();}
		catch(Exception e) {
			System.out.println("Exception handled "+e);
		}

	}

}
