package Core_Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q5 {
	public static void main(String[] sdg) throws NumberFormatException, IOException {
		
		 BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		 
		 int a , b ,c = 0 ;
		 System.out.println("Enter two numbers ");
		 a = Integer.parseInt(reader.readLine());
		 b = Integer.parseInt(reader.readLine());
		System.out.println("Before Swap " + a + "  "  + b);
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("After Swap " + a + "  "  + b);
	}
}
