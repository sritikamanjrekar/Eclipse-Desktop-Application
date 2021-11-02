package exception;

public class Exception7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				try {
					System.out.println("gng to divide");
					int b=39/0;
					System.out.println(b);
					
				}catch(ArithmeticException e) {
					System.out.println(e);
				}
				try {
					int a[]=new int[5];
					a[10]=4;
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(e);
				}
				
			}catch(ArithmeticException e) {
				
			}
			
			System.out.println("Normal flow");
	}

}
