package string;

public class StringComaprison11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Sachin";
		String s2="Sachin";
		
		String s3=new String("Sachin");
		String s4=new String("RST");
		String s5=new String("Forum");
		
		String s6="RST"+"Forum";
		
		String s11=s5.concat("networking");
		
		System.out.println(s11);
		
		String s7=s4.concat("Forum");
		
		final String s8="RST"+"Forum";
		
		String s9=s8+"for networking";
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equals(s3));
		
		System.out.println(s1.equals(s4));
		
		System.out.println(s8.equals(s9));

	}

}
