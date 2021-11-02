package practice;

public class InitBlock {
	int x=10;
	{
		System.out.println("Default");
	}
	
	InitBlock(int x){
		this.x=x;
		System.out.println(x);
		System.out.println(this.x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InitBlock(20);
	}

}
