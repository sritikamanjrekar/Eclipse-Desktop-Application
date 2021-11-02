package abstraction;

public class Dog extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d =new Dog();
		d.speak();
		d.hunt();
	}

	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println("woof woof");
	}

	@Override
	void hunt() {
		// TODO Auto-generated method stub
		System.out.println("bite");
	}

	 
}
