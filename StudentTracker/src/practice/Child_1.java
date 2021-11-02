package practice;

class Base1{
	private int x=20;
	void show() {
		System.out.println(x);
	}
}

public class Child_1 extends Base1{

	public static void main(String[] args) {
		Child_1 c1=new Child_1();
		c1.show();
	}

}
