package abstraction;

interface My2{
	void show();
}
interface My3{
	void display();
}

public class Child2 implements My2,My3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My2 m2=new Child2();
		m2.show();
		My3 m3=new Child2();
		m3.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("display");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

}
