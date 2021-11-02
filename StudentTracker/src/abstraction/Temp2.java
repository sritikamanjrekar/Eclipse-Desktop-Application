package abstraction;

public class Temp2 {
	final int x=20;
	static int z=40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp2 t=new Temp2();
		final int y=40;
		//t.x=20; error final data member cannot change value
		System.out.println(t.x);
		System.out.println(y);
		System.out.println(t.x+80);
		z=90;
		System.out.println(z);
	}

}
