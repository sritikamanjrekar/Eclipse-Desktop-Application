package practice;

public class Static {
	Static(){
		System.out.println("hello constructor");
	}
	
	Static(int n){
		int x=20;
		System.out.println("hello is static constructor");
	}
	
	{
		//init block
		System.out.println("hello im init block");
	}
	
	static {
		System.out.println("hello im static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Static();
		new Static();
		new Static();
		new Static(20);
		
	}

}
