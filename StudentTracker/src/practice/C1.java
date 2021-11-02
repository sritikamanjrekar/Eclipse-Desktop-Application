package practice;

class A1{
	A1(){
		System.out.println("A");
	}
}

class B1 extends A1{
	B1(int x){
		System.out.println("default");
		//not printed on screen 
	}
	
	B1(){
		System.out.println("B");
	}
}
public class C1 extends B1{
	
	C1(){
		System.out.println("C");
	}
	
	C1(int x){
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C1();
		new C1(20);
	}
	//a
	//b
	//c
	//

}
