package Core_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		int input;
		
		 BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		 
		 System.out.println("Enter the Number : ");
		 input = Integer.parseInt(reader.readLine());
		 
		 for (int i = 0 ; i < 10  ; i++) {
			 System.out.println(input +" X " + (i+1)  +" = " +(input*(i+1)));
		 }
		
	}
}
