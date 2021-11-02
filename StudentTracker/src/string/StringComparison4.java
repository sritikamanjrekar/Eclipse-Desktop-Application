package string;

public class StringComparison4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="sachin";
		String s2="Sachin";
		
		String s3=new String("Sachin");
		
		String s4="saurav";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s4));
		
		System.out.println(s1==s2);
		
		System.out.println(s1==s4);
		
		System.out.println(s1==s3);
	}

}
