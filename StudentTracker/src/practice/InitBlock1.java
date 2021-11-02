package practice;

public class InitBlock1 {
InitBlock1(){
	System.out.println("default");
}
{
	System.out.println("init Block");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InitBlock1();
		new InitBlock1();
		System.out.println("hello from main");
	}

}
