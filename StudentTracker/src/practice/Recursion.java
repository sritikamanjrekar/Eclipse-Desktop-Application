package practice;

public class Recursion {
	void A(int n,char a,char c,char b) {
		if(n>1) {
			A(n-1,a,b,c);
			System.out.println("Move disk\t"+n+"\tfrom\t"+a+"\tto\t"+c);
			A(n-1,b,c,a);
		}else if(n==1) {
			System.out.println("Move disk\t"+n+"\tfrom\t"+a+"\tto\t"+c);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r=new Recursion();
		r.A(3,'A','C','B');
	}

}
