package string;

public class StringConcatenation1 {
	public static void main(String args[]) {
		String s1="Sachin "+"Tendulkar";
		String s2=new String("hello");
		s1.concat(s2);
		String s3=s2.concat(""+s2);
			System.out.println(s1);
			System.out.println(s3);
	}

}
