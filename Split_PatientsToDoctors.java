package others;

import java.util.Scanner;

public class Split_PatientsToDoctors {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int size = scanner.nextInt();
		int array[] = new int[size];
		
		for(int i = 0; i < size; i++)
		{
			array[i] = scanner.nextInt();
		}
		int num = scanner.nextInt();
		
		for(int i = 0; i < num; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		for(int i = num; i < size; i++)
		{
			System.out.print(array[i]+" ");
		}

	}

}
