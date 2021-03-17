package college;

import java.util.Scanner;

public class HowManyDuplicates {
	public static void main(String[] args)
	{
		// print how many duplicate elements in the array
		
//		Scanner scanner = new Scanner(System.in);
//		int size;
//		System.out.println("Enter array size");
//		size = scanner.nextInt();
//		
//		int array1[] = new int[size];
//		int array2[] = new int[size];
				
//		int i, j, t, m;
//		t = 0; m = 0;
//		
//		for(i = 0; i < size; i++)
//		{
//			array1[i] = scanner.nextInt();
//		}
//	
//		for(i = 0; i < size; i++)
//		{
//			for(j = 0; j < size; j++)
//			{
//				if (array1[i] == array2[j])
//				{
//					t++;
//					System.out.println(t);
//				}
//			}
//			System.out.println(t);
//			if(t == 0)
//			{
//				array2[m] = array1[i];
//				m++;
//			}
//			t = 0; 
//		}
//		
//		System.out.println("New list");
//		for(i = 0; i < m; i++)
//		{
//			System.out.println(array2[i]);
//		}

		
		
		// in compile time
		
//		int array1[] = {1,2,3,1,2,5,3,3,4,3};
//		int array2[] = new int[array1.length];
//				
//		int i, j, temp, index;
//		temp = 0; index = 0;
//	
//		for(i = 0; i < array1.length; i++)
//		{
//			for(j = i+1; j < array2.length; j++)
//			{
//				if (array1[i] == array2[j])
//				{
//					array2[index] = array1[i];
//					index++;
//				}
//			}
//			if(temp == 0)
//			{
//				
//			}
//			temp = 0; 
//		}
//		
//		System.out.println("New list");
//		for(i = 0; i < index; i++)
//		{
//			System.out.println(array2[i]);
//		}
		
		// 
//		int array1[] = {1,2,3,1,2,2};
//		int t = 0, k = 0;
//		for(int i = 0; i < array1.length; i++)
//		{
//			for(int j = i + 1; j < array1.length; j++)
//			{
//				if(array1[i] == array1[j])
//					t++;
//			}
//			if(t > 0)
//			{
//				k++;
//			}
//			t = 0;
//		}
//		System.out.println(k);
		
		
		
		//new method
//		int array[] = {1,2,3,1,2,4,8,1,2,3,3};
//		int newArray[] = new int[array.length];
//		int i, j,k, t = 0, index = 0;

//		Scanner scanner = new Scanner(System.in);
//		int size;
//		System.out.println("Enter array size");
//		size = scanner.nextInt();
//		
//		int array[] = new int[size];
//		int newArray[] = new int[size];
//		int i, j, k, index;
//		index = 0;
//		
//		for(i = 0; i < size; i++)
//		{
//			array[i] = scanner.nextInt();
//		}
//		
//		for(i = 0; i < size; i++)
//		{
//			for(j = i + 1; j < size; j++)
//			{
//				if(array[i] == array[j])
//				{
//					for(k = 0; k < size; k++)
//					{
//						if(array[j] == newArray[k])
//						{
//							break;
//						}
//					}
//				}
//				else
//				{
//					newArray[index] = array[i];
//					index++;
//				}
//			}
//		}
//		for( int l = 0; l < index; l++)
//		{
//			System.out.println(newArray[l]);
//		}
		
		
		// utube
//		int array[] = {1,2,1,3,4,2,5,6,5,5};
//		int i, j;
//		for(i = 0; i < array.length - 1; i++)
//		{
//			int count = 1;
//			for(j = i + 1; j < array.length; j++)
//			{
//				if(array[i] == array[j])
//				{
//					count++;
//				}
//				else
//				{
//					break;
//				}
//			}
//			if(count > 1)
//			{
//				System.out.println(count);
//				i += (count - 1);
//			}
//		}
		
		// 
		int array1[] = {1,2,3,1,2,2,2,3};
		int array2[] = new int[array1.length];
		int t = 0, m = 0;
		for(int i = 0; i < array1.length; i++)
		{
			for(int j = i + 1; j < array1.length; j++)
			{
				if(array1[i] == array1[j])
				{
					for(int k = 0; k < m; k++)
					{
						if(array1[i] == array2[k])
						{
							t++;
						}
					}
					if(t == 0)
					{
						array2[m] = array1[i];
						m++;
					}
				}
			}
			
			t = 0;
		}
		System.out.println(m); // just printing the index of array2

	}

}
