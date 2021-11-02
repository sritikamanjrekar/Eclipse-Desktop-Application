package multithreading;

class Reentrant{
	public synchronized void m() {
		n();
		System.out.println("this m() method");
	}
	
	

	public synchronized void n() {
		// TODO Auto-generated method stub
		System.out.println("this n() method");
		
	}

	
}

public class ReentrantExample extends Reentrant {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final ReentrantExample re=new ReentrantExample();
		Thread t1=new Thread() {
			public void run() {
				re.m();
			}
		};
		t1.start();
	}

}
