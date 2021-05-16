package others;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args)
	{
//		int num = 373, originalnum, remainder, result = 0;
//		originalnum = num;
//		while(originalnum != 0)
//		{
//			remainder = originalnum % 10;
//			result = result+(remainder*remainder*remainder);
//            // or
//			//result += Math.pow(remainder, 3);
//			originalnum /= 10;
//		}
//		if(result == num) {
//			System.out.println("Armstrong");
//		}
//		else
//			System.out.println("Not a Armstrong");
		// using for loop
		
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int originalnum, remainder, result = 0;
		originalnum = num;
		for(;originalnum != 0; originalnum /= 10)
		{
			remainder = originalnum % 10;
			result = result+(remainder*remainder*remainder);
			// or
			//result += Math.pow(remainder, 3);
		}
		if(result == num)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not a Armstrong");
	}

}
