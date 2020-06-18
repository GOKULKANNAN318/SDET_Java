package Sdet.Task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1_Q5 {
	public static void main(String asj[]) throws NumberFormatException, IOException {


		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));


		int size , req_num = 0;
		System.out.println("Enter the array size ");
		size = Integer.parseInt(reader.readLine());

		int[] arr = new int[size];

		System.out.println("Enter " +size + " values");


		for(int i=0 ; i<size ; i++) {
			arr[i] = Integer.parseInt(reader.readLine());
		}

		int val = 1,flag=0;
		for(int i=0 ; i<size ; i++) {
			val = 1; 
			while(arr[i]>=val) {
				if(arr[i] == val) {
					flag = 1;
					System.out.println("YES");
					break;
				} else {
					val = val * 2 ;
					flag = 0;
				}
			}

			if(flag==0) {
				System.out.println("NO");
			}else if(arr[i]==0) {
				System.out.println("NO");
			}
		}




	}

}
