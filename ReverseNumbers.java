package others;

public class ReverseNumbers {
	public static void main(String[] args)
	{
		int num = 1234, reverse = 0;
		for(; num != 0; num /= 10)
		{
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			
	        System.out.println(reverse);
		}
		
		// using StringBuffer Class
//		StringBuffer sb = new StringBuffer(String.valueOf(num));
//		StringBuffer rev = sb.reverse();
//		System.out.println(rev);
		
		// using StringBuilder class
//		StringBuilder sb = new StringBuilder();
//		sb.append(num);
//		StringBuilder rev = sb.reverse();
//		System.out.println(rev);
		
		// checking palindrome or not
		
	}

}
