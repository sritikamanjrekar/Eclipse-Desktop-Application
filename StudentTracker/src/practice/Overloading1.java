package practice;

public class Overloading1 {

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
	
	void show(String x) {
		System.out.println("hello by string");
	}
	
	void show(int x,char y,long l) {
		System.out.println("hello by triple args");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading1 f1=new Overloading1();
		f1.show();
		f1.show(10);
		f1.show("abc");
		f1.show('z');
	}

}
