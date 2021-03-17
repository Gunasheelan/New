package college;

public class Fibanocci {

	public static void main(String[] args)
	{
//		int number = 6,number1 = 0, number2 = 1, result = 0; // 0 1 1 2 3 5 8 13
//		for(int i = 0; i < number; i++)
//		{
//			result = number1 + number2;
//			System.out.println(result);
//			number1 = number2;
//			number2 = result;
//		}
		
		// upto given number
//		int number = 100,number1 = 0, number2 = 1; 
//		while(number1 <= number)
//		{
//			
//			System.out.println(number1);
//			int result = number1 + number2;
//			number1 = number2;
//			number2 = result;
//		}
		
		System.out.println(fibanocci(9));
	}
	
	// using recursion 
	public static int fibanocci(int number) // but wrong
	{
		if(number <= 1)
			return number;
		
//		else if(number == 2)
//			return 1;
			return fibanocci(number - 1) + (number - 2);
	}

}
