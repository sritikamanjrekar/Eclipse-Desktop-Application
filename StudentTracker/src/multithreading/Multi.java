package multithreading;

public class Multi extends Thread{
	//implementing thread by extending classs
	
	public void run() {

		System.out.println("Hey look thread is running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multi t1=new Multi();
		t1.start();
	}

}
