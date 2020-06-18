package Core_Java;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] dkjs) {
		double x1,y1,x2,y2,result;
		double earthRadius = 6371.01; 
		Scanner input = new Scanner(System.in);
		System.out.print("Input the latitude of coordinate 1: ");
		x1 = input.nextDouble();
		System.out.print("Input the longitude of coordinate 1: ");
		y1 = input.nextDouble();
		System.out.print("Input the latitude of coordinate 2: ");
		x2 = input.nextDouble();
		System.out.print("Input the longitude of coordinate 2: ");
		y2 = input.nextDouble();

		x1 = Math.toRadians(x1);
		y1 = Math.toRadians(y1);
		x2 = Math.toRadians(x2);
		y2 = Math.toRadians(y2);

		result = earthRadius * Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(y1)*Math.cos(y2)*Math.cos(y1 - y2));

System.out.println(result);		
		
	}

}