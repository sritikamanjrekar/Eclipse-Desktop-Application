package string;

public class StringBufferExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		
		for(int i=sb.length()-1; i>0; i--) {
			System.out.println(sb.charAt(i));
		}
	}

}
