package others;

public class ExtractDigits {

	public static void main(String[] args) {
//		int num = 5678;
//		int remainder = 0;
//		int i = 1;
//		while(num != 0)
//		{
//			remainder = num % 10;
//			System.out.println(i+" "+remainder);
//			num /= 10;
//			i++;
//		}
		
		int a, b, c, count = 0;
		a = 5678;
		b = a;
		while(a > 0)
		{
			a = a / 10;
			count++;
		}
		while(b > 0)
		{
			c = b % 10;
			System.out.println("Digits at position "+count+" "+c);
			b = b / 10;
			count--;
		}
	
	}

}
