package exception;

public class Exception2 {
	

	public static void main(String[] s) {
		// TODO Auto-generated method stub
		try {
			System.out.println("size of array"+s.length);
			int x=10/s.length;
			System.out.println("\n Value of x is"+x);
		}catch(ArithmeticException a) {
			System.out.println(a);
			System.out.println("Exception handled...");
		}
		
	}

}
