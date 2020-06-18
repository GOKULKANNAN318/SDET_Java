package Core_Java;

import java.util.Scanner;

public class Q8 {
	public static void main (String[] asfha) {
		
		  int a = 0 , temp=0;
		//  int[] sum = new int[20];
		  Scanner in = new Scanner(System.in);

		  System.out.print("Enter the first number: ");
		  System.out.println();
		  a = in.nextInt();
		
		  for(int i=0;a!=0;i++) {
			  temp = temp + (a%10) ;
			  a=a/10;
			  
		  }
		  System.out.print(temp);
	}
}


