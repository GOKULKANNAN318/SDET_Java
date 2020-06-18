package Sdet.Task3;

//display upper triangular matrix

public class Task3_Q6 {
	
	 public static void main(String[] args) {    
	        int rows, cols;    
	            
	        //To initialize matrix a    
	        int a[][] = {       
	                        {1, 2, 3},    
	                        {8, 6, 4},    
	                        {4, 5, 6}    
	                    };    
	              
	          //To calculate number of rows and columns present 
	          rows = a.length;    
	        cols = a[0].length;    
	            
	        if(rows != cols){    
	            System.out.println("Matrix should be a square matrix");    
	        }    
	        else {    
	              
	            System.out.println("Upper triangular matrix: ");    
	            for(int i = 0; i < rows; i++){    
	                for(int j = 0; j < cols; j++){    
	                  if(i > j)    
	                    System.out.print("0 ");    
	                  else    
	                    System.out.print(a[i][j] + " ");    
	                }    
	                System.out.println();    
	            }    
	        }    
	    }    

}
