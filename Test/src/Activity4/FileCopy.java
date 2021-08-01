package Activity4;


import java.io.*;
import java.util.Scanner;

public class FileCopy {
	

	
		public static void main(String[] args) throws Exception {
		
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Source File");
			String sourceFile = sc.next();
			System.out.println("Enter Destination File");
			String destinationFile = sc.next();
			FileReader fin = new FileReader(sourceFile);
			FileWriter fout = new FileWriter(destinationFile,true);
			int c;
			while ((c = fin.read()) != -1) {  
				   fout.write(c);  
				  }  
				  System.out.println("Copy finish...");  
				  fin.close();  
				  fout.close();  
			
			sc.close();
			
		}
	

}
