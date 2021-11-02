package practice;

public class Fibonacci_series {
	public static void main(String[] args) {
		
		
		int a=0,b=1,c=0;
		System.out.print("fibonacci series:\n"+a+"\t"+b+"\t");
		
		for(int i=0;i<5;i++) {
			//c=b+a;
			System.out.print((c=b+a)+"\t");
			a=b;
			b=c;
		}
	}

}
