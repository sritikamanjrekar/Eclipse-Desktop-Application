package string;

public class StringComparison1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sachin"+"Tendulkar";
		String s2=new String("hello");
		
		s1.concat(s2);
		
		String s3=s2.concat("" +s1);
		
		System.out.println(s1);
		
		System.out.println(s3);
	}

}
