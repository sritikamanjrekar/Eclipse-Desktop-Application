package practice;
import java.util.Scanner;
public class Twisted_ip {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any number :");
		int n=scn.nextInt();
		int mark=0;
		//step 1 check prime
		for(int i=2;i<n;i++) {
			if(n%i==0)mark++;
		}
		
		if(mark==0) {
			int rem,rev=0;
			//step 2 reverse the number
			while(n!=0) {
				rem=n%10;
				rev=rem+rev*10;
				n=n/10;
			}
			
			//step 3 check prime again of the reverse number
			for(int i=2;i<rev;i++) {
				if(rev%i==0) {
					mark++;
				}
			}
			
			if(mark==0) {
				System.out.println("Twisted Prime Number");
			}else {
				System.out.println("Not a Twisted Prime Number");
			}
		}else {
			System.out.println("Not a Twisted Prime Number!!!");
		}

	}

}
