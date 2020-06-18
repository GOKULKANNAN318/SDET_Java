package Sdet.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
	public static void main(String sdhf[]) throws NumberFormatException, IOException {
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		 
		
		 int size , f_max=0,max=0;
		 System.out.println("Enter the array size ");
		 size = Integer.parseInt(reader.readLine());
		
		 int[] arr = new int[size];
		 
		 System.out.println("Enter " +size + " values");
		 
		 
		 for(int i=0 ; i<size ; i++) {
			 arr[i] = Integer.parseInt(reader.readLine());
			 if(arr[i]>0) {
				 f_max = i;
			 }
		 }
		 
		 //arr[max] = 0;
		 
		 for(int i=0 ; i<size ; i++) {
			if(i==f_max)
				continue;
			 if(arr[i]>0) {
				 max = arr[i];
			 }
		 }
		 
		 
		 System.out.println("Second largest number is : " + max);
	}
}
