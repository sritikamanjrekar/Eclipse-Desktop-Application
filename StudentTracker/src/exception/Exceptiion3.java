package exception;
//doubt output
public class Exceptiion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x=10/args.length;
			System.out.println(x);
			
			int z[]=new int[args.length];
			z[3]=10; 
		}catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		
		System.out.println("Exception handled");

	}

}
