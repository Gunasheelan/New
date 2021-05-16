package others;

import java.util.Scanner;

public class Decimal_toHex {
	static void toHex(int num)
	{
		int remainder = 0;
		String ans = "";
		char hexchar[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(num > 0)
		{
			remainder = num % 16;
			ans = hexchar[remainder] + ans;
			num /= 16;
		}
		System.out.println(ans);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		toHex(num);
		
		// or
//		System.out.println(Integer.toHexString(num));

	}

}
