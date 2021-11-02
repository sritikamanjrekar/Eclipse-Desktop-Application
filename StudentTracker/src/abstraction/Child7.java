package abstraction;

interface My10{
	void display();
	void show();
}

public class Child7 implements My10{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My10 m=new Child7();
		m.display();
		m.show();
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
