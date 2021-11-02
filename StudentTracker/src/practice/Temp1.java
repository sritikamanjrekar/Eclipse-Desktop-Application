package practice;

public class Temp1 {
	int x;
	int y;
	
	Temp1(int x,int y){
		System.out.println("Constructor Invoked");
		this.x=x;
		this.y=y;
	}
	
	void show() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp1 t=new Temp1(10,20);
		t.show();
	}

}
