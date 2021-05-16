package others;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {
	   Scanner scanner = new Scanner(System.in);
	   int size = scanner.nextInt();
	   int array[] = new int[size];
	   int sum = 0;
	
	   for(int i = 0; i < size; i++)
	   {
		   array[i] = scanner.nextInt();
	   }
	   scanner.close();
	   
	   for(int i = 0; i < size; i++)
	   {
		   sum += array[i];
	   }
	   
//	   int sum1 = (int) sum;
	   System.out.println(sum);
	   float average = (float) sum/size;
//	   double average = sum/size;
	   System.out.println(average);

	}

}
