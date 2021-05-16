package others;

import java.util.Scanner;

public class RecruitEmployee {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			array[i] = scanner.nextInt();
		}
		for(int i = 0; i < size; i++)
		{
			System.out.println(array[i]);
		}
		int index = scanner.nextInt();
		int num = scanner.nextInt();
		scanner.close();
		
		int array2[] = new int[size + 1];
		
		for(int i = 0; i < size; i++)
		{
			array2[i] = array[i];
		}
		
		
		for(int i = 0; i < size+1; i++)
			{
				System.out.println(array2[i]);
			}
		
		for(int i = array2.length - 1; i >= index; i--)
		{
			array2[i] = array2[i - 1];
		}
		array2[index - 1] = num;
		
		for(int i = 0; i < size + 1; i++)
		{
			System.out.println(array2[i]);
		}

	}

}
