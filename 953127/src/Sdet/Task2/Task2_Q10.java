package Sdet.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Task2_Q10 {

	public static void main(String[] args) throws NumberFormatException, IOException {



		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

		int itr = 0;

		itr = Integer.parseInt(reader.readLine());

		while(itr>0) {

			int N,K,M;

			N = Integer.parseInt(reader.readLine());
			K = Integer.parseInt(reader.readLine());
			M = Integer.parseInt(reader.readLine());


			int[] arr = new int[N];
			int[] arr1 = new int[0];
			for(int i=0 ; i<N ; i++) {

				arr[i] = Integer.parseInt(reader.readLine());
			}
int sum = 0;

			Arrays.sort(arr);
			int itr1 = 1,itr2 = 0;int obtained = 0,expected = 0;

			for(int j=0 ; j<N ; j++) {
				for(int l=j+1 ; l<N ; l++) {

					arr1 = Arrays.copyOf(arr1, itr1);
					itr1++;
					System.out.println("{"+arr[j] +"   "+arr[l] +"}");
					arr1[itr2] = arr[j] + arr[l] ;
					itr2++;
					/*for (int sub = l ; sub < j+K+1 ; sub++) {
						System.out.println( "dshgfsdh");
						System.out.println(j);
						System.out.println(l+" "+(j+K+1));
						System.out.println(arr[j]+" "+arr[sub]);
						System.out.println(sub);
					}*/
				}

			}

			for(int h = 0 ; h < arr1.length ; h++) {
				obtained = arr1[M-1];
				expected  = arr1[0];
				
			}

			System.out.println(obtained - expected );





		}

	}

}
