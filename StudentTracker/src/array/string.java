package array;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Buffer b-sachin
		
		StringBuilder sbu=new StringBuilder("hi");
		StringBuilder sbu1=new StringBuilder("hi");
		StringBuffer sb=new StringBuffer("Hello");
		StringBuffer sb1=new StringBuffer("Hello");
		
		String s1="Hello";
		String s2="Hello";
		
		System.out.println(sbu.equals(sbu1));
		System.out.println(sb);
		System.out.println("String Buffer "+sb.equals(sb1));
		System.out.println("String: "+s1.equals(s2));
		System.out.println(sb==sb1);
		System.out.println(s1==s2);
		System.out.println(sb.charAt(1));
	}

}
