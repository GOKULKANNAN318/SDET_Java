package Sdet.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q6 {
	public static void main (String hgfd[]) throws NumberFormatException, IOException {

		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

		long num ;
		System.out.println("Enter the Number");
		num = Long.parseLong(reader.readLine());
		long num1 = num;
		boolean flag = false;
		for(int i=0 ; num!=0 ; i++) {
			if(num%10 == 0) {
				flag = true;
				num = num/10;
				continue;
			}else if(num%10 == 1){
				flag = true;
				num = num/10;
				continue;
			} else if(num%10 > 1) {
				flag = false;
				num = num/10;
				break;
			}


		}
		
		if(flag == true) {
			System.out.println("The given number "+num1 + " is binary");
		} else {
			System.out.println("The given number "+num1 + " is not binary");
		}


	}
}
