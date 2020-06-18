package Core_Java;

import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
	public static void main (String[] asfha) {
		
		  int a = 0 , temp=0;
		//  int[] sum = new int[20];
		  Scanner in = new Scanner(System.in);

		  System.out.print("Enter the first number: ");
		  System.out.println();
		  a = in.nextInt();
		  
		  int sum[] = new int[0]; 
		int size =0;
		  for(int i=0;a!=0;i++) {
			  temp = (a%10) % 2 ;
			  a=a/2;
			 // System.out.print(temp);
			  sum = Arrays.copyOf(sum, size+i+1);
			//  System.out.println("Length is : " +sum.length);
			  sum[i] = temp;
		  }
		  
		  int reopen = 0,k=1;
			 
			
			 for (int j = 0 ; j <= sum.length-1 ; j++) {
				 
				 reopen = reopen+(sum[j] * k);
				 k=k*10;
				 
			 }
			 System.out.println(reopen);
			  
			
		  
	}
}
