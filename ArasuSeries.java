package others;

import java.util.Scanner;

public class ArasuSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		int a = 2, odd = 3;
		System.out.print(a+" ");
		for(int i = 0; i < input - 1; i++)
		{
			int next = a + odd;
			System.out.print(next+" ");
			odd = odd + 2;
			a = next;
		}

	}

}
