package exception;

public class IQ {
	static int show() {
		try {
			return 10;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("finallyyy");
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int z=show();
		System.out.println(z);

	}

}
