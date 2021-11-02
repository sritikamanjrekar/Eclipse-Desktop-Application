package practice;

class Parent{
	int x=50;
}

public class Child_2 extends Parent {
	int x=20;
	void show() {
		System.out.println(x);
		System.out.println(super.x);
	}

	public static void main(String[] args) {
		Child_2 c1=new Child_2();
		c1.show();

	}

}
