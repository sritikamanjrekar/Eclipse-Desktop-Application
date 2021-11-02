package array;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		//array declaration
		int[] n=new int[8];
		
		//array initialization
		int[] k= {5,2,6,1,0,3,4,8,9 };
		
		System.out.println("Enter elements in Array:");
		
		for(int i=0;i<n.length;i++) {
			n[i]=sc.nextInt();
		}
		
		//for each
		for(int temp:n) {
			System.out.println(temp);
		}

	}

}
