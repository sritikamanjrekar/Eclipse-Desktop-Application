package string;

public class StringBufferExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//doubt
		
		StringBuffer sb=new StringBuffer();
		
		System.out.println(sb.capacity());//10
		
		sb.append("hello");
		
		sb.ensureCapacity(100);
		
		System.out.println(sb.capacity());//16
		
		sb.append("Java is my fav language ");
		
		System.out.println(sb.capacity());
		
		sb.append("python is my fav language");
		
		System.out.println(sb.capacity());

	}

}
