package practice;

public class TiwstedMethod {

	int prime(int n) {
		int mark=0;
		for(int i=2;i<n;i++) {
			if(n%i==0)mark++;
		}
		return mark;
	}
	
	int reverse(int n) {
		int rem,rev=0;
		while(n!=0) {
			rem=n%10;
			rev=rem+rev*10;
			n=n/10;
		}
		return rev;
	}
	
	void twistedprime(int n) {
		//step 1 check prime
		if(prime(n)==0) {
			//reverse the number
			int ram=reverse(n);
			//check prime again
			if(prime(ram)==0){
				System.out.println("number is twisted prime number");
			}else {
				System.out.println("not a twisted prime number");
			}
		}else {
			System.out.println("Not a Twisted prime number");
		}
		
	}

	public static void main(String[] args) {
		TiwstedMethod d=new TiwstedMethod();
		d.twistedprime(19);
	}

}

