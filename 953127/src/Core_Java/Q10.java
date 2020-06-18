package Core_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {
	public static void main(String dsnh[]) throws IOException {
		
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the String : ");
		
		String string1 = reader.readLine();
		
		char[] string = string1.toCharArray(); 
		
		System.out.println("The Reversed String is : ");
		
		String reopened = "";
	for (int i = string1.length()-1; i >= 0 ; i--) {
		//System.out.print(string[i]);
		reopened = reopened+string[i];
	}
	System.out.print(reopened);
	}
}
