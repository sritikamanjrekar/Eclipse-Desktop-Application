package exception;

public class Exception10 {

//final
	//finally
	//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			try {
				int x=10/0;
				System.out.println(x);
			}catch(ArithmeticException e) {
				System.out.println(e);//2
			}
			
			try {
				int z[]=new int[args.length];
				z[100]=10;
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);//3
			}
		}finally {
			System.out.println("I am finally");//1
		}
		
	}

}
