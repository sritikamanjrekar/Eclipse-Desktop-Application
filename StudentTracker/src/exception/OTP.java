package exception;
import java.util.*;

public class OTP {
	
	static char[] OTp(int len) {
		System.out.println("Your otp is :");
		
		String num="1234567890";
		System.out.println(num.length());//length 10
		
		Random r=new Random();
		System.out.println(r.nextInt(8));
		System.out.println(r.nextInt(num.length()));//random generate single number
		
		char[] otp =new char[len];
		System.out.println(otp);//array is not initialize
		
		for(int i=0;i<len;i++) {
			otp[i]=num.charAt((r.nextInt(num.length()))); //?
			
		}
		
		return otp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OTp(6));
	}

}
