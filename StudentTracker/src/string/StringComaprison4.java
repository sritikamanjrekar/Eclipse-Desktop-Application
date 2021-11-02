package string;

public class StringComaprison4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="aaBhin";
		String s2="aachin";
		String s3="Gaurav";
		String s4="Gaurav";
		
		s2.concat(s4);
		
		System.out.println(s2);
		
		System.out.println(s2.compareTo(s2));
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s3.compareTo(s4));
	}

}
