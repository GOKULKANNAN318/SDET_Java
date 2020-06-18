package Sdet.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
	public static void main(String hfd[]) throws IOException {

		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String : ");

		String string1 = reader.readLine();

		char[] string = string1.toCharArray();

		int count = 0; 

		for (int i = 0 ; i < string.length ; i++ ) {
			count = 1;
			for(int j = i+1 ; j < string.length ; j++) {
				if(string[i] == string[j] && string[i] != '£') {
					string[j] = '£' ;
					count = count+1;
				}
			}
			if(string[i] != '£' && count != 1)
			System.out.println(string[i] +" = " + count);
		}
	}
}
