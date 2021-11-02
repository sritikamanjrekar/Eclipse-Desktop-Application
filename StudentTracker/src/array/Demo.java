package array;

public class Demo {

	public static void main(String[] args) {
		//array declaration
		int[] n=new int[8];
		
		//array decl & init
		int[] k= {4,6,2,7,9,4,2,1 };
		
		for(int i=0;i<n.length;i++) {
			
			System.out.println(n[i]);
		}
		
		//for each : suitable traversing
		
		for(int temp:k) {
			System.out.println(temp);
		}

	}

}
