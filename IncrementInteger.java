package others;

public class IncrementInteger {

	public static void main(String[] args) {
		int num = 1234;
		int remainder, result = 0;
		int remainder2, result2 = 0;
//		while(num != 0)
//		{
//			remainder = num % 10;
//			result = (result *10) + (remainder + 1);
//			num /= 10;
//		}
//		System.out.println(result);
//		while(result != 0)
//		{
//			remainder2 = result % 10;
//			result2 = (result2 *10) + (remainder2);
//			result /= 10;
//		}
//		System.out.println(result2);
		
		// or
		int temp = num;
		while(num > 0)
		{
			num = num / 10;
			result = result * 10 + 1;
		}
		System.out.println(temp + result);

	}

}
