package college;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		int remainder = number % 10;
		int quotient = number/ 10;
		int remainder2 = quotient % 10;
		int quotient2 = quotient / 10;
//		int remainder3 = quotient2 % 10;
//		int quotient3 = quotient2 / 10;
		
		System.out.println(remainder);
		System.out.println(remainder2);
		System.out.println(quotient2);
		
		int result = (remainder*remainder*remainder) + (remainder2*remainder2*remainder2) + (quotient2*quotient2*quotient2);
		System.out.println(result);
		
		if(number == result)
			System.out.println("Armstrong Numer");
		else
			System.out.println("Not a Armstrong Number");
	}

}
