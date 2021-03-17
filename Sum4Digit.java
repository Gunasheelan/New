package college;

import java.util.Scanner;

public class Sum4Digit {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		int a = number % 10;
		int b = number / 10;
		int c = b % 10;
		int d = b / 10;
		int e = d % 10;
		int f = d / 10;
		
		System.out.println(a);
		System.out.println(c);
		System.out.println(e);
		System.out.println(f);
		
		System.out.println(a+c+e+f); // String adding
		System.out.println(a+" "+c+" "+e+" "+f); // String reverse
		
	}

}
