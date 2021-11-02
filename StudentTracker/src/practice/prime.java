package practice;

public class prime {

	public static void main(String[] args) {
		int n=45;
		int mark=0;
		
		for(int i=2;i<n;i++) {
			if(n%i==0)mark++;
		}
		
		if(mark==0) {
			System.out.println("Prime Number");
		}else {
			System.out.println("Not a prime Number");
		}

	}

}
