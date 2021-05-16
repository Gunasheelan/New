package others;

public class RecursionFactorial {
	
	int total = 1;

	public static void main(String[] args) {
		RecursionFactorial rf = new RecursionFactorial();
		
		int result = rf.fact(4);
		System.out.println(result);

	}
	
	int fact(int num)
	{
		total = total * num;
		num--;
		
		if(num > 0)
		{
			fact(num);
		}
		return total;
	}

}
