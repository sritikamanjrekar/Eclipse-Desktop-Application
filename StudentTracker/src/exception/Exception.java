package exception;

public class Exception {
	void work() {
		try {
			this.dowork();
		}catch(ArithmeticException e) {
			
		}
		System.out.println("do your work");
	}

	 void dowork() {
		// TODO Auto-generated method stub
		this.domorework();
		System.out.println("do others work");
	}

	 void domorework() {
		// TODO Auto-generated method stub
		 doownwork();
		 System.out.println("do my work");
		
	}

	 void doownwork() {
		// TODO Auto-generated method stub
		System.out.println(10/0);
		System.out.println("okay");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception e=new Exception();
		e.work();
		System.out.println("chalega na");
	}

}
