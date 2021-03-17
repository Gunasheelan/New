package college;

public class Factorial {

	public static void main(String[]args)
	{
		// Factorial using fo loop
		int number = 5, result = 1;
		for(; number > 0; number--)
		{
			result= result * number;
			System.out.println(result);
		}
		//System.out.println(factorial(5));
	}
	
	// using recursion
    public static int factorial(int number)
    {
    	if(number == 1)
    		return 1;
    	else
    		return factorial(number - 1) * number;
    }

}
