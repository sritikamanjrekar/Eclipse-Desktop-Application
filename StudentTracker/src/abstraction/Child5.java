package abstraction;

//u can use declare regular method in interface with the help of default/static
interface My7{
	public default void show() {
		System.out.println("My7");
	}
}

interface My8{
	public default void show() {
		System.out.println("MY8");
	}
}

public class Child5 implements My7,My8{
	public void show() {
		System.out.println("Child");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My7	m=new Child5();
		m.show();
		My8 m8=new Child5();
		m.show();
	}

}
