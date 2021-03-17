package college;

import java.util.Scanner;

public class HowManyDuplicateKey {
	public static void main(String[] args)
	{
		// get a key from user and find how many times the key is repeated
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size");
		int size = scanner.nextInt();
		int array[] = new int[size];
		
		System.out.println("Enter numbers");
		for(int i = 0; i < size; i++)
		{
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Enter key");
		int key = scanner.nextInt();
		int temp = 0;
		scanner.close();
		for(int i = 0; i < size; i++)
		{
			if(key == array[i])
				temp += 1;
		}
		System.out.println(temp);
	}

}
