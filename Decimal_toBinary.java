package others;

import java.util.Arrays;
import java.util.Scanner;

public class Decimal_toBinary {
	
	static void toBinary(int num)
	{
		int remainder = 0, index = 0;
		int binary[] = new int[50];
		while(num > 0)
		{
			remainder = num % 2;
			binary[index++] = remainder;
			num /= 2;
		}
		for(int i = index - 1; i >= 0; i--)
			System.out.print(binary[i]);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		toBinary(num);
		
		//or
//		System.out.println(Integer.toBinaryString(num));

	}

}
