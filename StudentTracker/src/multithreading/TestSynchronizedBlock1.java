package multithreading;

class Table1{
	void printTable(int n) {
		synchronized(this) {
			for(int i=1;i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
	
}
	
	class MyThread_1 extends Thread{
		Table t;
		MyThread_1(Table t){
			this.t=t;
		}
		
		public void run() {
			t.printTable(5);
		}
	}
	
	class MyThread2 extends Thread{
		Table t;
		MyThread2(Table t){
			this.t=t;
		}
		
		public void run() {
			t.printTable(100);
		}
	}
	
	


public class TestSynchronizedBlock1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Table obj=new Table();
		MyThread_1 t1=new MyThread_1(obj);
		MyThread2 t2=new MyThread2(obj);
		t1.start();
		t2.start();

	}

}
