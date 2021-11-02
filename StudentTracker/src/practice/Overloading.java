package practice;

public class Overloading {
	void show() {
		System.out.println("hello");
	}
	
	void show(int x) {
		System.out.println("hello by integer");
	}
	
	void show(long x) {
		System.out.println("hello by long");
	}
	
	void show(char x) {
		System.out.println("hello by char");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading f1=new Overloading();
		f1.show();
		f1.show(10);
		f1.show(101);
		f1.show('z');
	}

}
