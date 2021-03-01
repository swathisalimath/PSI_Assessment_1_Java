// Q2 Solution 

//importing Scanner class from util package
import java.util.Scanner;

//creating class DoubleVariables 
public class DoubleVariables
{
	//main method which is called/launched by JVM itself when the execution starts
	
	public static void main(String[] args)
	{
		//creating object 'sc' for the Scanner class
		//Scanner class basically helps in getting or taking the input from user
		Scanner sc=new Scanner(System.in);
		//taking input from the user .. displaying these sentences in command prompt so that user will enter the input

		//asking user to enter first number 
		System.out.print("Enter the  first number: ");
		//taking first number from the user by the help of scanner object 'sc' and put it in double varible num1
        double num1 = sc.nextDouble();
		
		//asking user to enter second number
        System.out.print("Enter the second number: ");
		//taking first number from the user by the help of scanner object 'sc' and put it in double varible num2
        double num2 = sc.nextDouble();
		
		System.out.println(num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1);
	}
}