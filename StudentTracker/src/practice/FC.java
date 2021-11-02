package practice;
import java.util.Scanner;

public class FC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter the fah temp");
		double fah = scn.nextDouble();
		double cel = 5*(fah-32)/9;
		System.out.println("Temperature is "+cel+"degree celcius");
	}

}
