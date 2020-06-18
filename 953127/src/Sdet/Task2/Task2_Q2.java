package Sdet.Task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Task2_Q2 {

	public static void main(String args[]) throws IOException{  

		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int c[][]=new int[3][3];    

		 System.out.println("Multiplication of two matrices is :");
		for(int i=0;i<3;i++){    
			for(int j=0;j<3;j++){    
				c[i][j]=0;      
				for(int k=0;k<3;k++)      
				{      
					c[i][j]+=a[i][k]*b[k][j];      
				} 
				System.out.print(c[i][j]+" ");  
			}
			System.out.println();   
			// create a new file with specified file name
			FileWriter fw = new FileWriter("Report/myFilenew.log");

			// create the IO strem on that file
			BufferedWriter bw = new BufferedWriter(fw);

			// write a string into the IO stream
			//((Object) bw).out("my log entry");
			bw.append("my log entry new");
			

			// don't forget to close the stream!
			bw.close();
		}    
	}
	//Task 2 : Q1 is for printing product of matrix .
}
