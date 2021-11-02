package string;

public class StringBufferExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb.capacity());
		
		sb.append("Hello");
		
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(10);
		
		System.out.println(sb.capacity());
		
		sb.ensureCapacity(35);
		
		System.out.println(sb.capacity());
	}

}
