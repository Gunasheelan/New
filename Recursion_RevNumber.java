package others;

public class Recursion_RevNumber {
	
	int remainder = 0, result = 0;

	public static void main(String[] args) {
		Recursion_RevNumber rn = new Recursion_RevNumber();
		int result = rn.reverse(12345);
		System.out.println(result);

	}
	
	int reverse(int num)
	{
		remainder = num % 10;
		result = (result * 10) + remainder;
		num /= 10;
		
		if(num > 0) // or if(num != 0)
		{
			reverse(num);
		}
		return result;
	}

}
