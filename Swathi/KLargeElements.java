// Q5 Solution 

//importing Scanner class from util package
import java.util.*;

//creating class KLargeElements 
public class KLargeElements
{
	//main method which is called/launched by JVM itself when the execution starts
	
	public static void main(String[] args)
	{
		
		//defining integer array
        Integer a[] = new Integer[]{1, 4, 17, 7, 25, 3, 100};
		
		//setting integer k vaue as 3
        int k = 3;
		
		//printing original array
		System.out.println("Original Array: ");
		
		System.out.println(Arrays.toString(a));
		
		System.out.println(k +" largest elements of the said array are:");
		
        Arrays.sort(a, Collections.reverseOrder());  

		//printing K large elements
        for (int i = 0; i < k; i++) 
		{
          System.out.print(a[i] + " ");
		}
    }      

}	
		

     