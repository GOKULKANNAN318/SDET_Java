package Sdet.Task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

//the longest repeating sequence in a string

public class Task3_Q10 {
	   public static void main(String[] args) throws NumberFormatException, IOException {  
	
		   BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

			int itr = 0;
			
			itr = Integer.parseInt(reader.readLine());

		//	long sum = 0,sum1=0;
			
			double arr[] = new double[itr];
			
			for(int i=0 ; i<itr ; i++)  {
				arr[i] = Double.parseDouble(reader.readLine());
			}
			
			double test = 0.00;
			int num  = 0;
			
		String frac = "";	
		long total = 0;
		double decimal = 0.00;
		
		int dsf = 0;
	  for(int i=0 ; i<itr ; i++)  {
		  
		  test = arr[i];
		  num = (int) test ; 
	  frac = Double.toString(test);
	  //dsf = frac.substring(frac.indexOf(".")).length();
	  frac = frac.substring(frac.indexOf(".")+1);
	  decimal = Double.parseDouble(frac);
	  

	 String nuum = String.valueOf(num);
	 
	  
	 char[] numarray = nuum.toCharArray();
	 String itrw = "";
	 BigInteger bignum1 ;
	 BigInteger multiplyer = new BigInteger( "1");
	 BigInteger sumnum = new BigInteger( "0");
	 BigInteger sumnumfinal = new BigInteger( "0");
	 
	 for(int ka = numarray.length -1; ka>=0 ; ka--){
		 
		 itrw = String.valueOf(numarray[ka]);
		 
		 bignum1 = new BigInteger(itrw);
		 
		 sumnum = (bignum1.multiply(multiplyer));
		 
		 sumnumfinal = sumnumfinal.add(sumnum);
		 
		 multiplyer = multiplyer.multiply(new BigInteger("10"));
		 
		// System.out.println(sumnum);
	 }
	 
	  //System.out.println(num+" "+decimal);
	  //System.out.println(frac);
	  char[] decimalarr = frac.toCharArray();
	  BigInteger big2 ;
	  BigInteger sum11 = new BigInteger( "0");
	  String  number = String.valueOf(num);
	  
	  BigInteger big = new BigInteger( "700000005"); //value of 10^-1
	  
	  //BigInteger big4 = new BigInteger( number);
	  
	  BigInteger finalsum = new BigInteger( "0");
	  
	  itrw = "";
	  for(int it = 0 ; it <decimalarr.length ; it++) {
		  itrw = String.valueOf(decimalarr[it]);
		  big2 = new BigInteger(itrw);
		  sum11 = (big2.multiply(big));
		  for(int j=0;j<it;j++) {
		  sum11 = sum11.multiply(big);
		  }
		  finalsum  = finalsum.add(sum11);
		//  System.out.println(finalsum);
		  
	  }
	  BigInteger mod = new BigInteger( "1000000007");   //value of 10^9 + 7
	  
	  finalsum  = finalsum.add(sumnumfinal);
	  
	  BigInteger big4 = finalsum.mod(mod);
	  
	  String fv  = big4.toString();
	  int fv1 = Integer.valueOf(fv);
	  if(fv1>0) {
	  System.out.println(finalsum.mod(mod));
	  }
	  else {
		  System.out.println("-1");
	  }
	  
	  
	  
	  
/*  BigInteger big1,big5,big7; 
	  
	  BigInteger big3 = new BigInteger( "3");
	  BigInteger big6 = new BigInteger( "6");
	  big2 = new BigInteger( "2");
	  ///System.out.println(jvs);
	  big1 = big.multiply(big).multiply(big3);
	  big7 = big.multiply(big).multiply(big).multiply(big6);
	  //System.out.println(big1);
	  
	  big2 = big.multiply(big2);
	  //System.out.println(big2);
	  
	  
	  
	  big5 = big4.add(big1).add(big2).add(big7);
	  //System.out.println(big5);
	  System.out.println(big5.mod(mod));
*/
	  
	  } 
	  

		   
		   
	  
	  
	  
		  
//	  System.out.println((1+(700000005*2)+(700000005*700000005*3)));
	  
	  
	  
	  
	//  System.out.println(output%jvs);
//	  System.out.println(sum1); //1000000007;
	   
	   }  

}

