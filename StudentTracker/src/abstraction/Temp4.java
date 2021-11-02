package abstraction;

public class Temp4 {
	int x;
	
	Temp4(int x){
		this.x=x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp4 t=new Temp4(100);
		System.out.println(t.x);//100
		
		t.x=t.x+80;//180
		System.out.println(t.x);//180
		
		Temp4 t1=new Temp4(40);
		t1.x=t1.x+90;//130
		System.out.println(t1.x);//130
		
	}

}
