package Sdet.Task3;

public class Task3_Q5 {
	
	 public static void main(String[] args) {  
	        int rows, cols;  
	          
	        //to initialize matrix a  
	        int a[][] = {     
	                        {1, 2, 3},  
	                        {8, 6, 4},  
	                        {4, 5, 6}  
	                    };  
	            
	          //to Calculate number of rows and columns present in given matrix  
	          rows = a.length;  
	          cols = a[0].length;  
	          
	          if(rows != cols){  
	              System.out.println("Matrix should be a square matrix");  
	          }  
	          else {  
	              
	              System.out.println("Lower triangular matrix: ");  
	              for(int i = 0; i < rows; i++){  
	                  for(int j = 0; j < cols; j++){  
	                    if(j > i)  
	                      System.out.print("0 ");  
	                    else  
	                      System.out.print(a[i][j] + " ");  
	                }  
	                System.out.println();  
	            }  
	        }  
	    }  

}
