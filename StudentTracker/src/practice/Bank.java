package practice;

public class Bank {
	private int acNo=123;
	int amount=5000;
	String holderName="Priyanka";
	private int pinCode=1234;

	void deposit(int amount) {
		this.amount+=amount;
		
	}
	
	void withdrawl(int amount,int myPin) {
		if(this.pinCode==myPin) {
			this.amount=this.amount-amount;
			
			System.out.println("withdrawl successful");
		}else {
			System.out.println("withdrawl unsuccessful");
		}
		
	}
	
	void camount() {
		System.out.println("Current Balance in Your Account is :\n"+holderName+"\t"+acNo+"\nBalance-"+amount);
	}
	
	public int getPinCode() {
		return pinCode;
	}
	
	void setPinCode(int pinCode) {
		this.pinCode=pinCode;
	}
	
	public int getAcNo() {
		return acNo;
	}
	
	public int setAcNo(int acNo) {
		return this.acNo=acNo;
	}
	
	
}
