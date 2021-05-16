package others;

import java.util.Scanner;

public class VowelConsonant_Count {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		
		char a[] = name.toCharArray();
		int temp = 0;
		for(int i = 0; i < a.length; i++)
		{
			if(a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u')
			{
				temp++;
			}
		}
		int vow = temp;
		int cons = a.length - temp;
		System.out.println("vowels "+vow);
		System.out.println("consonant "+cons);
	}

}
