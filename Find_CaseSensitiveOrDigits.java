package others;

import java.util.Scanner;

public class Find_CaseSensitiveOrDigits {

	public static void main(String[] args) {
		
		// showing wrong output
		
		Scanner scanner = new Scanner(System.in);
		char a = scanner.next().charAt(0); // to get a char using scanner class
		int b = a;
		scanner.close();
		
		System.out.println(b);
		
		if(b >= 65 && b <= 90)
		{
			System.out.println("Uppercase");
		}
		else if(b >= 97 && b <= 122)
		{
			System.out.println("Lowercase");
		}
		else if(b >= 0 && 9 <= b)
		{
			System.out.println("Number");
		}

	}

}
