package Sdet.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		 
		
		 int size ;
		 System.out.println("Enter the array size ");
		 size = Integer.parseInt(reader.readLine());
		
		 int[] arr = new int[size];
		 
		 System.out.println("Enter " +size + " values");
		 
		 int temp=0;	
		 
		 for(int i=0 ; i<size ; i++) {
			 arr[i] = Integer.parseInt(reader.readLine());
		 }
		 
		 
		 for(int i = 0 ; i<size ; i++){
			 for(int j = i+1 ; j<size ; j++) {
				 if(arr[i] >= arr[j]) {
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
		 
		 System.out.print ("{");
		 
		 for( int i : arr) {
			 System.out.print(i);
			 System.out.print(",");
		 }
		 
		 System.out.println ("}");
		 
		 for(int i = 0 ; i<size ; i++){
			 for(int j = i+1 ; j<size ; j++) {
				 if(arr[i] <= arr[j]) {
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
		 System.out.print ("{");
		 for( int i : arr) {
			 System.out.print(i);
			 System.out.print(",");
		 }
		 
		 System.out.println ("}");
		 
	}
}
