package others;

import java.util.Scanner;

public class HexaDecimal_toDecimal {
	static void toHexa(String s)
	{
		String digits = "0123456789ABCDEF";
		int ans = 0;
		s = s.toUpperCase();
		for(int i = 0; i < s.length(); i++)
		{
			char c = s.charAt(i);
			int d = digits.indexOf(c);
			ans = ans * 16 + d;
		}
		System.out.println(ans);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		scanner.close();
		
		toHexa(s);
		
		// or
//		System.out.println(Integer.parseInt(s, 16));

	}

}
