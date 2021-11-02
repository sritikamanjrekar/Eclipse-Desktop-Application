package exception;
import java.io.*;

 class Exception8{

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		try {
		FileReader file=new FileReader("C:\\Users\\Sritika manjrekar\\Desktop\\today.txt");
		BufferedReader fileInput=new BufferedReader(file);
		
		for(int counter=0;counter<3;counter++) {
			System.out.println(fileInput.readLine());
			fileInput.close();
		}
		
		}catch(IOException io) {
			System.out.println(io);
		}
			
	}

}
