package Sdet.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		 
		
		 int size ;
		 System.out.println("Enter the array size ");
		 size = Integer.parseInt(reader.readLine());
		
		 size = size - 1; 
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
		 
		 
	
		 int num = 1;
		 for(int i = 0 ; i<size ; i++) {
			 if(arr[i] == num){
				 num++;
			 } else {
				 System.out.println("Missing number is : " + num);
				 break;
			 }
			 
			 if(arr[size-1] == size+1) {
				 
			 }else {
				 System.out.println("Missing number is : " + (size+1));
				 break;
			 }
		 }
		 

	}

}
