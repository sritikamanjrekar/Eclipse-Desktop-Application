package array;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] k= {5,2,7,4,9,1,5,3};
		
		int ke=3;
		
		for(int i=0;i<k.length;i++) {
			if(k[i]==ke) {
				System.out.println("Found at "+i);
			}
		}

	}

}
