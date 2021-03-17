package college;

import java.util.Scanner;

public class Mixing2Array {
	public static void main(String[] args)
	{
		// Get 2 array from user, print 3rd array with mixing of this 2 arrays
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter size");
//		int size = scanner.nextInt();
//		int array1[] = new int[size];
//		int array2[] = new int[size];
//		int result[] = new int[size];
//		
//		System.out.println("Enter numbers for array 1");
//		for(int i = 0; i < size; i++)
//		{
//			array1[i] = scanner.nextInt();
//		}
//		
//		System.out.println("Enter numbers for array 2");
//		for(int i = 0; i < size; i++)
//		{
//			array2[i] = scanner.nextInt();
//		}
//		scanner.close();
		
		
//		int[] array1 = {13,25,39,41,5,62};
//		int[] array2 = {21,12,33,14,55,36};
//		int result[] = new int[array1.length];
//		
//		int i,j;
//		for(i = 0; i < array1.length; i=i+2)
//		{
//			result[i] = array1[i];
//			System.out.println(result[i]);
//		}
//		System.out.println();
//		
//		for(j = 1; j < array1.length; j=j+2)
//		{
//			result[j] = array2[j];
//			System.out.println(result[j]);
//		}
//		System.out.println();
//		
//		for(int k = 0; k < result.length; k++)
//		{
//			System.out.print(result[k]+" ");
//		}
		
		// another merge
		int[] array1 = {13,25,39,41,5,62};
		int[] array2 = {21,12,33,14,55,36};
		int result[] = new int[array1.length + array2.length];
		
		int i, t = 0;
		for(i = 0; i < array1.length; i++)
		{
			result[t] = array1[i];
			t++;
			
			result[t] = array2[i];
			t++;
		}
		System.out.println();
		

		
		for(int k = 0; k < result.length; k++)
		{
			System.out.print(result[k]+" ");
		}

		
	}

}
