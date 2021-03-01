// Q1 Solution 

//importing Scanner class from util package
import java.util.Scanner;

//creating class Equality 
public class Equality
{
	//main method which is called/launched by JVM itself when the execution starts
	
	public static void main(String[] args)
	{
		//creating object 'sc' for the Scanner class
		//Scanner class basically helps in getting or taking the input from user
		Scanner sc=new Scanner(System.in);
		
		//taking input from the user .. displaying these sentences in command prompt so that user will enter the input
		System.out.println("enter four integers");

		//asking user to enter first number 
		System.out.println("Input first number: ");
		//taking first number from the user by the help of scanner object 'sc' and put it in integer varible a1
		int a1=sc.nextInt();


		//asking user to enter second number 
		System.out.println("Input first number: ");
		//taking second number from the user by the help of scanner object 'sc' and put it in integer varible a2
		int a2=sc.nextInt();
		
		//asking user to enter third number 
		System.out.println("Input first number: ");
		//taking third number from the user by the help of scanner object 'sc' and put it in integer varible a3
		int a3=sc.nextInt();
		
		//asking user to enter fourth number 
		System.out.println("Input first number: ");
		//taking fourth number from the user by the help of scanner object 'sc' and put it in integer varible a4
		int a4=sc.nextInt();


		if((a1==a2)&&(a2==a3)&&(a3==a4))
		{
			System.out.println("Numbers are equal");
		}
		else
		{
			System.out.println("Numbers are not equal!");
		}
	}
}