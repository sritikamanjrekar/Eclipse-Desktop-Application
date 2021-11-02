package abstraction;

interface My6{
	

	void display();
}
interface My5{
	

	void show();
}

public class Child4 implements My5,My6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My5 m5=new Child4();
		m5.show();
		My6 m6=new Child4();
		m6.display();
		//downcasting
		Child4 c=(Child4)m6;
		c.display();
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
