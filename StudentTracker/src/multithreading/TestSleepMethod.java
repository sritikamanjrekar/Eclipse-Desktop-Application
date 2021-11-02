package multithreading;

public class TestSleepMethod extends Thread {
	//thread scheduler is part of jvm to decide which thread should run
	
	public void run() {
		for(int i=1;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSleepMethod t1=new TestSleepMethod();
		TestSleepMethod t2=new TestSleepMethod();
		t1.start();
		t2.start();

	}

}
