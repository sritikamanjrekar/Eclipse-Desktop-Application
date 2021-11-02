package abstraction;

interface My9{
	int x=40;//static & final
}



public class Child6 implements My9{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//My9.x=50;
		System.out.println(My9.x);
	}

}
