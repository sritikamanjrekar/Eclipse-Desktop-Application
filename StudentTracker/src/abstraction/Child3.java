package abstraction;

interface My4{
	void show();
	
}

class Temp1{
	void show() {
		System.out.println("show");
	}
}
//extends then implement
public class Child3 extends Temp1 implements My4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My4 m1=new Child3();
		//upcasting
		m1.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("hello show");
	}

}
