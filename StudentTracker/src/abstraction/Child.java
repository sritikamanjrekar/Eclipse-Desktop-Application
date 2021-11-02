package abstraction;

interface My{
	void show();
}

class Temp{
	public void register(My m) {
		m.show();
	}
}

public class Child implements My{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c1=new Child();
		Temp t=new Temp();
		t.register(c1);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
	}

}
