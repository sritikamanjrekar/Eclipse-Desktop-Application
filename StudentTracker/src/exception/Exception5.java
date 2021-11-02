package exception;

public class Exception5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=10/args.length;
			System.out.println(x);
			System.out.println("Exception handled");
			int z[]=new int[args.length];
			z[3]=1000;

		}catch(ArithmeticException |ArrayIndexOutOfBoundsException e) {
			if(e instanceof ArithmeticException) {
				System.out.println(e);
			}else if( e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println(e);
			}
		}
		
		
		System.out.println("Exc handled ");
	}

}
