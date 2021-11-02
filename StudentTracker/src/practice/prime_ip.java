package practice;
import java.util.Scanner;
public class prime_ip {

	public static void main(String[] args) {
		
		int mark=0;
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter any number :");
		int n = scn.nextInt();
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
