package multithreading;

public class TestInteruptingThread4 extends Thread{
	public void run() {
		for(int i=1;i<=2;i++) {
			if(Thread.interrupted()) {
				System.out.println("code for interrupted thread");
			}else {
				System.out.println("code for normal thread");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInteruptingThread4 t1=new TestInteruptingThread4();
		TestInteruptingThread4 t2=new TestInteruptingThread4();
		t1.start();
		t1.interrupt();
		t2.start();
		

	}

}
