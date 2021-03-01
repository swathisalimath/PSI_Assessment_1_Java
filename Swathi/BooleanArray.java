// Q3 Solution 

//importing Scanner class from util package
import java.util.Scanner;
//creating class BooleanArray 
public class BooleanArray
{
	//main method which is called/launched by JVM itself when th

	public static void main(String[] args) 
	{
		// defining boolean array which is two dimentional
		boolean[][] a = {{true, false, true},
							 {false, true, false}};
							 
		// taking row and cloumn value of 2 dimentional array in the integer variables rows_length and columns_length respectively					 
		int rows_length = a.length;
		int columns_length = a[0].length;
		
		// using 2 for loops printing 't' if the array element is true and printing 'f'if array element is false
		for (int i = 0; i < rows_length; i++) {
			for (int j = 0; j < columns_length; j++) {
				
				//checking if a[i][j] is true
				if (a[i][j]) 
				{
					System.out.print(" t ");
				} 
				//checking if a[i][j] is false
				else 
				{
					System.out.print(" f ");
				}
				
			}
			System.out.println();
		}	
    }
}