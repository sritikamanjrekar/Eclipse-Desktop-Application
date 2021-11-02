package abstraction;

public class Cat extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.speak();
		c.hunt();
	}

	@Override
	void speak() {
		// TODO Auto-generated method stub
		System.out.println("Hyy");
	}

	@Override
	void hunt() {
		// TODO Auto-generated method stub
		System.out.println("mew mew");
	}

}
