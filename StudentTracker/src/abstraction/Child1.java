package abstraction;

interface My1{
	void show();
}
public class Child1 implements My1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		My1 m=new Child1();//upcasting
		m.show();
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

}
