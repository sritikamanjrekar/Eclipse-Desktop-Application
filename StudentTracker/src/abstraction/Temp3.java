package abstraction;

public class Temp3 {
	static int x=40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp3 t=new Temp3();
		t.x=t.x+80;
		System.out.println(t.x);//120
		
		Temp3 t1=new Temp3();
		t.x=t1.x+80;//80+120=200
		System.out.println(t1.x);//200
		System.out.println(t.x);//200
		
		
	}

}
