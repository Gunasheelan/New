package others;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
		// use this method
//		int number = 29, temp = 0;
//		for(int i = 2; i < number; i++)
//		{
//			if(number % i == 0)
//			{
//			    temp++;
//			    break; // if we don't put break, it will check all the other elements even if it's divisible
//			}
//			else
//				temp = 0;
//		}
//		if(temp == 0)
//			System.out.println("Prime");
//		else
//			System.out.println("Not a Prime");
		
		
		// checking prime from start to end
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter starting and ending point");
//		int start = scanner.nextInt();
//		int end = scanner.nextInt();
		int start = 6,end = 20;
		int temp = 0, j;
		for(int i = start; i < end; i++)
		{
		    for(j = 2; j < i;j++)
		    {
		    	if(i % j == 0)
				{
		    		temp++;
		    		break;
				}
		    	
		    }
		    if(temp == 0)
		    {
			    System.out.println(i);
		    }
		    temp = 0;
		    
		}

	}

}
