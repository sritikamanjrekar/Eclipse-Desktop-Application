package array;

public class BinarySearch {
	
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7};
		
		int s=9;
		
		 int mid=(a.length)/2;
		 
		 //System.out.println("mid index value "+mid+"\n");//3
		 //System.out.println("mid array value"+a[mid]+"\n");//3 index mila a[3] matlab a[mid]=4
		 
		 if(s==a[mid]) //s meh 3 hai......mid 3 jo hai index hai...
		 {
			System.out.println("Found at "+mid);
		 }
		 
		 
		 else if(s>a.length){
			 
			 System.out.println("NotFound");
			 
		 }	 else {
		 
			 if(s<a[mid]) {
				 for(int i=0;i<a[mid];i++) {
					 if(s==a[i]) {
						 System.out.println("Found at "+i);
					 }
				 }
			 }else {
				 for(int i=mid;i<a.length;i++ ) {
					 if(s==a[i]) {
						 System.out.println("Found at "+i);
					 }
				 }
			 }
		 }
	}

}
