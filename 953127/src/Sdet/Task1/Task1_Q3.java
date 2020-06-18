package Sdet.Task1;

import java.io.IOException;
import java.util.Scanner;

public class Task1_Q3 {

	public static void main(String[] hsdf) throws NumberFormatException, IOException {
		
		
		Scanner scan = new Scanner(System.in);
		
		int sizea , sizeb;
		
		System.out.println("Enter 2 numbers");
		
		sizea = scan.nextInt();
		
		sizeb = scan.nextInt();
		
		int[] arr = new int[sizea];
		
		
		int[] arr1 = new int[sizeb];
		
		
		System.out.println("Enter "+sizea+" numbers");
		
		for(int i=0;i<sizea;i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Enter "+sizeb+" numbers");
		for(int i=0;i<sizeb;i++) {
			arr1[i] = scan.nextInt();
		}
		
		
		int temp = 0;
		for(int i = 0 ; i<sizea ; i++){
			 for(int j = i+1 ; j<sizea ; j++) {
				 if(arr[i] <= arr[j]) {
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				 }
			 }
		 }
		
		for(int e : arr) {
	//		System.out.println(e);
		}
		
		
		for(int i=0;i<sizeb;i++) {
			for(int j=0;j<sizea;j++) {
				//System.out.println(arr1[i] +"   "+arr[j]);
				if(arr1[i]>arr[j]) {
					System.out.println(arr[j]);
					break;
				}
			}
		}
		
		
		
	}
	
}
