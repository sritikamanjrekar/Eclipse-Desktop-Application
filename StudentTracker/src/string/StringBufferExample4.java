package string;

public class StringBufferExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Hello");
		
		sb.replace(1, 3, "Java");
		
		System.out.println(sb);
		
		sb.delete(1, 5);
		
		System.out.println(sb);

	}

}
