package Core_Java;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		  int i = 0, remainder = 0;
		  int[] sum = new int[20];
		  Scanner in = new Scanner(System.in);

		  System.out.print("Enter the first number: ");
		  a = in.nextInt();
		  System.out.print("Enter the second number: ");
		  b = in.nextInt();

		  while (a != 0 || b != 0) 
		  {
		   sum[i++] = (int)((a % 10 + b % 10 + remainder) % 2);
		   remainder = (int)((a % 10 + b % 10 + remainder) / 2);
		   a = b / 10;
		   b = b / 10;
		  }
		  if (remainder != 0) {
		   sum[i++] = remainder;
		  }
		  --i;
		  System.out.print("Sum of two binary numbers: ");
		 /*
		  while (i >= 0) {
		   System.out.print(sum[i--]);
		  }*/
		  
		  int reopen = 0,k=1;
		 
		
		 for (int j = 0 ; j <= i ; j++) {
			 
			 reopen = reopen+(sum[j] * k);
			 k=k*10;
			 
		 }
		 System.out.println(reopen);
		  
		   
		 }
		}