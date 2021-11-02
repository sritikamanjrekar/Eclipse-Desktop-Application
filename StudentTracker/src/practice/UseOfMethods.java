package practice;

public class UseOfMethods {
	//reverse the number
	int reverse(int vada) {
		int rev=0,rem;
		
		while(vada!=0) {
			rem=vada%10;
			rev=rem+rev*10;
			vada=vada/10;
		}
		return rev;
	}
	
	//check prime
	boolean primeVada(int n) {
		boolean isPrime=true;
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				isPrime=false;
			}
		}
		
		return isPrime;
	}
	
	void tp(int n) {
		//check prime
		if(primeVada(n)) {
			//reverse number
			if(primeVada(reverse(n))) {
				System.out.println("twisted prime");
			}else {
				System.out.println("not twisted prime");
			}
		}else {
			System.out.println("Not twisted prime");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseOfMethods um=new UseOfMethods();
				um.tp(19);

	}

}
