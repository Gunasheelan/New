package others;

public class GreatNumber {

	public static void main(String[] args) {
		int num = 59;
		int remainder = num % 10;
		int quo = num / 10;
		
		int sum = remainder + quo;
		int product = remainder * quo;
		if((sum+product) == num)
			System.out.println("Great");
		else
			System.out.println("not");

	}

}
