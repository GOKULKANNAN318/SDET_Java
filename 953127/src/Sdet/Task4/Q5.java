package Sdet.Task4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
	public static void main(String[] hsdf) throws NumberFormatException, IOException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));


		int size , req_num = 0;
		System.out.println("Enter the array size ");
		size = Integer.parseInt(reader.readLine());

		int[] arr = new int[size];

		System.out.println("Enter " +size + " values");


		for(int i=0 ; i<size ; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}

		System.out.println("Enter the values required sum number");

		req_num = Integer.parseInt(reader.readLine());
		int sum = 0;
		for(int i=0 ; i<size ; i++) {
			sum = 0;
			for(int j=i ; j<size ; j++) {
				sum = sum+arr[j];
				if(sum < req_num){
					continue;
				}

				if(sum == req_num) {
					System.out.print("{");
					for(int k=i ; k<=j ; k++ ) {
						System.out.print(arr[k]);
						if(k!=j) {
							System.out.print(",");	
						}
					}
					System.out.println("}");
					break;
				}

				if(sum > req_num) {
					break;
				}


			}
		}


	}
}

