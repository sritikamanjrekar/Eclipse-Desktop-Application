package practice;

public class Temp {
	int x;
	
	void Show() {
		System.out.println("Show");
	}
	
	{
		//init block
		x=50;
	}
	
	Temp(int x){
		System.out.println(this);
		System.out.println(this.x);
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Temp t1=new Temp(20);
		t1.Show();
		System.out.println(t1);
	}

}
