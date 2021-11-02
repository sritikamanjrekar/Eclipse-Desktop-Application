package abstraction;

public class Monster implements Enemy{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster m=new Monster();
		m.Interface();
	}

	@Override
	public void Interface() {
		// TODO Auto-generated method stub
		System.out.println("Call from Interface method");
	}

}
