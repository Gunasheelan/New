package others;

import java.util.Scanner;

public class TotalOccurencesInNaturalNum {
	static void findOccurence(int num, int upto)
	{
		int count = 0, t = 0, remainder;
		for(int i = 1; i <= upto; i++)
		{
			if(i == num)
			{
				count++;
				System.out.println(i);
				continue; // don't put break here or we can use else block below
			}
			
			t = i;
			while(t != 0)
			{
				remainder = t % 10;
				if(remainder == num)
				{
					System.out.println(i);
					count++;
				}
				t /= 10;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int upto = scanner.nextInt();
		scanner.close();
		
		findOccurence(num, upto);

	}

}
