package practice;

class Base2{
	void show() {
		System.out.println("Base");
	}
}

public class Child5 extends Base2{
void show() {
	System.out.println("Child");
}
	public static void main(String[] args) {
		//up casting
		Base2 c=new Child5();
		c.show();

	}

}
