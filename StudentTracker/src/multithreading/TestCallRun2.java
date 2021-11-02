package multithreading;

public class TestCallRun2 extends Thread{
	//doubt TestSleepMethod and TestCallRun2
	public void run() {
		for(int i=0;i<5;i++) {
			try {
			Thread.sleep(500);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestCallRun2 t1=new TestCallRun2();
		TestCallRun2 t2=new TestCallRun2();
		t1.run();
		t2.run();
	}

}
