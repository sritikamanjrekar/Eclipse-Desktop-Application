package multitasking;

public class StandardDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {81,93,98,89,89};
		int a_length=a.length;
		int mean =0;
		for(int i=0;i<a_length;i++) {
			 mean =mean + a[i];
		}
		
		System.out.println(mean);//123
		
		mean=mean/a_length;
		System.out.println(mean);
		
		a_length=a_length-1;
		System.out.println(a_length);
		
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]-mean;
			System.out.println(a[i]);
		}
		
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*a[i];
			System.out.println(a[i]);
		}
		
		int b=0;
		for(int i=0;i<a.length;i++) {
			b=b+a[i];
		}
		System.out.println(b);
		int sd=b/a_length;
		
		System.out.println(Math.sqrt(sd));
		

	}

}
