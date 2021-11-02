package exception;

public class DemoTest {
	void sum(int... x) {//more than one args can take ...
		int total=0;
		for(int x1:x) {
			total=total+x1;
			System.out.println(total);
		}
		System.out.println("var arg method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoTest d=new DemoTest();
		d.sum(10);
		d.sum(10,20);
		d.sum(10,20,30);
		d.sum(10,20,30,40);
		d.sum(10,20,30,40,50);
		
	}

}
