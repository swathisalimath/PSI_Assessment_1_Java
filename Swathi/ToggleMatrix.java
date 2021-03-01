// Q4 Solution 

//importing Scanner class from util package
import java.util.Scanner;
//creating class ToggleMatrix 
public class ToggleMatrix
{
	//main method which is called/launched by JVM itself when th

	public static void main(String[] args) 
	{
		// defining boolean array which is two dimentional
		
		int[][] a = {
				{10, 20, 30},
				{40, 50, 60}
				};
				
		// printing original array and transpose array by calling print_array and transpose function and passing array a as parameter	
		
		System.out.print("Original Array:\n");
		print_array(a);
		System.out.print("After changing the rows and columns of the said array:\n");
		transpose(a);
	}
	
	private static void transpose(int[][] arr) 
	{
		
		int[][] tran_arr = new int[arr[0].length][arr.length];
		
		// transposing the Matrix
		
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = 0; j < arr[0].length; j++) 
			{
				tran_arr[j][i] = arr[i][j];
			}
		}
		
		print_array(tran_arr);
	}
	
	// function to print the array using 2 for loops
	
	private static void print_array(int[][] tran_arr) 
	{
		for (int i = 0; i < tran_arr.length; i++)
			{
			for (int j = 0; j < tran_arr[0].length; j++) 
			{
				System.out.print(tran_arr[i][j] + " ");
			}
			System.out.println();
		}
	
	}
}