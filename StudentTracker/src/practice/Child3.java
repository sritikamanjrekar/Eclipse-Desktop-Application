package practice;

class Base3 extends Dadaji{
	int x=50;
	
}

class Dadaji{
	int x=70;
}

public class Child3 extends Base3 {
	
	int x=20;
	//int y=20;
	
	void show() {
		System.out.println(x); //20
		System.out.println(super.x);//50
		System.out.println(((Dadaji)this).x);//70
	}

	public static void main(String[] args) {
		Child3 c1=new Child3();
		c1.show();

	}

}
