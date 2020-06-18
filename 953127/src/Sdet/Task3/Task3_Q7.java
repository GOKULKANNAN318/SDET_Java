package Sdet.Task3;

//frequency of odd and even numbers in given matrix

public class Task3_Q7 {
	
	 public static void main(String[] args) {    
	        int rows, cols, countOdd = 0, countEven = 0;    
	            
	        //To initialize matrix a    
	        int a[][] = {       
	                        {4, 1, 3},    
	                        {3, 5, 7},    
	                        {8, 2, 6}    
	                    };    
	              
	          //To calculate number of rows and columns
	          rows = a.length;    
	        cols = a[0].length;    
	            
	        //To count the number of even elements and odd elements    
	        for(int i = 0; i < rows; i++){    
	            for(int j = 0; j < cols; j++){    
	              if(a[i][j] % 2 == 0)    
	                countEven++;    
	              else    
	                countOdd++;    
	            }    
	        }    
	            
	        System.out.println("Frequency of odd numbers: " + countOdd);    
	        System.out.println("Frequency of even numbers: " + countEven);    
	    }    

}
