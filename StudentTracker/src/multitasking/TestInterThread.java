package multitasking;

class Customer{
	int amount=10000;
	
	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw");
	
	
		if(this.amount<amount) {
			System.out.println("balance insufficient");
			try {
				wait();
			}catch(Exception e) {
				
			}
			
			this.amount-=amount;
			System.out.println("withdraw completed...");
		}
	}
	
	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount+=amount;
		System.out.println("deposit completed");
		notify();
	}
}


 
public class TestInterThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c=new Customer();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();

		new Thread() {
			public void run() {
				c.deposit(8000);
			}
		}.start();
	}

}
