package Sdet.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
	public static void main(String[] hsdf) throws NumberFormatException, IOException {
	
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		 
		
		 int size , req_num = 0;
		 System.out.println("Enter the array size ");
		 size = Integer.parseInt(reader.readLine());
		
		 int[] arr = new int[size];
		 
		 System.out.println("Enter " +size + " values");
		 
		 
		 for(int i=0 ; i<size ; i++) {
			 arr[i] = Integer.parseInt(reader.readLine());
		 }
		 
		 System.out.println("Enter the values required sum number");
		 
		 req_num = Integer.parseInt(reader.readLine());
		 
		 for(int i=0 ; i<size ; i++) {
			 for(int j=i+1 ; j<size ; j++) {
				 if(arr[i]+arr[j] == req_num) {
					 System.out.println("("+arr[i]+","+arr[j]+")"	);
				 }
			 }
		 }
		 
		
	}
}
