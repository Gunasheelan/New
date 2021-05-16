package others;

public class AddUntil_SingleDigit {
	public static void sumDigits(int num) {
		int result = 0;
		while(num > 9) {
		    result = 0;
			while(num > 0) {
				result += num % 10;
				num /= 10;
			}
			num = result;
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		int num = 12341;
		sumDigits(num);

	}

}
