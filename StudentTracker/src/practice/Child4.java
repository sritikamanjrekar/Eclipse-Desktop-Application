package practice;

class Base4{
	A show(){
		System.out.println("base");
		return new A();
	}
	


}
public class Child4 extends Base4{
	

	B show() {
		System.out.println("Child");
		super.show();
		return new B();
	}

	public static void main(String[] args) {
		Child4 c=new Child4();
		c.show();
		
	}
}
class A{}
class B extends A{}
