package exception;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Hello try");
			int x=10,y=0,res;
			res=x/y;
			System.out.println("Exception free");
			System.out.println(res);
		}catch(ArithmeticException e) {
			System.out.println("catch");
			System.out.println("free code");
		}

	}

}
