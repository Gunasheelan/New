package college;

import java.util.Scanner;

public class PrintWithoutOriginal {
	public static void main(String[] args)
	{
		// print all duplicates without orginal
		//  eg. 111 22 3 4 555 - ans - 111 22 555 -print repeated numbers
		
		int array1[] = {1,3,1,3,2,2,4,5,6,6};
		int array2[] = new int[array1.length];
		int i, j, m = 0;
		for(i = 0; i < array1.length; i++)
		{
			for(j = 0 ; j < array1.length; j++)
			{
				if(array1[i] == array1[j])
				{
					if(i != j) // checking the same index or not
					{
						array2[m] = array1[j]; // we can put array1[j] or array1[i]
						m++;
						break;
					}
				}
			}
		}
		for(int k = 0; k < m; k++)
		{
			System.out.println(array2[k]);
		}
		
		// for user input
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter size");
//		int size = scanner.nextInt();
//		int a[] = new int[size];
//		int b[] = new int[size];
//		int m = 0;
//		
//		for(int i = 0; i < size; i++)
//		{
//			a[i] = scanner.nextInt();
//		}
//		for(int i = 0; i < size; i++)
//		{
//			for(int j = 0 ; j < size; j++)
//			{
//				if(a[i] == a[j])
//				{
//					if(i != j)
//					{
//						b[m] = a[i];
//						m++;
//						break;
//					}
//				}
//			}
//		}
//		for(int k = 0; k < m; k++)
//		{
//			System.out.println(b[k]);
//		}
	}

}
