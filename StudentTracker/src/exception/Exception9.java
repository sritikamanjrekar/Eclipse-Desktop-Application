package exception;

public class Exception9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int x=100/args.length;
			System.out.println(x);
		}catch(ArithmeticException e){
			System.out.println(e);
			System.out.println("exception handled");
		}
		
		try {
			int z[]=new int[args.length];
			z[2]=10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		finally
		{
			System.out.println("finallyy");
		}

	}

}
