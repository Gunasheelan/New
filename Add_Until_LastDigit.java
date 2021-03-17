package college;

public class Add_Until_LastDigit {

	public static void main(String[] args)
	{
		int number = 12345, remainder = 0,result = 0, newResult = 0;
		for(;number != 0; number /= 10)
		{
			remainder = number % 10;
			result += remainder;
			
		}
		System.out.println(result);
		
		for(; result != 0; result /= 10)
		{
			remainder = result % 10;
			newResult += remainder;
		}
		System.out.println(newResult);
	}

}
