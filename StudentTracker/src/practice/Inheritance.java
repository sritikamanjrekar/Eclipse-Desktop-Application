package practice;

class BaseClass{
	
	//default constructor
	BaseClass(){
		System.out.println("Parent Class\n");
	}
}

public class Inheritance extends BaseClass {
	Inheritance(){
		System.out.println("\tprinting from subclass\n");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Inheritance();
		
	}

}
