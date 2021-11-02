package multithreading;

public class TestDeadLockExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			final String resource1="Yo mandar sir";
			final String resource2="Yo Yo Yo";
			
			Thread t1=new Thread() {
				public void run() {
					synchronized(resource1) {
						System.out.println("Thread1:locked resource 1");
						
						try {
							Thread.sleep(100);
						}catch(Exception e) {}
						
						synchronized(resource2) {
							System.out.println("Thread 1:Loacked resource 2");
						}
					}
				}
			};
			
			Thread t2=new Thread() {
				public void run() {
					synchronized(resource2) {
						System.out.println("Thread 2 :locked resource 2");
						try {
							Thread.sleep(100);
						}catch(Exception e) {}
						synchronized(resource1) {
							System.out.println("Thread 2 :locked resource 1");
						}
					}
				}
			};
			
			t1.start();
			t2.start();
	}

}
