// Q6 Solution 

//importing Scanner class from util package
import java.util.Scanner;

//creating class IntToBinary 
public class IntToBinary
{
	//main method which is called/launched by JVM itself when the execution starts
	
	
	public static int countZeroBits(int n) 
	{
    
        // defining integer variable count
		int cnt = 0;
		
		//integer to binary conversion
		String binNum = Integer.toBinaryString(n);
	
		System.out.print("Binary representation of "+n+" is: "+binNum);
		for (char ch1 : binNum.toCharArray()) 
		{
			cnt += ch1 == '0' ? 1 : 0;
		}
		return cnt;
    }
	
	//main method which is called/launched by JVM itself when the execution starts
	
    public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		
		//asking user to enter integer and store it in integer n
        System.out.print("Input number: ");
        int n = s.nextInt();
		
		System.out.println("\nNumber of zero bits: " + countZeroBits(n));
	}
	
}