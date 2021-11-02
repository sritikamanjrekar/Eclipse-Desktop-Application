package array;

public class ArrayMul {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2D dcl and init
		int[][] a= {{1,1,1},{1,1,1},{1,1,1}};
		
		int[][] b= {{1,1,1},{1,1,1},{1,1,1}};
		
		//2D array decl
		int[][] res=new int[3][3];
		
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				for(int t=0;t<3;t++) {
					res[r][c]=res[r][c]+a[r][t]*b[t][c];
					
				}
			}
		}
		
		for(int r=0;r<3;r++) {
			for(int c=0;c<3;c++) {
				System.out.print(res[r][c]+" ");
			}
			System.out.println("");
		}
		
	}

}
