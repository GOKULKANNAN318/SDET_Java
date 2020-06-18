package Sdet.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10 {

	public static void main(String[] args) throws IOException {

		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String : ");

		String string1 = reader.readLine();

		char[] string = string1.toCharArray();

		int rep = 1 , nonrep = 1;
		 int k = 1;

		for(int i = 0 ; i<string.length ; i++) {
			for(int j = i+1 ; j<string.length ; j++) {
				if(rep == 1) {
					if (string[i] == string[j]){
						rep = 2;
						System.out.println("First Repeated character : " + string[i]);
						break;
					}
				}
				
				if(nonrep == 1) {
					if (string[i] == string[j]){
						nonrep = 2;
					}
				}
				
			}
			
			if(nonrep == 1 && k == 1) {
				k++;
				System.out.println("First Non Repeated character : " + string[i]);
				
			}

		}

	}

}
