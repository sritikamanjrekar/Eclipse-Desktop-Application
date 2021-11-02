package exception;

public class IQ1 {
	//@SuppressWarnings("finally")
	static
	int show() {
		try {
			int x=10/0;
			return 10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally{
			return 20;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=show();
		System.out.println(z);
	}

}
