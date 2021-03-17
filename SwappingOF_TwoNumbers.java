package college;

import java.util.Scanner;

public class SwappingOF_TwoNumbers {

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		scanner.close();
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a +" "+ b);
	}

}
