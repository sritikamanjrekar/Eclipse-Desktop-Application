package practice;
 class Ram{
	static SOP naam;
	static {
		naam=new SOP();
	}
}
public class SOP {
	void le(String str) {

		System.out.println(str);
	}
	
	void le(int n) {
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ram.naam.le("Reena");
		Ram.naam.le(14);
	}

}
